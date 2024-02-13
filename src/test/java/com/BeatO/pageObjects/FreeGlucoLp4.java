package com.BeatO.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGlucoLp4 {
WebDriver ldriver;
	
	public FreeGlucoLp4(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
				
	}	
	@FindBy(xpath="//span[text()=\"UPI \"]")
	@CacheLookup
	WebElement UPI;
	
	
	@FindBy(xpath="//span[text()=\"Wallets \"]")
	@CacheLookup
	WebElement Wallet;
	
	@FindBy(xpath="//span[text()=\"Debit and Credit Cards \"]")
	@CacheLookup
	WebElement CreditDebit;
	
	@FindBy(xpath="//input[@name=\"card[number]\"]")
	@CacheLookup
	WebElement VisaNum;
	
	@FindBy(xpath="//input[@name=\"card[expiry]\"]")
	@CacheLookup
	WebElement VisaExpire;
	
	@FindBy(xpath="//*[@name=\"card[cvv]\"]")
	@CacheLookup
	WebElement VisaCvv;

	@FindBy(xpath="//span[@id=\"footer-cta\"]")
	@CacheLookup
	WebElement VisaPay;
	
	@FindBy(xpath="//span[text()=\"Net Banking \"]")
	@CacheLookup
	WebElement NetBanking;

	@FindBy(xpath="//li[@onclick=\"cod()\"]")
	@CacheLookup
	WebElement CoD;
	
	@FindBy(xpath="//button[@id=\"paynowmob\"]")
	@CacheLookup
	WebElement PlaceOrder;
	

	@FindBy(xpath="//button[text()='PAY NOW']")
	@CacheLookup
	WebElement Order;
	
	@FindBy(xpath="//span[text()=\"Mobikwik\"]")
	@CacheLookup
	WebElement Mobikwik;
	
	@FindBy(xpath="//*[@name=\"vpa-upi\"]")
	@CacheLookup
	WebElement UPIID;
	
	@FindBy(xpath="//span[@id=\"footer-cta\"]")
	@CacheLookup
	WebElement PayAmount;
	
	
	public void  selUPI()
	{
		UPI.click();
	}
	
	public void  selUPI_ID()
	{
		ldriver.switchTo().frame(0);
		UPIID.sendKeys("success@razorpay");
	}
	
	
	public void  selWallet()
	{
		Wallet.click();
	}
	public void  selCreditDebit()
	{  
		CreditDebit.click();	
		
	}
	
	public void selVisa(){
		ldriver.switchTo().frame(0);
		VisaNum.sendKeys("4111111111111111");
		VisaExpire.sendKeys("1222");
		VisaCvv.sendKeys("123");
		VisaPay.click();
	}
	
	public void  selNetBanking()
	{
		NetBanking.click();
	}
	
	public void  selCoD()
	{
		CoD.click();
	}
	
	public void  Order()
	{	JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].scrollIntoView()",Order);
		
		Order.click();
	}
	public void  PayFinal()
	{
		PayAmount.click();
		
	}
	
	
	public void  selMobikwik() 
	{
		
		Mobikwik.click();
	}
	public void  PlaceOrder()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].scrollIntoView()",PlaceOrder);
		PlaceOrder.click();
	}



}
