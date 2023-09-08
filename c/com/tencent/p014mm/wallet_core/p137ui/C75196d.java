package com.tencent.p014mm.wallet_core.p137ui;

import android.text.method.NumberKeyListener;

/* renamed from: com.tencent.mm.wallet_core.ui.d */
public class C75196d extends NumberKeyListener {
    public C75196d(EditHintView editHintView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    public int getInputType() {
        return 18;
    }
}
