package com.inetBanking.testCase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.HomePage;

public class TC_HomePage_ArrivalNavigate_003 extends BaseClass {
	@Test
	public void ArrivalNavigate() throws InterruptedException
	{
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
					System.out.println("test case is failed");
				}
				else
				{
					Thread.sleep(3000);
					System.out.println("test case is pass");
					System.out.println(driver.getTitle());
					Thread.sleep(3000);	
					driver.navigate().refresh();
				    driver.navigate().back();
				}
			}
		}
		else
		{
			System.out.println("test case is failed b/c arrival image not equal to 3");
		}
	}
}
