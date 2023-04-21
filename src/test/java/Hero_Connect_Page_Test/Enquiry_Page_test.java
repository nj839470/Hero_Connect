package Hero_Connect_Page_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commen_Utility_Class.Baselibraray;
import Page_Classes.Enquiry_Page;

public class Enquiry_Page_test extends Baselibraray
{
	public Enquiry_Page ob;
@Parameters({"env" , "browswe_name"})
@BeforeTest
public void launchURL(String env,String browswe_name )
{
	getlaunchURL(getReadData(env) , browswe_name);
	ob = new Enquiry_Page();
}
@Test(priority = 0)
public void get_Title()
{
	log.info("     ----T0001 ----Title page ------");
	msg(" Using Hero_Connect URL = ", getReadData("stageurl"));
	ob.get_Title();
	
}
@Test(priority = 1)
public void click_On_Enquiry() throws InterruptedException
{
	ob.click_On_Enquiry();

}
//@Test(priority = 2)
//public void click_on_Hero_connect()
//{
//	ob.click_on_Hero_connect();
//}
	
}
