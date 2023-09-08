package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.h */
public final class C55462h extends C87413o implements C32224a<C68595k> {

    /* renamed from: d */
    public final /* synthetic */ C55463j f158035d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55462h(C55463j jVar) {
        super(0);
        this.f158035d = jVar;
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C68595k kVar = new C68595k(context);
        C55463j jVar = this.f158035d;
        kVar.setOnClickListener(new C55460f(jVar));
        kVar.setOnTouchListener(new C55461g(kVar, jVar));
        return kVar;
    }
}
