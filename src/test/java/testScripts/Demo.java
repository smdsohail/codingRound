package testScripts;

import org.testng.annotations.Test;

import base.TestBase;
import driverManager.DriverManager;
import exceptionHandler.ExceptionHandler;

public class Demo extends TestBase {
	
	@Test
	public void demoTest(){
		try {
			int a= 1/0;
			System.out.println(a);
		} catch (Exception e) {
			ExceptionHandler.handle(e);
		}
	}
	
}
