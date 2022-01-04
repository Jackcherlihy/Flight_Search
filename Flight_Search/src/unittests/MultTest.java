package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultTest {

	@Test
	public void testMultiply() {
		JUnit test = new JUnit();
		int result = test.multiply(5, 5);
		assertEquals(25, result);
	}
}