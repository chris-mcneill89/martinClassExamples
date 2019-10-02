package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringMiddleTest {

	/**
	 * test with "string" input
	 */
	@Test
	public void testMiddleTwo() {
		
		StringMiddle strMiddle = new StringMiddle();
		String result = strMiddle.middleTwo("string");
		assertEquals("ri", result);
		
	}
	/**
	 * test with "code" input
	 */
	@Test
	public void testMiddleTwoSecond() {
		
		StringMiddle strMiddle = new StringMiddle();
		String result = strMiddle.middleTwo("code");
		assertEquals("od", result);
		
	}
	/**
	 * test with "Practice" input
	 */
	@Test
	public void testMiddleTwoThird() {
		
		StringMiddle strMiddle = new StringMiddle();
		String result = strMiddle.middleTwo("Practice");
		assertEquals("ct", result);
		
	}

}
