package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class XclanModule {

	public WebDriver driver;
	@FindBy(xpath = "//a[normalize-space()='RIDES & EVENTS']")
	private WebElement rideEvents;  
	
	public WebElement click_rideAndEvents() {
		return rideEvents;}
	
	
	@FindBy(xpath = "//h5[normalize-space()='XCLAN']")
	private WebElement xclanSelect;  
	
	public WebElement click_xclan() {
		return xclanSelect;}
	
	@FindBy(xpath = "//div[@class='buttonconT memberInfo']")
	private WebElement xclanJoinNow;  
	
	public WebElement click_joinNowXcaln() {
		return xclanJoinNow;}
	
	
	@FindBy(xpath = "//div[@class='xClan-banner-left']/img")
	private WebElement xclanBannerImage;  
	
	public WebElement verify_xclanBannerImage() {
		return xclanBannerImage;}
	
	@FindBy(xpath = "//p[@class='xClan-banner-title']")
	private WebElement xclanTitle;  
	
	public WebElement verify_xclanMembershipTitle() {
		return xclanTitle;}
	
	
	@FindBy(xpath = "//p[@class='xClan-banner-price']")
	private WebElement xclanPrice;  
	
	public WebElement verify_xclanPrice() {
		return xclanPrice;}
	
	@FindBy(xpath = "//select[@name='model']")
	private WebElement xclanmodel;  
	
	public WebElement select_xclanModel() {
		return xclanmodel;}
	
	@FindBy(xpath = "//select[@name='chapter']")
	private WebElement xclanChapter;  
	
	public WebElement select_xclanChapter() {
		return xclanChapter;}
	
	@FindBy(xpath = "//button[@class='btn proceed pre-requiste-form btn-red-gradient']")
	private WebElement xclanproceed;  
	
	public WebElement click_proceedBttn1() {
		return xclanproceed;}
	
	//button[@class='btn proceed pre-requiste-form btn-red-gradient']
	
	//div[@class='alert-danger enrollment-error hidden']=== already enrolled
	
	@FindBy(xpath = "//div[@class='alert-danger enrollment-error hidden']")
	private WebElement enrolled;  
	
	public WebElement verify_alreadyEnrolled() {
		return enrolled;}
	
	@FindBy(name = "VIN")
	private WebElement vinNum;  
	
	public WebElement verify_VinNum() {
		return vinNum;}
	
	@FindBy(name = "Card_Number")
	private WebElement cardNum;  
	
	public WebElement verify_CardNum() {
		return cardNum;}
	
	@FindBy(name = "chapter-city")
	private WebElement chapterCity;  
	
	public WebElement verify_ChapterCity() {
		return chapterCity;}
	
	@FindBy(name = "MODEL_CODE")
	private WebElement model;  
	
	public WebElement verify_Model() {
		return model;}

	
	@FindBy(xpath = "//input[@value='OWNER']")  //==isSelected for owner as user
	private WebElement membFor;  
	
	public WebElement verify_MembershipFor() {
		return membFor;}
	
	@FindBy(xpath = "//button[@class='btn proceed nominee-proceed btn-red-gradient']")
	private WebElement proceedBttn;  
	
	public WebElement click_proceedBttn2() {
		return proceedBttn;}
	
	@FindBy(xpath = "(//div[@class='back']//p)[1]")
	private WebElement flipTile1;  
	
	public WebElement flip_welcomeKit() {
		return flipTile1;}
	
	@FindBy(xpath = "(//div[@class='back']//h3)[3]")
	private WebElement flipTile2;  
	
	public WebElement flip_GoodlifePlatinum() {
		return flipTile2;}
	
	@FindBy(xpath = "//div[@class='back']//b")
	private WebElement flipTile3;  
	
	public WebElement flip_xclusiveRides() {
		return flipTile3;}
	
	@FindBy(xpath = "(//div[@class='back']//h3)[2]")
	private WebElement flipTile4;  
	
	public WebElement flip_WallofFame() {
		return flipTile4;}
	
	@FindBy(xpath = "(//div[@class='back']//h3)[4]")
	private WebElement flipTile5;  
	
	public WebElement flip_RallyAndEvents() {
		return flipTile5;}
	
	@FindBy(xpath = "(//div[contains(@class,'back')]//h3)[6]")
	private WebElement flipTile6;  
	
	public WebElement flip_DedicatedSocialTribe() {
		return flipTile6;}
	
	
	
}
