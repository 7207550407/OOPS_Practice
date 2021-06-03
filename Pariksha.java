package Sai.Interface;

public class Pariksha {

public static void main(String[] args) {
	//kavya false....kavya is female
	boolean k=Boolean.parseBoolean(args[1]);
	if(k==true)
	{
		System.out.println(args[0]+" is male");
	}
	else
	{
		System.out.println(args[0]+" is female");
	}
}
	
}
