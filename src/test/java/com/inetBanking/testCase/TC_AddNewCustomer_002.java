package com.inetBanking.testCase;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.pageObjects.NewCostomerPage;

public class TC_AddNewCustomer_002 extends BaseClass{
	
	@Test
	public void AddCustomer() throws InterruptedException
	{
		
		logger.info("entering the url to website..");
		LoginPage lp=new LoginPage(driver);
		logger.info("creating the loginpage object..");
		lp.setuser(username);
		logger.info("entering username to login page..");
		lp.setpassword(password);
		logger.info("entering password to login page...");
		lp.setsubmit();
		logger.info("clicking on the submit button....");
		Thread.sleep(3000);
	     logger.info("new page is opening....banking page is opening..");
		
		NewCostomerPage np=new NewCostomerPage(driver);
		logger.info("creating newcustomer page...");
		np.setclickNewCustomer();
		logger.info("click on new customer..");
		Thread.sleep(4000);
		np.setusername("ravi");
		logger.info("entering the name of user..");
		np.setmale();
		logger.info("selecting the gender...");
		np.setdob("12", "06", "1996");
		logger.info("entering the dob of user..");
		np.setaddress("ankodha");
		logger.info("entering the address of customer..");
		np.setcity("daudnagar");
		logger.info("entering the city of the customer...");
		np.setstate("bihar");
		logger.info("entering the state of the customer...");
		np.setpinno("824116");
		logger.info("entering the pin of the customer...");
		np.setphoneno("9430834562");
		logger.info("entering the phone no of the customer...");
		np.setemail("ravi234@gmail.com");
		logger.info("entering the email of the customer....");
		np.setsubmit();
		logger.info("click on the submit button to add the customer..");
		Thread.sleep(3000);
		String titl=driver.getTitle();
		logger.info("getting the title of the page after the clicking...in the string variable");
		System.out.println(titl);
		logger.info("printing the title of the page after the adding the customer..");
		
		
	}
	
}
