package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class BookNowModule {
	public WebDriver driver;

//	@FindBy(xpath="//p[contains(text(),'Login')]")
//	private WebElement ;

	@FindBy(xpath = "//span[contains(text(),'Book Now')]")
	private WebElement BookNow;

	@FindBy(xpath = "(//td[@class=\"day_cell\"])[1]")
	private WebElement AvailableDate;

	@FindBy(xpath = "//ul[@class=\"range-labels\"]//child::li[2]")
	private WebElement SelectTime;

	@FindBy(xpath = "//div[@class=\"form-group odemeter-container-inner\"]//child::input")
	private WebElement OdometerReading;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement SelectService; // it is disabled currently

	@FindBy(xpath = "(//button[contains(text(),'NEXT')])[1]")
	private WebElement Click_NextBttn;

	// dealer page
	@FindBy(xpath="//h5[normalize-space()='Dealer']")
	private WebElement dealerpage;
	
	@FindBy(xpath = "//button[@id='dealerstateDropdown']")
	private WebElement StateDropDown;

	@FindBy(xpath = "//button[@id='dealercityDropdown']")
	private WebElement CityDropDown;

	@FindBy(xpath = "//h3[normalize-space()='HIMGIRI AUTOMOBILES (P) LTD.']//parent::div//parent::div//input")
	private WebElement SelectDealer;

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'NEXT')])[2]")
	private WebElement NextBttnDealer;

	@FindBy(xpath="//h5[normalize-space()='Self Job Card']")
	private WebElement jobCardPage;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'NEXT')])[3]")
	private WebElement NextBttnJobCard;

	@FindBy(xpath="//div[@class='row pleasure-max-container']//h3")
	private WebElement bikeName;
	
	@FindBy(xpath="//div[@class='row pleasure-max-container']//div//div")
	private WebElement bikeNumber;
	

	

	

	public BookNowModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

//	public WebDriver getDriver() {
//		return driver;
//	}

	public WebElement click_on_BookNow() {
		return BookNow;
	}

	public WebElement select_FirstAvailableDate() {
		return AvailableDate;
	}

	public WebElement select_Time() {
		return SelectTime;
	}

	public WebElement getOdodmeterReading() {
		return OdometerReading;
	}

	public WebElement Click_NextButton() {
		return Click_NextBttn;

	}

//==================================Dealer location==============================================

	public WebElement DealerPage() {
		return dealerpage;}
	
	public WebElement StateDropDown() {
		return StateDropDown;
	}

	public WebElement CityDropDown() {
		return CityDropDown;
	}
	
	public WebElement Select_Dealer() {
		return SelectDealer;
	}

	public WebElement NextButton_DealerPage() {
		return NextBttnDealer;
	}
	
	public WebElement SelfJobCard_Page() {
		return jobCardPage;}
	
	public WebElement NextButton_SelfJobCard() {
		return NextBttnJobCard;

	}
	
	
	//==================================Summary page==============================================
	@FindBy(xpath="//h3[normalize-space()='BASIC DETAILS']")
	private WebElement summaryHeading;
	
	@FindBy(xpath="//span[@id='summery-date']")
	private WebElement summaryDate;
	
	@FindBy(xpath="//span[@id='summery-time']")
	private WebElement summaryTime;
	
	@FindBy(xpath="//span[@id='service-type']")
	private WebElement servicetype;
	
	@FindBy(xpath="//div[contains(@class,'dealer-summary-card')]//h3[@id='dealerName']")
	private WebElement dealerName;
	
	@FindBy(xpath="//div[contains(@class,'dealer-summary-card')]//p[@id='dealer-address']")
	private WebElement dealerAddress;
	
	@FindBy(xpath="//div[contains(@class,'dealer-summary-card')]//span[@id='dealer-phn']")
	private WebElement dealerNumber;
	
	@FindBy(xpath="//div[@class='change-link basic-detail']")
	private WebElement changeBasicDetails;
	
	@FindBy(xpath="//span[normalize-space()='03/Self JobCard']")
	private WebElement selfjobcard;
	
	
	@FindBy(xpath="//div[@class='change-link dealer-card']")
	private WebElement changeDealer;
	
//	@FindBy(xpath="//div[@class='change-link basic-detail']")
//	private WebElement changeBasicDet;
	
	public WebElement get_summaryHeading() {
		return summaryHeading;}
	
	public WebElement get_summaryDate() {
		return summaryDate;}
	
	public WebElement get_summaryTime() {
		return summaryTime;}
	
	public WebElement get_serviceType() {
		return servicetype;}
	
	public WebElement get_dealerName() {
		return dealerName;}
	
	public WebElement get_dealerAddress() {
		return dealerAddress;}
	
	public WebElement get_dealerContactnum() {
		return dealerNumber;}
	
	public WebElement click_changeBasicDetails() {
		return changeBasicDetails;}
	
	public WebElement click_changeDealer() {
		return changeDealer;}
	
	public WebElement click_selfJobcardtab() {
		return selfjobcard;}
	
}
