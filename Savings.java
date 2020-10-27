/**
 * Savings account class, which creats savings account and checks if the customer is loyal
 * @author Jonathan Cattuna, George Job
 *
 */


public class Savings extends Account 
{
	private boolean isLoyal;
	
	/**
	 * Savings constructor
	 * @param holder
	 * @param balance
	 * @param dateOpen
	 * @param isLoyal
	 */
	public Savings(Profile holder, double balance, Date dateOpen, boolean isLoyal) {
		super(holder, balance, dateOpen);
		this.isLoyal = isLoyal;
	}
	
	public boolean isLoyal()
	{
		return isLoyal;
	}

	@Override
	public double monthlyFee() {
		if(getBalance() >= 300)
		{
			return 0;
		}
		else
		{
			return 5;
		}
	}

	@Override
	public double monthlyInterest() {
		if(isLoyal)
		{
			return (getBalance() * 0.0035 * (0.08333));
		}
		else
		{
			return (getBalance() * 0.0025 * (0.08333));
		}
	}

	
}