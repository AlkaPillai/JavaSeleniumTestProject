package oopConcceptPart1;

public class CallByValueAndCallByRef {

	public static void main(String[] args) {
		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x,y);//Call by value or pass by value
		
		
		
	}
	public int testSum(int a,int b) {
		a= 5;
		b = 4;
		int c = a+ b;
		return c;
	}
	
}
