package com.inetBanking.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_006 extends BaseClass{
	
	@Test
	public void AddToBasket() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.clickShop();
		Thread.sleep(3000);
		hp.clickhome();
		Thread.sleep(3000);
		List<WebElement> arvimgs=driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
		if(arvimgs.size()==3)
		{
			Thread.sleep(3000);
			System.out.println("home page contains 3 new arrivals.");
			String title1=driver.getCurrentUrl();
			Thread.sleep(3000);
			System.out.println(title1);
			Thread.sleep(3000);
			arvimgs.get(0).click();
			Thread.sleep(3000);
			String title2=driver.getCurrentUrl();
			System.out.println(title2);
			if(title1==title2)
			{
				System.out.println("test case is failed b/c after click its not navigate to other page.");
			}
			else
			{
				System.out.println("ok , navigate to other page.");
				Thread.sleep(3000);
				WebElement addbasket=driver.findElement(By.xpath("//button[contains(@class,'single_add_to_cart_button button alt')]"));
				Thread.sleep(3000);
				if(addbasket.isDisplayed())
			    {
			    	System.out.println("addbasket is displayed..");
			    	Thread.sleep(3000);
			    	WebElement itemsno=driver.findElement(By.xpath("//span[@class='cartcontents']"));
			    	Thread.sleep(3000);
			    	String item=itemsno.getText();
			    	Thread.sleep(5000);
			    	System.out.println(item);
			    	addbasket.click();
			    	Thread.sleep(5000);
			    	String afterclkitem=driver.findElement(By.xpath("//span[@class='cartcontents']")).getText();
			    	Thread.sleep(3000);
			    	System.out.println(afterclkitem);
			    	if(afterclkitem.contains("1 Item"))
			    	{
			    		Thread.sleep(3000);
			    		System.out.println("test case pass=baskte contains one items.");
			    	}
			    	else
			    	{
			    		System.out.println("test case is failed= basket does not contain any items.");
			    	}
			    	
			    	
			    }
			    else
			    {
			    	System.out.println("test case is failed b/c addbasket is not displayed.");
			    }
			
			
			
			}
			
		}
		else
		{
			System.out.println("test case is failed b/c home page does not contain three arrivals.");
		}
		
	}
	
	
	

}
