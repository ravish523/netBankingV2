package com.inetBanking.testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		
		logger.info("browser is opening.......");
		Thread.sleep(2000);
		driver.get(baseURL2);
	
		LoginPage lp=new LoginPage(driver);
		logger.info("login page object is creating....");
		Thread.sleep(3000);
		lp.setuser("username");
		logger.info("entering the username to the login page website...");
		lp.setpassword("password");
		logger.info("entering the password to the login page website");
		lp.setsubmit();
		logger.info("entering the submit buttom....");
		String alrttxt=driver.switchTo().alert().getText();
		logger.info("getting the alert text in the string variable....");
		System.out.println(alrttxt);
		logger.info("printing the alert text to the console window.....");
		driver.switchTo().alert().accept();
		logger.info("accepting the alert...");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); 
		logger.info("printing the title of the page.......");
		
		if(driver.getTitle().equals("GTPL Bank Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("test case is pass b/c it is matching the title of the page....");
		}
		else
		{
			CaptureScreen(driver,"loginTest");
			logger.info("test case is failed b/c it is not matching the title of the page");
			Assert.assertTrue(false);
			
		}
	}

}
