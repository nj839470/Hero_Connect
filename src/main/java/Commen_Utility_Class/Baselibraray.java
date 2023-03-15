package Commen_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibraray implements PropertyUtility , ExcelUtility , Liberary , ScreenshotUtility , ApplicationUtility
{
public static WebDriver driver;
	String confipath = System.getProperty("user.dir") +"\\Test_data\\config.properties";
	String excelpath = System.getProperty("user.dir");
	public static ExtentTest test;
	public static Logger log;
	public void getlaunchURL(String url , String browsername)
	{
		try {
			//URL remote = new URL("http://192.168.29.205:4444");
			if(browsername.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				//driver =new RemoteWebDriver(remote, new ChromeOptions());
			}
			else if(browsername.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				//driver = new RemoteWebDriver(remote, new EdgeOptions());
				}
			else if(browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				//driver = new RemoteWebDriver(remote, new FirefoxOptions());
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			log = LogManager.getLogger("Hero_Connect");
			
		} catch (Exception e) {
			System.out.println("Problem in launch browser" +e);
		}
	}
	public String getReadData(String key) 
	{
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(confipath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
		} catch (Exception e) {
			System.out.println("Problem in read data from property file" +e);
		}
		return value;
	}
	public String getReadData(int sheetno, int rowmo, int colno)
	{
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			value = sheet.getRow(rowmo).getCell(colno).getStringCellValue();
			
		} catch (Exception e) {
			System.out.println("Problem in read data from excel file" +e);
		}
		return value;
	}
	public void custom_sendkeys(WebElement element, String value, String fieldname) {
		try {
			if(element.isEnabled() || element.isDisplayed()==true) {
				element.clear();
				element.sendKeys(value);
			test.log(Status.PASS, fieldname+ "==Value Successfully send=="+value);
			log.info("  Successfully send Value "+fieldname);
			}
	}
	catch(Exception e) {
			test.log(Status.FAIL, fieldname+"==Unable To Send  Value=="+e);
			log.error("==Unable to send Value "+fieldname);
	}

		
	}
	public void Custom_click(WebElement element, String fieldname) 
	{
		try {
			if(element.isDisplayed() || element.isEnabled()==true) {
				element.click();
				test.log(Status.PASS, "Successfully click=="+ fieldname);
				log.info("  Successfully Click "+fieldname);
			}
		}
	catch(Exception e) {
			test.log(Status.FAIL, fieldname+"==Unable To Click =="+e);
			log.error("==Unable to Click "+fieldname);
						}
		
	}
	public void msg(String fieldname, String fieldname1) 
	{
		try {
			test.log(Status.PASS," "+fieldname+" "+ fieldname1);
			log.info(fieldname+""+fieldname1);
	}
catch(Exception e) {
		test.log(Status.FAIL, fieldname1+"==Unable Action performed =="+e);
		log.error(fieldname+""+fieldname1);
					}

		
	}
	public void visible_and_click(WebElement element, String fieldname) 
	{
		try {
			if(element.isDisplayed() || element.isEnabled()==true) {
		
				element.click();
				test.log(Status.PASS, "Element is visible =="+ fieldname);
				log.info("  Element is visible "+fieldname);
			}
		}
	catch(Exception e) {
			test.log(Status.FAIL, fieldname+"==Unable To Element visible =="+e);
			log.error("==Unable to Element visible "+fieldname);
						}

		
	}
	public void visible(WebElement element, String fieldname) 
	{
		try {
			if(element.isDisplayed() || element.isEnabled()==true) {
				Thread.sleep(500);
				test.log(Status.PASS, "Element is visible =="+ fieldname);
				log.info("  Element is visible "+fieldname);
			}
		}
	catch(Exception e) {
			test.log(Status.FAIL, fieldname+"==Unable To Element visible =="+e);
			log.error("==Unable to Element visible "+fieldname);
						}
		
	}
	@AfterTest
	public void closewindow()
	{
		driver.quit();
	}
	@Override
	public void getScreenShot(String foldername, String filename) 
	{
		String path = System.getProperty("user.dir")+"\\Screen_Shot\\" +foldername + "\\*\\" +filename + ".png";
	try {
		
		EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
		File src = ewf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	} catch (Exception e) {
		System.out.println("Problem in getScreen shot meythod" +e);
	}
	}
//	@AfterMethod
//	public void getanalysis(ITestResult result)
//	{
//		String filename = result.getMethod().getMethodName();
//		try {
//			
//			if(result.getStatus()==ITestResult.SUCCESS)
//			{
//				getScreenShot("Pass" , filename + date_and_Time("dd-MM-yyyy hh:mm:ss"));
//			}
//			else if(result.getStatus()==ITestResult.FAILURE)
//			{
//				getScreenShot("Fail", filename +date_and_Time("dd-MM-yyyy hh:mm:ss"));
//			}
//			else if(result.getStatus()==ITestResult.SKIP)
//			{
//				getScreenShot("Skip", filename +date_and_Time("dd-MM-yyyy hh:mm:ss"));
//			}
//		} catch (Exception e) {
//			System.out.println("Problem in getanalysis" +e);
//		}
//	}
//	@Override
	public String date_and_Time(String formate) 
	{
		String value ="";
		try {
			Date db = new Date();
			DateFormat df = new SimpleDateFormat(formate);
			value =df.format(db);
			} catch (Exception e) {
			System.out.println("Problem in data and time" +e);
		}
		return value;
	}
		
	}
	

