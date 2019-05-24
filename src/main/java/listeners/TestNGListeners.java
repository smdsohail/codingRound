package listeners;

import org.testng.IClassListener;
import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, IClassListener, ISuiteListener, IExecutionListener {

	@Override
	public void onExecutionStart() {
		System.out.println("Execution started. . . . . . . . . . . . . . . . ");
	}

	@Override
	public void onExecutionFinish() {
	}

	@Override
	public void onStart(ISuite suite) {
	}

	@Override
	public void onFinish(ISuite suite) {
	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

	@Override
	public void onBeforeClass(ITestClass testClass) {
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
	}
}