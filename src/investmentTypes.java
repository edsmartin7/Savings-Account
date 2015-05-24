
//SuperClass
	public class investmentTypes implements Investment
	{ 
	   private double amt;
	   //Static member 
	   public static int yr = 12; 
	  
	   public investmentTypes()
	   {
	      amt = 0.0;
	   }
	   public investmentTypes(double a)
	   {
	      amt = a;
	      System.out.println(toString());
	      System.out.println("The yearly sum is " + yearlySum(a));
	   }
	   public void declareName()
	   {
	      System.out.println("Account selected");
	   }
	   public void declarePercent()
	   {
	      System.out.println("Percent given");
	   }
	   public void setBalance(double a)
	   {
	      amt = a;
	   }
	   public double getBalance()
	   {
	      return amt;
	   }
	   public double getAvg(double a)
	   {
	      return 1 * a;
	   }
	   public String toString()
	   {
	   String str = "The account contains " + getAvg(amt);
	   return str;
	   }
	   //Static method
	   public static double yearlySum(double m)
	   {
	      return m * yr;
	   }
	

}
