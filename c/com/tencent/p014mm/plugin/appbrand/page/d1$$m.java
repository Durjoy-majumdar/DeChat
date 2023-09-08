package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$m */
public class d1$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f244605d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244606e;

    public d1$$m(C83780d1 d1Var, boolean z) {
        this.f244606e = d1Var;
        this.f244605d = z;
    }

    public void run() {
        C79808b bVar = this.f244606e.f244554F;
        if (bVar != null) {
            bVar.setLoadingIconVisibility(this.f244605d);
        }
    }
}
