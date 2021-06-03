package sai1.scanner;
import java.util.Scanner;
public class Throws
{
	
		Scanner sc=new Scanner(System.in);


	static void throwMethod() throws Exception 
	{
		System.out.println("Inside throwMethod");
		throw new Exception("Throws_Demo1");
	}

	static void throwMethod1() throws Exception 
	{
		System.out.println("Inside throwsMethod1");
		throw new Exception("Throws_Demo2");
	}

	public static void main(String[]abc) 
	{
		System.out.println("Please enter your inpiut...");
		try 
		{
			throwMethod();
		} 
		catch (Exception exp) 
		{
			System.out.println("Exception is: " + exp);
		}
		try 
		{
			throwMethod1();
		} 
		catch (Exception ae) 
		{
			System.out.println("Exception is: " + ae);
		}
	}
}
