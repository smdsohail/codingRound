package testScripts;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.HotelBookingPage;

public class HotelBookingTest extends TestBase {

	@Test
	public void shouldBeAbleToSearchForHotels() {
		HotelBookingPage hotelBookingPage = new HotelBookingPage();
		hotelBookingPage.enterWhereTextField("Bangalore");
		hotelBookingPage.selectDate();
		hotelBookingPage.selectTravelers("1 room, 1 adult");
		hotelBookingPage.clickOnSearch();
		hotelBookingPage.validateSearchSummeryPage();
	}

	// private WebDriver driver;
	//
	// @FindBy(linkText = "Hotels")
	// private WebElement hotelLink;
	//
	// @FindBy(id = "Tags")
	// private WebElement localityTextBox;
	//
	// @FindBy(id = "SearchHotelsButton")
	// private WebElement searchButton;
	//
	// @FindBy(id = "travellersOnhome")
	// private WebElement travellerSelection;
	//
	// @Test
	// public void shouldBeAbleToSearchForHotels() {
	// setDriverPath();
	// driver = new ChromeDriver();
	// driver.get("https://www.cleartrip.com/");
	// hotelLink.click();
	//
	// localityTextBox.sendKeys("Indiranagar, Bangalore");
	//
	// new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
	// searchButton.click();
	//
	// driver.quit();
	//
	// }
	//
	// private void setDriverPath() {
	// if (PlatformUtil.isMac()) {
	// System.setProperty("webdriver.chrome.driver", "chromedriver");
	// }
	// if (PlatformUtil.isWindows()) {
	// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// }
	// if (PlatformUtil.isLinux()) {
	// System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	// }
	// }

}
