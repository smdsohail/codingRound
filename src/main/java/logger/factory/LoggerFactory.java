package logger.factory;

import org.testng.Assert;

import configurations.Singleton;
import logger.Log4jLogger;
import logger.interfaces.ILogger;

/**
 * 
 * Logger factory class to set the logger class object into Singleton based on
 * user input(logger type)and get where ever we required in the entire framework
 *
 * @author soahil
 */
public class LoggerFactory {

	private ILogger Logger = null;

	/**
	 * 
	 * Method to get the Logger object based on the user input(loggrType)
	 * exception.
	 *
	 * @author
	 */
	public ILogger getLoggerType(String loggerType) {

		switch (loggerType.toLowerCase()) {
		case "log4jlogger":
			Singleton.setInstance(ILogger.class, new Log4jLogger());
			Logger = Singleton.getInstance(ILogger.class);
			break;
		default:
			Assert.fail("Invalid logger type provided : " + loggerType);
			break;
		}
		return Logger;
	}
}
