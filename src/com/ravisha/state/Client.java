package com.ravisha.state;

public class Client {
    public static void main(String[] args) {

        AccountContext accountContext = new AccountContext(new Account());
        accountContext.getState().deposit(10);
        System.out.println("Current State --> "+accountContext.getState().getClass().getSimpleName());
        accountContext.getState().deposit(995);
        System.out.println("Current State --> "+accountContext.getState().getClass().getSimpleName());
        accountContext.getState().withdraw(1005);
        System.out.println("Current State --> "+accountContext.getState().getClass().getSimpleName());
        accountContext.getState().deposit(10);
        System.out.println("Current State --> "+accountContext.getState().getClass().getSimpleName());
        accountContext.getState().deposit(1005);
        System.out.println("Current State --> "+accountContext.getState().getClass().getSimpleName());











    }
}
