
	//Subclass for IRA accounts

	public class investmentIRA
	{
	   //aggregation   
	     public investmentIRA(double d)
	     {
	     String nul="";
	     investment401k c1 = new investment401k(d, nul);
	     System.out.println("Total retirement savings are:"  + (c1.getAvg() + (.10*d)));
	     }
	
}
