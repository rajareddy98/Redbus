package com.RedBus.Test;


import org.testng.annotations.Test;

import com.RedBus.Generic.BaseTest;
import com.RedBus.Generic.ExcelData;
import com.RedBus.Pages.GoibiboPages;
import com.RedBus.Pages.HomePage;

public class LoginTest extends BaseTest
{
	@Test
	public void test() throws InterruptedException
	{
		String un=ExcelData.getData(file_path, "Sheet1", 1, 0);
		String pw=ExcelData.getData(file_path, "Sheet1", 1, 1);
		
		GoibiboPages gp= new GoibiboPages(driver);
		HomePage hp= new HomePage(driver);
		gp.clickOnSingButton();
		driver.switchTo().frame(0);
		gp.userName(un);
		gp.clickOnCont();
		gp.passwordName(pw);
		gp.clickOnSingin();
		hp.formButton("Bangalore (BLR)");
		hp.toButton("Hyderabad (HYD)");
		hp.ClickDepartdata();
		hp.clickOnData();
		hp.clickOnReturn();
		hp.clickOnData();
		hp.clickOnGoSetGoButton();
		
		
		Thread.sleep(50000);
	}
		
	

}
