package com.wzhang.basic.decorator.demo;

public abstract class BaseDecorator extends Notifier{

    private Notifier wrappee;


    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }


    public void send(String alert) {
        super.send(alert);
        wrappee.send(alert);
    }
}
