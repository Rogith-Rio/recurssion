package com.rio.colections;

public class NumberPalindrome {
	
	public static void method(int originalValue , int duplicate , int referenceValue ) {
		String original = String.valueOf(originalValue);
		String reference = String.valueOf(referenceValue);
		
		if(original.length() == reference.length()) {
			if(originalValue == referenceValue) {
				System.out.println("it is palindrome");
				return;
			}else {
				System.out.println("not a palindrome");
				return;
			}
		}else {
			if(referenceValue==0) {
				referenceValue+= duplicate%10;
				duplicate = duplicate/10;
			}else {
			referenceValue= (referenceValue*10)+duplicate%10;
			duplicate = duplicate/10;
			}

			method(originalValue ,duplicate, referenceValue);
		}
	}
	public static void main(String[] args) {
		method(888,888,0);
	}

}
