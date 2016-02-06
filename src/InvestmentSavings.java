
//Subclass for Savings Accounts

public class InvestmentSavings extends InvestmentTypes {

   private double savingsAmt;

   public InvestmentSavings(double input) {
      savingsAmt = input;
      System.out.println(toString());
      System.out.println("The yearly sum is " + yearlySum(input));      
   }
   public void setBalance(double input){
      savingsAmt = input;
   }
   public double getBalance(){
      return savingsAmt;
   } 
   public double getAverage(double input){
      return .01 * input;
   }
   public String toString(){
      String str = "The savings account accumulates " + getAverage(savingsAmt);
      return str;
   }   
	
}
