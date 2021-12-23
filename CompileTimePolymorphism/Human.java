package com.thoughtfocus.CompileTimePolymorphism;

public class Human {
	public static void main(String[] args) {
		Unknown unadd = new Unknown();
		Friend frd = new Friend();
		frd.calling("Mithun");
		frd.calling("mithun", "unknown");
		frd.calling(unadd);
	}
}