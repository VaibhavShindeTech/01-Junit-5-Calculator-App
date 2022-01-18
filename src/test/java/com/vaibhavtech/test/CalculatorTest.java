package com.vaibhavtech.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.vaibhavtech.Calculator;

public class CalculatorTest {

	private static Calculator cal = null;

	@BeforeAll
	public static void init() {
		cal = new Calculator();
	}

	@Test
	public void addTest() {
		Integer actual = cal.add(20, 20);
		Integer expected = 40;
		assertEquals(expected, actual);
	}

	@Test
	public void multiplyTest() {
		Integer actual = cal.multiply(10, 20);
		Integer expected = 200;
		assertEquals(expected, actual);
	}

	@AfterAll
	public static void destory() {
		cal = null;
	}
}
