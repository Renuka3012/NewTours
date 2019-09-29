package com.BasicJava;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		String s = "shiva";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter name");
		String name =input.next();
			
		if (name.equalsIgnoreCase(s))
		{
		System.out.print(name+"  is my husband");
		}
		else
		{
			System.out.println("Shut up ur mouth");
		}
		
		
		
		
		
	}

}
