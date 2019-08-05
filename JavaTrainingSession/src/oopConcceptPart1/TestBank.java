package oopConcceptPart1;

public class TestBank {

	public static void main(String[] args) {
		
		
		System.out.println(USBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//Dynamic polymorphism
		// Child class object can be reffered by parent Interface var
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		

	}

}
