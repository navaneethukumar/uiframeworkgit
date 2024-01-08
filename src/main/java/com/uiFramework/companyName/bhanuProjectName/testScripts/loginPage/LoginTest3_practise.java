package com.uiFramework.companyName.bhanuProjectName.testScripts.loginPage;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class LoginTest3_practise extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest3_practise.class);
	
	
	@Test(description="Login test with practise")
	public void testLoginToApplication() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("form url launched");
		System.out.println(driver.getTitle());
		List<WebElement> data = driver.findElements(By.xpath("//h1[@title~='some']"));
	
	for (WebElement webElement : data) {
		System.out.println(webElement.getText());
	}
				
				 	}
}
