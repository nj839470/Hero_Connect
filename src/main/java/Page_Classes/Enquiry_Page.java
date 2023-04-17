package Page_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath ="//button[@name=\"s_3_1_341_0\"]/span")
	private WebElement new_Button;
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
		
	}
//	public void click_on_Hero_connect()
//	{
//		log.info("---TC003----Open hero_connect");
//		Custom_click(open_Hero_connect, " = on hero_connect =" +open_Hero_connect);
//		
//	}
}
