package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class CharRemovalAtIndex {

	/**
	 * Main method which will run on start-up and call other class methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		CharRemovalAtIndex charRemovalAtIndex = new CharRemovalAtIndex();
		String amendedString;
		
		amendedString = charRemovalAtIndex.missingChar("kitten", 1);
		System.out.println(amendedString);
		amendedString = charRemovalAtIndex.missingChar("kitten", 0);
		System.out.println(amendedString);
		amendedString = charRemovalAtIndex.missingChar("kitten", 4);
		System.out.println(amendedString);
		
	}

	/**
	 * Method to remove character at index specified by param n
	 * @param strInput
	 * @param n
	 * @return
	 */
	public String missingChar(String strInput, int n) {
		
		String result;
		StringBuilder stringBuilder = new StringBuilder(strInput);
		result = stringBuilder.deleteCharAt(n).toString();
		
		return result;
	}

}
