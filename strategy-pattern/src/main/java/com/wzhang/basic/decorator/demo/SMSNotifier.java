package com.wzhang.basic.decorator.demo;

public class SMSNotifier extends BaseDecorator {

    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    public void send(String alert){
        System.out.println("Message!");
    }
}
