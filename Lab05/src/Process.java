/*
 * Tyler Shatley
 * csce 146
 */
public class Process {
	
	private String name;
	private double completeTime;
	
	//default
	public Process() 
	{
		this.name = "blank";
		this.completeTime = 0.0;
	}
	
	//parametrized constructor
	public Process(String xName, double xcompleteTime) 
	{
		this.setName(xName);
		this.setcompleteTime(xcompleteTime);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getcompleteTime() 
	{
		return completeTime;
	}
	
	
	public void setName(String xName)
	{
		this.name = xName;
		
	}
	
	public void setcompleteTime(Double xcompleteTime) 
	{
		if(xcompleteTime >= 0)
		{
			this.completeTime= xcompleteTime;
		}
		else
		{
			this.completeTime = -1;
		}
	}
	
	public String toString() 
	{
		return "Process Name: " + this.name +" Completion Time: " + this.completeTime;
	}
}

