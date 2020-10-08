
public class Checking extends Account 
{
	private boolean directDeposit;
	
	public Checking(String fName, String lName, double amount, Date date, boolean dd)
	{
		super(fName, lName, amount, date);
		this.directDeposit = dd;
	}
	
	public double monthlyIntrest()
	{
		return 0;
	}
	
	public double monthlyFee()
	{
		return 0;
	}
}
