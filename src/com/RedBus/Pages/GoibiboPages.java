package com.RedBus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedBus.Generic.BasePage;

public class GoibiboPages extends BasePage
{
	//declartion
	@FindBy(xpath="//a[@id='get_sign_in']")
	private WebElement sgBT;
	
	@FindBy(xpath="//input[@id='authMobile']")
	private WebElement unTB;
	
	@FindBy(id="mobileSubmitBtn")
	private WebElement contBT;
	
	@FindBy(id="authCredentialPassword")
	private WebElement pwTb;
	
	@FindBy(id="authCredentialPasswordSignInBtn")
	private WebElement sinBT;
	
	//intlization
	public GoibiboPages(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//utlization
	
	public void clickOnSingButton()
	{
		sgBT.click();
	}
	
	public void userName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void clickOnCont()
	{
		contBT.click();
	}
	public void passwordName(String pw)
	{
		pwTb.sendKeys(pw);
	}
	
	public void clickOnSingin()
	{
		sinBT.click();
	}
}
