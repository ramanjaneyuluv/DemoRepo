package com.patterns;

public class MaxValueInArray {

	public static void main(String[] args) {
		
		int[] arr=new int[]{2,5,8,12,57,246,8,94};
		int max=arr[0];
		for(int i=0;i<=arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				
			}

		}

		System.out.println("The large number is:"+max);

	}

}
