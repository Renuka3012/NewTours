package com.BasicJava;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		int a=153,r ;
		int temp=a;
		int sum=0;
		while (a>0)
		{
			r=a%10;
			a=a/10;
			sum=sum + r*r*r; // cubes of each number and their sum is equal to their own number//
			
		}
	if (temp==sum)
	{
		System.out.println("Armstrong");
		
	}
	else
	{
		System.out.println("Not Armstrong");
	}
		


	}

}
