//Subclass for 401k accounts

public class Investment401k extends InvestmentTypes {

   private double amount;

   public Investment401k(double c, String str) {
      amount = c;
   }

   public Investment401k(double c) {

      amount = c;
      System.out.println(toString());
      System.out.println("The yearly sum is " + yearlySum(c));
   }
   //Method Override 
   public double getAverage() {
      return .05 * amount;
   }
   //Method Overload
   public double getAverage(double c) {
      return .05 * c; 
   }
   public String toString() {
      String str = "The 401k account accumulates " + getAverage(amount);
      return str;
   }

}
