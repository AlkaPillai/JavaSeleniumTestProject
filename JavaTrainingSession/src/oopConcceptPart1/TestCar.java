package oopConcceptPart1;

public class TestCar {

	public static void main(String[] args) {
		
		//Static polymorphism -- compile time polymorphism
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		
		b.theftSafety();
		b.engine();
		
		System.out.println("/////////////////////");
		
		Cars c= new Cars();
		c.start();
		c.stop();
		c.refuel();
		/////////////
		System.out.println("////////////");
		
		//Top casting
		Cars c1 = new BMW();// Child class object can be reffered
		// by parent class reference variable--dynamic polymorphism--run time polymorphism
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting is possible but will give the error
		BMW b1 = (BMW) new Cars();//class Cast Exception error
		BMW b1 = (BMW) new Cars();
		
		

	}

}
