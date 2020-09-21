package com.inetBanking.testCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.IRCTCpage;

public class TC_IRCTCtest {
	
	public String from="PNBE";
	public String To="NDLS";
	public String rmonth="November2020";
	public String rday="30";
	public String coach="Sleeper (SL)";
	public String url="https://www.irctc.co.in/nget/train-search";
	public WebDriver driver;
	
	@Test
	public void IrctcHomePage() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\work1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		IRCTCpage ip=new IRCTCpage(driver);
		ip.setAlert();
		ip.setFrom(from);
		ip.setTo(To);
		ip.SetDate(rmonth);
		ip.SetDay(rday);
		ip.setcoachclick();
		ip.setcoachname(coach);
		ip.setFindTrain();
		Thread.sleep(2000); 
		TC_IRCTCtest obj=new TC_IRCTCtest();
		obj.CaptureScreen(driver,"TC_IRCTCtest");
		driver.close();
	}
	public void CaptureScreen(WebDriver driver,String testname) throws IOException
    {
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File target=new File("C:\\work1\\"+testname+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("screenshot is taken");
    }
}
