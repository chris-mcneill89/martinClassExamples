package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringConcatTest {

	/**
	 * Test with "one" "two" input
	 */
	@Test
	public void testConcatenate() {
		
		StringConcat stringConcat = new StringConcat();
		
		String result = stringConcat.concatenate("one", "two");

		assertEquals("onetwo", result);
	}
	
	/**
	 * Ignore case test with "One" "two" input
	 */
	@Test
	public void testConcatenateIgnoreCase() {
		
		StringConcat stringConcat = new StringConcat();
		String result = stringConcat.concatenate("One", "two");
		result.equalsIgnoreCase("onetwo");
	}
	
	/**
	 * Negative Test with "three" "four" input
	 */
	@Test
	public void testConcatenateNegative() {
		
		StringConcat stringConcat = new StringConcat();
		
		String result = stringConcat.concatenate("three", "four");
		
		assertNotEquals("onetwo", result);
	}

}
