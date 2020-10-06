
public abstract class Account 
{
	private Profile holder;
	private double balance;
	private Date dateOpen;
	
	public void debit(double amount) 
	{
		
	} //decrease the balance by amount
	
	public void credit(double amount)
	{
		
	} //increase the balance by amount
	@Override
	public String toString() 
	{
		return super.toString();
	}
	
	public abstract double monthlyInterest()
	{
		
	}
	
	public abstract double monthlyFee() 
	{
		
	}
}
