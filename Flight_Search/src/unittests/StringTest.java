package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testConcatenate() {
		JUnit test = new JUnit();
		String result  = test.concatenate("Jack", "Herlihy");
		assertEquals("JackHerlihy", result); 
	}
}
