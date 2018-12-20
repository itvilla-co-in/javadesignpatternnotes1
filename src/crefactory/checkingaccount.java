package crefactory;

public class checkingaccount extends BankAccountProduct
{
	private double accountBalance = 0.00;

	
	
	
	public checkingaccount() {
		
		  System.out.println("  CA Constructor : Creating a checking account   ");
	}

	@Override
	public void depositMoney(double depositAmount) {
	accountBalance += depositAmount;
	System.out.println("Bank ABC - Cheque Account : Deposit money "   + depositAmount);
		
	}

	@Override
	public void displayBalance() {
    System.out.println("Bank ABC - Cheque Account : Acount Balance " + accountBalance);
		
	}

	@Override
	public void withdrawMoney(double withdrawAmount) {
		 accountBalance -= withdrawAmount;
		    System.out.println("Bank ABC - Cheque Account : Withdraw money " + withdrawAmount);
		    
		
	}

}
