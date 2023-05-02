package Commen_Utility_Class;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public String date_and_Time(String formate);
	public void drop_down_byIndex(WebElement element ,int index , String fieldname );
	public void drop_down_by_Value(WebElement element , String value ,String fieldname );
	
	

}
