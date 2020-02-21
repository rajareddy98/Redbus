package com.RedBus.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
				
	}
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		int status=res.getStatus();
		if(status==2)
		{
			String name=res.getMethod().getMethodName();
			GenricUtils.getScreenShot(driver, name);
		}
		
		driver.close();
	}
	
}
