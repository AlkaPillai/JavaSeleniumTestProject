package oopConcceptPart1;

public class FunctionsinJava {
// main method is starting point of execution
	public static void main(String[] args) {
		//obj is the object reference name/variable to this object
		//new FunctionsinJava is the object 
		// After creating the object, the copy of all non static methods willbe given to this object  
		//main method is void never returns a value
		FunctionsinJava obj = new FunctionsinJava();
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String  s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30,10);
		System.out.println(div);
	}
	
	//non static methods
	//void means does not return a value
	
	public void test() {
		System.out.println("test method");//no input no output
	}
	
	// return type = int
	public int pqr() { //instead of void return type (here it is int)
		System.out.println("PQR method");//no input some output		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	
	public String qa() { //no input some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	// return type int
	//x and y are the input parameter or argument
	public int division (int x ,int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
	}

}
