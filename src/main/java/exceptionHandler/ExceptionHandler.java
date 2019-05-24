package exceptionHandler;

import org.testng.Assert;

public class ExceptionHandler {

	public static void handle(Exception e) {

		String exception = e.getClass().getSimpleName();

		switch (exception) {
		case "NoSuchElementException":
			Assert.fail("NoSuchElementException", e);
			break;
		case "ArithmeticException":
			Assert.fail("ArithmeticException", e);
			break;
		case "NoSuchFrameException":
			Assert.fail("NoSuchFrameException", e);
			break;
		case "InvalidSelectorException":
			Assert.fail("InvalidSelectorException", e);
			break;
		case "ElementNotVisibleException":
			Assert.fail("ElementNotVisibleException", e);
			break;
		case "NoSuchSessionException":
			Assert.fail("NoSuchSessionException", e);
			break;
		case "StaleElementReferenceException":
			Assert.fail("StaleElementReferenceException", e);
			break;
		case "WebDriverException":
			Assert.fail("WebDriverException", e);
			break;
		default:
			Assert.fail("Exception");
			break;
		}

	}

}
