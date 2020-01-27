package com.qa.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	HomePage homePage;
	
	@Test
	public void verifyLoginPageTitle() {
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		Assert.assertEquals(page.getInstance(LoginPage.class).getPageTitle(), "HubSpot Login");
	}
	
	@Test
	public void loginTest() {
		
		homePage = 	page.getInstance(LoginPage.class).doLogin("rohanwarang28@yahoo.com", "Test@1234567");
		String homePageTitle = homePage.getHomePageTitle();
		Assert.assertEquals(homePageTitle, "Reports dashboard");
	}
	
	
}
