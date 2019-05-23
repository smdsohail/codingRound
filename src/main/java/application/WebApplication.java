package application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import driverManager.DriverManager;

public class WebApplication implements Application {
	WebDriver driver = null;

	@Override
	public void launch() {
		// Test Data
		String browserType = "chrome";

		switch (browserType.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			throw new IllegalArgumentException("Invalid browser type provided: " + browserType);
		}
		DriverManager.setWebDriver(driver);
		// Test Data
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Override
	public void dispose() {
		driver.quit();
	}

}
