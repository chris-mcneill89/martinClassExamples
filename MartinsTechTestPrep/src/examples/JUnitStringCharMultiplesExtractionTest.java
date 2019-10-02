package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringCharMultiplesExtractionTest {

	/**
	 * Test with "Miracle", 2 input
	 */
	@Test
	public void testEveryNth() {
		
		StringCharMultiplesExtraction strCharObj = new StringCharMultiplesExtraction();
		String result = strCharObj.everyNth("Miracle", 2);
		assertEquals("Mrce", result);
	}
	/**
	 * Test with "abcdefg", 2 input
	 */
	@Test
	public void testEveryNthSecond() {
		
		StringCharMultiplesExtraction strCharObj = new StringCharMultiplesExtraction();
		String result = strCharObj.everyNth("abcdefg", 2);
		assertEquals("aceg", result);
	}
	/**
	 * Test with "abcdefg", 3 input
	 */
	@Test
	public void testEveryNthThird() {
		
		StringCharMultiplesExtraction strCharObj = new StringCharMultiplesExtraction();
		String result = strCharObj.everyNth("abcdefg", 3);
		assertEquals("adg", result);
	}
	/**
	 * Negative Test with "abcdefg", 3 input
	 */
	@Test
	public void testEveryNthFourth() {
		
		StringCharMultiplesExtraction strCharObj = new StringCharMultiplesExtraction();
		String result = strCharObj.everyNth("abcdefg", 3);
		assertNotEquals("aceg", result);
	}

}
