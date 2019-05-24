package logger;

import java.io.File;
import java.net.InetAddress;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import exceptionHandler.ExceptionHandler;
import logger.interfaces.ILogger;

/**
 * Log4jLogger class which implements ILogger interface
 * 
 * @autho sohail
 */
public class Log4jLogger implements ILogger {
	private Logger logger;
	private String logOutputPath = null;

	@Override
	public void initializeLogger() {
		String fileName = null;
		try {
			logOutputPath = Paths.get(System.getProperty("user.dir"), "Logs").toString();
			File logDirectory = new File(logOutputPath);
			if (!logDirectory.exists())
				logDirectory.mkdir();
			fileName = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss").format(new Date()) + ".log";
			System.setProperty("CESTA.log", Paths.get(logOutputPath, fileName).toString());
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
		createLogFile();
	}

	public void createLogFile() {
		String propsFileName = "./log4j.properties";
		try {
			File file = new File(propsFileName);
			if (file.exists()) {
				PropertyConfigurator.configure(propsFileName);
				logger = Logger.getRootLogger();
			} else {
				logger = Logger.getLogger(Log4jLogger.class);
				PatternLayout layout = new PatternLayout();
				InetAddress inetAddress = InetAddress.getLocalHost();
				MDC.put("ip", inetAddress.getHostAddress());
				MDC.put("host", inetAddress.getHostName());
				String conversionPattern = "[%-5p] %d %c - %m%n";
				layout.setConversionPattern(conversionPattern);
				ConsoleAppender consoleAppender = new ConsoleAppender();
				consoleAppender.setLayout(layout);
				consoleAppender.activateOptions();
				FileAppender fileAppender = new FileAppender();
				String filePath = System.getProperty("CESTA.log");
				fileAppender.setFile(filePath);
				fileAppender.setLayout(layout);
				fileAppender.activateOptions();
				Logger rootLogger = Logger.getRootLogger();
				rootLogger.setLevel(Level.INFO);
				rootLogger.addAppender(consoleAppender);
				rootLogger.addAppender(fileAppender);
			}
			info("Log Output Directory Created Successful : " + logOutputPath);
			info("Log Output File Created Successfully : " + System.getProperty("CESTA.log"));
			info("Startup Logger Activites..");
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
	}

	@Override
	public void fatal(String message) {
		try {
			logger.fatal(message);
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}

	}

	@Override
	public void error(String message) {
		try {
			logger.error(message);
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
	}

	@Override
	public void warn(String message) {
		try {
			logger.warn(message);
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
	}

	@Override
	public void info(String message) {
		try {
			logger.info(message);
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
	}

	@Override
	public void debug(String message) {
		try {
			logger.debug(message);
		} catch (Exception ex) {
			ExceptionHandler.handle(ex);
		}
	}
}
