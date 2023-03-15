package Hero_Connect_Page_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Commen_Utility_Class.Baselibraray;
import Page_Classes.Google_page;

public class Google_page_Test extends Baselibraray
{
	public Google_page ob;
@Parameters({"env" , "browswe_name"})
@BeforeTest
public void launchURL(String env,String browswe_name )
{
	getlaunchURL(getReadData(env) , browswe_name);
	ob = new Google_page();
}
@Test(priority = 0)
public void get_Title()
{
	log.info("     ----T0001 ----Title page ------");
	msg(" Using google URL = ", getReadData("google"));
	ob.get_Title();
}
@Test(priority = 1)
public void search_hero_connect()
{
	ob.search_hero_connect();
}
@Test(priority = 2)
public void click_on_Hero_connect()
{
	ob.click_on_Hero_connect();
}
	
}
