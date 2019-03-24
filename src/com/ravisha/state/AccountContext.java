package com.ravisha.state;

public class AccountContext {
  private State state = null;
  private State noIntrestState = null; 
  private State insufficientFundsState = null; 
  private State intrestState = null; 


  
  public AccountContext(){
	  noIntrestState = new NoIntrestState(this);
	  insufficientFundsState = new NoIntrestState(this);
	  intrestState = new NoIntrestState(this);
  }

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

public State getNoIntrestState() {
	return noIntrestState;
}

public State getInsufficientFundsState() {
	return insufficientFundsState;
}

public State getIntrestState() {
	return intrestState;
}


  
}
