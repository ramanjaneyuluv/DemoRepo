package com.patterns;

public class ReverseStringByWord {
	public static void reversreStg(String string){
		StringBuilder strbuilder=new StringBuilder();
		String[] words=string.split("");
		for(int j=words.length-1;j>=0;j--){
		strbuilder.append(words[j]).append(' ');
		}
		System.out.println(strbuilder);
	}

	public static void main(String[] args) {
		String string="Ramu is good boy and ramu is";
		

	}

}
