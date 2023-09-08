package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.n */
public final class C81713n extends C87413o implements C32224a<C81707l> {

    /* renamed from: d */
    public final /* synthetic */ C81717t f239821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81713n(C81717t tVar) {
        super(0);
        this.f239821d = tVar;
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C81717t tVar = this.f239821d;
        return new C81707l(context, tVar.f239825a, tVar.f239826b);
    }
}
