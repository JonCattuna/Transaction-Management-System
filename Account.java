
public abstract class Account 
{
	private Profile holder;
	private double balance;
	private Date dateOpen;
	
	
	public Account(String fname, String lname, double amount, Date dateOpen)
	{
		this.holder = new Profile(fname, lname);
		this.balance = amount;
		this.dateOpen = dateOpen;
	}
	public void debit(double amount) 
	{
		
	}
	//decrease the balance by amount;
	
	public void credit(double amount)
	{
		
	}
	 //increase the balance by amount
	@Override
	public String toString()
	{
		return this.holder.toString() + "" + this.balance;
		
	}
	
	
	public abstract double monthlyInterest();
	
	
	public abstract double monthlyFee();
	
}
