package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class StringCharMultiplesExtraction {

	/**
	 * Main method which runs on start-up, used to call other methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringCharMultiplesExtraction extract = new StringCharMultiplesExtraction();
		String result;
		
		result = extract.everyNth("Miracle", 2); //"Mrce"
		System.out.println("\nResult is " + result + "\n");
		
		result = extract.everyNth("abcdefg", 2);//"aceg"
		System.out.println("\nResult is " + result + "\n");
		
		result = extract.everyNth("abcdefg", 3);//"adg"
		System.out.println("\nResult is " + result + "\n");

	}

	/**
	 * Method to build a new string by extracting characters from existing string 
	 * at every multiple of the specified index
	 * @param strInput
	 * @param nth
	 * @return string
	 */
	public String everyNth(String strInput, int nth) {
		
		StringBuilder sbInput = new StringBuilder(strInput);
		StringBuilder sbResult = new StringBuilder();
		
		for(int index = 0; index < sbInput.length(); index += nth) {
			sbResult.append(sbInput.charAt(index));
			System.out.println("in loop " + sbResult);
		}

		return sbResult.toString();
	}

}
