package com.struts2;

public class loginService {

	public boolean loginService(User user) {

		if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {

			return true;
			
		} else {

			return false;
		}

	}

}
