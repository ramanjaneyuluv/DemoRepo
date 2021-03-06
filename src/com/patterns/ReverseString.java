package com.patterns;

public class ReverseString {
	public static void main(String[] args) {
		String string="whatever it is good";
		
		 // Using traditional approach
		   String result="";
		    for(int i=string.length()-1; i>=0; i--) {
		        result = result + string.charAt(i);
		    }
		    System.out.println(result);

		    // Using StringBuffer class
		    StringBuffer buffer = new StringBuffer(string);
		    System.out.println(buffer.reverse());    
		
	}

}
