package windowsmanagement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Example001_windowHandle {
	static WebDriver driver;

	public static void WindowHandles(WebDriver WindowHandles) {
		WebDriverManager.chromedriver().setup();
		 driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en/home.html");
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		login.click();
	//	System.out.println("Currentwindow Handle_Parent_Window:" + driver.getWindowHandle());

		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles)
			System.out.println(handle);

	}

	public static void main(String[] args) {

		WindowHandles(driver);

	}
}
