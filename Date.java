/**
 * Date class to save the date each account was opened and closed
 * @author Jonathan Cattuna, George Job
 *
 */

public class Date implements Comparable<Date>
{
	private int year;
	private int month;
	private int day;
	
	/**
	 * Creates a date object
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int month, int day, int year)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Date date)
	{ 
		
		if(this.year == date.year)
		{
			if(this.month == date.month)
				return this.day > date.day ? 1 : this.day < date.day ? -1 : 0;
			else
				return this.month > date.month ? 1 : this.month < date.month ? -1 : 0;
		}
		else
		{
			return this.year > date.year ? 1 : this.year < date.year ? -1 : 0;
		}		
	} //return 0, 1, or -1
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{ 
		return month + "/" + day + "/" + year;
	} //in the format mm/dd/yyyy
	
	/**
	 * Determines whether or not a date is a valid date
	 * @return true if date is valid, false if date is not valid
	 */
	public boolean isValid() 
	{
		if(month == 2)
		{
			if(year % 4 == 0)
			{
				return year >= 0 && year <= 2020 && month >= 1 && month <= 12 && day >= 1 && day <= 29;
			}
			else
			{
				return year >= 0 && year <= 2020 && month >= 1 && month <= 12 && day >= 1 && day <= 28;
			}
		}
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return year >= 0 && year <= 2020 && month >= 1 && month <= 12 && day >= 1 && day <= 31;
		}
		else
		{
			return year >= 0 && year <= 2020 && month >= 1 && month <= 12 && day >= 1 && day <= 30;
		}
	}
}