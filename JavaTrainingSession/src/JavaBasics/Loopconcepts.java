package JavaBasics;

public class Loopconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//while loop
		//Disadvantage of while loop is it will generate infinte loop if you don't give incremmental/ decremental part
		int i = 0;//initialization
		while(i<=10) {//conditional
			System.out.println(i);
			i = i+1;//incremental or decremental path
		}
		
		//2. for loop
		//j++ means j+1
		for (int j=1;j<=10;j++) { //Initialization,Conditional,incremental
			System.out.println(j);
			
		}
		
		// prinrt 10 to 1
		
		for(int k=10;k>=-10;k--) { //Initialization,conditional,decremental
			System.out.println(k);
		}
		
		
	}

}
