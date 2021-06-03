package pracice.example;

public class Three {
	
	public static void main(String[] args) {
	
	String first = "Ananth";
    String second = "AnanthaSai";
    String third = "Ananth";

    // compare first and second strings
    boolean res1 = first.equals(second);
    System.out.println("first and second are equal: " + res1);

    // compare first and third strings
    boolean res2 = first.equals(third);
    System.out.println("first and third are equal: " + res2);
    
    //compare second and third strings
    boolean res3=second.equals(third);
    System.out.println("second and third are equal: " + res3);
    
    //compare third and first strings
    boolean res4=third.equals(first);
    System.out.println("third and first are equal: " +res4);
      }

}