
//SuperClass
public class InvestmentTypes implements Investment { 
   
   private double amount;
   //Static member 
   public static int years = 12; 

   public InvestmentTypes(){
      amount = 0.0;
   }
   public InvestmentTypes(double amt){
      amount = amt;
      System.out.println(toString());
      System.out.println("The yearly sum is " + yearlySum(amt));
   }
   public void declareName(){
      System.out.println("Account selected");
   }
   public void declarePercent(){
      System.out.println("Percent given");
   }
   public void setBalance(double amt){
      amount = amt;
   }
   public double getBalance(){
      return amount;
   }
   public double getAverage(double amt){
      return 1 * amt;
   }
   public String toString(){
      String str = "The account contains " + getAverage(amount);
      return str;
   }
   //Static method
   public static double yearlySum(double amts){
      return amts * years;
   }
	
}
