package driverManager;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.javafx.PlatformUtil;

@SuppressWarnings("restriction")
public class DriverSettings {

	public String webDriverType = null;
	public Capabilities chromeCapabilities = null;
	public ChromeOptions chromeOptions = null;
	public ChromeDriverService chromeDriverService = null;

	public void setDriverPath() {
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
