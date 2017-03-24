package com.my24d.caixun.blog;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogInterceptor
 * 此拦截器仅做为示例展示，在本 demo 中并不需要
 */
public class BlogInterceptor implements Interceptor {
	
	public void intercept(Invocation inv) {
		System.out.println("Before invoking " + inv.getActionKey());
		String content_type = inv.getController().getRequest().getContentType();
		if (content_type != null && content_type.toLowerCase().indexOf("multipart") != -1) {
			inv.getController().getFiles();
		}
		
		inv.invoke();
		System.out.println("After invoking " + inv.getActionKey());
	}
}
