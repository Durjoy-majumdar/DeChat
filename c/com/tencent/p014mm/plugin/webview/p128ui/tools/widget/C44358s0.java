package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.widget.ScrollView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.s0 */
public final class C44358s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44341n0 f120213d;

    public C44358s0(C44341n0 n0Var) {
        this.f120213d = n0Var;
    }

    public final void run() {
        C44341n0 n0Var = this.f120213d;
        ScrollView scrollView = n0Var.f120172I;
        if (scrollView != null) {
            scrollView.scrollTo(n0Var.mo69079C().getWebScrollX(), this.f120213d.mo69079C().getWebScrollY());
        }
    }
}
