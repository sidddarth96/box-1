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
		int x= s.nextInt();
		System.out.println("enter a number");
		
		if(x%2==0)
		System.out.print("Even number");
		else if(x%2!=0)
		System.out.print("Odd number");
	}
}