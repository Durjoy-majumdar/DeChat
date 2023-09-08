package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.MenuItem;
import gy3.C87412m;
import nj3.C47269o0;
import nj3.C76875f0;
import qo3.C77407n;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f */
public final class C44254f implements C47269o0 {

    /* renamed from: a */
    public final /* synthetic */ C15133e0 f119917a;

    /* renamed from: b */
    public final /* synthetic */ C77407n f119918b;

    public C44254f(C15133e0 e0Var, C77407n nVar) {
        this.f119917a = e0Var;
        this.f119918b = nVar;
    }

    /* renamed from: a */
    public final void mo2584a(MenuItem menuItem, int i) {
        if (menuItem instanceof C76875f0) {
            C15133e0 e0Var = this.f119917a;
            C77407n nVar = this.f119918b;
            C87412m.m108591d(nVar);
            e0Var.m20(nVar, (C76875f0) menuItem, 3);
        }
    }
}
