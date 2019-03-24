package com.ravisha.state;

public interface State {
   	
   public void deposit(int amount);
   public int withdraw(int amount);
   public int getIntrest();
}
