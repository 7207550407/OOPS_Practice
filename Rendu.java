package Sai.Interface;

public class Rendu {
	public static void main(String[] xyz)
	{
		double a=Double.parseDouble(xyz[0]);
		double b=Double.parseDouble(xyz[1]);
		double c=Double.parseDouble(xyz[2]);
		double d=Double.parseDouble(xyz[3]);
		System.out.println("Answer is   "+(a+b+c-d));
		
		boolean g=Boolean.parseBoolean(xyz[4]);
		System.out.println("It is "+ g);
		
	}
}
