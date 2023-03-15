
package Commen_Utility_Class;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_generator {
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		
		String path=System.getProperty("user.dir")+"\\Report\\index.html";
		report=new ExtentSparkReporter(path);
		
		report.config().setDocumentTitle("Hero_Connect-Automation Test Report");
		report.config().setReportName("Hero_Connect");
		report.config().setTheme(Theme.DARK);
		
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("System Name", "Project Name");
		extent.setSystemInfo("Laptop-Lenovo", "Hero_Connect");
		extent.setSystemInfo("QA", "Nitesh Kumar");
		extent.setSystemInfo("Operating system", "Windows 10");
		extent.setSystemInfo("BrowserName", "Chrome");
		return extent;
	}

}
