package examples;

/**
 * 
 * @author MCN17134884
 *This is a code wars test not example we have done in class
 */
public class FindOdd {
	/**
	 * Method to find a number that appears an odd number of times in an array
	 * 
	 * @param int array
	 * @return int
	 */
	public static int findIt(int[] array) {

		int odd = 0;
		int maxValue = array[0];
		int minValue = array[0];
		// find max value
		for (int index = 1; index < array.length; index++) {
			if (array[index] > maxValue) {
				maxValue = array[index];
			}
		}
		// find min value
		for (int index = 1; index < array.length; index++) {
			if (array[index] < minValue) {
				minValue = array[index];
			}
		}
		System.out.println("MaxValue = " + maxValue);
		System.out.println("MinValue = " + minValue);

		// loop through array while within min-max range
		while (minValue <= maxValue) {
			int count = 0;
			// count # of times the current value appears in array
			for (int index = 0; index < array.length; index++) {
				if (array[index] == minValue) {
					count++;
				}
			}
			System.out.println(minValue + " " + count);
			// if counts odd assign and break out
			if ((count % 2) == 1) {
				odd = minValue;
				break;
				// else increment the current value and continue
			} else {
				minValue++;
			}

		}

		return odd;
	}
}