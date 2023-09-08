package com.tencent.p014mm.plugin.recharge.p093ui;

import android.text.method.NumberKeyListener;

/* renamed from: com.tencent.mm.plugin.recharge.ui.b */
public class C70452b extends NumberKeyListener {
    public C70452b(MallEditText mallEditText) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' '};
    }

    public int getInputType() {
        return 3;
    }
}
