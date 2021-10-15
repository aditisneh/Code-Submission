/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public void uniqueString(String x, String y)
	{
	
		int i = 0;
		boolean Unique = false;
		System.out.print("\n Ans  : ");
	
		HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
		for (i = 0; i < x.length(); i++)
		{
			if (map.containsKey(x.charAt(i)) == false)
			{
				map.put(x.charAt(i), 1);
			}
		}
		// unique character in second string which is not exist in first
		for (i = 0; i < y.length(); i++)
		{
			if (map.containsKey(y.charAt(i)))
			{
				if (map.get(y.charAt(i)) == 1)
				{
					//  in both string
					map.put(y.charAt(i), 3);
				}
			}
			else
			{
				map.put(y.charAt(i), 2);
			}
		}
		// Print 
		for (Character key: map.keySet())
		{
			if (map.get(key) != 3)
			{
				System.out.print("  " + key);
				// character exists
				Unique = true;
			}
		}
		if (Unique == false)
		{
			System.out.print("\n Nothing common");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone obj = new Ideone();
		// Test case
		obj.uniqueString("LOS ANGELESO", "LAS VEGASV");
		
	}
}
