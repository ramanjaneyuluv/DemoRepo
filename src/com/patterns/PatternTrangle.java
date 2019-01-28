package com.patterns;

import java.util.Arrays;

public class PatternTrangle {

	public static void main(String[] args) {
		for(int i=1; i<=4;i++){
			for(int j=1;j<=i+1;j++){
				System.out.println("*");
			}
			
		}
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.println("*");
			}
		}
		int[] n=new int[8];
		n[2]=2;
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);	
		}
		
		

	}

}
