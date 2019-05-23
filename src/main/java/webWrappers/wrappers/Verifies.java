package webWrappers.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import webWrappers.interfaces.IVerifies;

public class Verifies implements IVerifies {
	Actions actions;
	WebElement element;

	/**
	 * Method to verify the element is Present in DOM or not
	 * 
	 * @param by
	 */
	public void verifyElementIsPresent(By by) {
		try {
			element = actions.findElement(by);
			Assert.assertTrue(element != null,
					"Validation Failed : Expected Element: " + by + ", is not present in the DOM.");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * Method to verify the element is displayed or not
	 * 
	 * @param by
	 */
	public void verifyElementIsDisplayed(By by) {
		try {
			element = actions.findElement(by);
			Assert.assertTrue(element.isDisplayed(), "Validation Failed : Element is NOT Disabled : " + by);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
