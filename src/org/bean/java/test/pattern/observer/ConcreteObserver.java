package org.bean.java.test.pattern.observer;

public class ConcreteObserver implements Observer<String> {

    private String observerContent;

    @Override
    public void onChange(String s) {
        observerContent = s;
        System.out.println("observerContent : " + observerContent);
    }
}
