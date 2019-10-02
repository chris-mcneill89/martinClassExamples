package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class WeekdaySleepIn {

	/**
	 * Main method which from which all other class methods can be called
	 * 
	 * @param String array of args
	 */
	public static void main(String[] args) {
		// variable to store result of sleepIn method
		boolean weSleptIn;

		// call sleepIn method and print results
		WeekdaySleepIn sleep = new WeekdaySleepIn();
		weSleptIn = sleep.sleepIn(false, false);
		System.out.println(weSleptIn);
		weSleptIn = sleep.sleepIn(true, false);
		System.out.println(weSleptIn);
		weSleptIn = sleep.sleepIn(false, true);
		System.out.println(weSleptIn);

	}

	/**
	 * Method to determine whether we can sleep in or not
	 * 
	 * @param boolean weekday
	 * @param boolean vacation
	 * @return
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		// variable to store return value
		boolean result;

		if (!weekday && !vacation) {
			result = true;
		} else if (weekday && !vacation) {
			result = false;
		} else if (!weekday && vacation) {
			result = true;
		} else {
			result = true;
		}
		return result;
	}

}
