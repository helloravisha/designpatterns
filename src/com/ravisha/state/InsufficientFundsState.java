package com.ravisha.state;

public class InsufficientFundsState implements  State{
	
	private AccountContext context = null;
	private Account account = null;
	private static int INTREST_LIMIT = 1000; // Interest will come if balance is greater than this amount.
	
	public InsufficientFundsState(AccountContext context){
		this.context = context;
		account = context.getAccount();
	}

	@Override
	public void deposit(int amount) {
		int currentBalance = account.getBalance()+amount;
		System.out.println("Amount deposited.."+amount);

		account.setBalance(currentBalance);
		if(currentBalance > INTREST_LIMIT ){
			context.setState(context.getIntrestState());
		}else if (currentBalance == 0 ){
			context.setState(context.getInsufficientFundsState());
		}else if (currentBalance > 0 ) {
			context.setState(context.getSufficientFundsState());
		}
		
	}

	@Override
	public int withdraw(int amount) {		
			System.out.println("No Amount to withdraw");
			return 0;
	}

	@Override
	public int getIntrest() {
		System.out.println("Amount not sufficient  to get Intrest");
		return 0;
	}

}
