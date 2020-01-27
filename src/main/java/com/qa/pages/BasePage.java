package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void doClick(By locator) {
		// TODO Auto-generated method stub
		
		getElement(locator).click();
	}

	
	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		waitForElement(locator);
		return driver.findElement(locator);
		
	}

	
	@Override
	public void doSendKeys(By locator,String param) {
		// TODO Auto-generated method stub
		
		getElement(locator).sendKeys(param);
	}


	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		
		return driver.getTitle();
	}


	@Override
	public void waitForElement(By locator) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	

}
