package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement textuser;
	@FindBy(name="password")
	WebElement textpassword;
	@FindBy(name="btnLogin")
	WebElement txtbutton;
	
	public void setuser(String uname)
	{
		textuser.sendKeys(uname);
	}
	public void setpassword(String pass)
	{
		textpassword.sendKeys(pass);
	}
	public void setsubmit()
	{
		txtbutton.click();
	}
	
	

}
