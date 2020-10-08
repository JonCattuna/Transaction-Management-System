
public class MoneyMarket extends Account 
{
	//super(holder, balace, dateOpen);
	private int withdrawals;
	
	public MoneyMarket(String fName, String lName, double amount, Date date, int w)
	{
		super(fName, lName, amount, date);
		this.withdrawals = w;
	}
	
}
