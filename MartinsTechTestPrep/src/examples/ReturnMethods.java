package examples;

import java.util.ArrayList;

/**
 * 
 * @author MCN17134884
 *
 */
public class ReturnMethods {

	/**
	 * Main method which runs on start-up and used to call other class methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		ReturnMethods returnMethods = new ReturnMethods();
		
		int intResult;
		String strResult;
		ArrayList<String> stringArray = new ArrayList<String>();
		
		intResult = returnMethods.returnInt();
		System.out.println(intResult);
		
		strResult = returnMethods.returnString();
		System.out.println(strResult);
		
		intResult = returnMethods.returnMultipleInt(5, 7);
		System.out.println(intResult);
		
		stringArray = returnMethods.returnStringArray();
		System.out.println(stringArray.toString());

	}

	/**
	 * method which returns an ArrayList
	 * @return ArrayList
	 */
	private ArrayList<String> returnStringArray() {
		
		ArrayList<String> localArray = new ArrayList<String>();
		localArray.add("hello");
		localArray.add("world");
		
		return localArray;
	}

	/**
	 * method which multiplies int params and returns the result
	 * @param firstNumber
	 * @param secondNumber
	 * @return int
	 */
	public int returnMultipleInt(int firstNumber, int secondNumber) {
		
		int intValue = firstNumber*secondNumber;
		return intValue;
	}

	/**
	 * method which returns the local string
	 * @return string
	 */
	public String returnString() {
		
		String strValue = "hello world";
		return strValue;
	}

	/**
	 * method which returns the local int
	 * @return int
	 */
	public int returnInt() {
		
		int intValue = 42;
		return intValue;
	}

}
