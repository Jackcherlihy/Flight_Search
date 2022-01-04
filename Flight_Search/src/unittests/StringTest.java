package unittests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testConcatenate() {
		JUnit test = new JUnit();
		String result  = test.concatenate("Jack", "Herlihy");
		assertEquals("JackHerlihy", result); 
	}
}
