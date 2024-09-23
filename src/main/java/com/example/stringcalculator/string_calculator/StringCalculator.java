package com.example.stringcalculator.string_calculator;

import java.util.ArrayList;
import java.util.List;

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
	 
	 public int addDelimiters(String numbers) {
		    String delimiter = ",|\n";
		    
		    if (numbers.startsWith("//")) {
		        int delimiterIndex = numbers.indexOf("\n");
		        delimiter = numbers.substring(2, delimiterIndex);
		        numbers = numbers.substring(delimiterIndex + 1);
		    }
		    
		    String[] parts = numbers.split(delimiter);
		    int sum = 0;
		    for (String part : parts) {
		        sum += Integer.parseInt(part);
		    }
		    
		    return sum;
		}

	 public int handelException (String numbers) {
		    String delimiter = ",|\n";
		    if (numbers.startsWith("//")) {
		        int delimiterIndex = numbers.indexOf("\n");
		        delimiter = numbers.substring(2, delimiterIndex);
		        numbers = numbers.substring(delimiterIndex + 1);
		    }
		    
		    String[] parts = numbers.split(delimiter);
		    int sum = 0;
		    List<Integer> negatives = new ArrayList<Integer>();  // Explicit type declaration
		    for (String part : parts) {
		        int number = Integer.parseInt(part);
		        if (number < 0) {
		            negatives.add(number);
		        }
		        sum += number;
		    }
		    
		    if (!negatives.isEmpty()) {
		        throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
		    }
		    
		    return sum;
		}

}
