package unittests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MultTest {

	@Test
	void testMultiply() {
		JUnit test = new JUnit();
		int result = test.multiply(5, 5);
		assertEquals(25, result);
	}
}
