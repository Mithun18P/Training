package com.thoughtfocus.encapsulation;

public class CredentialsTest {

	public static void main(String[] args) {
		Credentials credentials=new Credentials();
		
		credentials.setusername("Rocking Star Yash");
		credentials.setpassword("radika@1234");
		
		System.out.println(credentials.getusername());
		System.out.println(credentials.getpassword());
	}

}