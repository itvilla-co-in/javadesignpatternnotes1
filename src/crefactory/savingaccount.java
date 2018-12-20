package crefactory;

public class savingaccount extends BankAccountProduct
{
	private double accountBalance = 0.00;

	
	
	
	public savingaccount() {
		
		  System.out.println("  CA Constructor : Creating a saving account   ");
	}

	@Override
	public void depositMoney(double depositAmount) {
	accountBalance += depositAmount;
	System.out.println("Bank ABC - Cheque Account : Deposit money "   + depositAmount);
		
	}

	@Override
	public void displayBalance() {

		System.out.println("Saving account does not have this feature");
		
	}

	@Override
	public void withdrawMoney(double withdrawAmount) {
		 accountBalance -= withdrawAmount;
		    System.out.println("Bank ABC - Cheque Account : Withdraw money " + withdrawAmount);
		    
		
	}

}
