package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class StringWork {

	/**
	 * Main method which runs on start-up and used to call othe class methods
	 * @param args
	 */
	public static void main(String[] args) {

		//call to other class methods to print test outputs
		StringWork characterSearch = new StringWork();
		characterSearch.printIndexCharacter();
		characterSearch.startCharacter();
		characterSearch.endCharacter();
		characterSearch.subCharacter();
		characterSearch.containsString();
		characterSearch.containsString();
		characterSearch.indexString();
		characterSearch.indexString();
		characterSearch.splitString();
		characterSearch.upperString();
		characterSearch.lowerString();

	}

	/**
	 * method to print character at specified index of string
	 */
	public void printIndexCharacter() {

		String name = "Chris";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
	}

	/**
	 * method to detect first character of string
	 */
	public void startCharacter() {
		String name = "Chris";
		String otherName = "Dave";

		boolean startWith = name.startsWith("C");
		if (startWith) {
			System.out.println(name.toString() + " starts with the character C");
		} else {
			System.out.println(name.toString() + " does not start with C");
		}

		startWith = otherName.startsWith("C");
		if (startWith) {
			System.out.println(otherName.toString() + " starts with the character C");
		} else {
			System.out.println(otherName.toString() + " does not start with C");
		}
	}

	/**
	 * method to detect last character of string
	 */
	public void endCharacter() {

		String name = "Chris";
		String otherName = "Dave";

		boolean endWith = name.endsWith("s");
		if (endWith) {
			System.out.println(name + " ends with the character s");
		} else {
			System.out.println(name + " does not end with the character s");
		}

		endWith = otherName.endsWith("s");
		if (endWith) {
			System.out.println(otherName + " ends with the character s");
		} else {
			System.out.println(otherName + " does not end with the character s");
		}

	}

	/**
	 * method to print a sub string of the base string
	 */
	public void subCharacter() {

		String name = "Chris";
		String subCharacter = name.substring(2, 4);
		String otherSubCharacter = name.substring(2);
		System.out.println("sub = " + subCharacter);
		System.out.println("sub = " + otherSubCharacter);
	}

	/**
	 * method to detect whether a string contains a certain sequence of characters
	 */
	public void containsString() {

		String name = "Chris";
		String otherName = "Dave";
		boolean contains = name.contains("hri");
		if (contains) {
			System.out.println(contains + " " + name + " does contain hri");
		} else {
			System.out.println(contains + " " + name + " does not contain hri");
		}

		contains = otherName.contains("vae");
		if (contains) {
			System.out.println(contains + " " + otherName + " does contain vae");
		} else {
			System.out.println(contains + " " + otherName + " does not contain vae");
		}

	}

	/**
	 * method to detect the index of specified character within a string
	 */
	public void indexString() {

		String name = "Chris";
		int index = name.indexOf("i");
		System.out.println("Index of i is " + index);
		index = name.indexOf("hr");
		System.out.println("Index of hr is " + index);
	}

	/**
	 * method to split strings into separate entities using a specified character
	 */
	public void splitString() {

		String sentence = "Chris is sexy";
		String[] stringArray = sentence.split(" ");
		System.out.println("stringArray length is " + stringArray.length);
		for (String strings : stringArray) {
			System.out.println(strings);
		}
	}

	/**
	 * method to convert all string characters to upper case
	 */
	public void upperString() {

		String sentence = "Chris is sexy";
		sentence = sentence.toUpperCase();
		System.out.println("After upper case conversion: " + sentence);
	}

	/**
	 * method to convert all string characters to lower case
	 */
	public void lowerString() {

		String sentence = "Chris is sexy";
		sentence = sentence.toLowerCase();
		System.out.println("After lower case conversion: " + sentence);
	}

}
