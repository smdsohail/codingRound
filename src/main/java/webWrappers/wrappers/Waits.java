package webWrappers.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverManager;
import webWrappers.interfaces.IWaits;

public class Waits implements IWaits {

	/**
	 * An expectation to wait and check an element is visible and enabled such
	 * that it can be clicked.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param waitType
	 *            :: Type of wait from WaitType
	 */
	public void waitForElementToBeClickable(By locator, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), time);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Failed Waiting For
			// Element ::" + locator + " To Be Clickable");
		}
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a
	 * page. This does not necessarily mean that the element is visible or
	 * enabled.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param waitType
	 *            :: Type of wait from WaitType
	 */
	public void waitForElementToBePresent(By locator, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), time);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Failed Waiting For
			// Element ::" + locator + " To Be Present");
		}
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a
	 * page and visible.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param waitType
	 *            :: Type of wait from WaitType
	 */
	public void waitForElementToBeVisible(By locator, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			// CustomExceptionHandler.ExceptionHandler(e, "Failed Waiting For
			// Element ::" + locator + " To Be Visible");
		}
	}

}
