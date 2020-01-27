package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;
import com.qa.util.XlsReader;

public class ContactsPageTest extends BaseTest{

	
	HomePage homePage;
	ContactsPage contactsPage;
	String actContactName;
	
	@Test(dataProvider="putContactData")
	public void createNewContact(String email,String fname,String lname) {
		homePage = page.getInstance(LoginPage.class).doLogin("rohanwarang28@yahoo.com", "Test@1234567");
		contactsPage = homePage.navigateToContactsPage();
		actContactName = contactsPage.createNewContact(email,fname,lname);
		Assert.assertEquals(actContactName, fname+" "+lname);
	}
	
	
	@DataProvider
	public Object[][] putContactData() {
		
		
		Object data[][] = TestUtil.fetchData("Sheet1", "D:\\my_newworkspace\\POMUsingJavaConceptsv0.2\\src\\main\\java\\com\\qa\\testdata\\ContactsData.xlsx");


		return data;
	
}
	
}
