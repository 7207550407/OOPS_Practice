package sai1.scanner;

import java.util.Scanner;

public class scannerPariksha 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter your Name");
		Scanner sc=new Scanner(System.in);
		String name = sc.next();
		System.out.println("Please enter your Age");
		String age = sc.next();
		System.out.println("Please enter your city");
		String city = sc.next();
		System.out.println("Your name is  " +name + " Your Age is " +age + " You are from " + city);
	}
}
