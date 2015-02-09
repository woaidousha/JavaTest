package org.bean.java.test.pattern.observer;

public interface Observer<T> {

    public void onChange(T t);

}
