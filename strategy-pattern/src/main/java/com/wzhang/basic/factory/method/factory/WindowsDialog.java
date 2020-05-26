package com.wzhang.basic.factory.method.factory;

import com.wzhang.basic.factory.method.buttons.Button;
import com.wzhang.basic.factory.method.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
