package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//array concept is to store data type values in a array variable
		// Lowest bound index is 0
		// upper bound index = n-1(n is size of array)
		//one dimensional array
		
		
		
		//Disadvantages of array :
		// 1.size is fixed-- Static array: To overcome this we use collections --Arraylist,Hashtags--use dynamic array.
		//2. Stores only similar data types: To overcome this problem we use object array
		
		
		// 1. int array
		 int i[]= new int[4];
		 i[2]=10;
		 i[3]= 40;
		 i[0]= 20;
		 i[1]=25;
		 System.out.println(i[3]);
		 System.out.println(i[2]);
		 
		 //System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		 

		 System.out.println(i.length);//size/length of array
		
		 
		 // print all your values of array: use for loop
		 for(int j= 0;j<i.length; j++) {
			 System.out.println(i[j]);
			 
		 }
		 
		 //2.Double array:
		 
		 double d[]=new double[3];
		 d[0] = 12.33;
		 d[1] = 21.33;
		 d[2] = 33.21;
		 System.out.println(d[2]);
		 
		 //3. Char array
		 
		 char c[] = new char[3];
		 c[0] = 'r';
		 c[1] = '3';
		 c[2] = '$';
		 
		 System.out.println(c[1]);
		 
		 //4.Boolean Array
		 
		 boolean b[] = new boolean[2];
		 b[1] = true;
		 
		 System.out.println(b[1]);
		 
		 // 5.String array
		 String s[] = new String[3];
		 s[0] = "Test";
		 s[1]= "Hello World";
		 
		 System.out.println(s[1]);
		 
		 //6. Object array:
		 
		 Object ob[] = new Object[6];
		 ob[0] = "Tom";
		 ob[1] = 25;
		 ob[2] = 12.34;
		 ob[3] = "1/1/2019";
		 ob[4] = 'M';
		 ob[5]= "London";
		 
		 System.out.println(ob[5]);
		 System.out.println(ob.length);
		 
		 
		 

	}

}
