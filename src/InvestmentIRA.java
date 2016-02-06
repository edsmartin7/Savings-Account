
//Subclass for IRA accounts

public class InvestmentIRA {
   //Aggregation   
   public InvestmentIRA(double amount) {
      String empty = "";
      Investment401k retire = new Investment401k(amount, empty);
      System.out.println("Total retirement savings are:" 
            + (retire.getAverage() 
            + (.10*amount)));
   }
	
}
