
public class Savings extends Account
{
	private boolean isLoyal;
	
	public Savings(String fName, String lName, double amount, Date date, boolean l)
	{
		super(fName, lName, amount, date);
		this.isLoyal = l;
	}
}
