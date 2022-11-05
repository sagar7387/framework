package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGeneretor {
	public static ExtentReports extend;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\admin\\eclipse-workspace\\Framework Design\\Reports";
		ExtentSparkReporter reporter=new  ExtentSparkReporter(path);
				
		reporter.config().setDocumentTitle("Auomation Reports");
		reporter.config().setReportName("Morning Batch");
		reporter.config().setTheme(Theme.DARK);
		
		
		
		
		 extend= new   ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("project name", "facebook");
		extend.setSystemInfo("module name", "login page");  
		extend.setSystemInfo("Automation Tool", "Selenium");
		extend.setSystemInfo("Q.A name", "pawan gupta");
		
		return extend;
		
	}
	
	
	
	

}
