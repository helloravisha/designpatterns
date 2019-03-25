package com.ravisha.state;

public class SufficientFundsState implements State{
	private AccountContext context = null;
	private Account account = null;
	private static int INTREST_LIMIT = 1000; // Interest will come if balance is greater than this amount.



	public SufficientFundsState(AccountContext context){
		this.context = context;
		this.account = context.getAccount();
	}

	@Override
	public void deposit(int amount) {
        System.out.println("Amount deposited.."+amount);
        int currentBalance = account.getBalance()+amount;
		account.setBalance(currentBalance);
		if(currentBalance > INTREST_LIMIT ){
			context.setState(context.getIntrestState());
		}
		
	}

	@Override
	public int withdraw(int amount) {
		int currentBalance = account.getBalance()-amount;
		account.setBalance(currentBalance);
		if(currentBalance > INTREST_LIMIT ){
			context.setState(context.getIntrestState());
		}
		if(currentBalance <= 0 ){
			context.setState(context.getInsufficientFundsState());
		}
		return currentBalance;
	}

	@Override
	public int getIntrest() {
		System.out.println("Amount not sufficient  to get Intrest");
		return 0;
	}
}
