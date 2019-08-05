package oopConcceptPart1;

public class HSBCBank implements USBank, BrazilBank { //we are achieving multiple inheritance
// This relation is called "Is a relationship" interface to class
	//If a class is implementing any interface,then its mandatory to define/ override all the methods of interface
	//Overriding from USBank
	public void credit() {
		System.out.println("HSBC....");
	}
	public void debit() {
		System.out.println("HSBC debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC Money transfer");
		
	}
// Separate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc Loan");
	}
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
	
	//Brazil bank method:Overiding from brazilbank
	public void mutualFund() {
		System.out.println("HSBC mutual fund");
	}
	
}
