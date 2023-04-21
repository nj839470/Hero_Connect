package Page_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Commen_Utility_Class.Baselibraray;

public class Enquiry_Page extends Baselibraray
{
public Enquiry_Page()
{
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//a[text()='Enquiry']")
	private WebElement enquiry;
	@FindBy(xpath ="//button[@name=\"s_3_1_341_0\"]")
	private WebElement new_Button;
	@FindBy(xpath = "//input[@name=\"s_2_1_1_0\"]")
	private WebElement prefixes;
	@FindBy(xpath ="//li[@data-licval=\"Mr.\"]")
	private WebElement mr_prefixes;
	@FindBy(xpath = "//input[@un=\"Contact First Name\"]")
	private WebElement firstname;
	@FindBy(xpath ="//input[@un=\"Contact Last Name\"]")
	private WebElement lastname;
	public void get_Title()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public void click_On_Enquiry() throws InterruptedException
	{
		log.info("---TC002---Enquiry page");
		Thread.sleep(2000);
		Custom_click(enquiry, " enquiry");
		Custom_click(new_Button, "new button");
		Thread.sleep(2000);
		custom_sendkeys(prefixes, "My.", "Prefixes");
		Thread.sleep(2000);
		//Custom_click(mr_prefixes, "Chose Prefix");
		custom_sendkeys(firstname, "Rajkumar", "First Nmae");
		custom_sendkeys(lastname, "sing", "Last name");
		
		
	}
//	public void click_on_Hero_connect()
//	{
//		log.info("---TC003----Open hero_connect");
//		Custom_click(open_Hero_connect, " = on hero_connect =" +open_Hero_connect);
//		
//	}
}
