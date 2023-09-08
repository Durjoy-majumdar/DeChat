package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.tencent.mm.plugin.remittance.ui.l */
public class C70908l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditText f205335d;

    /* renamed from: e */
    public final /* synthetic */ C70900k f205336e;

    public C70908l(C70900k kVar, EditText editText) {
        this.f205336e = kVar;
        this.f205335d = editText;
    }

    public void run() {
        this.f205335d.requestFocus();
        ((InputMethodManager) this.f205336e.f205319a.getSystemService("input_method")).showSoftInput(this.f205335d, 0);
    }
}
