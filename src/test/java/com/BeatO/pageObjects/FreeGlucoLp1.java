package com.BeatO.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FreeGlucoLp1 {
	WebDriver ldriver;
	
	public FreeGlucoLp1(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
				
	}	
	
	@FindBy(xpath="//input[@type=\"text\"]")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(xpath="//input[@type=\"number\"]")
	@CacheLookup
	WebElement txtMobileNo;
	
	@FindBy(xpath="//input[@type=\"email\"]")
	@CacheLookup
	WebElement txtEmail;
	@FindBy(xpath="//input[@type=\"submit\"]")
	@CacheLookup
	WebElement btnClaimNow;
	
	public void  setName(String uname)
	{
		txtName.sendKeys(uname);
	}
	public void  setMobileNo(String mobileno)
	{
		txtMobileNo.sendKeys(mobileno);
	}
	public void  setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	public void  clicksbmit()
	{
		btnClaimNow.click();
	}
}
