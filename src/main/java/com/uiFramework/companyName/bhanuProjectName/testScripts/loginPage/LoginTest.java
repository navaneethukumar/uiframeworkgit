package com.uiFramework.companyName.bhanuProjectName.testScripts.loginPage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uiFramework.companyName.bhanuProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.bhanuProjectName.pageObject.LoginPage;
import com.uiFramework.companyName.bhanuProjectName.testbase.TestBase;
/**
 * 
 * @author Bhanu Pratap
 */
public class LoginTest extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("facebook url launched");
	
		 System.out.println("credentionals entered successfully");
		String loginpagetitle=driver.getTitle();
		System.out.println("login page title is "+loginpagetitle);
	
		
	//  boolean status = loginPage.verifySuccessLoginMsg();
		  
	//	  AssertionHelper.updateTestStatus(status);
		 	}
	@Test(enabled=false,description="Login test with valid credentials")
	public void testLoginToApplicationWITHiNVALIDPASSWORD() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("facebook url launched");
		
		
		  LoginPage loginPage = new LoginPage(driver);
		  Thread.sleep(5000);
		  
		  loginPage.loginToApplication(ObjectReader.reader.getUserName(),
		  ObjectReader.reader.getPassword());
		  System.out.println("credentionals entered successfully");
		String loginpagetitle=driver.getTitle();
		System.out.println("login page title is "+loginpagetitle);
		Assert.assertEquals(driver.getTitle(), "abc","mismatched the title");
		
	//  boolean status = loginPage.verifySuccessLoginMsg();
		  
	//	  AssertionHelper.updateTestStatus(status);
		 	}
	@Test(enabled=false,description="Login test with valid credentials")
	public void testLoginToApplicationWITHiNVALIDPASSWORDANDBLANKUSERNAME() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("facebook url launched");
		
		
		  LoginPage loginPage = new LoginPage(driver);
		  Thread.sleep(5000);
		  
		  loginPage.loginToApplication(ObjectReader.reader.getUserName(),
		  ObjectReader.reader.getPassword());
		  System.out.println("credentionals entered successfully");
		String loginpagetitle=driver.getTitle();
		System.out.println("login page title is "+loginpagetitle);
		Assert.assertEquals(driver.getTitle(), "abc","mismatched the title");
		
	//  boolean status = loginPage.verifySuccessLoginMsg();
		  
	//	  AssertionHelper.updateTestStatus(status);
		 	}
	@Test(enabled=false,description="Login test with valid credentials")
	public void testLoginToApplicationFORFORGOTPASSWORDPASSWORDAPPLICAIONS() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("facebook url launched");
		
		
		  LoginPage loginPage = new LoginPage(driver);
		  Thread.sleep(5000);
		  
		  loginPage.loginToApplication(ObjectReader.reader.getUserName(),
		  ObjectReader.reader.getPassword());
		  System.out.println("credentionals entered successfully");
		String loginpagetitle=driver.getTitle();
		System.out.println("login page title is "+loginpagetitle);
		Assert.assertEquals(driver.getTitle(), "abc","mismatched the title");
		
	//  boolean status = loginPage.verifySuccessLoginMsg();
		  
	//	  AssertionHelper.updateTestStatus(status);
		 	}
	@Test(enabled=false,description="Login test with valid credentials")
	public void testLoginToApplicationLOGINPAGELINKSVERIFICATIOS() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("facebook url launched");
		
		
		  LoginPage loginPage = new LoginPage(driver);
		  Thread.sleep(5000);
		  
		  loginPage.loginToApplication(ObjectReader.reader.getUserName(),
		  ObjectReader.reader.getPassword());
		  System.out.println("credentionals entered successfully");
		String loginpagetitle=driver.getTitle();
		System.out.println("login page title is "+loginpagetitle);
		Assert.assertEquals(driver.getTitle(), "abc","mismatched the title");
		
	//  boolean status = loginPage.verifySuccessLoginMsg();
		  
	//	  AssertionHelper.updateTestStatus(status);
		 	}
}
