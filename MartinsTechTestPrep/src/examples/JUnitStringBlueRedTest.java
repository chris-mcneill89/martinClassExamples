package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringBlueRedTest {

	/**
	 * Test with "redxx" input
	 */
	@Test
	public void testSeeColor() {
		String result;
		StringBlueRed strColor = new StringBlueRed();
		result = strColor.seeColor("redxx");
		System.out.println("redxx test: " + result);
		assertEquals("red", result);
	}
	/**
	 * Test with "xxred" input
	 */
	@Test
	public void testSeeColorSecond() {
		String result;
		StringBlueRed strColor = new StringBlueRed();
		result = strColor.seeColor("xxred");
		System.out.println("xxred test: " + result);
		assertEquals("", result);
	}
	/**
	 * Test with "blueTimes" input
	 */
	@Test
	public void testSeeColorThird() {
		String result;
		StringBlueRed strColor = new StringBlueRed();
		result = strColor.seeColor("blueTimes");
		System.out.println("blueTimes test: " + result);
		assertEquals("blue", result);
	}

}
