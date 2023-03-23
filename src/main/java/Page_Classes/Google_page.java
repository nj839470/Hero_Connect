package Page_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commen_Utility_Class.Baselibraray;

public class Google_page extends Baselibraray
{
public Google_page()
{
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//input[@class=\"gLFyf\"]")
	private WebElement search;
	@FindBy(xpath ="(//span[contains(text(),'hero connect')])[1]")
	private WebElement open_Hero_connect;
	public void get_Title()
	{
		String title = driver.getTitle();
		System.out.println(title);
		//read_Data_From_Database("select * from employee");
	}
	public void search_hero_connect()
	{
		log.info("---TC002---Search Hero on connect");
		custom_sendkeys(search, "Hero Connect", " = search hero Connect =" +search);
		
	}
	public void click_on_Hero_connect()
	{
		log.info("---TC003----Open hero_connect");
		Custom_click(open_Hero_connect, " = on hero_connect =" +open_Hero_connect);
		
	}
}
