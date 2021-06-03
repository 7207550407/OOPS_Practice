package pracice.example;

public class Example {
	int accountNumber;
	String customerName;
	double balance;

	 // generate toString metod

		public String toString()
		{
			return accountNumber +" "+customerName+" "+ balance;
		}

	public Example(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public static void main(String[] args) {
		Example e = new Example(848, "Sai", 100230.99);
		Example a = new Example(820, "Naveen", 120310.34);
		System.out.println("Details : " +e);
		System.out.println("Details : " +a);

	}

}
