package com.struts2;

public class TutorialFinderService {

	public String getTutorial( String language) {
		if(language.equals("java")){
			
			return "Java Brains";

		}else {
			return "another language";

			
		}
		
		

	}

}
