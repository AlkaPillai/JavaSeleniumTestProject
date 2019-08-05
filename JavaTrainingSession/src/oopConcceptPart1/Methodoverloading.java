package oopConcceptPart1;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(12,24);



	}
	//Method Overloading when the method name is same with different arguments or input parameters 
	//within the same class.
	
	public void sum() {//zero input
		System.out.println("Sum method -zero parameter");
	}
	public void sum(int i) {//1 input
		System.out.println("sum method");
		System.out.println(i);
		
	}public void sum(int k,int l) {//2 input parameters
		System.out.println("sum methods");
		System.out.println(k+l);
	}

}
