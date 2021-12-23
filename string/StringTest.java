package com.thoughtfocus.string;


public class StringTest {
	
	public static void main(String[] args) {
		String st="pooja";
		String str=new String("pooja");
		String str1=new String("Ananya");
		System.out.println(str.hashCode());
		System.out.println(str1);
		System.out.println(st.hashCode());
		System.out.println(str.charAt(2));
		System.out.println(str1.codePointAt(0));
		System.out.println(str.concat(" getting married..."));
		System.out.println(str.contains("oja"));
		System.out.println(str.contentEquals(st));
		System.out.println(str1.endsWith("a"));
		System.out.println(str1.indexOf('y'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.length());
		System.out.println(str1.replace('A', 'a'));
		System.out.println(str.replaceAll("pooja", "POOJA"));
		System.out.println(str.split("o"));
		System.out.println(str);
		System.out.println(str1.startsWith("n", 1));
		System.out.println(str.strip());
		System.out.println(str.subSequence(1, 4));
		System.out.println(str1.substring(2));
		System.out.println(str.toUpperCase());
		System.out.println(str.format("pooj", str));
		//System.out.println(str.valueOf(false));
		//System.out.println(str.valueOf('p'));
	}
}
