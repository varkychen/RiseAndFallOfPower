package codechef.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAdditionInArraysMethod {
	private AdditionInArraysMethod method;
	
	@Before
	public void setUp() {
		method = new AdditionInArraysMethod(new ArrayHelper());
	}

	@Test
	public void testLoadIntoArray() {
		String[] result = method.npowern(4);
		Assert.assertEquals("256",result[0]);
	}
}
