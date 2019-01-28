package com.nagarro.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		Integer a = 2;
		Integer b= 3;
		Integer expectedOutput = 5;
		Integer c = calculator.add(a, b);
		assertEquals(expectedOutput, c);		
	}

}
