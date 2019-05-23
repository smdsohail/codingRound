package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.sun.javafx.PlatformUtil;

@SuppressWarnings("restriction")
public class TestBase {
	
	public WebDriver driver;

	@BeforeSuite
	public void globalSetup() {
		setDriverPath();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterSuite
	public void globalTeardown() {

	}

	// @BeforeClass
	// public void beforeClass() {
	//
	// }
	//
	// @BeforeTest
	// public void beforeTest() {
	//
	// }
	// @AfterTest
	// public void afterTest() {
	//
	// }
	//
	// @AfterClass
	// public void afterClass() {
	//
	// }
	
	private void setDriverPath() {
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");

		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_linux");

		}
	}
}
