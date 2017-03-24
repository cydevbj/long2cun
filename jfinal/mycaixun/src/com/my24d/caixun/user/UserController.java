/**
 * 
 */
package com.my24d.caixun.user;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.my24d.caixun.common.model.Session;
import com.my24d.caixun.common.model.User;
import com.my24d.caixun.common.model.Userinfo;

/**
 * @author Administrator
 *
 */
@Before(UserInterceptor.class)
public class UserController extends Controller {
	
	
	public void reg(){
		User user = getModel(User.class);
		user.setUsername(getPara("username"));
		user.setPassword(getPara("password"));
		user.setEmail(getPara("email"));
		user.setCreatetime(new Date());
		user.save();
		
		JSONObject json = new JSONObject();
        json.put("status", 2200);
        json.put("message", "success");//设置状态
        String jstr = JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        JSONObject jobj = JSON.parseObject(jstr);
        json.put("data", jobj);
        renderJson(json);
		
		
		
	}
	
	
	public void login(){
		String username = getPara("username");
		String password = getPara("password");
		List<User> users = User.dao.find("select * from user where username = '"+username+"'");
		User user = null;
		if(null != users && users.size() > 0){
			user = users.get(0);
			System.out.println("login user = "+user);
		}
		
		Session session = getModel(Session.class);
		if(null != user){
			session.setUserid(user.getId());
			session.setSession("session-"+System.currentTimeMillis());
			session.setOauthtype("wz");
			session.setActive(1);
			session.setCreatetime(new Date());
			session.save();
		}
		
		JSONObject json = new JSONObject();
        json.put("status", 2200);
        json.put("message", "success");//设置状态
        String jstr = JSON.toJSONStringWithDateFormat(session, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        JSONObject jobj = JSON.parseObject(jstr);
        json.put("data", jobj);
        renderJson(json);
		
		
		
	
		
	}
	
	public void login3rd(){
		String oauthtype = getPara("oauthtype");
		String userinfo3rd = getPara("userinfo");
		JSONObject userinfo3rdJO = JSON.parseObject(userinfo3rd);
		User user = getModel(User.class);
		if(null != userinfo3rdJO){
			if(userinfo3rdJO.containsKey("nickname")){
				user.setNickname(userinfo3rdJO.getString("nickname"));
			} else if(userinfo3rdJO.containsKey("name")){
				user.setNickname(userinfo3rdJO.getString("name"));
			}
			
			if(userinfo3rdJO.containsKey("headimgurl")){
				user.setIconurl(userinfo3rdJO.getString("headimgurl"));
			} else if(userinfo3rdJO.containsKey("figureurl_2")){
				user.setIconurl(userinfo3rdJO.getString("figureurl_2"));
			} else if(userinfo3rdJO.containsKey("figureurl_1")){
				user.setIconurl(userinfo3rdJO.getString("figureurl_1"));
			} else if(userinfo3rdJO.containsKey("figureurl")){
				user.setIconurl(userinfo3rdJO.getString("figureurl"));
			} else if(userinfo3rdJO.containsKey("avatar_large")){
				user.setIconurl(userinfo3rdJO.getString("avatar_large"));
			}
		}
		user.save();
				
		Session session = getModel(Session.class);
		if(null != user){
			
			session.setUserid(user.getId());
			session.setSession("session-"+System.currentTimeMillis());
			session.setOauthtype(oauthtype);
			session.setActive(1);
			session.setCreatetime(new Date());
			session.save();
		}
		
		Userinfo userinfo = getModel(Userinfo.class);
		userinfo.setOauthtype(oauthtype);
		userinfo.setUserinfo(userinfo3rd);
		userinfo.setUserid(user.getId());
		userinfo.setSessionid(session.getId());
		userinfo.setCreatetime(new Date());
		userinfo.save();
		
		JSONObject json = new JSONObject();
        json.put("status", 2200);
        json.put("message", "success");//设置状态
        String jstr = JSON.toJSONStringWithDateFormat(session, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        JSONObject jobj = JSON.parseObject(jstr);
        json.put("data", jobj);
        renderJson(json);
		
		
		
	
		
	}
	

}
