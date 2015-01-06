import static org.junit.Assert.*;

import org.junit.Test;


public class LuckyCalculatorTest {

	//@Test
	public void luckTest(){
		assertEquals("lucky 123123", 0, LuckyCalculator.luck("123123"));
		assertEquals("lucky 123006", 0, LuckyCalculator.luck("123006"));
		assertEquals("unlucky 123000", 6, LuckyCalculator.luck("123000"));
		assertEquals("lucky 12003", 0, LuckyCalculator.luck("12003"));
		assertEquals("lucky 0", 0, LuckyCalculator.luck("0"));
		assertEquals("unlucky 22226111", -1, LuckyCalculator.luck("22226111"));
	}

	//@Test 
	public void testSmallestLucky(){
		assertEquals("smallest lucky with sum 9 and length 1", "9", LuckyCalculator.smallestLucky(9, 1));
		assertEquals("smallest lucky with sum 10 and length 2", "19", LuckyCalculator.smallestLucky(10, 2));
		assertEquals("smallest lucky with sum 23 length 3", "599", LuckyCalculator.smallestLucky(23, 3));
		assertEquals("smallest lucky with sum 23 length 3", "0599", LuckyCalculator.smallestLucky(23, 4));
	}
	@Test 
	public void testBiggestLucky(){
		assertEquals("biggest lucky with sum 9 and length 1", "9", LuckyCalculator.biggestLucky(9, 1));
		assertEquals("biggest lucky with sum 10 and length 2", "91", LuckyCalculator.biggestLucky(10, 2));
		assertEquals("biggest lucky with sum 23 length 3", "995", LuckyCalculator.biggestLucky(23, 3));
		assertEquals("biggest lucky with sum 23 length 4", "9950", LuckyCalculator.biggestLucky(23, 4));
	}
}
