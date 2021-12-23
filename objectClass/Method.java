package com.thoughtfocus.objectClass;

public class Method {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		pen pen = new pen("camlin",5);
		pen copy=(pen)pen.clone();
		System.out.println(pen);
		System.out.println(copy);
	}
}
