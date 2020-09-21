package com.inetBanking.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_slider_001 extends BaseClass {
	@Test
	public void HomePageSliderCheck() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.clickShop();
		Thread.sleep(3000);
		hp.clickhome();
		Thread.sleep(5000);
	   List<WebElement> photos= driver.findElements(By.xpath("//img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']"));	
	    int totalphotos=photos.size();
	    System.out.println(totalphotos);
	    if(totalphotos==3)
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
