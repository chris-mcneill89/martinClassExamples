package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class StringBad {
	/**
	 * Method which detects if string input starts with "bad"
	 * @param strInput
	 * @return boolean
	 */
	public boolean hasBad(String strInput) {
		boolean result;
		String firstFourLetters = "";
		
		//populate new string with first 4 letters of strInput
		for(int index = 0; index <= 3; index++) {
			firstFourLetters += strInput.charAt(index);
		}
		//test string output
		System.out.println(firstFourLetters);
		//check if four letter string contains bad
		if(firstFourLetters.contains("bad")) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}
