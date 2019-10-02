package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitPalindromeTest {

	/**
	 * Test with hannah input
	 */
	@Test
	public void testIsPalindrome() {
		boolean result;
		Palindrome palin = new Palindrome();
		result = palin.isPalindrome("hannah");
		System.out.println(result);
		assertEquals(true, result);
	}
	
	/**
	 * Test with martin input
	 */
	@Test
	public void testIsPalindromeSecond() {
		boolean result;
		Palindrome palin = new Palindrome();
		result = palin.isPalindrome("martin");
		System.out.println(result);
		assertEquals(false, result);
	}
	
	/**
	 * Test with sausages input
	 */
	@Test
	public void testIsPalindromeThird() {
		boolean result;
		Palindrome palin = new Palindrome();
		result = palin.isPalindrome("sausages");
		System.out.println(result);
		assertEquals(false, result);
	}

}
