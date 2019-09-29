package com.BasicJava;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int a=1;
		int b=1;
		int k=0;
		System.out.print("1  1 ");
	
     while (k<=100)
     {
    	 k=a+b;
    	 System.out.print(k + " ");
    	 a=b;
    	 b=k;
     }

	}

}
