package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.g1 */
public class C83807g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ double f244654d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244655e;

    public C83807g1(C83780d1 d1Var, double d) {
        this.f244655e = d1Var;
        this.f244654d = d;
    }

    public void run() {
        C79808b bVar = this.f244655e.f244554F;
        if (bVar != null) {
            bVar.setBackgroundAlpha(this.f244654d);
        }
    }
}
