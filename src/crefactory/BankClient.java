package crefactory;

public class BankClient {

	public static void main(String[] args) {
	  
		AccountConcreteCreator newaccount = new AccountConcreteCreator();
		BankAccountProduct A1 = newaccount.createBankAccount("CHECKING");
		A1.depositMoney(1000);
		A1.displayBalance();
		A1.withdrawMoney(500);
	    
		//AccountConcreteCreator newaccount1 = new AccountConcreteCreator();
		BankAccountProduct A2 = newaccount.createBankAccount("SAVINGS");
		A2.depositMoney(10);
		A2.displayBalance();
		A2.withdrawMoney(50);
		
	}

}
