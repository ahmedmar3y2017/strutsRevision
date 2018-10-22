package com.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class myInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		// TODO Auto-generated method stub
		
		
		ValueStack stack =inv.getStack();		
		
		
		
		String s =stack.findString("language");
		
		System.out.println(s + " intercep");
		stack.set("language",s.toUpperCase());
		
		System.out.println(stack.findString("language"));
		
		return inv.invoke();
	}

}
