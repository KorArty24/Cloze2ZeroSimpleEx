/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


import acm.program.*;
import acm.util.RandomGenerator;

public class Java_Exercise4 extends ConsoleProgram  {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static int LOWERLIMIT  = -100;
	private static int UPPERLIMIT = 100;
	public void run() {
	int numelements = rgen.nextInt(5, 10);	
	int myarr[]=  new int[numelements];
	for (int i=0; i < numelements; i++) {
		myarr[i]=rgen.nextInt(-100, 100);
	}
	int close=FindClosest(myarr);
	println(close);
}
public static int FindClosest(int[] arr) 
{
	int closest = Integer.MAX_VALUE;
	int num=0;
	for (int i=0; i<arr.length; i++) {
		int distance = Math.abs(0-arr[i]);
		if (closest> distance)
		{
			closest=distance;
			num=i;
		} 
		else if (closest == distance) 
		{
			if (arr[num]>arr[i]) 
			{ 
				num=i;
			} 
			else if (arr[num]<arr[i]) 
			{
					num=i;
			} 
			else
			{
				  num=i;
			}
		}
	}
	return arr[num];
}
}
	
		
		
	
	



