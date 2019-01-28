package com.patterns;

public class ReapetedChars {
	public static void main(String[] args) {
		String str="Ramu is a good boy";
		int count=0;
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		for(int i=0; i<str.length();i++){
			for(int j=i+1; j<str.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[j]);
					System.out.println(count);
					count++;
					break;
				}
			}
		}

	}

}
