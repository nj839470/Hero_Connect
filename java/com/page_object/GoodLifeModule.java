package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodLifeModule {

	public WebDriver driver;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement GoodLifeTab;

	@FindBy(xpath = "(//a[@class='btn booknow-btn'])[1]") // go to GoodlifePlans
	private WebElement ViewPlansTop;

	@FindBy(xpath = "//span[text()='GoodLife']") // back to goodlife page
	private WebElement GoodLifePage;

	@FindBy(xpath = "//div[@class='banner-text']/div") // back to goodlife page
	private WebElement GoodLifeBannerText;

//-------------	Good Life Benefits  -----------------------------
	@FindBy(xpath = "//a[text()='Service Perks']")
	private WebElement ServicePerks;

	@FindBy(xpath = "//a[text()='Benefits']")
	private WebElement Benefits;

	@FindBy(xpath = "//a[text()='Rewards']")
	private WebElement Rewards;

	// ------------------------------------------------------------
	@FindBy(xpath = "//a[normalize-space()='Join now']") // on goodlife page
	private WebElement JoinNow;

	// ------------------------------------------------------------
	@FindBy(xpath = "(//button[normalize-space()='VIEW DETAILS'])[1]") // Earning points and Redemption
	private WebElement ViewDetails1;

	@FindBy(xpath = "//button[normalize-space()='View Details']") // winner View Details
	private WebElement ViewDetailswinner;

	// ------------------------------------------------------------

	@FindBy(xpath = "//span[@class='btn btn-red-gradient']") // GoodlifePlans--go to goodlife plan
	private WebElement ViewPlansBottom;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement GoodLifebanner;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]") // Use loop to verify all header contents
	private WebElement HeaderContents;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement MembershipPlansHeading;

	// select memebership plan -- to verify select tabs is clickable or not--> both
	// top and bottom

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectPlatinumBttn1;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectPlatinumBttn2;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectGoldBttn1;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectGoldBttn2;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectProBttn1;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement SelectProBttn2;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]") // use loop to verify all plan description text
	private WebElement PlanDescription;

	@FindBy(xpath = "(//span[text()='Join Now'])[1]")
	private WebElement BackGoodLifeBttn;

	@FindBy(xpath = "//div[@class='winning-month']/h1")
	public WebElement WinnerOfMonth;

	@FindBy(xpath = "//div[@class='winner-banner-left']/img")
	public WebElement WinnerBannerleftimage;

	@FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 winner-banner']")
	public WebElement WinnerBannerImage;

	@FindBy(xpath = "//div[@class='winner-banner-middle']/h1")  // winner name
	public WebElement WinnerName;
	
	@FindBy(xpath = "//div[@class='winner-banner-middle']/div")  // winner area
	public WebElement WinnerArea;
	
	
	public GoodLifeModule(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement JoinNow_GoodLife() {
		return GoodLifeTab;
	}

	public WebElement Click_ViewPlan1() {
		return ViewPlansTop;
	}

	public WebElement Click_JoinNow() { // join now on goodlife page
		return JoinNow;
	}

	// -------Banner------------------------

	public WebElement GoodLife_BannerText() {
		return GoodLifeBannerText;

	}
	// -------winner of month------------------------

	public WebElement Text_WinnerOfMonth() {
		return WinnerOfMonth;
	}

	public WebElement WinnerBannerImage_left() {
		return WinnerBannerleftimage;
	}
	public WebElement WinnerBanner_Image() {
		return WinnerBannerImage;
		
	}
//----------------------------------------------------------
	public WebElement Click_ViewPlan2() {
		return ViewPlansBottom;
	}

	public WebElement Click_ViewDetails1() {
		return ViewDetails1;
	}

	public WebElement Click_ViewDetails2() {
		return ViewDetailswinner;
	}

	public WebElement Click_GoodLife() {
		return GoodLifePage;
	}

	public WebElement GoodLife_ServicePerks() {
		return ServicePerks;
	}

	public WebElement GoodLife_Benefits() {
		return Benefits;
	}

	public WebElement GoodLife_Rewards() {
		return Rewards;
	}
	
	// -------select membership-----------------------------------------------
	//=========platinum==========
	
	@FindBy(xpath = "//span[@class='memebershipname'][normalize-space()='Platinum Membership']")
	private WebElement platinumMemb;   //ui
	
	public WebElement PlatinumMemb() {
		return platinumMemb;}
	
	@FindBy(xpath = "(//span[@class='memebershipvalue'])[1]")
	private WebElement platinumValue;
	
	public WebElement PlatinumCost() {
		return platinumValue;}
	
	@FindBy(xpath = "(//input[@id='platinum-content'])[1]")
	private WebElement selectplatinum;
	
	public WebElement Choose_platinumMemb() {
		return selectplatinum;}
	
	@FindBy(xpath = "//img[@alt='platinum-ban-pic']")
	private WebElement platinumImage;
	
	public WebElement PlatinumImage() {
		return platinumImage;}
	
	@FindBy(xpath = "(//p[@class='xClan-banner-insurance']//span)[1]")
	private WebElement platinumInsurance;
	
	public WebElement PlatinumInsurance() {
		return platinumInsurance;}
	
	@FindBy(xpath = "//p[@class='xClan-banner-biketitle']")
	private WebElement bikeTitle;
	
	public WebElement Bike_title() {
		return bikeTitle;}
	
	@FindBy(xpath = "//p[@class='xClan-banner-numPlate']")
	private WebElement numberPlate;
	
	public WebElement Bike_number() {
		return numberPlate;}
	
	@FindBy(xpath = "//p[@class='xClan-banner-link']")
	private WebElement changeVehicle;
	
	public WebElement Change_vehicle() {
		return changeVehicle;}
	
	@FindBy(xpath = "//button[@class='close close-vehicle-modal']")
	private WebElement closebttn;
	
	public WebElement close_vehiclePopup() {
		return closebttn;}
	
	@FindBy(xpath = "//input[contains(@value,'OWNER')]")
	private WebElement selectOwner;
	
	public WebElement Select_Owner() {
		return selectOwner;}
	
	@FindBy(xpath = "//input[@value='USER']")  // to select other person related to owner
	private WebElement selectuserRelated;
	
	public WebElement choose_userRealtedperson() {
		return selectuserRelated;}
	
	@FindBy(name="OWNERNAME")
	private WebElement ownerName;
	
	public WebElement get_OwnerName() {
		return ownerName;}
	
	@FindBy(name="OwnerMobile")
	private WebElement ownerNum;
	
	public WebElement get_OwnerNumber() {
		return ownerNum;}
	
	@FindBy(name = "BIRTH_DT")
	private WebElement ownerDob;
	
	public WebElement get_OwnerDob() {
		return ownerDob;}
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement ownerEmail;
	
	public WebElement get_OwnerEmail() {
		return ownerEmail;}
	
	@FindBy(xpath = "//input[@class='radio-item-Male']")
	private WebElement ownerGender;
	
	public WebElement select_OwnerGender() {
		return ownerGender;}
	
	@FindBy(xpath = "//input[@name='ADD1']")
	private WebElement ownerAdd;
	
	public WebElement get_OwnerAdd() {
		return ownerAdd;}
	
	@FindBy(xpath = "//input[@placeholder='Pin Code']")
	private WebElement ownerpincode;
	
	public WebElement get_OwnerPincode() {
		return ownerpincode;}
	
	@FindBy(xpath = "//select[@name='STATE']")
	private WebElement ownerState;
	
	public WebElement select_OwnerState() {
		return ownerState;}
	
	@FindBy(xpath = "//select[@name='CITY']")
	private WebElement ownercity;
	
	public WebElement select_OwnerCity() {
		return ownercity;}
	
	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	private WebElement proceedBttn;
	
	public WebElement Click_ProceedBttn() {
		return proceedBttn;}
	
	
	
	

	
	
	//=========Gold Membership============================================================================
	
		@FindBy(xpath = "//span[@class='memebershipname'][normalize-space()='Gold Membership']")
		private WebElement goldMemb;   //ui
		
		public WebElement verify_GoldMemb() {
			return goldMemb;}
		
		@FindBy(xpath = "(//span[@class='memebershipvalue'])[2]")
		private WebElement goldValue;
		
		public WebElement get_GoldCost() {
			return goldValue;}
		
		@FindBy(xpath = "//p[@class='xClan-banner-price']")
		private WebElement goldBannerPrice;
		
		public WebElement get_GoldBannerPrice() {
			return goldBannerPrice;}
		
		
		//p[@class='xClan-banner-price']
		
		@FindBy(xpath = "(//input[@id='gold_bg'])[1]")
		private WebElement selectGold;
		
		public WebElement Choose_GoldMemb() {
			return selectGold;}
		
		@FindBy(xpath = "//img[@alt='platinum-ban-pic']")
		private WebElement goldImage;
		
		public WebElement verify_goldlogoImage() {
			return goldImage;}
		
		@FindBy(xpath = "(//p[@class='xClan-banner-insurance']//span)[1]")
		private WebElement goldInsurance;
		
		public WebElement GoldInsurance() {
			return goldInsurance;}
		
		@FindBy(xpath = "//span[normalize-space()='GoodLife Plans']")
		private WebElement goodlifePlan;
		
		public WebElement click_GOODLIFE_PLAN() {
			return goodlifePlan;}
		
		//=========Silver Membership============================================================================
		
		@FindBy(xpath = "//span[@class='memebershipname'][normalize-space()='Silver Membership']")
		private WebElement silverMemb;  
		
		public WebElement verify_SilverMemb() {
			return silverMemb;}
		
		@FindBy(xpath = "(//span[@class='memebershipvalue'])[3]")
		private WebElement silverValue;
		
		public WebElement get_SilverCost() {
			return silverValue;}
		
		@FindBy(xpath = "//p[@class='xClan-banner-price']")
		private WebElement silverBannerPrice;
		
		public WebElement get_SilverBannerPrice() {
			return silverBannerPrice;}
		
		
		@FindBy(xpath = "(//input[@id='silver_bg'])[1]")
		private WebElement selectSilver;
		
		public WebElement Choose_SilverMemb() {
			return selectSilver;}
		
		@FindBy(xpath = "//img[@alt='platinum-ban-pic']")
		private WebElement silverImage;
		
		public WebElement verify_silverlogoImage() {
			return silverImage;}
		
		@FindBy(xpath = "(//p[@class='xClan-banner-insurance']//span)[1]")
		private WebElement silverInsurance;
		
		public WebElement SilverInsurance() {
			return silverInsurance;}	
		
		
		
//=========Pro Membership============================================================================
		
		@FindBy(xpath = "//span[@class='memebershipname'][normalize-space()='Pro Membership']")
		private WebElement proMemb;   //ui
		
		public WebElement verify_ProMemb() {
			return proMemb;}
		
		@FindBy(xpath = "(//span[@class='memebershipvalue'])[4]")
		private WebElement proValue;
		
		public WebElement get_ProCost() {
			return proValue;}
		
		@FindBy(xpath = "//p[@class='xClan-banner-price']")
		private WebElement proBannerPrice;
		
		public WebElement get_ProBannerPrice() {
			return proBannerPrice;}
		
		
		@FindBy(xpath = "(//input[@id='pro_bg'])[1]")
		private WebElement selectPro;
		
		public WebElement Choose_ProMemb() {
			return selectPro;}
		
		@FindBy(xpath = "//img[@alt='platinum-ban-pic']")
		private WebElement proImage;
		
		public WebElement verify_prologoImage() {
			return proImage;}
			

	
	
	//------Nominee--------------------------11 steps
	
	@FindBy(xpath = "//p[normalize-space()='Nominee Details']")
	private WebElement Nominee;  // text- "Nominee Details"
	
	public WebElement NomineeDetailsText() {
		return Nominee;}
	
	@FindBy(name = "NomineeName")
	private WebElement NomineeName;
	
	public WebElement get_NomineeName() {
		return NomineeName;}
	
	@FindBy(xpath = "//select[@name='NomineeRelation']")
	private WebElement NomineeRel;
	
	public WebElement select_NomineeRelation() {
		return NomineeRel;}
	
	@FindBy(name ="NomineeMobile")
	private WebElement NomineecontactNum;
	
	public WebElement get_NomineeMobile() {
		return NomineecontactNum;}
	
	@FindBy(xpath = "//input[@name='sameas_user']")
	private WebElement NomineeAdd;
	
	public WebElement choose_sameAdd() {
		return NomineeAdd;}
	
	@FindBy(xpath = "//input[contains(@name,'acknowledgement')]")
	private WebElement NomineeAcknowldg;
	
	public WebElement select_NomAcknowledgement() {
		return NomineeAcknowldg;}
	
	@FindBy(xpath = "//select[@name='DeclarationRelation']")
	private WebElement declareRelation;
	
	public WebElement select_DeclrRelation() {
		return declareRelation;}
	
	@FindBy(name = "DeclarationRelativeName")
	private WebElement declareRelname;
	
	public WebElement get_decRelativeName() {
		return declareRelname;}

	
	@FindBy(xpath = "//button[normalize-space()='Proceed for Payment']")
	private WebElement paymentproceed;
	
	public WebElement Click_ProceedPayment() {
		return paymentproceed;}
	
	
	@FindBy(xpath = "//div[@id='finalTotal']")
	private WebElement totalAmt;
	
	public WebElement validate_totalAmount() {
		return totalAmt;}
	
	@FindBy(xpath = "//span[normalize-space()='GoodLife Plans']")
	private WebElement gobackToPlans;
	
	public WebElement Click_GoodLifePlans() {
		return gobackToPlans;}
	
//---------------View Nominee
	
	
	@FindBy(xpath = "//div[@class='insurance-amount']//a")
	private WebElement viewNominee;
	
	public WebElement verify_viewNomineeLink() {
		return viewNominee;}
	
	public WebElement click_viewNomineeLink() {
		return viewNominee;}

	@FindBy(xpath = "//h2[normalize-space()='Nominee Information']")
	private WebElement nomineeInfo;
	
	public WebElement NomineeInfo_popup_open() {
		return  nomineeInfo;}
	
	
	@FindBy(xpath = "//input[@name='nomineename']")
	private WebElement nominame;
	
	public WebElement verify_NomineeName() {
		return  nominame;}
	
	@FindBy(xpath = "//input[@name='nomineerelationship']")
	private WebElement nomrelation;
	
	public WebElement verify_NomineeRelation() {
		return  nomrelation;}
	
	@FindBy(xpath = "//input[@name='nomineemobile']")
	private WebElement nominum;
	
	public WebElement verify_NomineeNum() {
		return  nominum;}
	
	@FindBy(xpath = "//input[@name='nomineeaddress']")
	private WebElement nomiAdd;
	
	public WebElement verify_NomineeAdd() {
		return  nomiAdd;}
	
	@FindBy(xpath = "//div[@id='nomineeDetails']//button[@type='button'][normalize-space()='×']")
	private WebElement bttnclose;
	
	public WebElement popup_close() {
		return  bttnclose;}

	
//-------------Earning and Redemption history------------------------
	
	
	@FindBy(xpath = "//button[normalize-space()='Earning and Redemption History']")
	private WebElement earning ;
	
	public WebElement Click_Earning_and_redemptionHistory() {
		return  earning;}
		
	@FindBy(xpath = "(//div[@class='earning-history-title'])[1]")
	private WebElement earningHistory ;
	
	public WebElement EarningHistory() {
		return  earningHistory;}
	
	@FindBy(xpath = "//div[@class='first-earning']")
	private WebElement earningDate ;
	
	public WebElement get_EarningDate() {
		return  earningDate;}
	
	@FindBy(xpath = "//div[@class='sec-earning']")
	private WebElement earningAmt ;
	
	public WebElement get_EarningAmount() {
		return  earningAmt;}
	
	@FindBy(xpath = "//div[@class='third-earning']")
	private WebElement earningType ;
	
	public WebElement get_EarningType() {
		return  earningType;}
	
	@FindBy(xpath = "//div[@class='four-earning']//div")
	private WebElement earningPoints ;
	
	public WebElement get_EarningPoints() {
		return  earningPoints;}
	
	@FindBy(xpath = "(//div[@class='earning-history-title'])[2]")
	private WebElement redemHistory ;
	
	public WebElement RedemptionHistory() {
		return  redemHistory;}
	
	
	@FindBy(xpath = "//div[@class='table-responsive redemption-history']/div/h3")
	private WebElement history ;
	
	public WebElement get_RedemptionHistory() {
		return  history;}
	
	
	//-------------Refer a friend------------------  on hold----------------------
	
	@FindBy(xpath = "//div[@class='hero-exchange-head-content']//p")
	private WebElement referfriend  ;
	
	public WebElement get_textReferAFriend() {
		return referfriend ;}
	
	
	@FindBy(xpath = "//a[normalize-space()='refer a friend']")
	private WebElement referFriendlink1 ;
	
	public WebElement click_ReferAfriend1() {
		return referFriendlink1 ;}
	
	
	@FindBy(xpath = "//button[normalize-space()='REFER A FRIEND'")
	private WebElement referFriendlink2 ;
	
	public WebElement click_ReferAfriend2() {
		return  referFriendlink2;}
	
	
	@FindBy(name = "name")
	private WebElement freindName ;
	
	public WebElement get_FriendName() {
		return freindName ;}
	
	@FindBy(name = "mobile")
	private WebElement friendNum ;
	
	public WebElement get_friendNum() {
		return  friendNum;}
	
	
	@FindBy(xpath = "//select[@name='state']")
	private WebElement friendState ;
	
	public WebElement select_friendState() {
		return friendState ;}
	
	
	
	@FindBy(xpath = "//select[@name='city']")
	private WebElement friendCity ;
	
	public WebElement select_friendCity() {
		return friendCity ;}
	
	@FindBy(xpath = "(//select[@name='bike-model'])[1]")
	private WebElement friendveh ;
	
	public WebElement select_vehicleInterested() {
		return friendveh ;}
	
	
	
	
	
}
