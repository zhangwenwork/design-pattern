package com.wzhang.basic.factory.method.factory;

import com.wzhang.basic.factory.method.buttons.Button;
import com.wzhang.basic.factory.method.buttons.MacButton;

public class MacDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
