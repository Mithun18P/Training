package com.thoughtfocus.string;

public class String_Buffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Patil");
	StringBuffer s=new StringBuffer("patil");
	sb.append(" got 5 acre land...");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(6));
	System.out.println(sb.codePointAt(1));//it gives ASCII value of the that index
	System.out.println(sb.length());
	System.out.println(sb.compareTo(s));//lexicographical comparison
	System.out.println(sb.delete(6,12));
	System.out.println(sb.replace(6, 44, "got 6 acre land."));
	System.out.println(sb.reverse());
	sb.reverse();
	System.out.println(sb.capacity());
	sb.trimToSize();//reduce size
	System.out.println(sb.capacity());
}
}
