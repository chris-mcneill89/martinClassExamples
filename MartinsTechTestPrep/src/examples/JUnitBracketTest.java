package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitBracketTest {

	@Test
	public void testBalancedBrackeets() {
		String result = Bracket.balancedBrackeets("[()]");
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackeetsSecond() {
		String result = Bracket.balancedBrackeets("{[]}");
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackeetsThird() {
		String result = Bracket.balancedBrackeets("[]{}()");
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackeetsFourth() {
		String result = Bracket.balancedBrackeets("[)[)");
		assertEquals("Not Balanced", result);
	}
	
	@Test
	public void testBalancedBrackeetsFifth() {
		String result = Bracket.balancedBrackeets("()]()");
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
