package com.wzhang.basic.decorator.demo;

public class SlackNotifier extends BaseDecorator {

    public SlackNotifier(Notifier wrappee) {
        super(wrappee);
    }

    public void send(String alert){
        System.out.println("Slack!");
    }
}
