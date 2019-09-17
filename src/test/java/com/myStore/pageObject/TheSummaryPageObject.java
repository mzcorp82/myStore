package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheSummaryPageObject {
	
	WebDriver ldriver;

	//Constractor
	public TheSummaryPageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "quantity_2_7_0_208599")
	@CacheLookup
	WebElement  txtqty;
	
	@FindBy(xpath = "//*[@id=\"cart_quantity_up_2_7_0_208599\"]/span/i")
	@CacheLookup
	WebElement  btnaddqty;
	
	@FindBy(xpath = "//*[@id=\"cart_quantity_down_2_7_0_208599\"]/span/i")
	@CacheLookup
	WebElement  btnsubtractqty;
	
	@FindBy(xpath = "//*[@id=\"2_7_0_208599\"]/i")
	@CacheLookup
	WebElement  btndelete;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[2]")
	@CacheLookup
	WebElement  btncontinueshoping;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	@CacheLookup
	WebElement  btnproceedcheckoutInCart;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	@CacheLookup
	WebElement  btnproceedcheckoutOnSummary;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	@CacheLookup
	WebElement  btnproceedcheckoutOnAddress;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	@CacheLookup
	WebElement  btnproceedcheckoutOnShipping;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	@CacheLookup
	WebElement  btnaddnewaddress;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	@CacheLookup
	WebElement  txtaddacomment;
	
	@FindBy(name = "cgv")
	@CacheLookup
	WebElement  btnagreetoterms;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
	@CacheLookup
	WebElement  btnpaybank;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")
	@CacheLookup
	WebElement  btnpaycheck;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	@CacheLookup
	WebElement  btnconfirmorder;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/a")
	@CacheLookup
	WebElement  btnotherpayment;

	
	public void enterTheQty(String qt){
		txtqty.sendKeys(qt);;
	}
	
	public void pressToAddQty(){
		btnaddqty.click();
	}
	
	public void pressToSubtractQty(){
		btnsubtractqty.click();
	}
	
	public void pressDeleteTheItem(){
		btndelete.click();
	}
	
	public void pressToContinueShoping(){
		btncontinueshoping.click();
	}
	
	public void pressProceedToCheckoutInCart(){
		btnproceedcheckoutInCart.click();
	}
	
	public void pressProceedToCheckoutOnSummary(){
		btnproceedcheckoutOnSummary.click();
	}
	
	public void pressProceedToCheckoutOnAddress(){
		btnproceedcheckoutOnAddress.click();
	}
	
	public void pressProceedToCheckoutOnShipping(){
		btnproceedcheckoutOnShipping.click();
	}
	
	
	
	
	
	public void pressToAddNewAddress(){
		btnaddnewaddress.click();
	}
	
	public void pressToAddComment(String comm){
		txtaddacomment.sendKeys(comm);
	}
	
	public void pressToAgreeTheTerms(){
		btnagreetoterms.click();
	}
	
	public void pressToPayByBankWire(){
		btnpaybank.click();
	}
	
	public void pressToPayByCheck(){
		btnpaycheck.click();
	}
	
	public void pressToConfirmTheOrder(){
		btnconfirmorder.click();
	}
	
	public void pressToOtherPayment(){
		btnotherpayment.click();
	}


}
