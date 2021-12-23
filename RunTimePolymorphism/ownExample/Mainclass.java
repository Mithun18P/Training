package com.thoughtfocus.RunTimePolymorphism.ownExample;

public class Mainclass {
public static void main(String[] args) {
	Dog dog=new Dog();
	Cat cat=new Cat();
	Snake snake=new Snake();
	dog.noise();
	cat.noise();
	snake.noise();
}
}
