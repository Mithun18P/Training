package com.thoughtfocus.string;

public class String_Builder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Prajwal");
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(3));
	System.out.println(sb.codePointAt(3));//it gives ASCII value of the that index
	System.out.println(sb.length());
	System.out.println(sb.delete(1,3));
	System.out.println(sb.subSequence(2, 4));
	sb.setLength(10);//creating space of remaining index.
	System.out.println(sb.append("he is uncle....."));
}
}
