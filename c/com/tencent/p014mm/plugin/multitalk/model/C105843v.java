package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.app.AppForegroundDelegate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.v */
public final class C105843v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105825p f314793d;

    /* renamed from: e */
    public final /* synthetic */ boolean f314794e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105843v(C105825p pVar, boolean z) {
        super(0);
        this.f314793d = pVar;
        this.f314794e = z;
    }

    public Object invoke() {
        this.f314793d.mo150812g();
        if (this.f314794e) {
            AppForegroundDelegate.INSTANCE.mo174209b(this.f314793d.f314754s);
        }
        return C13598b0.f38549a;
    }
}
