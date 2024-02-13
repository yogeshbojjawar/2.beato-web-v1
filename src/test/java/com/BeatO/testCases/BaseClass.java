package com.BeatO.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.BeatO.utilities.ReadConfig;

public class BaseClass {
	 ReadConfig readconfig=new ReadConfig();
	 public String baseurl=readconfig.getApplicationURL();
	 public String name=readconfig.getName();		 
	 public String mobileno=readconfig.getMobile();
	 public String email=readconfig.getEmail();
	 public String add1=readconfig.getAdress1();
	 public String add2=readconfig.getAdress2();
	 public String add3=readconfig.getAdress3();
	 public String pin=readconfig.getPincode();
	 public static WebDriver driver;
	 public static Logger logger;
	 @BeforeClass 
	 public void setup()
	 {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath()); 
		driver=new ChromeDriver();
		
		logger=Logger.getLogger("BeatO");
		PropertyConfigurator.configure("Log4j.properties");
	 }
	 
	 @AfterClass
	 public void teardown()
	 {
		//driver.quit(); 
	 }
}
