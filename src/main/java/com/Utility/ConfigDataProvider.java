package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
      Properties pro;
	public ConfigDataProvider() throws Exception {
		String path="C:\\Users\\admin\\eclipse-workspace\\Framework Design\\ConfigFileProperties\\config.properties";
		FileInputStream fis= new FileInputStream(path);
		
		 pro=new  Properties();
		 pro.load(fis);
	}
	
	public String geturl() {
		
		return pro.getProperty("URL");
	}
	public String getemail() {
		return pro.getProperty("email");
		
	}
	public String getpass() {
		return pro.getProperty("pass");
		
	}
	

}
