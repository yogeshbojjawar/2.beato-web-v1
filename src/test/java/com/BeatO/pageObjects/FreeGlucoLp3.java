package com.BeatO.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGlucoLp3 {
WebDriver ldriver;
	
	public FreeGlucoLp3(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
				
	}	
	
	@FindBy(xpath="//*[@id=\"name\"]")
	@CacheLookup
	WebElement FName;
	
	@FindBy(xpath="//*[@id=\"mobilemob\"]")
	@CacheLookup
	WebElement MobNo;
	
	@FindBy(xpath="//*[@id=\"emailmob\"]")
	@CacheLookup
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"line1mob\"]")
	@CacheLookup
	WebElement Adres1;
	
	@FindBy(xpath="//*[@id=\"line2mob\"]")
	@CacheLookup
	WebElement Adres2;
	
	@FindBy(xpath="//*[@id=\"line3mob\"]")
	@CacheLookup
	WebElement Adres3;
	
	@FindBy(xpath="//*[@id=\"pincodemob\"]")
	@CacheLookup
	WebElement Pin;
	
	@FindBy(xpath="//button[@onclick=\"paynow()\"]")
	@CacheLookup
	WebElement PayNow;
	
	public void  setName(String uname)
	{
		FName.sendKeys(uname);
	}
	public void  setMobileNo(String mobileno)
	{
		MobNo.sendKeys(mobileno);
	}
	public void  setEmail(String email)
	{
		Email.sendKeys(email);
	}
	public void  setAdd1(String address1)
	{
		Adres1.sendKeys(address1);
	}
	public void  setAdd2(String address2)
	{
		Adres2.sendKeys(address2);
	}
	public void  setAdd3(String address3)
	{
		Adres3.sendKeys(address3);
	}
	public void  setPin(String pin)
	{
		Pin.sendKeys(pin);
	}

	public void  clickNext()
	{
		PayNow.click();
	}
	
}
