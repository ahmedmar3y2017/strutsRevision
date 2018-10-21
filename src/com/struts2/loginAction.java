package com.struts2;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("validation");

		System.out.println(getUsername());
		
		if (StringUtils.isEmpty(getUsername())) {

			addFieldError("username", "Error UserName is required");

		}
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "Error Password is required");

		}

	}

	public String execute() {

		if (getUsername().equals("admin") && getPassword().equals("admin")) {

			return SUCCESS;

		} else {

			return LOGIN;

		}

	}

}
