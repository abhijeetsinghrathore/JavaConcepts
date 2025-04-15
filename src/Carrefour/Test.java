package Carrefour;

import java.util.Arrays;

public class Test {
	
	public static void main(String args[])
	{
		int[] a = {2,6,4}; // get the min
		int[] b = {9,7,5}; // get the min
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.length!=b.length)
		{
			System.out.println("Trnsaformation not possible");
		}
		else
		{
			int diff = b[0]-a[0];
			System.out.println(diff);
			
		}
	}

}
