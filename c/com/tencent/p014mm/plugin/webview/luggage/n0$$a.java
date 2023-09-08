package com.tencent.p014mm.plugin.webview.luggage;

import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$a */
public final /* synthetic */ class n0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43661n0 f22258d;

    /* renamed from: e */
    public final /* synthetic */ boolean f22259e;

    public /* synthetic */ n0$$a(C43661n0 n0Var, boolean z) {
        this.f22258d = n0Var;
        this.f22259e = z;
    }

    public final void run() {
        LinearLayout linearLayout;
        C43661n0 n0Var = this.f22258d;
        boolean z = this.f22259e;
        if (n0Var.f117992e != null && (linearLayout = n0Var.f117999o) != null) {
            if (z) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }
}
