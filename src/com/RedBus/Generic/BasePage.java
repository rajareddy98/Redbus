package com.RedBus.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait= new WebDriverWait(driver, 20);
		try
		{
		wait.until(ExpectedConditions.titleIs(etitle));
		
		Reporter.log("Title is matiching"+etitle,true);
		}
		catch (Exception e) 
		{
			Reporter.log("Title is not matching: Actual title is "+driver.getTitle(),true);
			Assert.fail();
		}
	}
	 
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch (Exception e)
		{
			Reporter.log("element is not present",true);
			Assert.fail();
		}
				
	}			
	
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				