package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class CountingStrings {

	/**
	 * Main method which runs on start-up, used to call other class methods
	 * @param string array args
	 */
	public static void main(String[] args) {
		
		//instance variables
		CountingStrings countStrings = new CountingStrings();
		int result;
		
		result = countStrings.countXX("abcxx");
		System.out.println("\nthe # of x's in abcxx is: " + result);
		result = countStrings.countXX("xxx");
		System.out.println("\nthe # of x's in xxx is: " + result);
		result = countStrings.countXX("xxxx");
		System.out.println("\nthe # of x's in xxxx is: " + result);

	}

	/**
	 * Method which checks for the number of x characters in a string
	 * @param strInput
	 * @return int
	 */
	public int countXX(String strInput) {
		
		int result = 0;
		char charCheck;
		
		for(int index = 0; index < strInput.length(); index++) {
			charCheck = strInput.charAt(index);
			if(charCheck == 'x') {
				result++;
			}
			else {
				System.out.println(charCheck + " is not an x");
			}
		}
		
		return result;
	}

}
