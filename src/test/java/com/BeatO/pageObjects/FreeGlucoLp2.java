package com.BeatO.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGlucoLp2 {
	WebDriver ldriver;

	public FreeGlucoLp2(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);

	}	

	@FindBy(xpath="//div[@id=\"plan1mob-a\"]")
	@CacheLookup
	WebElement Card1;

	@FindBy(xpath="//div[@id=\"plan2mob-a\"]")
	@CacheLookup
	WebElement Card2;

	@FindBy(xpath="//div[@id=\"plan3mob-a\"]")
	@CacheLookup
	WebElement Card3;

	@FindBy(xpath="//button[@onclick=\"goToCheckout()\"]")
	@CacheLookup
	WebElement CheckOut;


	public void  selCard1()
	{
		Card1.click();
	}
	public void  selCard2()
	{
		Card2.click();
	}
	public void  selCard3()
	{
		Card3.click();
	}

	public void  selCheckout()
	{
		CheckOut.click();
	}


}
