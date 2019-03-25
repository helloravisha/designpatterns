package com.ravisha.observer;

public class ConcreteObserverTwo implements  Observer {

    private Subject subject = null;


    public ConcreteObserverTwo(Subject subject){
        this.subject = subject;
    }

    @Override
    public void alert() {
        System.out.println("ALerted by Subject");
        subject.update("Two");
    }
}
