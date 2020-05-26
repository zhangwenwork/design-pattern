package com.wzhang.basic.factory.method;

import com.wzhang.basic.factory.method.factory.Dialog;
import com.wzhang.basic.factory.method.factory.WindowsDialog;

public class Demo {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();

    }
}
