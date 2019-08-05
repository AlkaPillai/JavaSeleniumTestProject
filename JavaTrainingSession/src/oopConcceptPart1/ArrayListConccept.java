package oopConcceptPart1;

import java.util.ArrayList;
public class ArrayListConccept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);//1
		ar.add(200);//2
		ar.add(300);//3
		
		System.out.println(ar.size());
		
		ar.add(400);//4
		ar.add(500);//5
	
		
		System.out.println(ar.size());
		ar.add("Tom");//6
		ar.add("Hello");//7
		ar.add(12.33);//8
		ar.add("M");//9
		
		System.out.println(ar.size());
		
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		//System.out.println(ar.get(9));
		
		ar.remove(8);
		
		//To print all the values of ArraList: use for loop
		for (int i=0; i<ar.size(); i++) {
		System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100 );
		//ar1.add("Tom");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("TOM");
		//ar2.add(100);
		
		
		

	}

}
