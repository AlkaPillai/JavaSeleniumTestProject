package oopConcceptPart1;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C" , "World");
		h.put("D" , "Arrow");
		
		System.out.println(h.size());
		
		
		h.put(1,100);
		h.put(2,400);
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3,"Tom");
		
		Hashtable<Integer,Integer> h = new Hashtable<Integer,Integer>();
  
		h.put(1,100);
		//h.put("A",300);
		
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();

		h.put(3,"P");
		
	}

}
