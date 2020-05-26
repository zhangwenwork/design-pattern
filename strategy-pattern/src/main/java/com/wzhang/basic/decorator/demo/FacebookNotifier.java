package com.wzhang.basic.decorator.demo;

public class FacebookNotifier extends BaseDecorator {

    public FacebookNotifier(Notifier wrappee) {
        super(wrappee);
    }

    public void send(String alert){
        System.out.println("Facebook!");
    }

}
