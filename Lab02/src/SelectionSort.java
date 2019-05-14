/*
 * Tyler Shatley
 */
public class SelectionSort {
	
	public void selectionSort(Word [] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
	            int index = i;
	            for (int j = i + 1; j < a.length; j++)
	            {
	                if (a[j].getValue() < a[index].getValue()) 
	                {
	                	index = j;
	                }
	                else
	                {
	                	//do nothing
	                }
	            }
	      
	            Word smallerNumber = a[index];  
	            a[index] = a[i];
	            a[i] = smallerNumber;
	    }	
	}
}