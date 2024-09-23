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
	 
	 public int addSum (String numbers) {
		    if (numbers.isEmpty()) {
		        return 0;
		    } else if (numbers.contains(",")) {
		        String[] parts = numbers.split(",");
		        return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
		    }
		    return Integer.parseInt(numbers);
		}
	 
	 public int handleCommasNewLine (String numbers) {
		    if (numbers.isEmpty()) {
		        return 0;
		      }
		    
		    String[] parts = numbers.split(",|\n");
		    int sum = 0;
		    for (String part : parts) {
		        sum += Integer.parseInt(part);
		    }
		    
		    return sum;
		}
}
