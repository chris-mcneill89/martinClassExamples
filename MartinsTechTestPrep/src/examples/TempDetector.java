package examples;

/**
 *
 * @author MCN17134884
 *
 */
public class TempDetector {

	/**
	 * Main method which runs on start-up, used to call other class methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		TempDetector tempDetector = new TempDetector();
		boolean result;
		
		result = tempDetector.icyHot(120, -1);
		System.out.println("120 & -1 = " + result);
		result = tempDetector.icyHot(-1, 120);
		System.out.println("-1 & 120 = " + result);
		result = tempDetector.icyHot(2, 120);
		System.out.println("2 & 120 = " + result);

	}

	/**
	 * Method to detect if 1 temp input is below 0 && 1 temp input is above 100 
	 * @param firstTemp
	 * @param secondTemp
	 * @return boolean
	 */
	public boolean icyHot(int firstTemp, int secondTemp) {
		boolean result;
		
		if((firstTemp < 0 || secondTemp < 0) && (firstTemp > 100 || secondTemp > 100)) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}
