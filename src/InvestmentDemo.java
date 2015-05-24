
	//Eddie Martin

	//Main demo class
	//Account Balances are already included
	//User must input a text file to have balance info copied to

	import java.io.*;
	import java.util.*;
	import java.util.Scanner;

	public class InvestmentDemo
	{
	   //Exception Handling 
	   public static void main(String[] args) throws InputMismatchException, IOException
	   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   investmentTypes b1 = new investmentTypes(200.00);
	   investmentSavings b2 = new investmentSavings(400.00);
	   //Overloading
	   investment401k b3 = new investment401k(600.00);
	   //Aggregation/Overriding
	   investmentIRA b4 = new investmentIRA(800.00);
	   //Polymorphism
	   investmentTypes b5 = new investmentSavings(1000.00);
	   b5.toString();
	  
	  //Input/Output
	      System.out.print("Enter a .txt file name to copy data to: ");
			String f1 = keyboard.nextLine();
	      FileWriter f2 = new FileWriter(f1, true);
			PrintWriter outputFile = new PrintWriter(f2);
						
		   outputFile.println(b1.getAvg(200));
	      outputFile.println(b2.getAvg(400));
	      outputFile.println(b3.getAvg(600));
	      outputFile.println(b5.getAvg(1000));
	      outputFile.println("Printing complete");
			outputFile.close();
	   }
	
}
