package com.inetBanking.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_005 extends BaseClass {
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
					driver.findElement(By.xpath("//a[contains(text(),'Reviews (0)')]")).click();
					Thread.sleep(5000);
					String review=driver.findElement(By.xpath("//p[@class='woocommerce-noreviews']")).getText();
					System.out.println(review);
					Thread.sleep(3000);
					if(review.contains("There are no reviews yet."))
					{
						System.out.println("test case is pass-review contains somthing.");
					}
					else
					{
						System.out.println("test case is failed b/s review is not present.");
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
