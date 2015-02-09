package org.bean.java.test.pattern.observer;

import java.util.ArrayList;

public abstract class Subject<T> {

    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(T t) {
        for (Observer observer : observers) {
            if (observer != null) {
                observer.onChange(t);
            }
        }
    }
}
