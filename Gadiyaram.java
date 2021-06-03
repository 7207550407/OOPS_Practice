package sai2.Date;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gadiyaram 
{
	public static void main(String[] args) 
	{
		LocalTime lt=LocalTime.now();
		LocalDate ld=LocalDate.now();
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Time...  "+lt);
		System.out.println("Date..."+ld);
		System.out.println("Time and Date...  "+ldt);
	}

}
