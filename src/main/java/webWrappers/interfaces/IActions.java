package webWrappers.interfaces;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IActions {
	
	/**
	 * Method for navigating to URL
	 * 
	 * @param url
	 */
	void navigateToURL(String url);
	/**
	 * Method to perform sendkeys operation
	 * 
	 * @param locator
	 */
	void sendKeys(By locator, String value);
	/**
	 * Method to perform a click operation on the given element.
	 * 
	 * @param locator
	 */
	void click(By locator);
	/**
	 * Method to perform clear operation
	 * 
	 * @param locator
	 */
	void clear(By locator);
	
	/**
	 * Method to find the given locator within the DOM. Returns the WebElement
	 * if the element is present within the DOM. This method performs retry for
	 * FindElement, if 'RetryCount' key is added to testcinfig.env.json file and
	 * has a valid value assigned. By default RetryCount will be 0.
	 * 
	 * @param locator
	 */
	WebElement findElement(By locator);
	
	/**
	 * Method to find the given locator within the DOM. Returns the List of
	 * WebElements if the elements are present within the DOM. This method
	 * performs retry for FindElements, if 'RetryCount' key is added to
	 * testcinfig.env.json file and has a valid value assigned. By default
	 * RetryCount will be 0.
	 * 
	 * @param locator
	 */
	List<WebElement> findElements(By locator);

}
