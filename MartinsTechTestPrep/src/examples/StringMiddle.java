package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class StringMiddle {
	/**
	 * Method to pick out the middle two letters in a string
	 * @param strInput
	 * @return string
	 */
	public String middleTwo(String strInput){
		String result;
		char chMiddle;
		
		int halfway = (strInput.length()/2);
		chMiddle = strInput.charAt(--halfway);
		result = chMiddle + "";
		System.out.println("First add = " + result);
		
		halfway++;
		chMiddle = strInput.charAt(halfway);
		result = result + chMiddle;
		System.out.println("Second add (result) = " + result + "\n");
		
		return result;
	}

}
