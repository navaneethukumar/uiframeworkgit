package com.uiFramework.companyName.bhanuProjectName.testScripts.loginPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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
public class LoginTest2 extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest2.class);
	
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication() throws InterruptedException{
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("form url launched");
		System.out.println(driver.getTitle());
		String headertext=driver.findElement(By.xpath("//div[@class='header']/h2")).getText();
		System.out.println("header text is  "+headertext);
		
		String headertext1=driver.findElement(By.xpath("//div[@class='container']/div/h2")).getText();
		System.out.println("header text1 is  "+headertext1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naresh");

	//	driver.findElement(By.id("uname")).sendKeys("naresh");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("naresh123@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("naresh123");
		Thread.sleep(2000);

		driver.findElement(By.id("cpassword")).sendKeys("naresh123");
		Thread.sleep(2000);

		driver.findElement(By.id("tc")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("button")).click();;
		Thread.sleep(2000);

		


		
		 	}
}
