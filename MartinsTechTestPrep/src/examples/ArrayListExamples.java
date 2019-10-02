package examples;

import java.util.ArrayList;

/**
 * 
 * @author MCN17134884
 *
 */
public class ArrayListExamples {

	/**
	 * Main method which runs on start-up and used to call other class methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayListExamples arrayExample = new ArrayListExamples();
		boolean result;
		ArrayList<String> resultArrayList = new ArrayList<String>();
		
		arrayExample.addStringToArrayList();
		result = arrayExample.containsString();
		System.out.println("Does the ArrayList contain the word Good? - " + result);
		resultArrayList = arrayExample.removeString();
		System.out.println("Arraylist contents: " + resultArrayList);
		result = arrayExample.isEmptyArray();
		System.out.println("Is ArrayList empty? - " + result);
	}

	/**
	 * Method to check whether an ArrayList is empty
	 * @return boolean
	 */
	public boolean isEmptyArray() {
		
		ArrayList<String> listOfStuff = new ArrayList<String>();
		boolean result;
		listOfStuff.add("hello");
		listOfStuff.add("world");
		/*commented out test code, keeping for future testing
		 * listOfStuff.remove("hello"); listOfStuff.remove(0);
		 */
		result = listOfStuff.isEmpty();
		return result;
	}

	/**
	 * Method which removes a string from the ArrayList using literal value or index
	 * @return ArrayList<String>
	 */
	public ArrayList<String> removeString() {
		
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		listOfStuff.add("World");
		System.out.println("Pre-remove Size of Array: " + listOfStuff.size());
		listOfStuff.remove("Good");
		listOfStuff.remove(0);
		System.out.println("Post-remove Size of Array: " + listOfStuff.size());
		
		return listOfStuff;
		
	}

	/**
	 * Method to check if the ArrayList contains the specified string
	 * @return boolean
	 */
	private boolean containsString() {
		
		ArrayList<String> listOfStuff = new ArrayList<String>();
		boolean result;
		String test = "good";
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		result = listOfStuff.contains("Good");
		
		return result;
		
	}

	/**
	 * Method to print the value of ArrayList contents at each index
	 */
	public void addStringToArrayList() {
		
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		for(int index = 0; index < listOfStuff.size(); index++) {
			String indexValue = listOfStuff.get(index);
			System.out.println("Value of String: " + indexValue);
		}
		
	}

}
