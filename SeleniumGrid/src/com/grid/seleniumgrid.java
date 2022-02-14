package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumgrid {

	
	static String baseUrl = "https://www.google.com";
	static String nodeURL = "http://192.168.1.7:4444/wd/hub";
	static WebDriver driver;
	public static void main(String[] args) {
		gridRun();
 
		
		
	}
	
	public static void gridRun() {
     // DesiredCapabilities cap = DesiredCapabilities.chrome();
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("chrome");
		
		try {
			driver = new RemoteWebDriver(new URL(nodeURL),capability);
			driver.navigate().to(baseUrl);
			driver.findElement(By.name("q")).sendKeys("QuickITDotnet");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
