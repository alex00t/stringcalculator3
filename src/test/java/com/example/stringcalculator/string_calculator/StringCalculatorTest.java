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
}

