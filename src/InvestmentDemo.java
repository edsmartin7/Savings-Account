
//Main demo class
//Final Project includes all aspects of Java Programming
//User enters a file to have given data copied into

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class InvestmentDemo {

   //Exception Handling 
   public static void main(String[] args) 
         throws InputMismatchException, IOException {

      Scanner keyboard = new Scanner(System.in);
      InvestmentTypes generic = new InvestmentTypes(200.00);
      InvestmentSavings savings = new InvestmentSavings(400.00);
      //Overloading
      Investment401k retire = new Investment401k(600.00);
      //Aggregation/Overriding
      InvestmentIRA IRA = new InvestmentIRA(800.00);
      //Polymorphism
      InvestmentTypes plain = new InvestmentSavings(1000.00);
      plain.toString();

      //Input/Output
      System.out.print("Enter a .txt file name to copy data to: ");
      String input = keyboard.nextLine();
      FileWriter writer = new FileWriter(input, true);
      PrintWriter outputFile = new PrintWriter(writer);				

      outputFile.println(generic.getAverage(200));
      outputFile.println(savings.getAverage(400));
      outputFile.println(retire.getAverage(600));
      outputFile.println(plain.getAverage(1000));
      outputFile.println("Printing complete");
      outputFile.close();
   }
	
}
