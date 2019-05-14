/*
 * Tyler Shatley
 */
import java.util.*;
import java.io.*;
public class WordHelper {
	
	Word word = new Word();//new word
	private static int vowelCounter(String str)//method that counts the amount of vowels.
	{
		int vowelCount = 0;
		for(int i = 0; i < str.length(); i++)
		{
				if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || 
					str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
					str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'O' || 
					str.charAt(i) == 'u' || str.charAt(i) == 'U' ||
					str.charAt(i) == 'y' || str.charAt(i) == 'Y')
				{
					vowelCount++;
				}
		}
		return vowelCount;
	}

	public static String[] sortByVowels(String[] a)
	{
		SelectionSort ss = new SelectionSort();
		Word [] w = new Word[a.length];
		
		//this for loop creates an array of object-Word.
		for(int i = 0; i < a.length; i++)
		{
			Word ww = new Word();
			ww.setStr(a[i]);
			ww.setValue(vowelCounter(a[i]));
			w[i] = new Word(ww.getStr(),ww.getValue());
		}
		ss.selectionSort(w);
			
		for(int i = 0; i < a.length; i++)
		{
			a[i] = w[i].getStr();
		}
		return a;
	}
	
	private static int constCounter(String str)//method that counts the amount of consonants.
	{
		int constCount = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'A' && 
					str.charAt(i) != 'e' && str.charAt(i) != 'E' &&
					str.charAt(i) != 'i' && str.charAt(i) != 'I' &&
					str.charAt(i) != 'o' && str.charAt(i) != 'O' && 
					str.charAt(i) != 'u' && str.charAt(i) != 'U' &&
					str.charAt(i) != 'y' && str.charAt(i) != 'Y')
				constCount++;		
		}
		return constCount++;
	}
	
	public static String [] sortByConsonants(String [] a)
	{
		SelectionSort ss = new SelectionSort();
		Word [] w = new Word[a.length];
		
		
		for(int i = 0; i < a.length; i++)
		{
			Word ww = new Word();
			ww.setStr(a[i]);
			ww.setValue(constCounter(a[i]));
			w[i] = new Word(ww.getStr(),ww.getValue());
		}
		ss.selectionSort(w);
			
		for(int i = 0; i < a.length; i++)
		{
			a[i] = w[i].getStr();
		}
		return a;	
	}
		
	public static String [] sortByLength(String [] a)
	{
		SelectionSort ss = new SelectionSort();
		Word [] w = new Word[a.length];
		
		
		for(int i = 0; i < a.length; i++)
		{
			Word ww = new Word();
			ww.setStr(a[i]);
			ww.setValue(a[i].length());
			w[i] = new Word(ww.getStr(),ww.getValue());
		}
		ss.selectionSort(w);
			
		for(int i = 0; i < a.length; i++)
		{
			a[i] = w[i].getStr();
		}
		return a;
	}	
}
