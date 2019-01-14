package singleton.pattern;

public class Singleton {

	private static Singleton onlyInstance = null;
	private StringBuilder log;
	
	/**
	 * This constructor is guaranteed to be called only once.
	 */
	private Singleton() {
		System.out.println("Initialized a singleton logger.");
	
		this.log = new StringBuilder();
	}
	
	/**
	 * A method that will always return a one and only
	 * element. Weather it is just created or it was previously created.
	 * @return the only instance of Singleton class
	 */
	public static Singleton getInstance() {
		
		if(onlyInstance == null) {
			onlyInstance = new Singleton();
		}
		return onlyInstance;
	}
	
	/**
	 * Appends the text to the current log.
	 * @param input
	 */
	public void log(String input) {
		this.log.append("\n" + input);
	}
	
	/**
	 * A method used for getting the log back to the user.
	 * @return everything logged so far
	 */
	public String getLog() {
		return this.log.toString();
	}
	
	/**
	 * Prints out the current log to the console.
	 */
	public void printLog() {
		System.out.println(this.getLog());
	}
	
	/**
	 * Clears out the entire log.
	 */
	public void clearLog() {
		this.log = new StringBuilder();
	}
}
