package com.example.printing_press;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DemoJUnitTests {

	@Disabled("This is only used for demo.")
	@Test
	public void demoTestA() {
		String valueX = null;
		String valueX2 = "";
		assertEquals(valueX, valueX2, "Value X does not matach value X2.");
	}

}
