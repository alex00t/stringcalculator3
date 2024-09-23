package com.example.stringcalculator.string_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

  
	  @Test
	    public void testAdd_EmptyString_ReturnsZero() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(0, calculator.add(""));
	    }
	  
	  @Test
	    public void testAdd_SingleNumber_ReturnsValue() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(1, calculator.addSingleNumber("1"));
	    }
	  
	  @Test
	    public void testAdd_TwoNumbers_ReturnsSum() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(3, calculator.addSum("1,2"));
	    }
	  
	  @Test
	    public void testAdd_NewLinesBetweenNumbers_ReturnsSum() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(6, calculator.handleCommasNewLine("1\n2,3"));
	    }
	  
	  @Test
	    public void testAdd_CustomDelimiter_ReturnsSum() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(3, calculator.addDelimiters("//;\n1;2"));
	    }
	  
	  @Test(expected = IllegalArgumentException.class)
	    public void testAdd_NegativeNumbers_ThrowsException() {
	        StringCalculator calculator = new StringCalculator();
	        calculator.handelException("1,-2,3");
	    }
}

