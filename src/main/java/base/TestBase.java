package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import application.WebApplication;
import configurations.Singleton;
import driverManager.DriverSettings;
import logger.factory.LoggerFactory;
import logger.interfaces.ILogger;

public class TestBase {

	protected WebApplication webApplication;
	DriverSettings settings;
	ILogger log;

	public TestBase() {
		webApplication = Singleton.getInstance(WebApplication.class);
		settings = Singleton.getInstance(DriverSettings.class);
	}

	@BeforeSuite
	public void globalSetup() {
		log = new LoggerFactory().getLoggerType("log4jlogger");
		log = Singleton.getInstance(ILogger.class);
		log.initializeLogger();
		log.info("Execution Started");
		settings.setDriverPath();
		// settings.webDriverType = "chrome";
		webApplication.launch();

	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterSuite
	public void globalTeardown() {
		webApplication.dispose();
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

}
