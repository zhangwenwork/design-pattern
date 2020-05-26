package com.wzhang.basic.factory.method.buttons;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Mac button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Mac button on click ");
    }
}
