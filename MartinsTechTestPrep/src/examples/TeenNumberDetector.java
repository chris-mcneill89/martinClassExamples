package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class TeenNumberDetector {

	/**
	 * Main method which runs on start-up and calls other class methods
	 * @param string array of args
	 */
	public static void main(String[] args) {

		TeenNumberDetector teenNumberDetector = new TeenNumberDetector();
		boolean result;

		result = teenNumberDetector.hasTeen(13, 20, 10);
		System.out.println(result);
		result = teenNumberDetector.hasTeen(20, 19, 10);
		System.out.println(result);
		result = teenNumberDetector.hasTeen(20, 10, 13);
		System.out.println(result);
		result = teenNumberDetector.hasTeen(20, 12, 10);
		System.out.println(result);

	}

	/**
	 * Method which detects whether any of the int params is a teen number
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 * @return boolean
	 */
	public boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

		boolean result;

		if ((firstNumber > 12 && firstNumber < 20) || (secondNumber > 12 && secondNumber < 20)
				|| (thirdNumber > 12 && thirdNumber < 20)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
