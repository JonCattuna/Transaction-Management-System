/**
 * Profile class stores proiles to easily catgorize accounts
 *  @author Jonathan Cattuna, George Job
 *
 */

public class Profile {
	private String fname;
	private String lname;
	
	/**
	 * Creates profile object
	 * @param fname First name
	 * @param lname Last name
	 */
	public Profile(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	
	/**
	 * @return first name
	 */
	public String getFname()
	{
		return fname;
	}
	
	/**
	 * @return last name
	 */
	public String getLname()
	{
		return lname;
	}
}