package com.qa.pages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

//@author:rohan 
public abstract class Page {
	
	public static WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver,WebDriverWait wait) {
		
		this.driver=driver;
		this.wait=wait;
	}
	
	public abstract void waitForElement(By locator);

	public abstract void doClick(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void doSendKeys(By locator,String param);
	
	public abstract String getTitle();
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(driver,wait);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		
		
		
		
		
		
	}


	
	
}
