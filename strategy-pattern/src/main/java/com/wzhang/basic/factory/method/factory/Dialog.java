package com.wzhang.basic.factory.method.factory;

import com.wzhang.basic.factory.method.buttons.Button;

public abstract class Dialog {

    public void render() {
        Button okButton = createButton();
        okButton.render();

    }

    public abstract Button createButton();
}
