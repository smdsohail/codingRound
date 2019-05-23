package testScripts;

import org.testng.annotations.Test;

import base.TestBase;
import driverManager.DriverManager;

public class Demo extends TestBase {
	
	@Test
	public void demoTest(){
		DriverManager.getWebDriver().get("http://google.com");
	}
	
}
