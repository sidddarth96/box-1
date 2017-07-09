/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
	
		System.out.println("enter the  numbers:");
		int x1= s.nextInt();
		System.out.println("enter the  numbers:");
			int x2=s.nextInt();
		System.out.println("enter the  numbers:");
		int x3=s.nextInt();
	int large;	
	large=x1;
	if(x2>large)
	large=x2;
	if(x3>large)
	large=x3;
	System.out.print("the largest number is:" +large);
	}
}