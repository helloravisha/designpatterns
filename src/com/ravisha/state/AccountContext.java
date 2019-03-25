package com.ravisha.state;

public class AccountContext {
    private State state = null;


    private State sufficientFundsState = null;
    private State insufficientFundsState = null;
    private State intrestState = null;



    private Account account = null;


    public AccountContext(Account account) {

        this.account = account;
        sufficientFundsState = new SufficientFundsState(this);
        insufficientFundsState = new InsufficientFundsState(this);
        intrestState = new IntrestState(this);
        setState(insufficientFundsState);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSufficientFundsState() {
        return sufficientFundsState;
    }

    public Account getAccount() {
        return account;
    }

    public State getInsufficientFundsState() {
        return insufficientFundsState;
    }

    public State getIntrestState() {
        return intrestState;
    }


}
