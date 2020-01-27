package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	
	//declaring elements 
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	
	
	public String getPageTitle() {
		
		
		return getTitle();		
		
	}
	
	
	public HomePage doLogin(String loginId,String pwd) {
		
		doSendKeys(username, loginId);
		doSendKeys(password, pwd);
		doClick(loginButton);
		
		return getInstance(HomePage.class);
	}
	

}
