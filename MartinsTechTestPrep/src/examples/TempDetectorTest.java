package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TempDetectorTest {

	@Test
	public void testIcyHot() {
		
		TempDetector temp = new TempDetector();
		boolean result;
		
		result = temp.icyHot(120, -1);
		assertEquals(true, result);
		
	}
	
	@Test
	public void testIcyHotSecond() {
		
		TempDetector temp = new TempDetector();
		boolean result;
		
		result = temp.icyHot(-1, 120);
		assertEquals(true, result);
		
	}
	
	@Test
	public void testIcyHotThird() {
		
		TempDetector temp = new TempDetector();
		boolean result;
		
		result = temp.icyHot(2, 120);
		assertEquals(false, result);
		
	}
	
	@Test
	public void testIcyHotFourth() {
		
		TempDetector temp = new TempDetector();
		boolean result;
		
		result = temp.icyHot(2, 120);
		assertNotEquals(true, result);
		
	}


}
