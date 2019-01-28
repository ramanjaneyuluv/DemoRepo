package com.patterns;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i=0, j=0;
		String PrimeNumber="";
		for(i=1;i<=100;i++){
			int count=0;
			for(j=i;j>=1;j--){
				if(i%j==0){
					count=count+1;
				}
			}
			if(count==2){
				PrimeNumber=PrimeNumber+i+" ";
			}
		}
		System.out.println(PrimeNumber);
		
		ArrayList<Integer> arr=new ArrayList();
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(51);
		System.out.println(arr.toString());
	
	}

}
