/*
Program: To print System properties
@author: sheetal soni
@Date: 18oct 2022  
*/

//declaring a class
class VersionDemo
{
	public static void main(String args[])
	{
		System.out.println("The java version is:"+System.getProperty("java.version"));
		System.out.println("The installation directory is:"+System.getProperty("java.home"));
	}// end of main

}// end of class AdditionDemo