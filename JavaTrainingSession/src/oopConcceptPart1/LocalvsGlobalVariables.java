package oopConcceptPart1;

public class LocalvsGlobalVariables {
	//Global variable = Class variable
	String name = "Tomy";
	int age = 34;
	

	public static void main(String[] args) {
		
		int i =10;//Local varaiable
		System.out.println(i);
		
		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	public void sum(){
		int i =10;
		int j = 29;
		int age = 22;
	}
	 

}
