/**
 * Abstact class that is the object of account which is used in the database and conprised of the different types.
 * 
 *
 */
public abstract class Account 
{
	private Profile holder;
	private double balance;
	private Date dateOpen;
	
	/**
	 * creates an account object
	 * @param fname
	 * @param lname
	 * @param amount
	 * @param dateOpen
	 */
	public Account(String fname, String lname, double amount, Date dateOpen)
	{
		this.holder = new Profile(fname, lname);
		this.balance = amount;
		this.dateOpen = dateOpen;
	}
	/**
	 * debit method which withrawls from accounts
	 * @param amount
	 */
	public void debit(double amount) 
	{
		
	}
	//decrease the balance by amount;
	/**
	 * credit method which deposits into accounts
	 * @param amount
	 */
	public void credit(double amount)
	{
		
	}
	 //increase the balance by amount
	/**
	 * toString to test 
	 */
	@Override
	public String toString()
	{
		return this.holder.toString() + "" + this.balance;
		
	}
	
	/**
	 * monthlyIntrest variable
	 */
	public abstract double monthlyInterest();
	
	/**
	 * monthlyfee variable
	 * 
	 */
	public abstract double monthlyFee();
	
}
