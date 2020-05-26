package com.wzhang.basic.factory.method.buttons;

public class WindowsButton  implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Window button on click");
    }
}
