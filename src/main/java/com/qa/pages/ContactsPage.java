package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContactsPage extends BasePage{
	
	
	//define elements
	By createContactLink = By.xpath("//span[text()='Create contact']");
	By textbox_Email = By.xpath("//input[@data-field='email']");
	By textbox_fname = By.xpath("//input[@data-field='firstname']");
	By textbox_lname = By.xpath("//input[@data-field='lastname']");
	By createContactButton = By.xpath("(//span[text()='Create contact'])[2]/..");
	By contactName = By.xpath("//span[@class='CompanyContactEditableTitle__Title-sc-1nmjhoi-0 iHehvO']/child::span");

	public ContactsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	
	public String createNewContact(String emailId,String firstName,String lastName) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doClick(createContactLink);
		doSendKeys(textbox_Email, emailId);
		doSendKeys(textbox_fname, firstName);
		doSendKeys(textbox_lname, lastName);
		doClick(createContactButton);
		
		String actualContactName = getElement(contactName).getText();
		
		return actualContactName;
	}

}
