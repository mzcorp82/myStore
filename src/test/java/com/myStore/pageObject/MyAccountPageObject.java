package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageObject {
	
	WebDriver ldriver;

	//Constractor
	public MyAccountPageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	WebElement  orderhistory;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span")
	@CacheLookup
	WebElement orderslips;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
	@CacheLookup
	WebElement myaddresse;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
	@CacheLookup
	WebElement personalinfo;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
	@CacheLookup
	WebElement wishlist;

	public void pressOrderHistory(){
		orderhistory.click();
	} 
	
	public void pressMyCreditSlips(){
		orderslips.click();
	}
	
	public void pressMyAddresses(){
		myaddresse.click();
	}
	
	public void pressMyPersonalInfo(){
		personalinfo.click();
	}
	
	public void pressMyWishlists(){
		wishlist.click();
	}

	 

	


}



