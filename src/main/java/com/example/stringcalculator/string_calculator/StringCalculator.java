package com.example.stringcalculator.string_calculator;


public class StringCalculator {
	
	 public int add(String numbers) {
	        if (numbers.isEmpty()) {
	            return 0;
	        }
	        return -1;  
	    }
	 
	 public int addSingleNumber(String numbers) {
		    if (numbers.isEmpty()) {
		        return 0;
		    } else if (numbers.length() == 1) {
		        return Integer.parseInt(numbers);
		    }
		    return -1;  
		}
}
