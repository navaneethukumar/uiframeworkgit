package com.qa.crossbrowser_naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowsertesting_naresh {

@Parameters("browser")
@Test
public void startapplication(String browser) {
	WebDriver driver=null;
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
			System.out.println("chrome driver involked");
	}
	else if(browser.equals("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		System.out.println("firefox driver involked");
		System.out.println("excuted from jenkins");

		
	}
	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		System.out.println("edge driver involked");

		
	}
	else {
		System.out.println("mismatched");
	}
driver.get("https:www.facebook.com");	
System.out.println(driver.getTitle());
System.out.println("cross broser testing reached");
}

}
