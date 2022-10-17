/*
progrm: To understand commandline arguments 
@author: sheetal soni
@Date: 14 oct 2022
*/

//declaring a class

class AdditionDemo
 {
   public static void main(String arags[])
   {
   // declaring local variables 
      int number1= Integer.parseInt(arags[0]);
      int number2= Integer.parseInt(arags[1]);
	    
	// calculating the sum 
      int sum = number1+ number2;
      System.out.println("The sum is :"+sum); //printing the value of sum 
	  
	  
	 } // end of main 
 
 } // end of class AdditionDemo 