/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {
	WebDriver driver;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Chetan\\Softs\\SeleniumSuite\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {
		driver.findElement(By.id("email")).sendKeys("chetankanani87");
		driver.findElement(By.id("pass")).sendKeys("hiImthere");
		driver.findElement(By.id("loginbutton")).submit();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
