package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) {
		String string1="Liv   etech";
		String string2="Tec*&^h";
		if (string1.length() > string2.length())
		{
			System.out.println("String1 is greater");
		}
		else
			if(string1.length() == string2.length())
			{
				System.out.println("Both are equal");
			}
			else
			{
				System.out.println("String2 is greater");
			}
								
		

	}

}
