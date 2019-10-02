package examples;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitStatHelloTest {

	/**
	 * test helloName with "Bob" input
	 */
	@Test
	public void testHelloName() {
		String result;
		result = StatHello.helloName("Bob");
		assertEquals("Hello Bob!", result);
	}
	/**
	 * test helloName with "Alice" input
	 */
	@Test
	public void testHelloNameSecond() {
		String result;
		result = StatHello.helloName("Alice");
		assertEquals("Hello Alice!", result);
	}
	/**
	 * test helloName with "X" input
	 */
	@Test
	public void testHelloNameThird() {
		String result;
		result = StatHello.helloName("X");
		assertEquals("Hello X!", result);
	}

}
/*
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 * 
 * helloName("Bob") = Hello Bob! helloName("Alice") = Hello Alice!
 * helloName("X") = Hello X!
 */