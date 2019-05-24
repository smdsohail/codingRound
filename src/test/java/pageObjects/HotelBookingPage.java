package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.PageBase;

public class HotelBookingPage extends PageBase {
	By txt_Where = By.id("Tags");
	By dp_Date = By.xpath(
			"//div[@id='ui-datepicker-div']/div[@class='monthBlock last']//a[@class='ui-state-default ' and text()='1']");
	By list_Where = By.id("ui-id-1");
	By btn_Search = By.id("SearchHotelsButton");
	By hdr_SearchSummery = By.className("searchSummary");

	public void enterWhereTextField(String cityName) {
		actions.navigateToURL("https://www.cleartrip.com/hotels");
		waits.waitForElementToBeVisible(txt_Where, 4);
		actions.sendKeys(txt_Where, cityName);
		try {
			waits.waitForElementToBeVisible(list_Where, 10);
			List<WebElement> elements = actions.findElements(list_Where);
			for (WebElement element : elements) {
				if (element.getText().contains(cityName)) {
					element.click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail("Exception caused while entering from city : " + cityName, e);
		}
	}

	public void selectDate() {
		waits.waitForElementToBeVisible(dp_Date, 2);
		actions.click(dp_Date);
		waits.waitForElementToBeVisible(dp_Date, 2);
		actions.click(dp_Date);
	}

	public void selectTravelers(String roomsAndPeoples) {
		try {
			WebElement element = actions.findElement(By.id("travellersOnhome"));
			Select select = new Select(element);
			select.selectByVisibleText(roomsAndPeoples);
		} catch (Exception e) {
			Assert.fail("Exception caused while selecting travelers : " + roomsAndPeoples, e);
		}
	}

	public void clickOnSearch() {
		actions.click(btn_Search);
	}

	public void validateSearchSummeryPage() {
		waits.waitForElementToBeVisible(hdr_SearchSummery, 5);
		verifies.verifyElementIsDisplayed(hdr_SearchSummery);
	}

}
