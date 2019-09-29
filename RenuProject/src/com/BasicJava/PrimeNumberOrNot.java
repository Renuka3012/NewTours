package com.BasicJava;
import java.util.Scanner;
public class PrimeNumberOrNot {
	private static Scanner sc;

	public static void main(String[] args)
	{
		int Number,i;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		if (Number==0||Number==1)
		{
			System.out.println("not prime");
		}
		else
		{
			for (i=2;i<=Number;i++)
			{
				if (Number%i==0)
				{
					System.out.println("Not Prime");
					break;
				}
				else
				{
					System.out.println(" Prime");
				}
			}
		}
	

		 
	}

}
