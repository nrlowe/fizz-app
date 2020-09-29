package com.fizz.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
		System.out.println( "Welcome to FizzBUzz, input a number!" );
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String stringNumber = reader.readLine(); 
		try {
			fizzBuzz(Integer.parseInt(stringNumber));
		} catch (Exception e) {
			
		}
    }
    
    public static int[] fizzBuzz(int num) {
    	int fizzs = 0;
    	int buzzs = 0;
    	int fizzbuzz = 0;
    	int lucks = 0;
    	int numbers = 0;
    	StringBuilder sb = new StringBuilder();
    	for(int i = 1; i <= num; i++) {
    		if(checkForNumbers(i)) {
    			sb.append("lucky ");
    			lucks++;
    			continue;
    		}
    		if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
    			sb.append("fizzbuzz ");
    			fizzbuzz++;
    		} else if (i%5==0) {
    			sb.append("buzz ");
    			buzzs++;
    		} else if (i%3==0) {
    			sb.append("fizz ");
    			fizzs++;
    		} else {
    			sb.append(i + " ");
    			numbers++;
    		}
    	}
    	System.out.println(sb.toString());
    	System.out.println("fizz: " + fizzs);
    	System.out.println("buzz: " + buzzs);
    	System.out.println("fizzbuzz: " + fizzbuzz);
    	System.out.println("lucky: " + lucks);
    	System.out.println("integer: " + numbers);
    	return new int[] {fizzs, buzzs, fizzbuzz, lucks, numbers};
    }
    
    private static boolean checkForNumbers(int num) {
    	if(num % 10 == 3) {
    		return true;
    	} 
    	return false;
    }
}
