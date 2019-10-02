package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class Bracket {
	/**
	 * Method to find if brackets are correctly balanced
	 * 
	 * @param brackets
	 * @return string
	 */
	public static String balancedBrackeets(String brackets) {

		String result = "";
		String check;
		int connectIndex;
		int countClose = 0;
		int countOpen = 0;
		
		//check if string is odd, if true assign result to Not Balanced and return
		if (brackets.length() % 2 == 1) {
			result = "Not Balanced";
		} else {
			// loop through input string
			for (int index = 0; index < brackets.length(); index++) {
				check = brackets.charAt(index) + "";
				System.out.println(check);
				connectIndex = index;

				// check for opening brace
				if (check.equals("{")) {
					countOpen++;
					// loop through remainder of string to find corresponding closing brace
					for (int innerIndex = connectIndex; innerIndex < brackets.length(); innerIndex++) {
						System.out.println("{ check " + brackets.charAt(innerIndex));
						if ((brackets.charAt(innerIndex) + "").equals("}")) {
							countClose++;
							result = "Balanced";
						} else {
							result = "Not Balanced";
						}
					}
					System.out.println(result);
				}

				// check for opening square bracket
				else if (check.equals("[")) {
					countOpen++;
					// loop through remainder of string to find corresponding closing square bracket
					for (int innerIndex = connectIndex; innerIndex < brackets.length(); innerIndex++) {
						System.out.println("[ check " + brackets.charAt(innerIndex));
						if ((brackets.charAt(innerIndex) + "").equals("]")) {
							countClose++;
							result = "Balanced";
							break;
						} else {
							result = "Not Balanced";
						}
					}
					System.out.println(result);
				}

				// check for opening parentheses
				else if (check.equals("(")) {
					countOpen++;
					// loop through remainder of string to find corresponding closing parentheses
					for (int innerIndex = connectIndex; innerIndex < brackets.length(); innerIndex++) {
						System.out.println("( check " + brackets.charAt(innerIndex));
						if ((brackets.charAt(innerIndex) + "").equals(")")) {
							countClose++;
							result = "Balanced";
							break;
						} else {
							result = "Not Balanced";
						}
					}
					System.out.println(result);
				}

			}
		} 

		System.out.println("countOpen = " + countOpen);
		System.out.println("countOpen = " + countClose);
		 if (result.equals("Balanced") && (countClose != 0 || countOpen != 0) && countClose == countOpen) { 
			  result = "Balanced"; 
		  } 
		  else { 
			  result = "Not Balanced"; 
			  }
		 

		System.out.println(result);
		return result;
	}

}
/*
 * balancedBrackets("[()]")
 * 
 * input: exp = "[()]" Output: Balanced
 * 
 * input: exp = "{[]}" Output: Balanced
 * 
 * input: exp = "[]{}()" Output: Balanced
 * 
 * input: exp = "[)[)" Output: Not Balanced
 * 
 * input: exp = "()]()" Output: Not Balanced
 */