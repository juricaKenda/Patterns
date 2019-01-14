package singleton.pattern;

public class Tester {

	
	public static void main(String[] args) {
		//Creating the first logger and log some stuff in it
		Singleton logger = Singleton.getInstance();
		logger.log("Log from the first logger");
		logger.log("More logging..");
		
		/*
		 * Attempting to create a different logger,
		 * but we see that the log from the first logger is 
		 * being printed out, which implies we were assigned the same 
		 * object.
		 */
		Singleton loggerTwo = Singleton.getInstance();
		loggerTwo.printLog();
		
		/**
		 * Just to demonstrate it is indeed the same object we will
		 * reverse the roles and get the input from the second logger 
		 * and display it from the first one.
		 */
		loggerTwo.log("Logging from logger two!");
		logger.printLog();
	}
	
}
