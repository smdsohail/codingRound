package testScripts;

import base.TestBase;
import pageObjects.FlightBookingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FlightBookingTest extends TestBase {
	WebDriver driver;

	@Test
	public void testThatResultsAppearForAOneWayJourney() {
		// Test Data
		FlightBookingPage flightBookingPage = new FlightBookingPage();
		flightBookingPage.selectTripType("OneWay");
		flightBookingPage.fromCity("Bangalor");
		flightBookingPage.toCity("Delh");
		flightBookingPage.departDate();
		flightBookingPage.clickSearchButton();
		flightBookingPage.validateSearchSummeryPage();

		// driver.get("https://www.cleartrip.com/");
		// waitFor(2000);
		// driver.findElement(By.id("OneWay")).click();
		// driver.findElement(By.id("FromTag")).clear();
		// driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		//
		// // wait for the auto complete options to appear for the origin
		//
		// waitFor(2000);
		// List<WebElement> originOptions =
		// driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
		// originOptions.get(0).click();
		//
		// driver.findElement(By.id("ToTag")).clear();
		// driver.findElement(By.id("ToTag")).sendKeys("Delhi");
		//
		// // wait for the auto complete options to appear for the destination
		//
		// waitFor(2000);
		// // select the first item from the destination auto complete list
		// List<WebElement> destinationOptions =
		// driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
		// destinationOptions.get(0).click();
		//
		// driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		//
		// // all fields filled in. Now click on search
		// driver.findElement(By.id("SearchBtn")).click();
		//
		// waitFor(5000);
		// // verify that result appears for the provided journey search
		// Assert.assertTrue(isElementPresent(By.className("searchSummary")));
		//
		// // close the browser
		// driver.quit();

	}

	// private void waitFor(int durationInMilliSeconds) {
	// try {
	// Thread.sleep(durationInMilliSeconds);
	// } catch (InterruptedException e) {
	// e.printStackTrace(); // To change body of catch statement use File |
	// // Settings | File Templates.
	// }
	// }
	//
	// private boolean isElementPresent(By by) {
	// try {
	// driver.findElement(by);
	// return true;
	// } catch (NoSuchElementException e) {
	// return false;
	// }
	// }

}
