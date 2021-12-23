package com.thoughtfocus.objectClass;

public class pen {
	String brand;
	int price;
	public pen(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
