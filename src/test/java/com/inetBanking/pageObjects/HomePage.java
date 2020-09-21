package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shopbtn;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homebtn;
	public void clickShop()
	{
		shopbtn.click();
	}
	public void clickhome()
	{
		homebtn.click();
	}

}
