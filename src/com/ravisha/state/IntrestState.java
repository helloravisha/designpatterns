package com.ravisha.state;

public class IntrestState  implements   State {
	private AccountContext context = null;
	private Account account = Account.getAccount();
	private static int INTREST_LIMIT = 1000; // Interest will come if balance is greater than this amount.


	public IntrestState(AccountContext context){
		this.context = context;
	}

	@Override
	public void deposit(int amount) {
		int currentBalance = account.getBalance()+amount;
		account.setBalance(currentBalance);
	}

	@Override
	public int withdraw(int amount) {
		int currentBalance = account.getBalance()-amount;
		account.setBalance(currentBalance);
		if(currentBalance > 0 && currentBalance < INTREST_LIMIT ){
			context.setState(context.getNoIntrestState());
		}
		return currentBalance;
	}

	@Override
	public int getIntrest() {
		// TODO Auto-generated method stub
		return 0;
	}
}
