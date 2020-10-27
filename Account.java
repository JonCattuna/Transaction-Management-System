/**
 * Abstact class that is the object of account which is used in the database and conprised of the different types.
 *  @author Jonathan Cattuna, George Job
 *
 */

public abstract class Account 
{
	private Profile holder;
	private double balance;
	private Date dateOpen;
	
	/**
	 * Creates Account object
	 * @param holder Profile
	 * @param balance initial balance
	 * @param dateOpen
	 */
	public Account(Profile holder, double balance, Date dateOpen)
	{
		this.holder = holder;
		this.balance = balance;
		this.dateOpen = dateOpen;
	}
	
	/**
	 * decreases balance by amount
	 * @param amount
	 */
	public void debit(double amount) 
	{
		balance -= amount;
	} //decrease the balance by amount
	
	/**
	 * increases balance by amount
	 * @param amount
	 */
	public void credit(double amount)
	{
		balance += amount;
	} //increase the balance by amount
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		
	}
	
	/**
	 * @return monthly interest accrued
	 */
	public abstract double monthlyInterest()
	{
		
	}
	
	/**
	 * @return the monthly fee associated with this account
	 */
	public abstract double monthlyFee() 
	{
		
	}
	
	/**
	 * @return profile of holder of this account
	 */
	public Profile getProfile()
	{
		return holder;
	}
	
	/**
	 * @return current balance of account
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * @return date of when the account was opened
	 */
	public Date getDateOpen()
	{
		return dateOpen;
	}
	
	
	/**
	 * Determines whether two accounts are equal or not
	 * @param account to compare
	 * @return true if accounts are equal, false if accounts are not equal
	 */
	public boolean equals(Account account) 
	{
		boolean sameType = getClass().getName().equals(account.getClass().getName());
		boolean sameFname = getProfile().getFname().equals(account.getProfile().getFname());
		boolean sameLname = getProfile().getLname().equals(account.getProfile().getLname());
		
		return (sameType && sameFname && sameLname);
	}
}