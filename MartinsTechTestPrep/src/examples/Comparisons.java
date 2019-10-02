package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class Comparisons {

	private int a = 4;
	private int b = 5;
	boolean result = true;

	/**
	 * Main method which runs on start-up and calls other class methods
	 * @param string array of args
	 */
	public static void main(String[] args) {

		/*Method calls for testing, keeping them for future tests, uncomment if you want to use/test
		 * 
		 * Comparisons ifConditions = new Comparisons(); ifConditions.printConditions();
		 */
		/*
		 * Comparisons forLooping = new Comparisons(); forLooping.forConditions();
		 */
		/*
		 * Comparisons whileLooping = new Comparisons(); whileLooping.whileConditions();
		 */
		/*
		 * Comparisons doWhileLooping = new Comparisons();
		 * doWhileLooping.doWhileConditions();
		 */
		/*
		 * Comparisons switching = new Comparisons(); switching.switchConditions();
		 */
		Comparisons switching = new Comparisons();
		switching.stringSwitchConditions();

	}

	/**
	 * print value comparison results
	 */
	public void printConditions() {

		if (a < b) {
			System.out.println("A - Result is true");
		} else {
			System.out.println("A - Result is false");
		}

		if (a > b) {
			System.out.println("B - Result is true");
		} else {
			System.out.println("B - Result is false");
		}

		if (a <= 4) {
			System.out.println("C - Result is true");
		} else {
			System.out.println("C - Result is false");
		}

		if (b >= 5) {
			System.out.println("D - Result is true");
		} else {
			System.out.println("D -Result is false");
		}

		if (a == b) {
			System.out.println("E - Result is true");
		} else {
			System.out.println("E - Result is false");
		}

		if (a != b) {
			System.out.println("F - Result is true");
		} else {
			System.out.println("F - Result is false");
		}

		if (a > b || a < b) {
			System.out.println("G - Result is true");
		} else {
			System.out.println("G - Result is false");
		}

		if (3 < a && a < 6) {
			System.out.println("H - Result is true");
		} else {
			System.out.println("H - Result is false");
		}

		if (result = !result) {
			System.out.println("I - Result is true");
		} else {
			System.out.println("I - Result is false");
		}
	}

	/**
	 * print for loop test outputs
	 */
	public void forConditions() {
		System.out.println("print to 0 starting from 10");
		for (int index = 10; index >= 0; index--) {
			System.out.println(index);
		}
	}

	/**
	 * print while loop test output
	 */
	public void whileConditions() {
		int index = 0;
		while (index < 5) {
			System.out.println(index);
			index++;
		}

	}

	/**
	 * print dowhile test output
	 */
	public void doWhileConditions() {

		int index = 0;
		do {
			System.out.println("index: " + index);
			index++;
		} while (index < 0);

	}

	/**
	 * print switch statement test outputs using int param
	 */
	public void switchConditions() {
		int day = 8;
		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	/**
	 * print switch statement test output using string param
	 */
	public void stringSwitchConditions() {
		String day = "Wednesday";
		switch (day) {

		case "Monday":
			System.out.println(day);
			break;
		case "Tuesday":
			System.out.println(day);
			break;
		case "Wednesday":
			System.out.println(day);
			break;
		case "Thursday":
			System.out.println(day);
			break;
		case "Friday":
			System.out.println(day);
			break;
		case "Saturday":
			System.out.println(day);
			break;
		case "Sunday":
			System.out.println(day);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

}
