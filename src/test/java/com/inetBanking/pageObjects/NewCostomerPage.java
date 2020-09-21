package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCostomerPage {
	
	WebDriver ldriver;
	public NewCostomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement txtAddCustomer;
	@FindBy(name="name")
	WebElement txtcustname;
	@FindBy(xpath="//tr[5]//td[2]//input[1]")
	WebElement txtmalebtn;
	@FindBy(xpath="//tr[5]//td[2]//input[2]")
	WebElement txtfemalebtn;
	@FindBy(id="dob")
	WebElement txtdob;
	@FindBy(name="addr")
	WebElement txtaddres;
	@FindBy(name="city")
	WebElement txtcity;
	@FindBy(name="state")
	WebElement txtstate;
	@FindBy(name="pinno")
	WebElement txtpinno;
	@FindBy(name="telephoneno")
	WebElement txttelephone;
	@FindBy(name="emailid")
	WebElement txtemail;
	@FindBy(name="sub")
	WebElement txtsubmit;
	@FindBy(name="res")
	WebElement txtreset;
	
	
	public void setclickNewCustomer()
	{
		txtAddCustomer.click();
	}
	public void setusername(String uname)
	{
		txtcustname.sendKeys(uname);
	}
	public void setmale()
	{
		txtmalebtn.click();
	}
	public void setdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	public void setaddress(String add)
	{
		txtaddres.sendKeys(add);
	}
	public void setcity(String city)
	{
		txtcity.sendKeys(city);
	}
	public void setstate(String state)
	{
		txtstate.sendKeys(state);
	}
	public void setpinno(String pinno)
	{
		txtpinno.sendKeys(pinno);
	}
	public void setphoneno(String phone)
	{
		txttelephone.sendKeys(phone);
	}
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setsubmit()
	{
		txtsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
