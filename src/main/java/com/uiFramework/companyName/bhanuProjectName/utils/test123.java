package com.uiFramework.companyName.bhanuProjectName.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test123 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('email').value='kfg';");

String aa = driver.findElement(By.id("email")).getAttribute("value");
System.out.println(aa);



WebElement ele = (WebElement) js.executeScript("return document.getElementsByName('login')[0];");
ele.click();


	}

}
