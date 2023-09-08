package com.tencent.p014mm.plugin.appbrand.page;

import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.page.f2 */
public final class C83802f2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83790e2 f244652d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83802f2(C83790e2 e2Var) {
        super(0);
        this.f244652d = e2Var;
    }

    public Object invoke() {
        ViewGroup.LayoutParams layoutParams = this.f244652d.f244639e.f233381m.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        this.f244652d.f244639e.f233381m.setVisibility(8);
        this.f244652d.f244639e.f233374f.setVisibility(0);
        return C13598b0.f38549a;
    }
}
