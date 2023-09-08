package com.tencent.p014mm.p136ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.ui.l3 */
public class C74791l3 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C74793m3 f219915d;

    public C74791l3(C74793m3 m3Var) {
        this.f219915d = m3Var;
    }

    public void afterTextChanged(Editable editable) {
        if (editable == null || editable.length() <= 0) {
            this.f219915d.f219919f.setVisibility(8);
        } else {
            this.f219915d.f219919f.setVisibility(0);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
