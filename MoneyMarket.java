/**
 * creates MoneyMarket accounts and allows withdrawls
 * @author Jonathan Cattuna, George Job
 *
 */

public class MoneyMarket extends Account 
{
	private int withdrawals;
	
	/**
	 * creates a moneymarket object
	 * @param holder
	 * @param balance
	 * @param date
	 */
	public MoneyMarket(Profile holder, double balance, Date dateOpen)
	{
		super(holder, balance, dateOpen);
		withdrawals = 0;
	}

	/**
	 * Return current amount of withdrawals
	 * @return
	 */
	public int getWithdrawals()
	{
		return withdrawals;
	}
	
	/**
	 * Increment withdrawals
	 */
	public void incrementWithdrawals()
	{
		withdrawals++;
	}
	
	@Override
	public double monthlyInterest() {
		return (getBalance() * 0.0065 * (0.08333));
	}

	@Override
	public double monthlyFee() {
		if(getBalance() >= 2500 && withdrawals <= 6)
		{
			return 0;
		}
		else
		{
			return 12;
		}
	}
}