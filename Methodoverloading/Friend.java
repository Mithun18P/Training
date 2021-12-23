package com.thoughtfocus.Methodoverloading;

public class Friend {
	void run() {
		System.out.println("friend running slowly");
	
	}
	void run(int a)
	{System.out.println("Freind running with a speed "+a);
	}
	void run(int a, String b)
	{
		System.out.println("Freind running with a speed "+a+" with me");
	}
}
