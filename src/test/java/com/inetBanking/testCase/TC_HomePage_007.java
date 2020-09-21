package com.inetBanking.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_HomePage_007 extends BaseClass {
	@Test
	public void AddBasketCapacityCheck() throws InterruptedException
	{
		driver.get("http://practice.automationtesting.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("450");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();
		String txt=driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
		System.out.println(txt);
	}

}
