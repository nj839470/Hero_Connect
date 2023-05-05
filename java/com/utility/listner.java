package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class listner extends base_class implements ITestListener {
	
	ExtentReports extent=extent_reports_generator.getreports();
	ThreadLocal<ExtentTest> extent_test=new ThreadLocal<ExtentTest>();

		public void onTestStart(ITestResult result) {
			test=extent.createTest(result.getTestClass().getName()+ "== " +result.getMethod().getMethodName());
			extent_test.set(test);
		}
	
		public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Pass");
	//		library.test.addScreenCaptureFromBase64String(getcapcture());
		}
	
		public void onTestFailure(ITestResult result) {
			test.log(Status.FAIL, "Test Case Fail");
			test.addScreenCaptureFromBase64String(getcapcture());
		}
	
		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, "Test Case Skip");
		}
	
	
		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
	
		public String getcapcture() {
			TakesScreenshot ts=(TakesScreenshot) driver;
			return ts.getScreenshotAs(OutputType.BASE64);
		}
		
	

}
