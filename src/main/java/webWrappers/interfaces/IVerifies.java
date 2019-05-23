package webWrappers.interfaces;

import org.openqa.selenium.By;

public interface IVerifies {
	
	/**
	 * Method to verify the element is Present in DOM or not
	 * 
	 * @param by
	 */
	void verifyElementIsPresent(By by);
	
	/**
	 * Method to verify the element is displayed or not
	 * 
	 * @param by
	 */
	void verifyElementIsDisplayed(By by);

}
