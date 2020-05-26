package com.wzhang.basic.decorator.demo;

public class Application {
    private Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }


    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSth(){
        notifier.send("Alert");
    }
}
