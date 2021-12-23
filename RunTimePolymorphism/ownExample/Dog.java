package com.thoughtfocus.RunTimePolymorphism.ownExample;

public class Dog extends Animal{
	void noise()
	{
		System.out.println("Bow Bow....noise");
	}
}
class Cat extends Animal{
	void noise()
	{
		System.out.println("meow meow ...noise");
	}
}
	class Snake extends Animal{
		void noise()
		{
			System.out.println("Buss Tuss....noise");
		}
	}

