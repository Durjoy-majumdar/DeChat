package com.tencent.p014mm.plugin.wepkg.model;

/* renamed from: com.tencent.mm.plugin.wepkg.model.q */
public class C44522q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44488a f120741d;

    /* renamed from: e */
    public final /* synthetic */ WepkgCrossProcessTask f120742e;

    public C44522q(C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f120741d = aVar;
        this.f120742e = wepkgCrossProcessTask;
    }

    public void run() {
        C44488a aVar = this.f120741d;
        if (aVar != null) {
            aVar.mo66027a(this.f120742e);
        }
        this.f120742e.mo114397h();
    }
}
