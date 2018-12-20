package crefactory;

public class AccountConcreteCreator extends AccountCreator
{

	@Override
	public BankAccountProduct createBankAccount(String accountType) {
		 
		if ("CHECKING".equals(accountType)) 
		    {
		      return new checkingaccount();

		    } else 
		  if ("SAVINGS".equals(accountType)) {
		      return new savingaccount();

		    } else {
		      return null;
		    }
		 
	
	}

}
