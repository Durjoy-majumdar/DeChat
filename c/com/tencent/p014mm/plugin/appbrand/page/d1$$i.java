package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$i */
public class d1$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f244598d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244599e;

    public d1$$i(C83780d1 d1Var, int i) {
        this.f244599e = d1Var;
        this.f244598d = i;
    }

    public void run() {
        C79808b bVar = this.f244599e.f244554F;
        if (bVar != null) {
            bVar.setBackgroundColor(this.f244598d);
        }
    }
}
