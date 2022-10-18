/*
Program: To understand instanceOf operator
@author: sheetal soni
@Date: 18oct 2022  
*/


//declaring a class
class Car
{
	public static void main(String args[])
	{
		//creating car object
		Car BMWCar = new Car();
		Car Audi=null;
		//Audi = new Car();
		
		//checking whether it is an instanceOf
		
		System.out.println(BMWCar instanceof Car);
		System.out.println(Audi instanceof Car);
		
		// boolean
	}// end of main
}// end of class 