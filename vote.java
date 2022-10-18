/*
Program: To Check Eligible For Vote
@author: sheetal soni
@Date: 18oct 2022  
*/
//importing packages

import java.util.Scanner;

//declaring a class
class vote
{
	public static void main(String args[])
	{
		//creating variables
		int age;
		System.out.println("Enter Your Age");
		Scanner r=new Scanner(System.in);
		
		// creating variables
	    age= r.nextInt();
				
		if(age>=18)
			System.out.println("Eligible for votes");
		else
		{
		   System.out.println("Not Eligible for votes");
	    }
	}// end of main
	
}// end of class 