package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.u */
public class C96744u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f283389d;

    /* renamed from: e */
    public final /* synthetic */ boolean f283390e;

    public C96744u(C96728e0 e0Var, View view, boolean z) {
        this.f283389d = view;
        this.f283390e = z;
    }

    public void run() {
        this.f283389d.setPressed(this.f283390e);
    }
}
