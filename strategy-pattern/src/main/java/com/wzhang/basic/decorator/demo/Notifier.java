package com.wzhang.basic.decorator.demo;

public abstract class Notifier {
    public Notifier() {
    }

    public void send(String alert) {
        System.out.println(alert);
    }
}
