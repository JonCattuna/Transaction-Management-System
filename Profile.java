/**
 * Profile class stores proiles to easily catgorize accounts
 * 
 *
 */
public class Profile
{
	private String fname;
	private String lname;
	/**
	 * creats the profile object
	 * @param fname
	 * @param lname
	 */
	public Profile(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	/**
	 * gets the first name from the account
	 * @return
	 */
	public String getFname()
	{
		return fname;
	}
	/**
	 * gets the last name from the account
	 * @return
	 */
	public String getLname()
	{
		return lname;
	}
	/**
	 * toString for testing
	 */
	public String toString()
	{
		return this.fname + "" + this.lname;
	}
}