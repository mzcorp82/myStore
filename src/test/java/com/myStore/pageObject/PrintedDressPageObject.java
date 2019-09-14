package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintedDressPageObject {
	
	WebDriver ldriver;

	//Constractor
	public PrintedDressPageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[1]")
	@CacheLookup
	WebElement  btntweetershare;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[2]")
	@CacheLookup
	WebElement  btnfacebookshare;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[3]")
	@CacheLookup
	WebElement  btngoogleplusshare;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[4]")
	@CacheLookup
	WebElement  btnpinterest;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/div[3]/ul/li/a")
	@CacheLookup
	WebElement  btnwritereview;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[1]/a")
	@CacheLookup
	WebElement  btncancelquality;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[2]/a")
	@CacheLookup
	WebElement  btnonestar;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[3]/a")
	@CacheLookup
	WebElement  btntwostar;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[4]/a")
	@CacheLookup
	WebElement  btnthreestar;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[5]/a")
	@CacheLookup
	WebElement  btnfourstar;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/ul/li/div[1]/div[6]/a")
	@CacheLookup
	WebElement  btnfivestar;


	@FindBy(name = "title")
	@CacheLookup
	WebElement  txttitle;

	@FindBy(name = "content")
	@CacheLookup
	WebElement  txtcomment;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/div[2]/p[2]/button/span")
	@CacheLookup
	WebElement  btnsend;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/div[2]/p[2]/a")
	@CacheLookup
	WebElement  btncancel;



	@FindBy(id = "send_friend_button")
	@CacheLookup
	WebElement  btnsendafriend;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/ul/li[2]/a")
	@CacheLookup
	WebElement  btnprint;

	@FindBy(name = "qty")
	@CacheLookup
	WebElement  txtquantity;
	/////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[1]")                                                                                                  
	@CacheLookup
	WebElement  btnsmallsize;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[2]")                                                                                                  
	@CacheLookup
	WebElement  btnmediumsize;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[3]")                                                                                                  
	@CacheLookup
	WebElement  btnlargsize;

	@FindBy(name = "White")////
	@CacheLookup
	WebElement  btncolorwhite;

	@FindBy(name = "Black")/////
	@CacheLookup
	WebElement  btncolorblack;


	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	@CacheLookup
	WebElement  btnaddtocart;

	@FindBy(id = "wishlist_button")
	@CacheLookup
	WebElement  btnwishlist;

	public void pressToTweet(){
		btntweetershare.click();
	} 

	public void pressToShareOnFacebook(){
		btnfacebookshare.click();
	} 

	public void pressToShareOnGooglePluse (){
		btngoogleplusshare.click();
	} 

	public void pressSerchOnPinterest(){
		btnpinterest.click();
	} 

	public void pressToWriteReview(){
		btnwritereview.click();
	} 

	public void pressToCancelStars (){
		btncancelquality.click();
	} 

	public void pressOnOneStar (){
		btnonestar.click();
	} 

	public void pressOnTwoStar (){
		btntwostar.click();
	} 

	public void pressOnTreeStar (){
		btnthreestar.click();
	} 

	public void pressOnFourStar (){
		btnfourstar.click();
	} 

	public void pressOnFiveStar (){
		btnfivestar.click();
	} 

	public void titleForReview(String  titl){
		txttitle.sendKeys(titl);
	} 

	public void commentForReview(String  com){
		txtcomment.sendKeys(com);
	} 
	public void pressSend (){
		btnsend.click();
	} 
	public void pressCancel (){
		btncancel.click();
	} 
	public void pressSendToFriend (){
		btnsendafriend.click();
	} 
	public void pressToPrint (){
		btnprint.click();
	} 
	public void enterOrderQuantity(String num){
		txtquantity.sendKeys(num);
	} 
	public void chusTheSmallSize(){
		btnsmallsize.click();
	}
	public void chusTheMediumSize(){
		btnmediumsize.click();
	} 
	public void chusTheLargSize(){
		btnlargsize.click();
	} 

	public void chooseTheColorWhite (){
		btncolorwhite.click();
	} 
	public void chooseTheColorBlack(){
		btncolorblack.click();
	} 
	public void AddTheProductToCart (){
		btnaddtocart.click();
	} 
	public void AddTheProductToWishlist (){
		btnwishlist.click();
	} 
}


