
public class AccountDatabase 
{
	private Account[] accounts;
	private int size;
	
	private int find(Account account) 
	{
		return size; 
		
	}
	
	private void grow() 
	{ 
		//USE ARRAYCOPY(0,0, ARRAYLENGTH) TO MAKE A NEW ARRAY WITH 5 EXTRA SPOTS
	}
	
	public boolean add(Account account) 
	{
		
	} //return false if account exists
	
	public boolean remove(Account account)
	{ 
		
	} //return false if account doesn’t exist
	
	public boolean deposit(Account account, double amount)
	{ 
		
	}
	//return 0: withdrawal successful, 1: insufficient funds, -1 account doesn’t exist
	
	public int withdrawal(Account account, double amount)
	{ 
		
	}
	
	private void sortByDateOpen()
	{ 
		
	} //sort in ascending order
	
	private void sortByLastName()
	{ 
		
	} //sort in ascending order
	
	public void printByDateOpen()
	{ 
		sortByDateOpen();
		//use compareto to find dates
		//Slection sort will work or quick sort
	}
	
	public void printByLastName()
	{ 
		sortByLastName();
	}
	
	public void printAccounts()
	{
		
	}

	
}
