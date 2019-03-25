package com.ravisha.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer firstObserver = new ConcreteObserverOne(subject);
        Observer secondObserver = new ConcreteObserverTwo(subject);
        subject.register(firstObserver);
        subject.register(secondObserver);
        subject.notifyObservers();



    }
}
