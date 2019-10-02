package examples;

public class Bracket {
	/**
	 * Method to find if brackets are correctly balanced
	 * @param brackets
	 * @return string
	 */
	public static String balancedBrackeets(String brackets) {

		String result = "";
		String check;
		int connectIndex;
		//loop through input string
		for(int index = 0; index<brackets.length(); index++) {
			check = brackets.charAt(index) + "";
			System.out.println(check);
			connectIndex = index;
			
			//check for opening brace 
			if(check.equals("{")) {
				
				//loop through remainder of string to find corresponding closing brace
				for(int innerIndex = connectIndex; innerIndex<brackets.length(); innerIndex++) {
					System.out.println("{ check " + brackets.charAt(innerIndex));
					if((brackets.charAt(innerIndex)+"").equals("}")) {
						result = "Balanced";
					}
					else {
						result = "Not Balanced";
					}
				}
				System.out.println(result);
			}
			
			//check for opening square bracket
			else if(check.equals("[")) {
				
				//loop through remainder of string to find corresponding closing square bracket
				for(int innerIndex = connectIndex; innerIndex<brackets.length(); innerIndex++) {
					System.out.println("[ check " + brackets.charAt(innerIndex));
					if((brackets.charAt(innerIndex)+"").equals("]")) {
						result = "Balanced";
						break;
					}
					else {
						result = "Not Balanced";
					}
				}
				System.out.println(result);
			}
			
			//check for opening parentheses
			else if(check.equals("(")) {
				
				//loop through remainder of string to find corresponding closing parentheses
				for(int innerIndex = connectIndex; innerIndex<brackets.length(); innerIndex++) {
					System.out.println("( check "+ brackets.charAt(innerIndex));
					if((brackets.charAt(innerIndex)+"").equals(")")) {
						result = "Balanced";
						break;
					}
					else {
						result = "Not Balanced";
					}
				}
				System.out.println(result);
			}
			
		}
		
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