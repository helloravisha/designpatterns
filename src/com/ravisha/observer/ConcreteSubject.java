package com.ravisha.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach( observer -> { observer.alert(); });
    }

    @Override
    public void update(String observerName) {
        System.out.println("As subject alerted  observer "+ observerName+", "+observerName +" started processing.");
    }
}
