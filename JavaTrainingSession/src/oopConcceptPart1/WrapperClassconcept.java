package oopConcceptPart1;

public class WrapperClassconcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer,double,boolean
		
		//String to double conversion
		String y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		// String to Boolean
		String k = "true";
		boolean t = Boolean.parseBoolean(k);
		System.out.println(t);
		
		//Int to string conversion
		int j= 200;
		System.out.println(j+20);
		String r = String.valueOf(j);//200
		System.out.println(r);
		System.out.println(r+20);
		
		String u = "100A";

		Integer.parseInt(u);//NumberFormatException Error will give- for input 100A
		
		

	}

}
