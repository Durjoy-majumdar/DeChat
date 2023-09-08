package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.f1 */
public class C83801f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244651d;

    public C83801f1(C83780d1 d1Var) {
        this.f244651d = d1Var;
    }

    public void run() {
        C83780d1 d1Var = this.f244651d;
        if (d1Var.f244554F != null) {
            d1Var.mo116208z0(true);
            this.f244651d.f244554F.setFullscreenMode(true);
        }
    }
}
