package com.BeatO.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src=new File("./Configuration/config.properties");
		try {
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is="+e.getMessage());
		}
		
			
	}
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getName() {
		String name=pro.getProperty("name");
		return name;
	}
	public String getMobile() {
		String mobile=pro.getProperty("mobileno");
		return mobile;
	}
	public String getEmail() {
		String email=pro.getProperty("email");
		return email;
	}
	public String getChromePath() {
		String chromedriver=pro.getProperty("chromepath");
		return chromedriver;
	}
	public String getAdress1() {
		String add1=pro.getProperty("addr1");
		return add1;
	}
	public String getAdress2() {
		String add2=pro.getProperty("addr2");
		return add2;
	}	
	public String getAdress3() {
		String add3=pro.getProperty("addr3");
		return add3;
	}	
	public String getPincode() {
		String pincode=pro.getProperty("pin");
		return pincode;
	}	

}
