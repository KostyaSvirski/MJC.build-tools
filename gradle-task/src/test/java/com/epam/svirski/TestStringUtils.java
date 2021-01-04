package com.epam.svirski;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringUtils {
	
	public TestStringUtils() {
	}

	@Test
	void testPositive() {
		assertTrue(StringUtils.isPositiveNumber("1"));
	}
	
	@Test
	void testNotPositive() {
		assertFalse(StringUtils.isPositiveNumber("-1"));
	}
	
}
