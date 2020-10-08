/**
 * Savings account class, which creats savings account and checks if the customer is loyal
 * @author Starscream
 *
 */
public class Savings extends Account
{
	private boolean isLoyal;
	/**
	 * creates the object of Savings accounts
	 * @param fName
	 * @param lName
	 * @param amount
	 * @param date
	 * @param l
	 */
	public Savings(String fName, String lName, double amount, Date date, boolean l)
	{
		super(fName, lName, amount, date);
		this.isLoyal = l;
	}
}
