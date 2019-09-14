package com.myStore.testCasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myStore.pageObject.HomePagePageObject;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws Exception{
		
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.getTitle().equals("My account - My Store")){
			Assert.assertTrue(true);
			logger.info("the login was successfully");
		}
		else{
			Assert.assertTrue(false);
			captureScreen(driver, "loginTest");
			logger.info("the login was unsuccessfullyl");
		}
	}
} 



