package JavaBasics;

public class IfelseConcept {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		if (b> a) {
			System.out.println("It is greater than a");
			
			}
		else {
			System.out.println("It is greater than b");
		}
		//comparison operators < > <= <= != ==
		
		int c = 20;
		int d= 40;
		if (c==d) {
			System.out.println("c and d are equal");
		}
		
		else {
			System.out.println("its not equal");
		}
		
		// Write a logic to find out a highest number
		int a1=100;
		int b1= 300;
		int c1 =400;
		
		if (a1>b1 & a1>c1) {  //false&false=false
			System.out.println("a1 is greatest");
		}
		else if (b1>c1) {
			System.out.println(b1 is greatest);
		}
		else {
			System.out.println("c1 is greatest");
		}

	}

}
