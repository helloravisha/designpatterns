package com.ravisha.observer;

public class ConcreteObserverOne implements  Observer {

    private Subject subject = null;

    public ConcreteObserverOne(Subject subject){
        this.subject = subject;
    }

    @Override
    public void alert() {
        System.out.println("ALerted by Subject");
        subject.update("One");


    }
}
