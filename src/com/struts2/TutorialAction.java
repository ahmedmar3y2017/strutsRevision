package com.struts2;

public class TutorialAction {

	String tutorialName;

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTutorialName() {
		return tutorialName;
	}

	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}

	public String execute() {

		TutorialFinderService finderService = new TutorialFinderService();

		setTutorialName(finderService.getTutorial(getLanguage()));

		System.out.println(getLanguage());

		return "success";

	}

	public String addTutorial() {

		System.out.println("Add tutorial Action");

		return "success";

	}

}
