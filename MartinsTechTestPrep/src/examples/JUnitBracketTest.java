package examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author MCN17134884
 *
 */
public class JUnitBracketTest {

	/**
	 * Test with "[()]" input
	 */

	@Test
	public void testBalancedBrackeets() {
		String result = Bracket.balancedBrackeets("[()]");
		assertEquals("Balanced", result);
	}
	/**
	 * Test with "{[]}" input
	 */
	@Test
	public void testBalancedBrackeetsSecond() {
		String result = Bracket.balancedBrackeets("{[]}");
		assertEquals("Balanced", result);
	}
	/**
	 * Test with "[]{}()" input
	 */
	@Test
	public void testBalancedBrackeetsThird() {
		String result = Bracket.balancedBrackeets("[]{}()");
		assertEquals("Balanced", result);
	}
	/**
	 * Test with "[)[)" input
	 */
	@Test
	public void testBalancedBrackeetsFourth() {
		String result = Bracket.balancedBrackeets("[)[)");
		assertEquals("Not Balanced", result);
	}
	/**
	 * Test with "()]()" input
	 */
	@Test
	public void testBalancedBrackeetsFifth() {
		String result = Bracket.balancedBrackeets("()]()");
		assertEquals("Not Balanced", result);
	}
	/**
	 * Test with "())(" input
	 */
	@Test
	public void testBalancedBrackeetsSixth() {
		String result = Bracket.balancedBrackeets("((()");
		assertEquals("Not Balanced", result);
	}
}

/*
 * balancedBrackets("[()]")
 * 
 * input: exp = "[()]" Output: Balanced
 * 
 * input: exp = "{[]}" Output: Balanced
 * 
 * input: exp = "[]{}()" Output: Balanced
 * 
 * input: exp = "[)[)" Output: Not Balanced
 * 
 * input: exp = "()]()" Output: Not Balanced
 */
