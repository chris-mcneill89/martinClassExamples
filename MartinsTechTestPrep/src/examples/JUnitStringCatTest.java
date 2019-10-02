package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStringCatTest {

	/**
	 * test concat method with "Man" and "chester" inputs
	 */
	@Test
	public void testConcat() {
		
		String result = StringCat.concat("Man", "chester");
		assertEquals("Manchester", result);
	}

}
