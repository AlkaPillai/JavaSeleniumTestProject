package oopConcceptPart1;

public class StaticandNonStaticConcept {
	//Global variable: THe scope of global var will be available across all the functions "with some conditions"(like if its a static variable call them directly or by class name,if its non static create the object and call them 
	String name = "TIM";//nonstatic global variable
	static int age = 25;//static global variable
	

	public static void main(String[] args) {
		// how to call static method and vars?
		// direct method:
		sum();
		////2. calling by class name:
		
		StaticandNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticandNonStaticConcept.age);
		// how to call nonstatic methods and var:
		StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
		obj.sendMail();
		
		System.out.println(obj.name);
		
		//Can I access static method by using object reference: yes we can but we need to use as obj.
		 obj.sum();// but a warning will be given to access in a static way(its is not a good practice)
		 
		

	}
	
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}

}
