package Page_Classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath = "//input[@rn=\"Mr/Ms\"]")
	private WebElement prefixes;
	@FindBy(xpath ="//li[@data-licval=\"Mr.\"]")
	private WebElement mr_prefixes;
	@FindBy(xpath = "//input[@un=\"Contact First Name\"]")
	private WebElement firstname;
	@FindBy(xpath ="//input[@un=\"Contact Last Name\"]")
	private WebElement lastname;
	@FindBy(xpath ="//input[@rn=\"Key Contact Mobile #\"]")
	private WebElement mobile_number;
	@FindBy(xpath ="//input[@rn=\"Key Contact Email4\"]")
	private WebElement email;
	@FindBy(xpath ="//input[@rn=\"State\"]")
	private WebElement state;
	@FindBy(xpath ="//input[@rn=\"District\"]")
	private WebElement district;
	@FindBy(xpath="//input[@rn=\"HHML Tehsil\"]")
	private WebElement Tehsil;
	@FindBy(xpath ="//input[@rn=\"Key Contact City4\"]")
	private WebElement  city;
	@FindBy(xpath ="//input[@un=\"Address Line 1\"]")
	private WebElement address_line1;
	@FindBy(xpath ="//input[@un=\"Pin Code\"]")
	private WebElement pin_code;
	@FindBy(xpath ="//input[@rn=\"HMCL Contact Age\"]")
	private WebElement age;
	@FindBy(xpath ="//input[@rn=\"HMCL MF\"]")
	private WebElement gender;
	@FindBy(xpath ="//input[@un=\"Occupation\"]")
	private WebElement occupation;
	@FindBy(xpath ="//input[@un=\"Model Interested In\"]")
	private WebElement Model_INterested_in;
	@FindBy(xpath ="//input[@un=\"Variant\"]")
	private WebElement variant;
	@FindBy(xpath ="//input[@un=\"Color\"]")
	private WebElement color;
	@FindBy(xpath ="//input[@un=\"Quantity\"]")
	private WebElement Quantity;
	@FindBy(xpath ="//input[@un=\"Existing Vehicle\"]")
	private WebElement Exisiting_vehicle;
	@FindBy(xpath ="//input[@un=\"Exchange Required\"]")
	private WebElement Exchange_required;
	@FindBy(xpath ="//input[@un=\"Finance Required\"]")
	private WebElement Finance_required;
	@FindBy(xpath ="//input[@un=\"Loyalty Required\"]")
	private WebElement Loyalty_Required;
	@FindBy(xpath ="//input[@un=\"Actual Enquiry Date\"]")
	private WebElement Actual_Enquiry_date;
	@FindBy(xpath ="//input[@un=\"Expected Date Of Purchase\"]")
	private WebElement Expected_date_of_Purchase;
	@FindBy(xpath ="//input[@un=\"Next Follow-Up Date\"]")
	private WebElement next_Follow_up_date;
	@FindBy(xpath ="//input[@un=\"Awareness source\"]")
	private WebElement awareness_source;
	@FindBy(xpath ="//input[@un=\"Enquiry source\"]")
	private WebElement enquiry_source;
	@FindBy(xpath ="//input[@un=\"Buying Intend\"]")
	private WebElement buying_inted;
	@FindBy(xpath ="//input[@rn=\"HHML Point Of Contact\"]")
	private WebElement point_of_contact;
	@FindBy( xpath ="//input[@un=\"Test Ride Required\"]")
	private WebElement test_ride_required;
	@FindBy(xpath ="//input[@un=\"Test Ride Required Time\"]")
	private WebElement test_ride_requires_time;
	@FindBy(xpath ="//input[@rn=\"HHML Test Ride\"]")
	private WebElement test_ride_teken;
	@FindBy(xpath ="//input[@un=\"Test Ride Time\"]")
	private WebElement test_ride_time;
	@FindBy(xpath ="//textarea[@rn=\"Comments4\"]")
	private WebElement test_comment;
	@FindBy(xpath ="//input[@un=\"Intended Usage\"]")
	private WebElement intended_usage;
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
		custom_sendkeys(prefixes, "Mr.", "Prefixes");
		prefixes.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		custom_sendkeys(firstname, "Rajkumar", "First Nmae");
		custom_sendkeys(lastname, "sing", "Last name");
		custom_sendkeys(mobile_number, "7876567645", "Mobile Number");
		custom_sendkeys(email, "ab@gmail.com", "Email");
		custom_sendkeys(state, "Bihar", "State");
		state.sendKeys(Keys.TAB);
		custom_sendkeys(district, "BUXAR", "Districy");
		district.sendKeys(Keys.TAB);
		custom_sendkeys(Tehsil, "RAJPUR", "Tehsil");
		Tehsil.sendKeys(Keys.TAB);
		custom_sendkeys(city, "RAJPUR", "City");
		city.sendKeys(Keys.TAB);
		custom_sendkeys(address_line1, "Raja pakar", "Address 1");
		custom_sendkeys(pin_code, "546753", "Pine code");
		custom_sendkeys(age, "45", "Age");
		custom_sendkeys(gender, "M", "Gender");
		gender.sendKeys(Keys.TAB);
		custom_sendkeys(occupation, "Others", "Occupation");
		occupation.sendKeys(Keys.TAB);
		custom_sendkeys(Model_INterested_in, "PASSION +", "Model_INterested_in");
		Model_INterested_in.sendKeys(Keys.TAB);
		custom_sendkeys(variant, "HGLMNUSSCFI", "Variant");
		variant.sendKeys(Keys.TAB);
		custom_sendkeys(color, "MVG", "Color");
		color.sendKeys(Keys.TAB);
		custom_sendkeys(awareness_source, "Referred By Friend", "Awarence Source");
		awareness_source.sendKeys(Keys.TAB);
		custom_sendkeys(enquiry_source, "Walk-In", "Enquiery Source");
		enquiry_source.sendKeys(Keys.TAB);
		custom_sendkeys(buying_inted, "Self", "Buying Inted");
		buying_inted.sendKeys(Keys.TAB);
		custom_sendkeys(point_of_contact, "Customer Walk-in", "Point of Contact");
		point_of_contact.sendKeys(Keys.TAB);
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.chord(Keys.CONTROL + "s")).perform();
		log.info("Sucessfully saved quey");
	
	}
}
