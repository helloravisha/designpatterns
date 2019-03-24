package com.ravisha.state;

public class Account {
	
	int balance;
	private static Account account = null;
	public static Account getAccount(){
		if(account == null){
			account = new Account();
			
		}
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void setAccount(Account account) {
		Account.account = account;
	}
	
	

}
