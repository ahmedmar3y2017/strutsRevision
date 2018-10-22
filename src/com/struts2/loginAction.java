package com.struts2;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class loginAction extends ActionSupport implements ModelDriven<User> ,  Preparable {

	private User user = new User() ;


	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("validation");

		System.out.println(user.getUsername());

		if (StringUtils.isEmpty(user.getUsername())) {

			addFieldError("username", "Error UserName is required");

		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Error Password is required");

		}

	}

	public String execute() { 
		
		int x =20/0;
		loginService loginService = new loginService();

		
		

		if (loginService.loginService(user)) {

			return SUCCESS;

		} else {

			return LOGIN;

		}

	}

	
	
	
	public User getModel() {
		// TODO Auto-generated method stub
	    user=new User();  

		return user;
	}

	@Override
	public void prepare() throws Exception {

		System.out.println("Before Business Logic ");
		
		
	}

}
