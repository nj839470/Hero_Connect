package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class MyVehiclePage {

	public WebDriver driver;
	//(//div[@class='myVeharrow-wrap']/a)[2]
	@FindBy(how = How.XPATH, using = "(//a[@class='myVehcarousel-arrow next-vehicle'])[1]")
	private WebElement rightArrow;

	@FindBy(how = How.XPATH, using = "(//div[@class='myVeharrow-wrap']/a)[1]")
	private WebElement LeftArrow;

	// vehicle details
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Vehicle Details')]")
	private WebElement VehicleDetails;

	@FindBy(how = How.XPATH, using = "//p[@class='engine-no']")
	private WebElement EngineNo;

	@FindBy(how = How.XPATH, using = "//p[@class='vin-no']")
	private WebElement VINNo;

	@FindBy(how = How.XPATH, using = "//p[@class='purchasedate']")
	private WebElement purchaseDate;

	// service details
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Service Details')]")
	private WebElement ServiceDetails;

	@FindBy(how = How.XPATH, using = "(//div[@class='service-details']//p)[1]")
	private WebElement LastServiced;

	@FindBy(how = How.XPATH, using = "(//div[@class='service-details']//p)[2]")
	private WebElement LastServiceType;

	@FindBy(how = How.XPATH, using = "//div[@class='service-details']//div//a")
	private WebElement ServiceRecord;

	// Documents
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Documents')]")
	private WebElement DocumentsDetails;

	@FindBy(how = How.XPATH, using = "//a[@class='view-document']")
	private WebElement ViewDocument;

	// edit profile
	@FindBy(how = How.XPATH, using = "(//div[@class='upload-image'])[1]//a")
	private WebElement editProfile;

	@FindBy(xpath= "//input[@type='date']") // input[@type='date']
	private WebElement dob;

	@FindBy(how = How.NAME, using = "email")
	private WebElement email;

	@FindBy(how = How.NAME, using = "blood_group")
	private WebElement BloodGroup;

	@FindBy(how = How.XPATH, using = "//input[@class='radio-item-Female']")
	private WebElement Gender;

	@FindBy(how = How.NAME, using = "address_line1")
	private WebElement StreetName;

	@FindBy(how = How.NAME, using = "pin_code")
	private WebElement PinCode;

	@FindBy(how = How.NAME, using = "state")
	private WebElement State;

	@FindBy(how = How.NAME, using = "city")
	private WebElement City;

	@FindBy(how = How.XPATH, using = "//button[@class='save-btn']")
	private WebElement SaveProfile;

	@FindBy(how = How.XPATH, using = "//img[@class='img-fluid bike-img moving-img']")
	private WebElement BikeImage;

	@FindBy(how = How.XPATH, using = "//p[@class='myVehicle-modal']")
	private WebElement VehicleModal;

	@FindBy(how = How.XPATH, using = "//p[@class='myVehicle-number']")
	private WebElement VehicleNum;

	public MyVehiclePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement RightCarousel() {
		return rightArrow;

	}

	public WebElement LeftCarousel() {
		return LeftArrow;

	}

	public WebElement VehcileDetails() {
		return VehicleDetails;
	}

	public WebElement Engine_Number() {
		return EngineNo;
	}

	public WebElement VIN_Number() {
		return VINNo;
	}

	public WebElement Purchase_Date() {
		return purchaseDate;
	}

	public WebElement ServiceDetails() {
		return ServiceDetails;
	}

	public WebElement Last_serviced() {
		return LastServiced;

	}

	public WebElement Last_serviceType() {
		return LastServiceType;

	}

	public WebElement Service_Record() {
		return ServiceRecord;

	}

	public WebElement Documents_MyVehiclePage() {
		return DocumentsDetails;
	}

	public WebElement Document_View() {
		return ViewDocument;
	}

	// edit profile
	public WebElement EditProfile() {
		return editProfile;

	}

	public WebElement dob() {
		return dob;
	}

	public WebElement Email() {
		return email;
	}

	public WebElement Bloodgroup() {
		return BloodGroup;
	}

	public WebElement Gender() {
		return Gender;
	}

	public WebElement AddressStreetName() {
		return StreetName;
	}

	public WebElement PinCode() {
		return PinCode;
	}

	public WebElement SelectState() {
		return State;
	}

	public WebElement SelectCity() {
		return City;
	}

	public WebElement Save_profile() {
		return SaveProfile;
	}

	public WebElement Bike_Image() {
		return BikeImage;
	}
	
	public WebElement Vehicle_Modal() {
		return VehicleModal;}
	
	public WebElement Vehicle_Number() {
		return VehicleNum;}

}
