
	//Subclass for 401k accounts

	public class investment401k extends investmentTypes
	{
	  private double amt3;
	  public investment401k(double c, String str)
	  {
	  amt3 = c;
	  }
	  public investment401k(double c)
	  {
	      amt3 = c;
	      System.out.println(toString());
	      System.out.println("The yearly sum is " + yearlySum(c));
	  }
	  //Method Override 
	   public double getAvg()
	   {
	      return .05 * amt3;
	   }
	   //Method Overload
	   public double getAvg(double c)
	   {
	      return .05 * c; 
	   }
	   public String toString()
	   {
	   String str = "The 401k account accumulates " + getAvg(amt3);
	   return str;
	   }
	
}
