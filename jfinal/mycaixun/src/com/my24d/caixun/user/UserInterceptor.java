package com.my24d.caixun.user;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class UserInterceptor implements Interceptor {

	@Override
	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println("Before UserInterceptor invoking " + inv.getActionKey());
		inv.invoke();
		System.out.println("After UserInterceptor invoking " + inv.getActionKey());
	}

}
