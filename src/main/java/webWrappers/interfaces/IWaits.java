package webWrappers.interfaces;

import org.openqa.selenium.By;

public interface IWaits {

	/**
	 * An expectation to wait and check an element is visible and enabled such
	 * that it can be clicked.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param time
	 *            :: Time in seconds
	 */
	void waitForElementToBeClickable(By locator, int time);

	/**
	 * An expectation for checking that an element is present on the DOM of a
	 * page. This does not necessarily mean that the element is visible or
	 * enabled.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param time
	 *            :: Time in seconds
	 */
	void waitForElementToBePresent(By locator, int time);

	/**
	 * An expectation for checking that an element is present on the DOM of a
	 * page and visible.
	 * 
	 * @param locator
	 *            :: Locator for the web element
	 * @param time
	 *            :: Time in seconds
	 */
	void waitForElementToBeVisible(By locator, int time);

}
