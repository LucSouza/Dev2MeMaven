package br.com.dev2me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void shouldCalculateSumBetweenTwoValues() {
		int valueA = 2;
		int valueB = 2;
		
		int sum = 0;
		Calculator calc = new CalculatorImpl();
		
		sum = calc.sum(valueA, valueB);
		
		assertEquals(sum, 4);
		
	}
	
	@Test
	public void shouldCalculateSubtractionBetweenTwoValues() {
		int valueA = 2;
		int valueB = 1;
		
		int subtract = 0;
		Calculator calc = new CalculatorImpl();
		
		subtract = calc.subtraction(valueA, valueB);
		
		assertEquals(subtract, 1);
		
	}
	
	@Test
	public void shouldCalculateMultiplicationBetweenTwoValues() {
		int valueA = 2;
		int valueB = 3;
		
		int multiplication = 0;
		Calculator calc = new CalculatorImpl();
		
		multiplication = calc.multiplication(valueA, valueB);
		
		assertEquals(multiplication, 6);}
	
	@Test
	public void shouldCalculateDivisionBetweenTwoValues() throws Exception {
		int valueA = 6;
		int valueB = 3;
		
		int division = 0;
		Calculator calc = new CalculatorImpl();
		
		division = calc.division(valueA, valueB);
		
		assertEquals(division, 2);}
	
	@Test
	public void shouldCalculateEqualIntegers() throws Exception {
		int valueA = 6;
		int valueB = 6;
		boolean compare = false;
		Calculator calc = new CalculatorImpl();
		
		compare = calc.equalIntegers(valueA, valueB);
		
		assertTrue(compare);}
	
	
}
