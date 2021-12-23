package com.thoughtfocus.ConstructorChaining;

public class Constructor {
	Constructor(){
		this("second");
		System.out.println("Default constructor");
	}
	Constructor(String a)
	{
		this("last","chaining");
		System.out.println("Secound constructor");
	}
	Constructor(String a,String b)
	{
		System.out.println("last Constructor");
	}
}
