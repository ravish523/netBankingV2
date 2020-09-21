package com.inetBanking.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_Arrival_002 extends BaseClass {
	@Test
	public void HomePageArrivalCkeck() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.clickShop();
		Thread.sleep(3000);
		hp.clickhome();
		Thread.sleep(3000);
		List<WebElement> arvphotos=driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
		int totalarvphoto=arvphotos.size();
		System.out.println(totalarvphoto);
		if(totalarvphoto==3)
	    {
	    	Assert.assertTrue(true);
	    	System.out.println("test case is pass total no of photo is 3");
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    	System.out.println("test case is failed total no of photo not equal to 3");
	    }
		
		
	}
	

}
