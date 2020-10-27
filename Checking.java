/**
 * The checking class creates the checking account objects and the interest with it
 * @author Jonathan Cattuna, George Job 
 *
 */


public class Checking extends Account {
	private boolean directDeposit;
	
	/**
	 * Creates a Checking account
	 * @param holder
	 * @param balance
	 * @param dateOpen
	 * @param directDeposit
	 */
	public Checking(Profile holder, double balance, Date dateOpen, boolean directDeposit)
	{
		super(holder, balance, dateOpen);
		this.directDeposit = directDeposit;
	}
	
	public boolean isDirectDeposit()
	{
		return directDeposit;
	}

	@Override
	public double monthlyFee() {
		if(directDeposit || getBalance() >= 1500)
		{
			return 0;
		}
		else
		{
			return 25;
		}
	}

	@Override
	public double monthlyInterest() {
		return (getBalance() * 0.0005 * (0.08333));
	}
}