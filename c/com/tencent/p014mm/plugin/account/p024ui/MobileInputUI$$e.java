package com.tencent.p014mm.plugin.account.p024ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$e */
public class MobileInputUI$$e implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f344715d;

    public MobileInputUI$$e(MobileInputUI mobileInputUI) {
        this.f344715d = mobileInputUI;
    }

    public void afterTextChanged(Editable editable) {
        this.f344715d.f344701r.setEnabled(true);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
