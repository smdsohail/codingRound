package driverManager;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> webDriverThread = new ThreadLocal<WebDriver>();

	public static WebDriver getWebDriver() {
		return webDriverThread.get();
	}

	public static void setWebDriver(WebDriver webdriver) {
		webDriverThread.set(webdriver);
	}

}
