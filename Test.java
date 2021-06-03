package Sai.Interface;

interface Bike
{
	public void vehicleHorn();
}

class Test1 implements Bike
{
	public void vehicleHorn()
	{
		System.out.println("Pe Pe");
	}
}

public class Test 
{
	public static void main(String[] xyz)
	{
		Test1 t1=new Test1();
		t1.vehicleHorn();
	}
	

}
