package com.inetBanking.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_004 extends BaseClass {
	 
	@Test
	public void ArrivalImageDescription() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.clickShop();
		Thread.sleep(3000);
		hp.clickhome();
		Thread.sleep(3000);
		List<WebElement> arvphotos=driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
		Thread.sleep(3000);
		int count=arvphotos.size();
		Thread.sleep(3000);
		System.out.println(count);
		if(count==3)
		{
			Thread.sleep(3000);
			String curl=driver.getCurrentUrl();
			Thread.sleep(3000);
			System.out.println(curl);
			for(int i=0;i<count;i++)
			{
				Thread.sleep(3000);
				arvphotos.get(0).click();
				Thread.sleep(3000);
				String url1=driver.getCurrentUrl();
				Thread.sleep(3000);
				System.out.println(url1);
				if(curl==url1)
				{
					System.out.println("test case is failed b/c its not navigate to other browser");
				}
				else
				{
					WebElement addbasket=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
					if(addbasket.isDisplayed())
					{
					Thread.sleep(3000);
					System.out.println("test case is pass -add basket is displayed.");
					driver.findElement(By.xpath("//a[contains(text(),'Description')]")).click();
					Thread.sleep(5000);
					String description=driver.findElement(By.xpath("//div[@id='tab-description']//p[contains(text(),'The Selenium WebDriver Recipes book is a quick pro')]")).getText();
					System.out.println(description);
					Thread.sleep(3000);
					if(description.contains("The Selenium WebDriver Recipes book"))
					{
						System.out.println("test case is pass-description contains somthing.");
					}
					else
					{
						System.out.println("test case is failed b/s description is not present.");
					}
					}
					else 
					{
						System.out.println("test case is failed b/c addbasket is not diplayed");
					}
					
				}
			}
		}
		else
		{
			System.out.println("test case is failed b/c arrival image not equal to 3");
		}
	}
}

	


