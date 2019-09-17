package com.myStore.testCasses;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myStore.pageObject.BlousePageObject;
import com.myStore.pageObject.HomePagePageObject;
import com.myStore.pageObject.TheSummaryPageObject;

public class TC_SanetyTest_002 extends BaseClass{
	
	@Test
	public void sanetyTest() throws Exception{
	
	 	test = extent.createTest("loginTest");
		
		driver.get(baseURL);
		logger.info("open Website");
		HomePagePageObject hp = new HomePagePageObject(driver);
		
		hp.pressLoginBtn();
		logger.info("login button pressed");
		hp.setUserName(username);
		logger.info("enter the username");
		hp.setPassword(password);
		logger.info("enter the password");
		hp.pressSignInBtn();
		logger.info("press the sign in button");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.getTitle().equals("My account - My Store")){
			Assert.assertTrue(true);
			logger.info("the login was successfully");
		}
		else{
			Assert.assertTrue(false);
			captureScreen(driver, "loginTest");
			logger.info("the login was unsuccessfullyl");
		}
		hp.pressHomePageBtn();
		logger.info("Return to the home page");
		hp.pressBlouseChoise();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		logger.info("The Blouse was chosen");
		
		BlousePageObject blse = new BlousePageObject(driver);
		
		blse.AddTheProductToCart();
		logger.info("We added the dress");
		if(driver.getPageSource().contains("There is 1 item in your cart")==true){
			Assert.assertTrue(true);
			logger.info("the item was adedd successfully");
		}
		else{
			Assert.assertTrue(false);
			captureScreen(driver, "loginTest");
			logger.info("the item was adedd unsuccessfully");
		}
		
		TheSummaryPageObject sum = new TheSummaryPageObject(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sum.pressProceedToCheckoutInCart();;
		logger.info("we are now moving to the checkout");
		if(driver.getTitle().equals("Order - My Store")){
			Assert.assertTrue(true);
			logger.info("you in the order section");
		}
		else{
			Assert.assertTrue(false);
			captureScreen(driver, "loginTest");
			logger.info("you are not in the order section");
		}
		sum.pressProceedToCheckoutOnSummary();
		logger.info("you are moving to the order page");
		
		sum.pressProceedToCheckoutOnAddress();
		logger.info("you are moving to check the address");
		
		sum.pressToAgreeTheTerms();
		logger.info("you agree to the turmse");
		sum.pressProceedToCheckoutOnShipping();
		logger.info("you are moving to check the payment method");
		
		sum.pressToPayByBankWire();
		logger.info("you payed with the bank wire");
	}
}
