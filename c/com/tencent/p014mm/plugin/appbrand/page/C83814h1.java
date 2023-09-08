package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.h1 */
public class C83814h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f244658d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244659e;

    public C83814h1(C83780d1 d1Var, String str) {
        this.f244659e = d1Var;
        this.f244658d = str;
    }

    public void run() {
        C79808b bVar = this.f244659e.f244554F;
        if (bVar != null) {
            bVar.setForegroundStyle(this.f244658d);
            this.f244659e.mo116201v1(this.f244658d);
        }
    }
}
