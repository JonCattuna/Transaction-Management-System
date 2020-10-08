import java.util.Scanner;

public class TransactionManager 
{
	String first;
	String last;
	Float amount;
	boolean loyal;
	String date;
	private TransactionManager manager;
	private Account Saccount;
	private Account Caccount;
	private Account Maccount;
	//private AccountDatabase database;
	
	AccountDatabase database = new AccountDatabase();
	
	private TransactionManager()
	{
		manager = new TransactionManager();
	}
	
	/*private Account parseCommand(String[] cmdArray)
	{
		String first = cmdArray[1];
		String last = cmdArray[2];
		Float amount = Float.parseFloat(cmdArray[3]);
		boolean loyal = Boolean.parseBoolean(cmdArray[4]);
		return new Account(first, last, amount, loyal);
	}*/
	
	public void run()
	{
		System.out.println("Running manager");
		boolean transacting = true;
		while(transacting)
		{
			Scanner input = new Scanner(System.in);
			String cmd = input.nextLine();
			String[] cmdArray = cmd.split(" ");
			//Try {
			
			switch(cmdArray[0])
			{
				
				case "OC":
					if(cmdArray.length == 6)
					{
						//Opens checking account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						database.add(Caccount);
						System.out.println("Account opened and added to the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "OS":
					if(cmdArray.length == 6)
					{
						//Opens savings account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						database.add(Saccount);
						System.out.println("Account opened and added to the database.");
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
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						database.add(Maccount);
						System.out.println("Account opened and added to the database.");
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
						database.remove(Caccount);
						System.out.println("Account closed and removed from the database.");
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
						database.remove(Saccount);
						System.out.println("Account closed and removed from the database.");
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
						database.remove(Maccount);
						System.out.println("Account closed and removed from the database.");
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
						amount = Float.parseFloat(cmdArray[3]);
						database.deposit(Caccount, amount);
						System.out.println(/*amount + */"Deposited into the account.");
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
						amount = Float.parseFloat(cmdArray[3]);
						database.deposit(Saccount, amount);
						System.out.println(/*amount + */"Deposited into the account.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DM":
					if(cmdArray.length == 4)
					{
						//deposit to money market first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						database.deposit(Maccount, amount);
						System.out.println(/*amount + */"Deposited into the account.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WC":
					if(cmdArray.length == 3)
					{
						//withdraw checing first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						database.withdrawal(Caccount, amount);
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WS":
					if(cmdArray.length == 3)
					{
						//withdraw savings first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						database.withdrawal(Saccount, amount);
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WM":
					if(cmdArray.length == 3)
					{
						//withdraw money market first last amount'
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						database.withdrawal(Maccount, amount);
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "PA":
					//print list of all acounts
					System.out.println("--Listing accounts in the database--");
					database.printAccounts();
					System.out.println("--end of listing--");
					break;
				case "PD":
					System.out.println("--Printing statements by data opened--");
					database.printByDateOpen();
					//calculate list of monthly intrests + fees
					//print account statements in sorted by opening dates
					break;
				case "PN":
					System.out.println("--Printing statements by last name--");
					
					database.printByLastName();
					//Same as PD, but sorted bt last names in acending order
					break;
				case "Q":
					System.out.println("Transaction processing completed.");
					transacting = false;
					break;
				default:
					System.out.println("Invalid Command");
					
					
				/*	
				catch(NumberFormatException e)
				{
					System.out.println("Number format mismatch");
				}
				catch (InputMismatchException e)
				{
					System.out.println("Input data type mismatch");
				}
				
				catch (Exception e)
				{
					System.out.println("Invalid Command");
				}	
				*/
				
				
			}
			//}
		}
	}
	
}