package examples;

/**
 * 
 * @author MCN17134884
 *
 */
public class HiTest {

	/**
	 * Main method which will run on start-up and call other class methods
	 * @param string array of args
	 */
	public static void main(String[] args) {
		boolean hi;
		HiTest HTObj = new HiTest();
		hi= HTObj.startHi("hi there");
		System.out.println("Does the string start with hi? - " + hi);
		hi= HTObj.startHi("hi");
		System.out.println("Does the string start with hi? - " + hi);
		hi= HTObj.startHi("hello hi");
		System.out.println("Does the string start with hi? - " + hi);
		hi= HTObj.startHi("him");
		System.out.println("Does the string start with hi? - " + hi);
		hi= HTObj.startHi("hhi");
		System.out.println("Does the string start with hi? - " + hi);
		hi= HTObj.startHi("hello hi");
		System.out.println("Does the string start with hi? - " + hi);

	}

	/**
	 * method to determine whether the string param begins with "hi"
	 * @param String strInput
	 * @return
	 */
	public boolean startHi(String strInput) {
		boolean result;
		if(strInput.startsWith("hi")) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
		
	}

}
