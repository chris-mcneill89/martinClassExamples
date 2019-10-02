package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class Palindrome {

	/**
	 * Method to decide if input string is palindrome
	 * @param strInput
	 * @return boolean
	 */
	public boolean isPalindrome(String strInput) {
		boolean result;
		String compare = "";
		// iterate backwards through the String input and assign to comparison string
		for (int index = strInput.length() - 1; index >= 0; index--) {
			compare += strInput.charAt(index);
			System.out.println(compare);
		}
		// if strings now match then it is a palindrome, else it is not
		if(compare.equals(strInput)) {
			result = true;
		}
		else {
			result = false;
		}

		return result;
	}

}
