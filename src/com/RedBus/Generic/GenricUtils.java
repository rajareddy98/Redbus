package com.RedBus.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenricUtils 
{
	public static void getScreenShot(WebDriver driver,String name)
	{
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShot"+ name +".png");
		
		FileUtils.copyFile(src, dest);
		}
		catch (Exception e) 
		{
		
		}
	}

	
	
}
