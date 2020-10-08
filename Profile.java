public class Profile
{
	private String fname;
	private String lname;
	
	public Profile(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname()
	{
		return fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public String toString()
	{
		return this.fname + "" + this.lname;
	}
}