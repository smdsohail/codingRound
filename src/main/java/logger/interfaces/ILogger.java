package logger.interfaces;

/**
 * ILogger interface consists of common logger function which can be override
 * by any type of logger and implement there own functionalities
 * 
 * @author sohail
 */
public interface ILogger {

	/**
	 * Method to Initialize Logger
	 * 
	 * @return void
	 */
	void initializeLogger();

	/**
	 * Method to log the Fatal message.
	 * 
	 * @return void
	 * @param message
	 */
	void fatal(String message);

	/**
	 * Method to log the Error message.
	 * 
	 * @return void
	 * @param message
	 */
	void error(String message);

	/**
	 * Method to log the Warn message.
	 * 
	 * @return void
	 * @param message
	 */
	void warn(String message);

	/**
	 * Method to log the Info message.
	 * 
	 * @return void
	 * @param message
	 */
	void info(String message);

	/**
	 * Method to log the Debug message.
	 * 
	 * @return void
	 * @param message
	 */
	void debug(String message);

}