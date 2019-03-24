package com.ravisha.state;

public class NoIntrestState implements State{
	private AccountContext context = null;
	private Account account = Account.getAccount();
	private static int INTREST_LIMIT = 1000; // Interest will come if balance is greater than this amount.



	public NoIntrestState(AccountContext context){
		this.context = context;
	}

	@Override
	public void deposit(int amount) {
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
		return currentBalance;
	}

	@Override
	public int getIntrest() {
		System.out.println("Amount not sufficient  to get Intrest");
		return 0;
	}
}
