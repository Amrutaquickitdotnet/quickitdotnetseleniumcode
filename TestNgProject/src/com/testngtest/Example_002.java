package com.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_002 {
WebDriver driver;
@Test
public void lauchURL() {
	String baseUrl = "https://opensource-demo.orangehrmlive.com/";
	System.out.println("launching orangehrm website");
	System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(baseUrl);
	String testTitle = "OrangeHRM";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, testTitle);
	
}


@Test
public void foo() {
	
	System.out.println("Thanks");
	
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Starting test on chrome browser");
}

@org.testng.annotations.AfterMethod
public void AfterMethod() {
	System.out.println("Closing browser");
	//driver.close();
}


}
