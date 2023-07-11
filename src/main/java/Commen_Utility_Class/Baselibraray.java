package Commen_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibraray
		implements PropertyUtility, ExcelUtility, Liberary, ScreenshotUtility, ApplicationUtility, JDBC_Connect {
	public static WebDriver driver;
	String confipath = System.getProperty("user.dir") + "\\Test_data\\config.properties";
	String excelpath = System.getProperty("user.dir");
	public static ExtentTest test;
	public static WebDriverWait wait;
	public static Logger log;
	public static listner lis;

	public void getlaunchURL(String url, String browsername) {
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
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			if (url.equalsIgnoreCase(getReadData("testurl"))) {
				WebElement advanced = driver.findElement(By.cssSelector("button[id=\"details-button\"]"));
				advanced.click();
				driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
				driver.findElement(By.cssSelector("input[name=\"SWEUserName\"]"))
						.sendKeys(getReadData("sales_user_id"));
				driver.findElement(By.cssSelector("input[name=\"SWEPassword\"]")).sendKeys(getReadData("password"));
				driver.findElement(By.xpath("//a[@id=\"s_swepi_22\"]")).click();
				log = LogManager.getLogger("Hero_Connect");
				lis = new listner();
			} else {
				driver.findElement(By.cssSelector("input[name=\"SWEUserName\"]"))
						.sendKeys(getReadData("sales_user_id"));
				driver.findElement(By.cssSelector("input[name=\"SWEPassword\"]")).sendKeys(getReadData("password"));
				driver.findElement(By.xpath("//a[@id=\"s_swepi_22\"]")).click();
				log = LogManager.getLogger("Hero_Connect");
				lis = new listner();
			}

		} catch (Exception e) {
			System.out.println("Problem in launch browser" + e);
		}
	}

	public String getReadData(String key) {
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

	public String getReadData(int sheetno, int rowmo, int colno) {
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

	public void custom_sendkeys(WebElement element, String value, String fieldname) {
		try {
			if (element.isEnabled() || element.isDisplayed() == true) {
				wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(element));
				//element.clear();
				element.sendKeys(value);
				test.log(Status.PASS, fieldname + "==Value Successfully send==" + value);
				log.info("  Successfully send Value " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Send  Value==" + e);
			log.error("==Unable to send Value " + fieldname);
			lis.onTestFailure(null);
		}

	}

	public void Custom_click(WebElement element, String fieldname) {
		try {
			if (element.isDisplayed() || element.isEnabled() == true) {
				 wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				test.log(Status.PASS, "Successfully click==" + fieldname);
				log.info("  Successfully Click " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Click ==" + e);
			log.error("==Unable to Click " + fieldname);
			lis.onTestFailure(null);
		}
	}

	public void msg(String fieldname, String fieldname1) {
		try {
			test.log(Status.PASS, " " + fieldname + " " + fieldname1);
			log.info(fieldname + "" + fieldname1);
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname1 + "==Unable Action performed ==" + e);
			log.error(fieldname + "" + fieldname1);
			lis.onTestFailure(null);
		}
	}

	public void visible_and_click(WebElement element, String fieldname) {
		try {
			if (element.isDisplayed() || element.isEnabled() == true) {

				element.click();
				test.log(Status.PASS, "Element is visible ==" + fieldname);
				log.info("  Element is visible " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Element visible ==" + e);
			log.error("==Unable to Element visible " + fieldname);
			lis.onTestFailure(null);
		}

	}

	public void visible(WebElement element, String fieldname) {
		try {
			if (element.isDisplayed() || element.isEnabled() == true) {
				Thread.sleep(500);
				test.log(Status.PASS, "Element is visible ==" + fieldname);
				log.info("  Element is visible " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Element visible ==" + e);
			log.error("==Unable to Element visible " + fieldname);
			lis.onTestFailure(null);
		}

	}

	public void getScreenShot(String foldername, String filename) {
		String path = System.getProperty("user.dir") + "\\Screen_Shot\\" + foldername + "\\" + filename + ".png";
		try {

			EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
			File src = ewf.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		} catch (Exception e) {
			System.out.println("Problem in getScreen shot meythod" + e);
			
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
////				getScreenShot("Passed" , filename + date_and_Time("dd-MM-yyyy_hh mm ss"));
//			}
//			else if(result.getStatus()==ITestResult.FAILURE)
//			{
//				getScreenShot("Faild", filename +date_and_Time("dd-MM-yyyy_hh mm ss"));
//			}
//			else if(result.getStatus()==ITestResult.SKIP)
//			{
//				getScreenShot("Skip", filename +date_and_Time("dd-MM-yyyy_hh mm ss"));
//			}
//		} catch (Exception e) {
//			System.out.println("Problem in getanalysis" +e);
//		}
//	}
	@Override
	public String date_and_Time(String formate) {
		String value = "";
		try {
			Date db = new Date();
			DateFormat df = new SimpleDateFormat(formate);
			value = df.format(db);
		} catch (Exception e) {
			System.out.println("Problem in data and time" + e);
		}
		return value;
	}

	@AfterTest
//	public void closewindow()
//	{
//		driver.quit();
//	}
	@Override
	public ResultSet read_Data_From_Database(String query) {
		ResultSet result = null;
		String name = "", des = "";
		int age = 0, rollnum = 0, salary = 0;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nk", "root", "Sql@12345");
			PreparedStatement statement = con.prepareStatement(query);
			result = statement.executeQuery();
//			while(result.next())
//			{
//				 name= result.getString(1);
//				 age = result.getInt(2);
//				 rollnum = result.getInt(3);
//				 salary = result.getInt(4);
//				 des = result.getString(5);
//				 System.out.println(rollnum + "   " + name+ "   " + age +"   "+ salary+ "   " +des +"\n");
//			}

		} catch (Exception e) {
			System.out.println("Problem in Read data from database " + e);
		}
		return result;
	}

	@Override
	public void drop_down_byIndex(WebElement element ,int index , String fieldname) {
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Select sel = new Select(element);
			sel.selectByIndex(index);
			test.log(Status.PASS, fieldname + "==Value Successfully select==" + fieldname);
			log.info("  Successfully send " + fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To  select ==" + e);
			log.error("==Unable to select " + fieldname);
			lis.onTestFailure(null);		}
		
	}

	@Override
	public void drop_down_by_Value(WebElement element, String value, String fieldname) {
	try {
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select sel = new Select(element);
		sel.selectByValue(value);
		test.log(Status.PASS, fieldname + "==Value Successfully select==" + fieldname);
		log.info("  Successfully selet Value " + fieldname);
	} catch (Exception e) {
		test.log(Status.FAIL, fieldname + "==Unable To  selectable ==" + e);
		log.error("==Unable to select " + fieldname);
		lis.onTestFailure(null);
	}
		
	}

}
