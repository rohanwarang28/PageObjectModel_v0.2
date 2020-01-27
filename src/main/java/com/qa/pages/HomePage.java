package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	
	By ContactLink = By.xpath("//a[contains(text(),'Contacts')]");
	By InsideContactLink = By.xpath("//div[contains(text(),'Contacts')]");
	

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public String getHomePageTitle() {
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		return getInstance(HomePage.class).getTitle();
			
	}
	
	public ContactsPage navigateToContactsPage() {
		
		doClick(ContactLink);
		doClick(InsideContactLink);
		return getInstance(ContactsPage.class);
	}
	

}
