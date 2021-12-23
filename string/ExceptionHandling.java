package com.thoughtfocus.string;

public class ExceptionHandling {
public static void main(String[] args) {
	int[] arr= {1,2,3};
	try {
	
		System.out.println(arr[5]);
	}
	catch(Exception e) {
		System.out.println("enterd catch..");
		e.printStackTrace();
	}
}
}
