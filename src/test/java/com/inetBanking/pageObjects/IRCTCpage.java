package com.inetBanking.pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTCpage {
	
	WebDriver driver;
	public IRCTCpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='From*']")
	WebElement txtFrom;
	@FindBy(xpath="//input[@placeholder='To*']")
	WebElement txtTo;
	@FindBy(xpath="//span[@class='fa fa-angle-right']")
	WebElement txtmonthclick;
	@FindBy(xpath="//div[@class='ui-datepicker-title']")
	WebElement txtMonth;
	@FindBy(xpath="//label[@class='ng-tns-c11-6 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")
	WebElement txtCoachdetail;
	@FindBy(xpath="//label[contains(text(),'Flexible With Date')]")
	WebElement txtFlexible;
	@FindBy(xpath="//label[contains(text(),'Divyaang Concession')]")
	WebElement txtDivyaang;
	@FindBy(xpath="//button[contains(text(),'Find trains')]")
	WebElement txtFindTrains;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	WebElement txtalert;
	@FindBy(xpath="//a[contains(text(),'')]")
	List<WebElement> date;
	@FindBy(xpath="//span[contains(text(),'')]")
	List<WebElement> coach;
	
	public void setcoachname(String coachname)
	{
		for(WebElement ele:coach)
		{
			String cname=ele.getText();
			if(cname.equals(coachname))
			{
				ele.click();
				break;
			}
		}
	}
	public void setAlert()
	{
		txtalert.click();
	}
	public void setFrom(String fname) throws InterruptedException
	{
		txtFrom.sendKeys(fname);
		Thread.sleep(1000);
		txtFrom.sendKeys(Keys.TAB);
	}
	public void setTo(String tname) throws InterruptedException
	{
		txtTo.sendKeys(tname);
		Thread.sleep(1000);
		txtTo.sendKeys(Keys.TAB);
	}
	public void setcoachclick()
	{
		txtCoachdetail.click();
	}
	public void setFindTrain()
	{
		txtFindTrains.click();
	}
	public void SetDay(String day)
	{
		for(WebElement d:date)
		{
			String datetxt=d.getText();
			if(datetxt.equals(day))
			{
				d.click();
				break;
			}
		}
	}
	public void SetDate(String month) 
	{
		while(true)
		{
			String text=txtMonth.getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				txtmonthclick.click();
			}
		}	
	}
}
