/**
 * This class is the interface class it holds the scanner and takes in the users input
 * @author Jonathan Cattuna, George Job
 *
 */

import java.util.Scanner;

public class TransactionManager 
{
	String first;
	String last;
	Float amount = 0.0f;
	boolean loyal = false;
	String date;
	private TransactionManager manager;
	//private AccountDatabase database;
	
	AccountDatabase database = new AccountDatabase();
	
	public TransactionManager()
	{
		//manager = new TransactionManager();
	}
	
	/**
	 * Run the transaction process
	 */
	public void run()
	{	
		System.out.println("Transaction processing starts.....");
		boolean transacting = true;
		while(transacting)
		{
			Scanner input = new Scanner(System.in);
			String cmd = input.nextLine();
			String[] cmdArray = cmd.split(" ");
			
			switch(cmdArray[0])
			{
				case "OC":
					if(cmdArray.length == 6)
					{
						//Opens checking account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						date = cmdArray[4];
						
						if(cmdArray[5].toLowerCase().equals("true"))
						{
							loyal = true;
						}
						else if(cmdArray[5].toLowerCase().equals("false"))
						{
							loyal = false;
						}
						else
						{
							System.out.println("Input data type mismatch");
							break;
						}
						
						String[] dateComponents = date.split("/");
						Date accountDate = new Date(Integer.parseInt(dateComponents[0]), Integer.parseInt(dateComponents[1]), Integer.parseInt(dateComponents[2]));
						if(!accountDate.isValid())
						{
							System.out.println(accountDate + " is not a valid date!");
							break;
						}
						
						Checking newChecking = new Checking(new Profile(first,last), amount, accountDate, loyal);
						
						if(database.add(newChecking))
						{
							System.out.println("Account opened and added to the database.");
						}
						else
						{
							System.out.println("Account is already in the database.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "OS":
					if(cmdArray.length == 6)
					{
						//Opens checking account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						date = cmdArray[4];
						
						if(cmdArray[5].toLowerCase().equals("true"))
						{
							loyal = true;
						}
						else if(cmdArray[5].toLowerCase().equals("false"))
						{
							loyal = false;
						}
						else
						{
							System.out.println("Input data type mismatch");
							break;
						}
						
						String[] dateComponents = date.split("/");
						Date accountDate = new Date(Integer.parseInt(dateComponents[0]), Integer.parseInt(dateComponents[1]), Integer.parseInt(dateComponents[2]));
						if(!accountDate.isValid())
						{
							System.out.println(accountDate + " is not a valid date!");
							break;
						}
						
						Savings newSavings = new Savings(new Profile(first,last), amount, accountDate, loyal);
						
						if(database.add(newSavings))
						{
							System.out.println("Account opened and added to the database.");
						}
						else
						{
							System.out.println("Account is already in the database.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "OM":
					if(cmdArray.length == 5)
					{
						//Opens money market account with first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						date = cmdArray[4];
						
						String[] dateComponents = date.split("/");
						Date accountDate = new Date(Integer.parseInt(dateComponents[0]), Integer.parseInt(dateComponents[1]), Integer.parseInt(dateComponents[2]));
						if(!accountDate.isValid())
						{
							System.out.println(accountDate + " is not a valid date!");
							break;
						}
						
						MoneyMarket newMM = new MoneyMarket(new Profile(first,last), amount, accountDate);
						
						if(database.add(newMM))
						{
							System.out.println("Account opened and added to the database.");
						}
						else
						{
							System.out.println("Account is already in the database.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CC":
					if(cmdArray.length == 3)
					{
						//Close checking account with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						Checking dummyChecking = new Checking(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						if(database.remove(dummyChecking))
						{
							System.out.println("Account closed and removed from the database.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CS":
					if(cmdArray.length == 3)
					{
						//close savings account with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						Savings dummySavings = new Savings(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						if(database.remove(dummySavings))
						{
							System.out.println("Account closed and removed from the database.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CM":
					if(cmdArray.length == 3)
					{
						//close money market amount with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						MoneyMarket dummyMM = new MoneyMarket(new Profile(first,last), amount, new Date(0,0,0));
						
						if(database.remove(dummyMM))
						{
							System.out.println("Account closed and removed from the database.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DC":
					if(cmdArray.length == 4)
					{
						//depoist to checking first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						Checking dummyChecking = new Checking(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						if(database.deposit(dummyChecking, amount))
						{
							System.out.println(amount + " deposited to account.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DS":
					if(cmdArray.length == 4)
					{
						//deposit to savings first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						Savings dummySavings = new Savings(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						if(database.deposit(dummySavings, amount))
						{
							System.out.println(amount + " deposited to account.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DM":
					if(cmdArray.length == 4)
					{
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						MoneyMarket dummyMM = new MoneyMarket(new Profile(first,last), amount, new Date(0,0,0));
						
						if(database.deposit(dummyMM, amount))
						{
							System.out.println(amount + " deposited to account.");
						}
						else
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WC":
					if(cmdArray.length == 4)
					{
						//withdraw checing first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						Checking dummyChecking = new Checking(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						int withdrawResult = database.withdrawal(dummyChecking, amount);
						if(withdrawResult == 0)
						{
							System.out.println(amount + " withdrawn from the account.");
						}
						else if(withdrawResult == 1)
						{
							//if withdraw is over total account amount
							System.out.println("Insufficient funds.");
						}
						else if(withdrawResult == -1)
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WS":
					if(cmdArray.length == 4)
					{
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						Savings dummySavings = new Savings(new Profile(first,last), amount, new Date(0,0,0), loyal);
						
						int withdrawResult = database.withdrawal(dummySavings, amount);
						if(withdrawResult == 0)
						{
							System.out.println(amount + " withdrawn from the account.");
						}
						else if(withdrawResult == 1)
						{
							//if withdraw is over total account amount
							System.out.println("Insufficient funds.");
						}
						else if(withdrawResult == -1)
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WM":
					if(cmdArray.length == 4)
					{
						//withdraw money market first last amount'
						first = cmdArray[1];
						last = cmdArray[2];
						try
						{
							amount = Float.parseFloat(cmdArray[3]);
						}
						catch(NumberFormatException e)
						{
							System.out.println("Input data type mismatch.");
							break;
						}
						
						MoneyMarket dummyMM = new MoneyMarket(new Profile(first,last), amount, new Date(0,0,0));
						
						int withdrawResult = database.withdrawal(dummyMM, amount);
						if(withdrawResult == 0)
						{
							System.out.println(amount + " withdrawn from the account.");
						}
						else if(withdrawResult == 1)
						{
							//if withdraw is over total account amount
							System.out.println("Insufficient funds.");
						}
						else if(withdrawResult == -1)
						{
							System.out.println("Account does not exist.");
						}
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "PA":
					//print list of all acounts
					if(database.getSize() > 0)
					{
						System.out.println("--Listing accounts in the database--");
						database.printAccounts();
						System.out.println("--end of listing--");
					}
					else
					{
						System.out.println("Database is empty.");
					}
					break;
				case "PD":
					if(database.getSize() > 0)
					{
						System.out.println("--Printing statements by data opened--");
						database.printByDateOpen();
					}
					else
					{
						System.out.println("Database is empty.");
					}
					//calculate list of monthly intrests + fees
					//print account statements in sorted by opening dates
					break;
				case "PN":
					if(database.getSize() > 0)
					{
						System.out.println("--Printing statements by last name--");
						database.printByLastName();
					}
					else
					{
						System.out.println("Database is empty.");
					}
					break;
				case "Q":
					System.out.println("Transaction processing completed.");
					transacting = false;
					break;
				default:
					System.out.println("Command '" + cmdArray[0] + "' not supported!");
			}
		}
	}
	
}