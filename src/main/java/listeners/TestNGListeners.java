package listeners;

import org.testng.IClassListener;
import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import loggers.factory.LoggerFactory;
//import loggers.interfaces.ILogger;
//import parsers.PropertiesParser;
//import reporters.factory.ReporterFactory;
//import reporters.interfaces.IReporter;
//import testConfiguration.PropertyFileLoader;
//import testConfiguration.Singleton;

//public class TestNGListeners implements ITestListener, IClassListener, ISuiteListener, IExecutionListener {
//	private ILogger log;
//	private IReporter report;
//
//	@Override
//	public void onExecutionStart() {
//		System.out.println("Execution started. . . . . . . . . . . . . . . . ");
//		PropertiesParser propertiesParser = Singleton.getInstance(PropertyFileLoader.class).propertiesParser;
//		log = new LoggerFactory().getLoggerType(propertiesParser.getProperty("logtype"));
//		report = new ReporterFactory().getReporterType(propertiesParser.getProperty("reporttype"));
//	}
//
//	@Override
//	public void onExecutionFinish() {
//		log.info("\n#######################\n Execution Finished \n#######################");
//	}
//
//	@Override
//	public void onStart(ISuite suite) {
//		Singleton.getInstance(ILogger.class).initializeLogger();
//		Singleton.getInstance(IReporter.class).initializeReport(suite);
//		log.info("On Suite Start");
//	}
//
//	@Override
//	public void onFinish(ISuite suite) {
//		log.info("On Suite Finish");
//	}
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		log.info("On Test Execution Start");
//		report.startTest(result);
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		log.info("On Test Start");
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		log.info("On Test Failure");
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		log.info("On Test Skipped");
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		log.info("On Test Failed But With in Success Percentage : " + result.getName());
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		log.info("Invoking after the test class is instantiated and before any configuration method is called");
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		log.info("All the tests have run and all their Configuration methods have been called");
//	}
//
//	@Override
//	public void onBeforeClass(ITestClass testClass) {
//		log.info("On Before Class : " + testClass.getName());
//	}
//
//	@Override
//	public void onAfterClass(ITestClass testClass) {
//		log.info("On After Class : " + testClass.getName());
//	}