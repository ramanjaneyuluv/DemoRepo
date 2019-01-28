package com.patterns;

public class ReplacingChar {

	public static void main(String[] args) {
		String s1="javapoint is very good websit";
		
		String replacingString=s1.replace('a', 'e');
		System.out.println(replacingString);
		
		StringBuffer rString=new StringBuffer(s1);
		System.out.println(rString);
	}

}
