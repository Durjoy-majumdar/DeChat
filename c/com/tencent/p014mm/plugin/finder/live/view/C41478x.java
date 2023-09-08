package com.tencent.p014mm.plugin.finder.live.view;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.tencent.mm.plugin.finder.live.view.x */
public final class C41478x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C56081l f111698d;

    public C41478x(C56081l lVar) {
        this.f111698d = lVar;
    }

    public final void run() {
        this.f111698d.f159925g.requestFocus();
        C56081l lVar = this.f111698d;
        InputMethodManager inputMethodManager = (InputMethodManager) lVar.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(lVar.f159925g, 0);
        }
    }
}
