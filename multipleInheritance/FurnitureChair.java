package com.thoughtfocus.multipleInheritance;

public class FurnitureChair implements PlasticChair, IronChair{

	@Override
	public void design() {
		// TODO Auto-generated method stub
		System.out.println("Design from both Plastic chair and Iron chair");
		
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("To sit from both Plastic chair and Iron chair");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("To sleep from both Plastic chair and Iron chair");
	}
	
}
