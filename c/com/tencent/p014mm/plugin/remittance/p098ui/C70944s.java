package com.tencent.p014mm.plugin.remittance.p098ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.remittance.ui.s */
public class C70944s implements TextWatcher {
    public C70944s(RemittanceBaseUI remittanceBaseUI) {
    }

    public void afterTextChanged(Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 2) {
            editable.delete(indexOf + 3, length);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
