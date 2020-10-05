
import java.util.Scanner;

public class TransactionManager 
{
	private TransactionManager manager;
	
	
	public TransactionManager()
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
			String[] cmdArray = cmd.split("");
			
			switch(cmdArray[0])
			{
				case "OC":
					//Opens checking account with first last amount loyal
					System.out.println("Account opened and added to the database.");
					break;
				case "OS":
					//Opens savings account with first last amount loyal
					System.out.println("Account opened and added to the database.");
					break;
				case "OM":
					//Opens money market account with first last amount
					System.out.println("Account opened and added to the database.");
					break;
				case "CC":
					//Close checking account with first last
					System.out.println("Account closed and removed from the database.");
					break;
				case "CS":
					//close savings account with first last
					System.out.println("Account closed and removed from the database.");
					break;
				case "CM":
					//close money market amount with first last
					System.out.println("Account closed and removed from the database.");
					break;
				case "DC":
					//depoist to checking first last amount
					System.out.println(/*amount + */"Deposited into the account.");
					break;
				case "DS":
					//deposit to savings first last amount
					System.out.println(/*amount + */"Deposited into the account.");
					break;
				case "DM":
					//deposit to money market first last amount
					System.out.println(/*amount + */"Deposited into the account.");
					break;
				case "WC":
					//withdraw checing first last amount
					System.out.println(/*amount + */"withdrawn from the account.");
					//if withdraw is over total account amount
					System.out.println("Insufficient funds");
					break;
				case "WS":
					//withdraw savings first last amount
					System.out.println(/*amount + */"withdrawn from the account.");
					//if withdraw is over total account amount
					System.out.println("Insufficient funds");
					break;
				case "WM":
					//withdraw money market first last amount'
					System.out.println(/*amount + */"withdrawn from the account.");
					//if withdraw is over total account amount
					System.out.println("Insufficient funds");
					break;
				case "PA":
					//print list of all acounts
					System.out.println("--Listing accounts in the database--");
					
					System.out.println("--end of listing--");
					break;
				case "PD":
					System.out.println("--Printing statements by data opened--");
					//calculate list of monthly intrests + fees
					//print account statements in sorted by opening dates
					break;
				case "PN":
					System.out.println("--Printing statements by last name--");
					//Same as PD, but sorted bt last names in acending order
					break;
				case "Q":
					System.out.println("Transaction processing completed.");
					transacting = false;
					break;
				default:
					System.out.println("Invalid Command");
			}
		}
	}
	
}
