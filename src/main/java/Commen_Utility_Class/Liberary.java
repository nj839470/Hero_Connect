package Commen_Utility_Class;

import org.openqa.selenium.WebElement;

public interface Liberary {
	public void custom_sendkeys(WebElement element,String value,String fieldname);
	public  void Custom_click(WebElement element,String fieldname);
	public void msg(String fieldname,String fieldname1);
	public  void visible_and_click(WebElement element,String fieldname);
	public  void visible(WebElement element,String fieldname);
}
