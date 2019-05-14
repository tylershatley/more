/*
 * Tyler Shatley
 */
public class Word {
	
	private String str;
	private int value;
	
	//default constructor 
	public Word()
	{
		this.str = "no";
		this.value = 0;
	}
	
	//paramterrized constructor
	public Word(String xStr, int xValue)
	{
		this.setStr(xStr);
		this.setValue(xValue);
	}
	
	public String getStr() 
	{
		return str;
	}

	public void setStr(String str) 
	{
		this.str = str;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setValue(int xValue)
	{
		if(xValue >= 0)
		{
			this.value = xValue;
		}
	}
	
	public String toString()
	{
		return this.str + " " + this.value;
	}
}
