/**
 * Account database is an array of all types of accounts and controls the 
 * differnt actions that can be performed on accoutns like add and remove
 * 
 *
 */
public class AccountDatabase 
{
	private Account[] accounts;
	private int size;
	/**
	 * find a certain account from the array of accounts
	 * @param account
	 * @return
	 */
	private int find(Account account) 
	{
		return size; 
		
	}
	/**
	 * grows the size of the arrray by 5 when it reachs max capacity
	 */
	private void grow() 
	{ 
		//USE ARRAYCOPY(0,0, ARRAYLENGTH) TO MAKE A NEW ARRAY WITH 5 EXTRA SPOTS
	}
	/**
	 * adds accounts to the database
	 * @param account
	 * @return
	 */
	public boolean add(Account account) 
	{
		return false;
		
	} //return false if account exists
	/**
	 * removes accounts from the database
	 * @param account
	 * @return
	 */
	public boolean remove(Account account)
	{
		return false; 
		
	} //return false if account doesn’t exist
	
	/**
	 * deposit an amount into a certin account
	 * @param account
	 * @param amount
	 * @return
	 */
	public boolean deposit(Account account, double amount)
	{
		return false; 
		
	}
	//return 0: withdrawal successful, 1: insufficient funds, -1 account doesn’t exist
	/**
	 * removes an amount from a certain account
	 * @param account
	 * @param amount
	 * @return
	 */
	public int withdrawal(Account account, double amount)
	{
		return size; 
		
	}
	/**
	 * sorts all account by the date they were opened
	 */
	private void sortByDateOpen()
	{ 
		
	} //sort in ascending order
	/**
	 * sorts all account by their last names
	 */
	private void sortByLastName()
	{ 
		
	} //sort in ascending order
	/**
	 * prints out all account based on their dates opened
	 */
	public void printByDateOpen()
	{ 
		sortByDateOpen();
		//use compareto to find dates
		//Slection sort will work or quick sort
	}
	/**
	 * prints out all accounts based on their last names
	 */
	public void printByLastName()
	{ 
		sortByLastName();
	}
	/**
	 * prints all account without sorting
	 */
	public void printAccounts()
	{
		
	}

	
}
