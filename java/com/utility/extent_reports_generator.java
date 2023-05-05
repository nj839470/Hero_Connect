
package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_generator {
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		
		String path=System.getProperty("user.dir")+"\\Report\\index.html";
		report=new ExtentSparkReporter(path);
		
		report.config().setDocumentTitle("MoonShot-Automation Test Report");
		report.config().setReportName("MoonShot");
		report.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("System Name", "Project Name");
		extent.setSystemInfo("Laptop-Dell", "MoonShot Web Application");
		extent.setSystemInfo("QA", "Savita Dhayal");
		extent.setSystemInfo("Operating system", "Windows 10 pro");
		extent.setSystemInfo("BrowserName", "Chrome");
		return extent;
	}

}
