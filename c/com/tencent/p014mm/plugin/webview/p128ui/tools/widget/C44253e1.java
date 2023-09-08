package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.inputmethod.InputMethodManager;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.e1 */
public final class C44253e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44366w0 f119916d;

    public C44253e1(C44366w0 w0Var) {
        this.f119916d = w0Var;
    }

    public final void run() {
        C44366w0.m48736e(this.f119916d);
        Object systemService = this.f119916d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f119916d.f120265z, 0);
    }
}
