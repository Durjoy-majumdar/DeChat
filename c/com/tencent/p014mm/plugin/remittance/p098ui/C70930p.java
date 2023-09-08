package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.tencent.mm.plugin.remittance.ui.p */
public class C70930p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditText f205375d;

    /* renamed from: e */
    public final /* synthetic */ C70900k f205376e;

    public C70930p(C70900k kVar, EditText editText) {
        this.f205376e = kVar;
        this.f205375d = editText;
    }

    public void run() {
        this.f205375d.requestFocus();
        ((InputMethodManager) this.f205376e.f205319a.getSystemService("input_method")).showSoftInput(this.f205375d, 0);
    }
}
