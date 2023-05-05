package com.page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class home_page {
	
public WebDriver driver;
////====================================Header Section======================

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	private List<WebElement> Click_MotorCycles;

	public void ClickMotorcycles() {
		for (int i = 0; i < Click_MotorCycles.size(); i++) {

			System.out.println(Click_MotorCycles.get(i).getText());
			Click_MotorCycles.get(i).click();
		}
	}

	@FindBy(xpath = "//a[normalize-space()='MOTORCYCLES']")
	private WebElement motorcycles;

	public WebElement click_Motorcycles() {
		return motorcycles;
	}

	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle'])[2]")
	private WebElement scooters;

	public WebElement click_Scooters() {
		return scooters;
	}

	@FindBy(xpath = "//a[normalize-space()='EXCHANGE']")
	private WebElement exchange;

	public WebElement click_Exchange() {
		return exchange;
	}

	@FindBy(xpath = "(//a[normalize-space()='GOODLIFE'])[1]")
	private WebElement goodlife;

	public WebElement click_goodLife() {
		return goodlife;
	}

	@FindBy(xpath = "//a[normalize-space()='SERVICES']")
	private WebElement services;

	public WebElement click_SERVICES() {
		return services;
	}

	@FindBy(xpath = "//a[normalize-space()='RIDES & EVENTS']")
	private WebElement rideEvents;

	public WebElement click_RideEvents() {
		return rideEvents;
	}

	@FindBy(xpath = "//a[normalize-space()='DEALER LOCATOR']")
	private WebElement dealerLocator;

	public WebElement click_DealerLocator() {
		return dealerLocator;
	}

	@FindBy(xpath = "//a[normalize-space()='COMPANY']")
	private WebElement company;

	public WebElement click_Company() {
		return company;
	}

	@FindBy(xpath = "//img[@alt='Home']")
	private WebElement home;

	public WebElement click_Hero() {
		return home;
	}
	 //when on sliders page--- use this xpath to navigate back to home page
	@FindBy(xpath = "//img[@class='img-fluid desktop-logo']")
	private WebElement homeHero;

	public WebElement click_HeroLogo() {
		return homeHero;
	}

	@FindBy(xpath = "//div[@class='top-bar-option ']//p") 
	private WebElement country;

	public WebElement click_countryTab() {
		return country;}

	@FindBy(xpath = "(//div[@id='countryModal']//button)[1]")
	private WebElement crossbttn;

	public WebElement cancel_button() {
			return crossbttn;}

	@FindBy(xpath = "//p[normalize-space()='Login']") 
	private WebElement logintab;

	public WebElement click_LoginTab() {
				return logintab;}
	
	//(//div[@id='logIn']//button)[1]
	@FindBy(xpath = "//div[@id='logIn']//button[@type='button'][normalize-space()='×']")
	private WebElement logincrossbttn;

	public WebElement cancel_Loginbutton() {
			return logincrossbttn;}
	
	@FindBy(xpath = "//p[@class='quick-nav-label']")
	private WebElement eshop;

	public WebElement click_Eshop() {
			return eshop;}
	
	@FindBy(xpath = "//h5[normalize-space()='ACCESSORIES']")
	private WebElement accessories;

	public WebElement click_Accessories() {
			return accessories;}

//======================E-shop=======================	//child window
	
	@FindBy(xpath = "//a[@title='Home']")
	private WebElement hometab;

	public WebElement click_Home() {
			return hometab;}

	
	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Motorcycles']")
	private WebElement motortab;

	public WebElement click_MotorTab() {
			return motortab;}
	
	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Scooters']")
	private WebElement scootertab;

	public WebElement click_ScooterTab() {
			return scootertab;}
	
	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Spares']")
	private WebElement sparestab;

	public WebElement click_SpareTab() {
			return sparestab;}
	
	@FindBy(xpath = "//a[@title='Engine Oil']")
	private WebElement enginetab;

	public WebElement click_EngineTab() {
			return enginetab;}
	
	@FindBy(xpath = "//h5[normalize-space()='Evaluate your bike now']")
	private WebElement evaluate;

	public WebElement click_EvaluateYour_BikeNow() {
			return evaluate;}
	
	@FindBy(xpath = "//h5[normalize-space()='HERO CONNECT']")
	private WebElement heroConnect;

	public WebElement click_HeroConnect() {
			return heroConnect;}
	
	@FindBy(xpath = "//h5[normalize-space()='MERCHANDISE']")
	private WebElement merchandise;

	public WebElement click_Merchandise() {
			return merchandise;}
	
	//==========  =============   ============  =====================
	@FindBy(xpath = "//h5[normalize-space()='Book a Service']") 
	private WebElement bookaService;

	public WebElement click_Book_a_Service() {
		return bookaService;
	}
	

	/// ====================================Slider -Section===========================================
	

	
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[1]") 
	private WebElement firstslide;

	public WebElement click_FirstSlide() {
		return firstslide;
	}
	
	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='KNOW MORE']") 
	private WebElement knowMore;

	public WebElement click_knowMore() {
		return knowMore;
	}
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[2]") 
	private WebElement secondSlide;

	public WebElement click_SecondSlide() {
		return secondSlide;
	}
	
	@FindBy(xpath = "//a[@class='btn callback-btn btn-white'][normalize-space()='Know More']") 
	private WebElement knowMore_2ndSlide;

	public WebElement click_SecondSlide_KnowMore() {
		return knowMore_2ndSlide;
	}
	
	
	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='Book Now']") 
	private WebElement bookNow_2ndSlide;

	public WebElement click_SecondSlide_BookNow() {
		return bookNow_2ndSlide;
	}	
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[3]") 
	private WebElement thirdSlide;

	public WebElement click_ThirdSlide() {
		return thirdSlide;
	}
	
	@FindBy(xpath = "//a[contains(text(),'REQUEST CALLBACK')]") 
	private WebElement requestcallback;

	public WebElement click_RequestCallback() {
		return requestcallback;
	}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='×'])[3]") 
	private WebElement requestcallCancellBtn;

	public WebElement click_RequestCallback_CancelBttn() {
		return requestcallCancellBtn;}
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[4]") 
	private WebElement fourthSlide;

	public WebElement click_FourthSlide() {
		return fourthSlide;
	}
	
	@FindBy(xpath = "//a[normalize-space()='Download the App']") 
	private WebElement thirdSlide_downloadApp;

	public WebElement click_FourthSlide_DownloaddApp() {
		return thirdSlide_downloadApp;
	}
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[5]") 
	private WebElement fifthSlide;

	public WebElement click_FifthSlide() {
		return fifthSlide;
	}
	
	@FindBy(xpath = "//a[@class='btn callback-btn btn-white'][normalize-space()='KNOW MORE']") 
	private WebElement knowMore_5thSlide;

	
	public WebElement click_FifthSlide_KnowMore() {
		return knowMore_5thSlide;
	}
	
	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[6]") 
	private WebElement sixthSlide;

	public WebElement click_SixthSlide() {
		return sixthSlide;
	}
	
	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='Know More']") 
	private WebElement knowMore_6thSlide;
	
	public WebElement click_SixthSlide_KnowMore() {
		return knowMore_6thSlide;
	}
	
	@FindBy(xpath = "//a[normalize-space()='Request Callback']") 
	private WebElement requestcallback2;

	public WebElement click_RequestCallback2() {
		return requestcallback2;
	}
	
	//=============== Explore Our products===============================================
	
	
	@FindBy(xpath = "//a[normalize-space()='new release']") 
	private WebElement newRelease;

	public WebElement click_NewRelease() {
		return newRelease;
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='PRACTICAL']") 
	private WebElement practical;

	public WebElement click_Practical() {
		return practical;
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='EXECUTIVE']") 
	private WebElement executive;

	public WebElement click_Executive() {
		return executive;
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='PERFORMANCE']") 
	private WebElement performance;

	public WebElement click_Performance() {
		return performance;
	}
	
	@FindBy(xpath = "//a[normalize-space()='Scooters']") 
	private WebElement explorescooters;

	public WebElement click_ExploreScooters() {
		return explorescooters;
	}
	

//===================Be a HERO with a HERO=========
	
	@FindBy(xpath = "//a[normalize-space()='Scooters']") 
	private WebElement Be_aHEROTEXT;

	public WebElement Text_Be_a_HERO() {
		return Be_aHEROTEXT;
	}
	
	@FindBy(xpath = "//a[@href='/en-in/good-life.html']") 
	private WebElement goodlifeLINK;

	public WebElement click_goodlifeLINK() {
		return goodlifeLINK;
	}
	
	@FindBy(xpath = "//a[@href='/en-in/hero-accessories/']") 
	private WebElement accessoriesLINK;

	public WebElement click_AccessoriesLINK() {
		return accessoriesLINK;
	}
	
	@FindBy(xpath = "//div[@id='container-2d763063a5']//a[@class='img-text']") 
	private WebElement eshopSparesLINK;

	public WebElement click_eshop_SparesLINK() {
		return eshopSparesLINK;
	}
	
	@FindBy(xpath = "//div[@id='container-cfcfb8c3f9']//a[@class='img-text']") 
	private WebElement joyrideLINK;

	public WebElement click_JoyRideLINK() {
		return joyrideLINK;
	}
	
	
	
//===========================bottom navigation tabs===============
	
	
	//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']
//	(//ul[@class='nav nav-tabs common-tabs-main'])[2]
	//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li
	
	
	@FindBy(xpath = "//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li") 
	private WebElement bottomNav_bar;

	public WebElement click_Bottom_Nav_Bar() {
		return bottomNav_bar;
	}
	
	
	
	
	//==================footer links=====================================
	
	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='About Us']") 
	private WebElement aboutUs;

	public WebElement click_FooterLink_AboutUs() {
		return aboutUs;
	}
	//(//ul[@class='footer-link d-md-block d-none'])[1]//li	
	//h3[@class='footer-heading  pb-4']
	
	
	
	
	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='My Hero']") 
	private WebElement myHero;

	public WebElement click_FooterLink_MyHero() {
		return myHero;
	}
	
	
	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='Reach Us']") 
	private WebElement reachUs;

	public WebElement click_FooterLink_ReachUs() {
		return reachUs;
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Media Center']") 
	private WebElement mediaCenter;

	public WebElement click_FooterLink_MediaCenter() {
		return mediaCenter;
	}	
//===================country tab===============================
	
	
	@FindBy(xpath = "//div[@id='container-3aa1aa44cf']//li") 
	private WebElement selectCountry;

	public WebElement select_country() {
		return selectCountry;
	}	
	
	@FindBy(xpath = "//div[@class='userInfo']//a") 
	private WebElement countryName;

	public WebElement get_CountryName() {
		return countryName;
	}
	
	//=================  =======================   ===========================
	public home_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}




	

////====================================        ===========================================================
//	

}
