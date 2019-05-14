/*
 * Tyler Shatley
 * csce 146
 * lab02
 */
public class mergeSort {
	
	public static void mergeSort(Word [] a)
	{
		int size = a.length;
		if(size < 2)
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		Word [] left = new Word[leftSize];
		Word [] right = new Word[rightSize];
		
		for(int i = 0; i < leftSize; i++)
			left[i] = a[i];
		
		for(int i = mid; i < size; i++)
			right[i-mid] = a[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	
	public static void merge(Word [] left, Word [] right, Word[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//left index
		int j = 0; //right index
		int k = 0; //a index
		
		while(i < leftSize && j < rightSize)
		{
			if(left[i].getValue() <= right[j].getValue())
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public int mergeCount(Word [] left, Word [] right, Word[] a)
	{
		int count = 0;
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//left index
		int j = 0; //right index
		int k = 0; //a index
		
		while(i < leftSize && j < rightSize)
		{
			if(left[i].getValue() <= right[j].getValue())
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			count++;
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			count++;
			a[k] = right[j];
			j++;
			k++;
		}
		return count;
	}
	
	
	public void printMergeSort(int [] a)
	{
		System.out.println("Array in order brought to you by, mergeSort.");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}	
}

