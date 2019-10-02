package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class StringBlueRed {
	/**
	 * Method to detect if input string starts with red or blue 
	 * @param strInput
	 * @return string
	 */
	public String seeColor(String strInput) {
		String result;
		
		if(strInput.startsWith("red")) {
			result = "red";
		}
		else if(strInput.startsWith("blue")) {
			result = "blue";
		}
		else {
			result = "";
		}
		
		return result;
	}

}
