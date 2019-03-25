package com.ravisha.state;

public class Account {
	
	int balance;
	private  Account account = null;
	public  Account getAccount(){
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
	public  void setAccount(Account account) {
		this.account = account;
	}
	
	

}
