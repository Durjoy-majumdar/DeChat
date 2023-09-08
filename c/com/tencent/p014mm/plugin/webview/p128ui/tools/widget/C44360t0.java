package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.widget.ScrollView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.C43513g0;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.t0 */
public final class C44360t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44341n0 f120215d;

    public C44360t0(C44341n0 n0Var) {
        this.f120215d = n0Var;
    }

    public final void run() {
        MMWebView C = this.f120215d.mo69079C();
        ScrollView scrollView = this.f120215d.f120172I;
        C87412m.m108591d(scrollView);
        C5843f0 f0Var = C5843f0.f22025a;
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new C43513g0(scrollView, C, C.getScale()));
    }
}
