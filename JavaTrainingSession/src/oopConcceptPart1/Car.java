package oopConcceptPart1;

public class Car {
	
	// class vars
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		
		//New car(): -- this is the object of car class
		// new keyword is used to create the object
		// a,b,c --> Object refferences variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2019;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel =4;
		
		c.mod = 2009;
		c.wheel = 4;
		
		System.out.println("Before assigning the references");
		System.out.println(a.mod);
		System.out.println(b.wheel);
		System.out.println(b.mod);
		
		
		System.out.println("after shifting the references");
		
		a = b;
		b = c;
		c = a;
		
		a.mod = 10;
		System.out.println(a.mod); //10
 
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);
		
		
		
		
		
	}

}
