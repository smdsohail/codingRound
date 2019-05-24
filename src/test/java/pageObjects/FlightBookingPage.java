package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import base.PageBase;

public class FlightBookingPage extends PageBase {

	By txt_FromCity = By.id("FromTag");
	By txt_ToCity = By.id("ToTag");
	By btn_SearchFlights = By.id("SearchBtn");
	By dp_Date = By.xpath(
			"//div[@id='ui-datepicker-div']/div[@class='monthBlock last']//a[@class='ui-state-default ' and text()='1']");
	By list_FromCity = By.id("ui-id-1");
	By list_ToCity = By.id("ui-id-2");
	By hdr_SearchSummery = By.className("searchSummary");

	public void selectTripType(String tripType) {
		// Test Data
		actions.navigateToURL("https://www.cleartrip.com/");
		By rb_tripType = By.id(tripType);
		waits.waitForElementToBeClickable(rb_tripType, 4);
		actions.click(rb_tripType);
	}

	public void fromCity(String city) {
		waits.waitForElementToBeVisible(txt_FromCity, 4);
		actions.sendKeys(txt_FromCity, city);
		try {
			waits.waitForElementToBeVisible(list_FromCity, 10);
			List<WebElement> elements = actions.findElements(list_FromCity);
			for (WebElement element : elements) {
				if (element.getText().contains(city)) {
					element.click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail("Exception caused while entering from city : " + city, e);
		}

	}

	public void toCity(String city) {
		waits.waitForElementToBeVisible(txt_ToCity, 4);
		actions.sendKeys(txt_ToCity, city);
		try {
			waits.waitForElementToBeVisible(list_ToCity, 10);
			List<WebElement> elements = actions.findElements(list_ToCity);
			for (WebElement element : elements) {
				if (element.getText().contains(city)) {
					element.click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail("Exception caused while entering to city :" + city, e);
		}
	}

	public void departDate() {
		waits.waitForElementToBeVisible(dp_Date, 4);
		actions.click(dp_Date);
	}

	public void clickSearchButton() {
		waits.waitForElementToBeClickable(btn_SearchFlights, 4);
		actions.click(btn_SearchFlights);
	}

	public void validateSearchSummeryPage() {
		waits.waitForElementToBeVisible(hdr_SearchSummery, 5);
		verifies.verifyElementIsDisplayed(hdr_SearchSummery);
	}

}
