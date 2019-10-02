package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringBadTest {

	/**
	 * Test with "badxx" input
	 */
	@Test
	public void testHasBad() {
	
		StringBad stringBad = new StringBad();
		boolean result = stringBad.hasBad("badxx");
		assertEquals(true, result);
	}
	/**
	 * Test with "xbadxx" input
	 */
	@Test
	public void testHasBadSecond() {
	
		StringBad stringBad = new StringBad();
		boolean result = stringBad.hasBad("xbadxx");
		assertEquals(true, result);
	}
	/**
	 * Test with "xxbadxx" input
	 */
	@Test
	public void testHasBadThird() {
	
		StringBad stringBad = new StringBad();
		boolean result = stringBad.hasBad("xxbadxx");
		assertEquals(false, result);
	}

}
