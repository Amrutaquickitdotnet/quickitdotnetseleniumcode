package com.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_004_groups {
	 WebDriver driver;
	 String title = "OrangeHRM";
	 String baseUrl = "https://opensource-demo.orangehrmlive.com";
	
	@Test
	public void starting_point() {
		
		System.out.println("launching orangehrm website");
		System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		
		
	}


	@Test(groups = {"orangehrmtitle"})
	public void checkTitle() 
	{
		 
		
		System.out.println("Thanks");
		
	}
	@Test(groups = {"orangehrmtitle"})
	public void verifyTitle() {
		System.out.println("Title has been verified");
	}



}
