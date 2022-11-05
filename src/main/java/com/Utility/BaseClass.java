package com.Utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExelDataProvider excel;
	public static ConfigDataProvider config;

	@BeforeSuite
     public void Bs() throws Exception {
	 excel=new ExelDataProvider();
	  config=new ConfigDataProvider();
  
	}
	@Parameters("BrowserName")
	@BeforeMethod
	public void BrowserOpen(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver();	   
		}else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		driver.get(config.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
 public void Close() {
	driver.quit();
	
	
	
	
 }
}
