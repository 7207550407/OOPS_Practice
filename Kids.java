package Sai.Interface;
	
	interface Kavya
	{
		public void kavyaMethod();
	}
	interface Ruthwik
	{
		public void ruthwikMethod();
	}
class Annamtinu implements Kavya, Ruthwik
	{
		public void kavyaMethod()
		{
			System.out.println("Kavya= Naku vaddu mummy..nenu bommalu chudali");
		}
		public void ruthwikMethod()
		{
			System.out.println("Ruthwik= Tavya phone ivvu tintanu");
		}
	}	
public class Kids 
{
	public static void main(String[] abc)
	{
		Annamtinu a=new Annamtinu();
		a.kavyaMethod();
		a.ruthwikMethod();

	}
}