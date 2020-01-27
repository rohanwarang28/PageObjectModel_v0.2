package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.BasePage;

public  class TestUtil extends BasePage{

	
	public TestUtil(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}



	public static Object[][] fetchData(String sheetName , String filePath){
	XlsReader xls = new XlsReader(filePath);
	Object data[][]=new Object[xls.getRowCount("Sheet1")-1][xls.getColumnCount(sheetName)];
	for(int row = 0;row<=xls.getRowCount("Sheet1")-2;row++) {
		
		for(int col=0;col<=xls.getColumnCount("Sheet1")-1;col++) {
			
			 data[row][col] = xls.getCellData("Sheet1", col, row+2).toString();
		}
	
	}
	return data;
	
}
	
	
	
	public static void takeFailureScreenshots(String methodName) throws IOException {
		Date date = new Date();
		long time = date.getTime();
		TakesScreenshot ts  = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src,new File( System.getProperty("user.dir")+"\\Failure Screenshots\\"+methodName+" "+time+".png"));
		
	}

	
}