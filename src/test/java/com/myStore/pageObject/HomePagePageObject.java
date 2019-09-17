package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageObject {
	
	WebDriver ldriver;

	//Constractor
	public HomePagePageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img ")
	@CacheLookup
	WebElement  btnmainhome;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement  btnlogin;

	@FindBy(xpath = "//*[@id=\"email\"]")
	@CacheLookup
	WebElement  txtusername;

	@FindBy(xpath = "//*[@id=\"passwd\"]")
	@CacheLookup
	WebElement  txtpassword;

	@FindBy(xpath = " /html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span ")
	@CacheLookup
	WebElement  btnsignin;

	@FindBy(xpath = " /html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a ")
	@CacheLookup
	WebElement  btncart;

	@FindBy(xpath=" /html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
	@CacheLookup
	WebElement  btnwomen;

	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	@CacheLookup
	WebElement  btndresses;

	@FindBy(xpath="  /html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	@CacheLookup
	WebElement  btntshirt;

	@FindBy(xpath="  /html/body/div/div[1]/header/div[2]/div/div/nav/div[3]/a")
	@CacheLookup
	WebElement  btncontactus;

	@FindBy(xpath="  /html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
	@CacheLookup
	WebElement  btnsognout;

	@FindBy(xpath="/html/body/div/div[2]/div/div[2]/div/ul/li[1]/a")
	@CacheLookup
	WebElement  btnpopular;

	@FindBy(xpath=" /html/body/div/div[2]/div/div[2]/div/ul/li[2]/a")
	@CacheLookup
	WebElement  btnbestsellers;

	@FindBy(xpath="  /html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement  btnfadedshortchoise;

	@FindBy(xpath="  /html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement  btnblousechoise;

	@FindBy(xpath="  /html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement  btnprinteddresschoise;
	
	@FindBy(id = "email_create")
	@CacheLookup
	WebElement txtemailaddress;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	@CacheLookup
	WebElement btncreateaccount;
	
	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[1]/a")
	@CacheLookup
	WebElement btnfacebookfolow;
	
	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[2]/a")
	@CacheLookup
	WebElement btntwitterfolow;
	
	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[3]/a")
	@CacheLookup
	WebElement btnyoutubechanel;


	public void pressHomePageBtn (){
		btnmainhome.click();
	} 

	public void pressLoginBtn (){
		btnlogin.click();
	} 

	public void setUserName(String  uname){
		txtusername.sendKeys(uname);
	} 

	public void setPassword(String pass){
		txtpassword.sendKeys(pass);
	} 

	public void pressSignInBtn(){
		btnsignin.click();
	} 

	public void pressTheCart(){
		btncart.click();
	} 

	public void pressWomenSection(){
		btnwomen.click();
	} 

	public void pressDressesSection(){
		btndresses.click();
	} 

	public void pressTShirtSection(){
		btntshirt.click();
	} 

	public void pressContactUs(){
		btncontactus.click();
	} 

	public void pressSignOutUs(){
		btnsognout.click();
	} 
	public void pressPopularCollection(){
		btnpopular.click();
	} 

	public void pressBestSellersCollection (){
		btnbestsellers.click();
	} 


	public void pressFadedShortChoise(){
		btnfadedshortchoise.click();
	} 

	public void pressBlouseChoise (){
		btnblousechoise.click();
	} 

	public void pressPrintedDressChoise (){
		btnprinteddresschoise.click();
	} 
	
	public void enterNewEmailForRegistration (String newemail){
		txtemailaddress.sendKeys(newemail);
	}
	
	public void pressCreateAnAccount (){
		btncreateaccount.click();
	}


}
