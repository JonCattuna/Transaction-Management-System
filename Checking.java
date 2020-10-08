/**
 * The checking class creats the cheaking account objects and the intrest with it
 * 
 *
 */
public class Checking extends Account 
{
	private boolean directDeposit;
	/**
	 * create checking account object
	 * @param fName
	 * @param lName
	 * @param amount
	 * @param date
	 * @param dd
	 */
	public Checking(String fName, String lName, double amount, Date date, boolean dd)
	{
		super(fName, lName, amount, date);
		this.directDeposit = dd;
	}
	/**
	 * Monthly intrest
	 * @return
	 */
	public double monthlyIntrest()
	{
		return 0;
	}
	/**
	 * monthly fee
	 * @return
	 */
	public double monthlyFee()
	{
		return 0;
	}
}
