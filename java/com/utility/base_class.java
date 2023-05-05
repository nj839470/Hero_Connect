package com.utility;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class implements config_data_provider , excel_data_provider , library
{
	public static WebDriver driver;
	public static Logger log;
	public static WebDriverWait wait;
	public static ExtentTest test;
	public static listner lis;
	String confipath = System.getProperty("user.dir") + "\\config_data\\config.properties";
	String excelpath=System.getProperty("user.dir")+"\\data\\data1.xlsx";

	@Parameters({ "browser_name" })
	@BeforeTest
	public void getlaunchURL(@Optional("chrome") String browsername) {
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			if (browsername.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
//				dc.setBrowserName("chrome");
//				driver =new RemoteWebDriver(new URL("http://localhost:4444"), dc);
			} else if (browsername.equalsIgnoreCase("edge")) {
				// WebDriverManager.edgedriver().setup();
				// driver=new EdgeDriver();
				dc.setBrowserName("edge");
				driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
			} else if (browsername.equalsIgnoreCase("firefox")) {
				// WebDriverManager.firefoxdriver().setup();
				// driver=new FirefoxDriver();
				dc.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
			}
			driver.get(config_getdata("stageurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			log = LogManager.getLogger("Moonshot_Web");
		}catch (Exception e) {
				System.out.println("Problem in launch browser" + e);
			}
		}
@Override
	public String config_getdata(String key) 
	{
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(confipath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (Exception e) {
			System.out.println("Problem in read data from property file" + e);
		}
		return value;
	}
@Override
	public String excel_getdata(int sheetno, int rowmo, int colno) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			value = sheet.getRow(rowmo).getCell(colno).getStringCellValue();

		} catch (Exception e) {
			System.out.println("Problem in read data from excel file" + e);
		}
		return value;
	}
	@Override
	public int getRowCount(int sheetno) {
		int count =0;
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			count=sheet.getLastRowNum();
			
		} catch (Exception e) {
			System.out.println("Problem in read data from excel file for Row_Count" + e);
		}
		return count;
	}
@Override
	public int getColCount(int sheetno) {
		int count =0;
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			count=sheet.getRow(0).getLastCellNum();
			} catch (Exception e) {
			System.out.println("Problem in read data from excel file for Row_Count" + e);
		}
		return count;
	}
@Override
public void custom_sendkeys(WebElement element, String value, String fieldname) 
{
	try {
	if(element.isEnabled() || element.isDisplayed()==true) {
		element.sendKeys(value);
	test.log(Status.PASS, fieldname+ "==Value Successfully send=="+value);
	log.info("Successfully send Value "+fieldname);
	}
	}
	catch(Exception e) {
	test.log(Status.FAIL, fieldname+"==Unable To Send  Value==");
	log.error("==Unable to send Value "+fieldname);
	test.addScreenCaptureFromBase64String(lis.getcapcture());
	}
}
@Override
public void Custom_click(WebElement element, String fieldname) {
	try {
		if(element.isDisplayed() || element.isEnabled()==true) {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			test.log(Status.PASS, "Successfully click=="+ fieldname);
			log.info("Successfully Click "+fieldname);
		}
	}
catch(Exception e) {
		test.log(Status.FAIL, fieldname+"==Unable To Click =="+e);
		log.error("==Unable to Click "+fieldname);
		lis.onTestFailure(null);
					}
}
@Override
public void VerifyElementPresent(WebElement ele, String fieldname, String Text) {
	try {
		if(ele.isDisplayed()==true) {
			 Text= ele.getText();
			 test.log(Status.PASS, "Element is present:  "+ fieldname + ": "+Text );
			 log.info("Text present "+fieldname+";"+Text);
		}
			}
		catch (Exception e) {
			test.log(Status.FAIL, fieldname+"==Element is not present =="+e);}
	}
@Override
public void VerifyIconPresent(WebElement ele, String fieldname) {
	try {
		if(ele.isDisplayed()==true) {
			 
			 test.log(Status.PASS, "Image is present:  "+ fieldname);
		}
			
		}
		catch (Exception e) {
			test.log(Status.FAIL, fieldname+"==Image is not present =="+e);}
	}
@Override
public void VerifyImagePresent(WebDriver driver, WebElement image, String fieldname) {
	try {
		Boolean ImagePresent=(Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", image);
		if(ImagePresent) {
		 test.log(Status.PASS, "Image is present:  "+ fieldname);
		 log.info("Image is present "+fieldname);
	}
		}
	catch (Exception e) {
		test.log(Status.FAIL, fieldname+"==Image is not present =="+e);}
	}
@Override
public void PageLoaded(WebDriver driver, String Title) {
	try {
	     Title=driver.getTitle();
	     test.log(Status.PASS, "Page is loaded : "+Title);
		log.info("Page is loaded " +Title);
	}catch (Exception e) {
			test.log(Status.FAIL, "==page is not loaded :"+e);}
	}
//////////////////////////////// Explicit Wait ///////////////////////////////	
public void Wait(WebElement element) {
 wait = new WebDriverWait(driver, 30);
 wait.until(ExpectedConditions.visibilityOf(element));
}
@Override
public void VerifyTextByAttribute(WebElement ele, String fieldname, String Text) {
	try {
		if(ele.isDisplayed()==true) {
			Wait(ele);
			 Text= ele.getAttribute("value");
			 test.log(Status.PASS, "Element is present:  "+ fieldname + ": "+Text );
			 log.info("Text present "+fieldname);
		}
			}catch (Exception e) {
			test.log(Status.FAIL, fieldname+"==Element is not present =="+e);}
	}
@Override
public void Check_IfSelected(WebElement ele, String fieldname, String Text) {
	try {
		if(ele.isSelected()==true) {
			Wait(ele);
			 Text=ele.getText();
			 test.log(Status.PASS, "Element is present:  "+ fieldname + ": "+Text );
			 log.info("Element is already selected "+fieldname);
		}
		else {
			 Text=ele.getText();
			 test.log(Status.PASS, "Element is present:  "+ fieldname + ": "+Text );
			 Wait(ele);
			 ele.click();
			 log.info("Element is  clickable "+fieldname);
		}
			}catch (Exception e) {
			test.log(Status.FAIL, fieldname+"==Element is not present =="+e);}
	}
@Override
public void TextOfElement(String ele, String fieldname) {
	try {
		//if(( ele.isDisplayed()==true) {
			test.log(Status.PASS, "Text is visibile :"+ fieldname + ":"+ele);
		}catch(Exception e) {
			test.log(Status.FAIL, fieldname+"==Unable To find =="+e);
			log.error("==Unable to find "+fieldname);
			}
	}
@Override
public void verify_if_Clickable(WebElement ele, String fieldname) {
	ele.click();
	//  test.log(Status.PASS, "Element is clickabale:"+ fieldname);
	

		test.log(Status.FAIL, fieldname+"=Element is not clickbale ==");
		log.error("==Unable to click "+fieldname);
		test.addScreenCaptureFromBase64String(lis.getcapcture());
	}
}

	


	
	

	
	






