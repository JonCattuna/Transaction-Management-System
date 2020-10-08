/**
 * creates MoneyMarket accounts and allows withdrawls
 * 
 *
 */
public class MoneyMarket extends Account 
{
	//super(holder, balace, dateOpen);
	private int withdrawals;
	/**
	 * creates a moneymarket object
	 * @param fName
	 * @param lName
	 * @param amount
	 * @param date
	 * @param w
	 */
	public MoneyMarket(String fName, String lName, double amount, Date date, int w)
	{
		super(fName, lName, amount, date);
		this.withdrawals = w;
	}
	
}
