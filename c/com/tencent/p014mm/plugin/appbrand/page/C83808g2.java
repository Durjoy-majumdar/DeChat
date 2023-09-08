package com.tencent.p014mm.plugin.appbrand.page;

import android.view.ViewGroup;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.g2 */
public final class C83808g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83790e2 f244656d;

    public C83808g2(C83790e2 e2Var) {
        this.f244656d = e2Var;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams = this.f244656d.f244639e.f233381m.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        this.f244656d.requestLayout();
    }
}
