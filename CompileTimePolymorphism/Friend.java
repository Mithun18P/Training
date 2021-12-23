package com.thoughtfocus.CompileTimePolymorphism;

public class Friend {
	void calling(String a)
	{
		System.out.println("friend is calling");
	}
	void calling(String a,String b)
	{
		System.out.println("Friend is calling with conference");
	}
	void calling(Unknown un)
	{
		un.calling("pickup");
	}
}
