package webWrappers.wrappers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driverManager.DriverManager;
import webWrappers.interfaces.IActions;

public class Actions implements IActions {
	
	
	public void navigateToURL(String url) {
		try {
			DriverManager.getWebDriver().get(url);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception occurred
			// while navigating to URL ::" + url);
		}
	}

	/**
	 * Method to perform sendkeys operation
	 * 
	 * @param locator
	 */
	public void sendKeys(By locator, String value) {
		WebElement element;
		try {
			element = findElement(locator);
			element.clear();
			element.sendKeys(value);
			// log.info("Typing " + value + " to the locator " + locator);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception while
			// entering text to: " + locator);
		}
	}


	public void click(By locator) {
		WebElement element;
		try {
			element = findElement(locator);
			element.click();
			// log.info("Click on: " + locator);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception in clicking
			// element: " + locator);
		}
	}


	public void clear(By locator) {
		WebElement element;
		try {
			element = findElement(locator);
			element.clear();
			// log.info("Clear text from the locator: " + locator);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception while
			// clearing text: " + locator);
		}
	}

	public WebElement findElement(By locator) {
		WebElement element = null;
		try {
			element = DriverManager.getWebDriver().findElement(locator);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception occurred
			// while trying to find element using locator:"
			// + locator + ", with RetryCount:" + retry);
		}
		return element;
	}

	/**
	 * Method to find the given locator within the DOM. Returns the List of
	 * WebElements if the elements are present within the DOM. This method
	 * performs retry for FindElements, if 'RetryCount' key is added to
	 * testcinfig.env.json file and has a valid value assigned. By default
	 * RetryCount will be 0.
	 * 
	 * @param locator
	 */
	public List<WebElement> findElements(By locator) {
		List<WebElement> element = null;
		try {
			element = DriverManager.getWebDriver().findElements(locator);
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Exception occurred
			// while trying to find element using locator:"
			// + locator + ", with RetryCount:" + retry);
		}
		return element;
	}

}
