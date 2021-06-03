package sai1.scanner;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {

		System.out.print("Please enter number 1     ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		try {

			int b = Integer.parseInt(a);
			System.out.print("Please enter number 2     ");
			String c = sc.next();
			int d = Integer.parseInt(c);

			int f = b / d;

			System.out.println("Answer is  " + f);
		} catch (NullPointerException e) {
			System.out.println("Pora " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Pora " + e.getMessage());
		}

		System.out.println("Thank you...your program is Executed Successfully");
	}
}