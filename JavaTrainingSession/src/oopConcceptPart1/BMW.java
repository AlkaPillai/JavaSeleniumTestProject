package oopConcceptPart1;

public class BMW extends Cars{ //Has a relationship(Clcass - class relationship)
	
	//When  method is present in parent class as well as in Child class with the same name and number of arguments 
	//it is called Method Overriding
	public void start() { // Overridden method
		System.out.println("BMW Car start...");
	}
 
	public void theftSafety() {
		System.out.println("BMW ...Theft safety....");
	}
}
