package com.tencent.p014mm.wallet_core.p137ui;

import android.text.method.NumberKeyListener;

/* renamed from: com.tencent.mm.wallet_core.ui.b */
public class C75191b extends NumberKeyListener {
    public C75191b(EditHintView editHintView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    public int getInputType() {
        return 3;
    }
}
