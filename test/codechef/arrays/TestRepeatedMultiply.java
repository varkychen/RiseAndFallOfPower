package codechef.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRepeatedMultiply {
	private RepeatedlyMultipliable helper;
	
	@Before
	public void setUp() {
		helper = new ArrayHelper();
	}

	@Test
	public void testOneLoop() {
		String result = helper.repeatedMultiply(4, 1);
		Assert.assertEquals("4", result);
	}

	@Test
	public void testTwoLoops() {
		String result = helper.repeatedMultiply(4, 2);
		Assert.assertEquals("16", result);
	}
	
	@Test
	public void testThreeLoops() {
		String result = helper.repeatedMultiply(4, 3);
		Assert.assertEquals("64", result);
	}	
	
	@Test
	public void testFourLoops() {
		String result = helper.repeatedMultiply(4, 4);
		Assert.assertEquals("256", result);
	}
	
	
	@Test
	public void testFiveLoops() {
		String result = helper.repeatedMultiply(5, 5);
		Assert.assertEquals("3125", result);
	}
}