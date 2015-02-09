package org.bean.java.test.pattern.observer;

public class Main {

    public static void main(String args[]) {
        Observer observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.attach(observer);
        ((ConcreteSubject) subject).setContent("test");
        subject.detach(observer);
    }

}
