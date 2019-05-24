package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import base.PageBase;

public class SignInPage extends PageBase {
	By tab_YourTrip = By.id("userAccountLink");
	By btn_SignIn = By.id("SignIn");
	By btn_SignInPopUp = By.id("signInButton");
	By lbl_ErrorMsg = By.xpath("//div[@id='errors1']/span");
	By iFrame = By.xpath("//iframe[@id='modal_window']");

	public void clickOnYourTripTab() {
		actions.navigateToURL("https://www.cleartrip.com/");
		waits.waitForElementToBeClickable(tab_YourTrip, 2);
		actions.click(tab_YourTrip);
	}

	public void clickOnSignInButton() {
		waits.waitForElementToBeClickable(btn_SignIn, 2);
		actions.click(btn_SignIn);
	}

	public void clickOnSignInAtPopUp() {
		actions.switctoIFrame(iFrame);
		waits.waitForElementToBeVisible(btn_SignInPopUp, 5);
		waits.waitForElementToBeClickable(btn_SignInPopUp, 2);
		actions.click(btn_SignInPopUp);
	}

	public void validateErrorMessage() {
		waits.waitForElementToBeVisible(lbl_ErrorMsg, 2);
		String errorMsg = actions.getText(lbl_ErrorMsg);
		Assert.assertEquals(errorMsg, "There were errors in your submission");
	}
}
