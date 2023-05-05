package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page {
	public WebDriver driver;

	// ==================================== service login
	// ========================================

	@FindBy(xpath = "//p[contains(text(),'Login')]")
	private WebElement loginTab;

	@FindBy(how = How.XPATH, using = "//input[@id='number']")
	private WebElement MobileNo;

	@FindBy(how = How.XPATH, using = "//input[@id='otp']")
	private WebElement OTP;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement Button;

	@FindBy(how = How.XPATH, using = "//span[@class='profile-name']")
	private WebElement ProfileName;

	// ==================================== LoginTab-My Account---> Locators
	// ==========================================
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='My Account']")
	private WebElement MyAccount;

	@FindBy(xpath = "//div[@class='mobile']//p")
	private WebElement MobileNumber;

	@FindBy(xpath = "//div[@class='dob']//p")
	private WebElement dateofbirth;

	@FindBy(xpath = "//div[@class='email']//p")
	private WebElement Email;

	@FindBy(xpath = "//div[@class='gender']//p")
	private WebElement gender;

	@FindBy(xpath = "//div[@class='bloodgrp']//p")
	private WebElement bloodgroup;

	@FindBy(xpath = "//div[@class='Addrs']//p")
	private WebElement address;

	@FindBy(xpath = "(//div[@id='details-section']//button/p)[1]")
	private WebElement Manage_license;

	@FindBy(xpath = "(//div[@id='details-section']//button/p)[2]")
	private WebElement emergencyCont;

	@FindBy(xpath = "//div[@class='editprofile']//h4")
	private WebElement editProfile;

	@FindBy(xpath = "//div[@class='add-contact']//a")
	private WebElement addContact;

	// emergency contact
	@FindBy(name = "name")
	private WebElement enterName;

	@FindBy(name = "email")
	private WebElement enterEmail;

	@FindBy(name = "mobile")
	private WebElement enterMobileNo;

	@FindBy(name = "relation")
	private WebElement enterRelation;

	@FindBy(xpath = "//button[@id='add-contact']")
	private WebElement saveContact;

	@FindBy(xpath = "//a[@class='close removecontact']")
	private WebElement removeContact;

	@FindBy(xpath = "//span[@class='info-popup-body-title']")
	private WebElement profileUpdated;

	@FindBy(xpath = "//span[@class='btn btn-red-gradient']")
	private WebElement backToProfile;

	public WebElement click_MyAccount() {
		return MyAccount;
	}

	public WebElement verify_mobileNo() {
		return MobileNumber;
	}

	public WebElement verify_Dob() {
		return dateofbirth;
	}

	public WebElement verify_Email() {
		return Email;
	}

	public WebElement verify_gender() {
		return gender;
	}

	public WebElement verify_BloodGroup() {
		return bloodgroup;
	}

	public WebElement verify_Address() {
		return address;
	}

	public WebElement ClickManageLicense() {
		return Manage_license;
	}

	public WebElement click_EmergencyContact() {
		return emergencyCont;
	}

	public WebElement contact_name() {
		return enterName;
	}

	public WebElement contact_email() {
		return enterEmail;
	}

	public WebElement contact_number() {
		return enterMobileNo;
	}

	public WebElement contact_relation() {
		return enterRelation;
	}

	public WebElement click_addContact() {
		return addContact;
	}

	public WebElement click_saveContact() {
		return saveContact;
	}

	public WebElement remove_contact() {
		return removeContact;
	}

	public WebElement click_EditProfile() {
		return editProfile;
	}

	public WebElement Profile_Updated() {
		return profileUpdated;
	}

	public WebElement click_GoToProfile() {
		return backToProfile;

	}

	// ==================================== MyVehicle--->Locators
	// ==========================================
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='My Vehicle']")
	private WebElement MyVehicle;

//		@FindBy(how=How.XPATH,using="//span[contains(text(),'Book Now')]")
//		private WebElement BookNow;
//		
//		
//		@FindBy(how=How.XPATH,using="(//td[@class=\"day_cell\"])[1]")
//		private WebElement AvailableDate;
//		
//		@FindBy(how=How.XPATH,using="//ul[@class=\"range-labels\"]//child::li[2]")
//		private WebElement SelectTime;
//		
//		@FindBy(how=How.XPATH,using="//div[@class=\"form-group odemeter-container-inner\"]//child::input")
//		private WebElement OdometerReading;
//		
//		@FindBy(how=How.XPATH,using="//input[@type='radio']")
//		private WebElement SelectService;  //it is disabled currently
//		
//		@FindBy(how=How.XPATH,using="(//button[contains(text(),'NEXT')])[1]")
//		private WebElement Click_NextBttn;
//		
//		
//		@FindBy(how=How.XPATH,using="//button[@id='dealerstateDropdown']")
//		private WebElement StateDropDown;
//		
//		@FindBy(how=How.XPATH,using="//a[contains(text(), 'DELHI')]]")
//		private WebElement SelectState;
//		
//		@FindBy(how=How.XPATH,using="//button[@id='dealercityDropdown']")
//		private WebElement CityDropDown;
//		
//		@FindBy(how=How.XPATH,using="//a[contains(text(),'SOUTH DELHI')]")
//		private WebElement SelectCity;
//		
//		@FindBy(xpath="//h3[normalize-space()='HIMGIRI AUTOMOBILES (P) LTD.']//parent::div//parent::div//input")
//		private WebElement SelectDealer;
//		
//		@FindBy(how=How.XPATH,using="(//button[contains(text(),'NEXT')])[2]")
//		private WebElement NextBttnDealer;
//		
//		
//		@FindBy(how=How.XPATH,using="(//button[contains(text(),'NEXT')])[3]")
//		private WebElement NextBttnJobCard;

	// ===========================================================================================
	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	// ==================================== LoginTab
	// ==========================================
	public WebElement clickLoginTab() {
		return loginTab;
	}

	public WebElement getusername() {
		return MobileNo;
	}

	public WebElement getPassword() {
		return OTP;
	}

	public WebElement getClick_submit_Button() {
		return Button;
	}

	public WebElement click_ProfileTab() {
		return ProfileName;
	}

	// ==================================== incorrect creds
	// ==========================================

	
	@FindBy(xpath = "//label[@class='error']")   // enter wrong num or leave blank
	private WebElement wrongNum;
	
	public WebElement get_incorrectNum_Msg() {
		return wrongNum;}


	@FindBy(xpath = "(//label[@class='invalid-otp-message'])[3]")
	private WebElement wrongOTP;
	
	public WebElement get_WrongOTPMsg() {
		return wrongOTP;}

	// ==================================== MyVehicle
	// ==========================================

	public WebElement select_MyVehicle() {
		return MyVehicle;
	}

//						public WebElement click_on_BookNow() {
//							return BookNow;
//						}
//						public WebElement select_FirstAvailableTime() {
//							return AvailableDate;}
//						
//						public WebElement select_Time() {
//							return SelectTime;}
//						
//						public WebElement getOdodmeterReading() {
//							return OdometerReading;}
//						
//						
//						public WebElement Click_NextButton() {
//							return Click_NextBttn;
//							
//						}
//					
//					
//						
//	//==================================Dealer location==============================================
//						
//						public WebElement StateDropDown() {
//							return StateDropDown;}
//						
//						public WebElement SelectState() {
//							return SelectState;}
//						
//						public WebElement CityDropDown() {
//							return CityDropDown;}
//						
//						
//						public WebElement SelectCity() {
//							return SelectCity;}
//						
//						public WebElement Select_Dealer() {
//							return SelectDealer;
//							
//						}
//						
//						public WebElement NextButton_DealerPage() {
//							return NextBttnDealer;
//					}
//						
//						
//						public WebElement NextButton_SelfJobCard() {
//							return NextBttnJobCard;
//							
//						}

//	
//	

//					
//
//		

}
