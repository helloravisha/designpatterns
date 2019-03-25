package com.ravisha.state;

public class IntrestState  implements   State {
	private AccountContext context = null;
	private Account account =null;
	private static int INTREST_LIMIT = 1000; // Interest will come if balance is greater than this amount.


	public IntrestState(AccountContext context){
		this.context = context;
		account = context.getAccount();
	}

	@Override
	public void deposit(int amount) {
        System.out.println("Amount deposited.."+amount);
        int currentBalance = account.getBalance()+amount;
		account.setBalance(currentBalance);
	}

	@Override
	public int withdraw(int amount) {
        System.out.println("Amount with drawn.."+amount);
        int currentBalance = account.getBalance()-amount;
		account.setBalance(currentBalance);
		if(currentBalance > 0 && currentBalance < INTREST_LIMIT ){
			context.setState(context.getSufficientFundsState());
		}else if(currentBalance <= 0){
            System.out.println("No more balance..");
            context.setState(context.getInsufficientFundsState());
		}
		return currentBalance;
	}

	@Override
	public int getIntrest() {
		// TODO Auto-generated method stub
		return 0;
	}
}
