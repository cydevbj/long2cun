package com.my24d.caixun.common.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Page;
import com.my24d.caixun.common.model.base.BaseBlog;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * Blog model.
 * 数据库字段名建议使用驼峰命名规则，便于与 java 代码保持一致，如字段名： userId
 */
@SuppressWarnings("serial")
public class Blog extends BaseBlog<Blog> {
	
	public static final Blog me = new Blog().dao();
	
	/**
	 * 所有 sql 与业务逻辑写在 Service 中，在此放在 Model 中仅为示例，
	 * 不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public Page<Blog> paginate(int pageNumber, int pageSize) {
		return paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
	}
	
	public List<Image> getImages() {
		return Image.dao.find("select * from image where blogid=?",
		get("id"));
		}
	
	public void setImages(List<Image> images){
		for (Image image : images) {
			image.setBlogid(getId());
			image.save();
		}
	}
	
}


