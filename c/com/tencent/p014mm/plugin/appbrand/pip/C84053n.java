package com.tencent.p014mm.plugin.appbrand.pip;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.n */
public class C84053n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f245402d;

    /* renamed from: e */
    public final /* synthetic */ float f245403e;

    /* renamed from: f */
    public final /* synthetic */ C84048m f245404f;

    public C84053n(C84048m mVar, boolean z, float f) {
        this.f245404f = mVar;
        this.f245402d = z;
        this.f245403e = f;
    }

    public void run() {
        if (this.f245402d) {
            this.f245404f.f245397a.f245419e.mo117677q(this.f245403e);
        } else {
            this.f245404f.f245397a.f245419e.mo117670l();
        }
    }
}
