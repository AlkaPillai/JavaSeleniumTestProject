package oopConcceptPart1;

public class CallbyValueandCallbyReference {
	int p = 11;
	int q = 12;
	

	public static void main(String[] args) {
		
		CallbyValueandCallbyReference obj = new CallbyValueandCallbyReference();
		int x= 4;
		int y= 5;
		
		
		obj.testSum(x,y);//Call by value or pass by value
		obj.p = 11;
		obj.q = 15;
		
		obj.swap(obj);
		//After swap 
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int testSum(int a,int b) {
		a= 1;
		b= 2;
		int c = a+b;
		return c;
	}
	//Call by reference or pass by reference
	public void swap(CallbyValueandCallbyReference t) {
		int temp;
		temp = t.p;//temp = 11
		t.p = t.q;// t.p = 15
		t.q = temp;//t.q = 11
		
		
		
	}
}
