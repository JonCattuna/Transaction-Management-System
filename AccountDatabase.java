/**
 * Account database is an array of all types of accounts and controls the 
 * different actions that can be performed on accounts like add and remove
 *  @author Jonathan Cattuna, George Job
 *
 */

import java.text.DecimalFormat;

public class AccountDatabase 
{
	private Account[] accounts;
	private int size;
	
	/**
	 * Creates new database object
	 */
	public AccountDatabase()
	{
		accounts = new Account[5];
		size = 0;
	}
	
	/**
	 * Searches for account in database
	 * @param account to search for
	 * @return index of account in database, -1 if not found
	 */
	private int find(Account account) 
	{
		for(int i = 0; i < size; i++)
		{
			//System.out.println("find, i: " + i + ", size: " + size);
			if(accounts[i].equals(account))
				return i;
		}
		return -1;
	}
	
	/**
	 * Grow size of database by 5
	 */
	private void grow() 
	{ 
		//USE ARRAYCOPY(0,0, ARRAYLENGTH) TO MAKE A NEW ARRAY WITH 5 EXTRA SPOTS
		Account[] temp = new Account[accounts.length +5];
		System.arraycopy(accounts, 0, temp, 0, accounts.length);
		accounts = temp;
	}
	
	/**
	 * Add account to the database
	 * @param account to be added
	 * @return true if added, false if not added
	 */
	public boolean add(Account account) 
	{
		if(find(account) < 0)
		{
			if(accounts.length == size)
			{
				grow();
				accounts[size] = account;
				size++;
				return true;
			}
			else
			{
				accounts[size] = account;
				size++;
				return true;
			}
		}
		else
		{
			return false;
		}
	} //return false if account exists
	
	/**
	 * Remove account from the database
	 * @param account to be removed
	 * @return true if removed, false if not removed
	 */
	public boolean remove(Account account)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			accounts[accountIndex] = accounts[size-1];
			accounts[size-1] = null;
			size--;
			return true;
		}
		
		return false;
	} //return false if account doesn’t exist
	
	/**
	 * Deposit amount in to the account specified
	 * @param account to deposit into
	 * @param amount to deposit in account
	 * @return true if deposited, false if not deposited
	 */
	public boolean deposit(Account account, double amount)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			accounts[accountIndex].credit(amount);
			return true;
		}
		
		return false;
	}
	//return 0: withdrawal successful, 1: insufficient funds, -1 account doesn’t exist
	
	/**
	 * Withdraw amount from account
	 * @param account to withdraw from
	 * @param amount to withdraw from account
	 * @return 0 if withdrawn, 1 if insufficient balance, -1 if account not found
	 */
	public int withdrawal(Account account, double amount)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			if((accounts[accountIndex].getBalance() - amount) >= 0)
			{
				accounts[accountIndex].debit(amount);
				
				if(accounts[accountIndex].getClass().getName().equals("MoneyMarket"))
				{
					((MoneyMarket) accounts[accountIndex]).incrementWithdrawals();
				}
				
				return 0;
			}
			else
			{
				return 1;
			}
		}
		
		return -1;
	}
	
	/**
	 * Sorts the database by the date opened
	 */
	private void sortByDateOpen()
	{ 
		
	} //sort in ascending order
	
	/**
	 * Sorts the database by last name
	 */
	private void sortByLastName()
	{ 
		//selection sort
		for(int j = 0; j < size - 1; j++)
		{
			int iMin = j;
			for(int i = j + 1; i < size; i++)
			{
				if((accounts[i].getProfile().getLname()).compareTo(accounts[iMin].getProfile().getLname()) < 0)
				{
					iMin = i;
				}
			}
			
			if(iMin != j)
			{
				Account temp = accounts[iMin];
				accounts[iMin] = accounts[j];
				accounts[j] = temp;
			}
		}
	} //sort in ascending order
	
	/**
	 * Print all accounts in database sorted by date opened
	 */
	public void printByDateOpen()
	{ 
		sortByDateOpen();
		//use compareto to find dates
		//Slection sort will work or quick sort
	}
	
	/**
	 * Print all accounts in database sorted by last name
	 */
	public void printByLastName()
	{ 
		sortByLastName();
		//calculate monthlyInterest and monthlyFee, print out account
		for(Account acc : accounts)
		{
			if(acc != null)
			{
				if(acc.getClass().getName().equals("Checking"))
				{
					DecimalFormat df = new DecimalFormat();
					df.setMaximumFractionDigits(2);
					if(((Checking) acc).isDirectDeposit())
					{
						System.out.println("*Checking*" + acc.getProfile().getFname() + " " 
								+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
								+ acc.getDateOpen().toString() + "*direct deposit account*");
					}
					else
					{
						System.out.println("*" + acc.getClass().getName() + "*" + acc.getProfile().getFname() + " " 
											+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
											+ acc.getDateOpen().toString());
					}
					
					double interest = ((Checking) acc).monthlyInterest();
					double monthlyFee = ((Checking) acc).monthlyFee();
					acc.credit(interest - monthlyFee);
					
					System.out.println("-interest: $ " + df.format(interest));
					System.out.println("-fee: $ " + monthlyFee);
					System.out.println("-new balance: $ " + df.format(acc.getBalance()));
				}
				else if(acc.getClass().getName().equals("Savings"))
				{
					DecimalFormat df = new DecimalFormat();
					df.setMaximumFractionDigits(2);
					
					if(((Savings) acc).isLoyal())
					{
						System.out.println("*Savings*" + acc.getProfile().getFname() + " " 
								+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
								+ acc.getDateOpen().toString() + "*special Savings account*");
					}
					else
					{
						System.out.println("*" + acc.getClass().getName() + "*" + acc.getProfile().getFname() + " " 
											+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
											+ acc.getDateOpen().toString());
					}
					
					double interest = ((Savings) acc).monthlyInterest();
					double monthlyFee = ((Savings) acc).monthlyFee();
					acc.credit(interest - monthlyFee);
					
					System.out.println("-interest: $ " + df.format(interest));
					System.out.println("-fee: $ " + monthlyFee);
					System.out.println("-new balance: $ " + df.format(acc.getBalance()));
				}
				else if(acc.getClass().getName().equals("MoneyMarket"))
				{
					DecimalFormat df = new DecimalFormat();
					df.setMaximumFractionDigits(2);
					
					System.out.println("*Money Market*" + acc.getProfile().getFname() + " " 
							+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
							+ acc.getDateOpen().toString() + "*" + ((MoneyMarket) acc).getWithdrawals() + " withdrawals*");
					
					double interest = ((MoneyMarket) acc).monthlyInterest();
					double monthlyFee = ((MoneyMarket) acc).monthlyFee();
					acc.credit(interest - monthlyFee);
					
					System.out.println("-interest: $ " + df.format(interest));
					System.out.println("-fee: $ " + monthlyFee);
					System.out.println("-new balance: $ " + df.format(acc.getBalance()));
				}
			}
		}
	}
	
	/**
	 * Print all accounts in the database
	 */
	public void printAccounts()
	{
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		for(Account acc : accounts)
		{
			if(acc != null)
			{
				if(acc.getClass().getName().equals("Checking"))
				{
					if(((Checking) acc).isDirectDeposit())
					{
						System.out.println("*Checking*" + acc.getProfile().getFname() + " " 
								+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
								+ acc.getDateOpen().toString() + "*direct deposit account*");
					}
					else
					{
						System.out.println("*" + acc.getClass().getName() + "*" + acc.getProfile().getFname() + " " 
											+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
											+ acc.getDateOpen().toString());
					}
				}
				else if(acc.getClass().getName().equals("Savings"))
				{
					if(((Savings) acc).isLoyal())
					{
						System.out.println("*Savings*" + acc.getProfile().getFname() + " " 
								+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
								+ acc.getDateOpen().toString() + "*special Savings account*");
					}
					else
					{
						System.out.println("*" + acc.getClass().getName() + "*" + acc.getProfile().getFname() + " " 
											+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
											+ acc.getDateOpen().toString());
					}
				}
				else if(acc.getClass().getName().equals("MoneyMarket"))
				{
					System.out.println("*Money Market*" + acc.getProfile().getFname() + " " 
							+ acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" 
							+ acc.getDateOpen().toString() + "*" + ((MoneyMarket) acc).getWithdrawals() + " withdrawals*");
				}
			}
		}
	}

	/**
	 * Get current size of the database
	 * @return current size of database
	 */
	public int getSize()
	{
		return size;
	}
}