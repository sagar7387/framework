package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentReports extend=ExtendReportGeneretor.getReports();
	ThreadLocal<ExtentTest> extenttest= new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		Library.test=extend.createTest(result.getClass().getName()+"++"+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "on success");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "in fail");
	Library.test.addScreenCaptureFromBase64String(Getcapture());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "in Skipped");
	}

	public void onFinish(ITestContext context) {
		extend.flush();
	}
	
	public static String Getcapture() {
		TakesScreenshot tc=(TakesScreenshot) driver;
		return tc.getScreenshotAs(OutputType.BASE64);
	}
	
	
	
	
	
	
	
	

}
