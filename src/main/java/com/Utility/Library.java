package com.Utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	


	public static void customsendkey(WebElement element ,String value) {
		
		
		try {

			element.sendKeys(value);
			test.log(Status.PASS, "success");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			test.log(Status.FAIL, e.getMessage());

		}
	}
		
		public static void customclick(WebElement element ) {
		try	{
			element.click();
			
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
			
		}
		}
		public static  Alert custom_handleAlert(WebDriver driver) {
			
			return driver.switchTo().alert();
			
		}
		
		public static void customIframeHanadlename(WebDriver driver) {
			
			driver.switchTo().frame("selenium");
			
		}

		public static void customIframeHanadlemainpage(WebDriver driver) {
		driver.switchTo().frame(1);
			
			
		}
			
		
	public static void DropdownHandle(WebElement element,String value) {
		
		Select sel= new Select(element);
		sel.selectByVisibleText(value);
	
	}

	public static void ExplicitWait( WebDriver driver,WebElement element,int time) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
		
		}


