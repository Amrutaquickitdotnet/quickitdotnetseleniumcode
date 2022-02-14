package allurereport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FunctioningofAllure {
  // @Test =. Actual testing of my test cases
	WebDriver driver;
	
	@BeforeTest
  public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
  }
	
	
	@Test(enabled = true)
	  public void verifyPageTitle() {
		
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	String currentTitle =	 driver.getTitle();
	Assert.assertEquals(currentTitle, "Google", "Title Doesn't match");
	  }
	
	
	@AfterTest
	  public void closebrowser() {
		System.out.println("I am Closing browser");
		driver.close();
	  }
}
