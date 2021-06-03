package sai2.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tesiveyu 
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Before Formatting  " +ldt);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E, dd/MMM/yyyy  hh:mm");
		String dft=ldt.format(dtf);
		System.out.println("After Formatting  " +dft);
	}
}
