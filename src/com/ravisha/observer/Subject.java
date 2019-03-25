package com.ravisha.observer;

public interface Subject {

    public void  register(Observer observer);
    public void notifyObservers();
    public void update(String observerName);
}
