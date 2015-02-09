package org.bean.java.test.pattern.observer;

public class ConcreteSubject extends Subject<String> {

    String content;

    public void setContent(String content) {
        this.content = content;
        notifyObservers(content);
    }

}
