package com.demo.blog;

import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.demo.blog.utils.FileUtil;
import com.demo.common.model.Blog;
import com.demo.common.model.Image;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogController
 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {
	private static final Logger log = Logger.getLogger(BlogController.class);
	public void index() {
		setAttr("blogPage", Blog.me.paginate(getParaToInt(0, 1), 10));
		render("blog.html");
	}
	
	public void add() {
	}
	
	@Before(BlogValidator.class)
	public void save() {
		getModel(Blog.class).save();
		redirect("/blog");
	}
	
	public void edit() {
		setAttr("blog", Blog.me.findById(getParaToInt()));
	}
	
	@Before(BlogValidator.class)
	public void update() {
		getModel(Blog.class).update();
		redirect("/blog");
	}
	
	public void delete() {
		Blog.me.deleteById(getParaToInt());
		redirect("/blog");
	}
	
	public void upload(){
//		UploadFile file = getFile();
//		System.out.println("wz369upload files"+file.toString());
		List<UploadFile> files = getFiles();
//		System.out.println("wz369upload files"+files.toString());
		String paras = getPara();
		System.out.println("wz369upload paras = "+paras);
		Map<String, String[]> paraMap = getParaMap();
		
		System.out.println("wz369upload paraMap = "+paraMap);
//		System.out.println(Json.getJson().toJson(paraMap)); 
		Enumeration<String> pnames = getParaNames();
		System.out.println("wz369upload getParaNames = "+pnames);
		
		
		Blog b = getModel(Blog.class);
		b.setContent(getPara("content"));
		b.setPostlocation(getPara("postlocation"));
		b.setVisibility(getParaToInt("visibility"));
		String time = getPara("time");
		try {
			Date datetime = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(time.trim());
			b.setTime(datetime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.setUsrname(getPara("usrname"));
		b.save();
		if(null != files){
			for (int i = 0; i < files.size(); i++) {
				UploadFile uploadFile = files.get(i);
				Image image = new Image();
				image.setBlogid(b.getId());
				String url = FileUtil.instance.changeFileName(uploadFile.getUploadPath(), uploadFile.getFileName());
				image.setPath(url);
				image.setType(uploadFile.getContentType());
				image.setIdx(i);
				image.save();
			}
		}
		
		
		
		//设置返回的json
        JSONObject json = new JSONObject();
        json.put("status", 2200);
        json.put("message", "success");//设置状态
        String jstr = JSON.toJSONStringWithDateFormat(b, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        JSONObject jobj = JSON.parseObject(jstr);
        json.put("data", jobj);
        renderJson(json);
	}
	
}


