
	//Subclass for Savings Accounts

	public class investmentSavings extends investmentTypes
	{
	  private double amt2;
	   
	  public investmentSavings(double b)
	  {
	      
	      amt2 = b;
	      System.out.println(toString());
	      System.out.println("The yearly sum is " + yearlySum(b));      
	  }
	  public void setBalance(double b)
	  {
	  amt2 = b;
	  }
	  public double getBalance()
	  {
	   return amt2;
	  } 
	   public double getAvg(double b)
	   {
	      return .01 * b;
	   }
	   public String toString()
	   {
	   String str = "The savings account accumulates " + getAvg(amt2);
	   return str;
	   }   
	
}
