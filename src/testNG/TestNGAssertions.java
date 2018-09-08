/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAssertions {
	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Chetan\\Softs\\SeleniumSuite\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 10));
		System.out.println("Chetan Kanani");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("Chetan");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
