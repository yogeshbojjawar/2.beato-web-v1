package com.BeatO.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.BeatO.pageObjects.FreeGlucoLp1;
import com.BeatO.pageObjects.FreeGlucoLp2;
import com.BeatO.pageObjects.FreeGlucoLp3;
import com.BeatO.pageObjects.FreeGlucoLp4;

public class Tc_FreeGluco_001 extends BaseClass
{
	FreeGlucoLp4 obj3;
    @Test
	public void freeglucolp1() throws InterruptedException
	{
    	driver.get(baseurl);
    	logger.info("URL Opened");
    	driver.manage().window().maximize();
    	FreeGlucoLp1 obj=new FreeGlucoLp1(driver);
    	Thread.sleep(5000); 
    	obj.setName(name);
    	logger.info("Name Entered");
    	obj.setMobileNo(mobileno);
    	logger.info("Mobile Entered");
    	obj.setEmail(email);
    	logger.info("Email Entered");
    	obj.clicksbmit();
    	logger.info("Submited page1");
    	
    	
    	if(driver.getTitle().equals("Claim Free Glucometer")) {
    		Assert.assertTrue(true);
    		logger.info("Page1 Passed");
    	}
    	else {
    		Assert.assertTrue(false);
    		logger.info("Page1 Failed");
    	}
    	
    	FreeGlucoLp2 obj1=new FreeGlucoLp2(driver);
    	Thread.sleep(5000); 
    	obj1.selCard1();
    	logger.info("Item 1 selected");
    	obj1.selCheckout();
    	logger.info("CheckOut clicked");
    	
    	if(driver.getTitle().equals("Claim Free Glucometer")) {
    		Assert.assertTrue(true);
    		logger.info("Page2 Passed");
    	}
    	else {
    		Assert.assertTrue(false);
    		logger.info("Page2 Failed");
    	}
    	
    	FreeGlucoLp3 obj2=new FreeGlucoLp3(driver);
    	Thread.sleep(5000); 
    	/*obj2.setName(name);
    	logger.info("Name Entered");
    	Thread.sleep(5000); 
    	obj2.setMobileNo(mobileno);
    	logger.info("Mobile Entered");
    	Thread.sleep(5000); 
    	obj2.setEmail(email);
    	logger.info("Email Entered");
    	Thread.sleep(5000); */
    	obj2.setAdd1(add1);
    	logger.info("Addr1 Entered");
    
    	obj2.setAdd2(add2);
    	logger.info("Addr2 Entered");
    	
    	obj2.setAdd3(add3);
    	logger.info("Addr3 Entered");
    	 
    	obj2.setPin(pin);
    	Thread.sleep(5000); 
    	logger.info("Pincode Entered");
    	
    	Thread.sleep(5000); 
    	obj2.clickNext();
    	logger.info("CheckOut clicked");
    	
    	if(driver.getTitle().equals("Claim Free Glucometer")) {
    		Assert.assertTrue(true);
    		logger.info("Page3 Passed");
    	}
    	else {
    		Assert.assertTrue(false);
    		logger.info("Page3 Failed");
    	}
    	Thread.sleep(2000);
    	
    	obj3=new FreeGlucoLp4(driver);
    	Thread.sleep(5000); 
    	//obj3.selUPI();
    	//logger.info("UPI selected");
    	//obj3.selWallet();
    	//logger.info("Wallet selected");
    	
    	 allcredit();
    	
    	 	//obj3.selCoD();
    	//logger.info("CoD selected");
    	//obj3.PayFinal();
    	//logger.info("Amount paid");
    	//obj3.PlaceOrder();
    	
    	//logger.info("Order Placed");
    	//obj3.selMobikwik();
    	
    	//logger.info("Mobikwik selected");
    	
    	if(driver.getTitle().equals("Claim Free Glucometer")) {
    		Assert.assertTrue(true);
    		logger.info("Page4 Passed");
    	}
    	else {
    		Assert.assertTrue(false);
    		logger.info("Page4 Failed");
    	}
	}

	private void allcredit() throws InterruptedException {
		obj3.selCreditDebit();
    	logger.info("Credit/Debit selected");
    	obj3.Order();
    	logger.info("PAY NOW selected");
    	Thread.sleep(5000);
    	//obj3.selUPI_ID();
    	//logger.info("UPI entered");
    	obj3.selVisa();
    	logger.info("Card details Entered");
   
	}
}
