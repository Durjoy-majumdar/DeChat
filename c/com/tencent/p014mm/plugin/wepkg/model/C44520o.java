package com.tencent.p014mm.plugin.wepkg.model;

/* renamed from: com.tencent.mm.plugin.wepkg.model.o */
public class C44520o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44488a f120737d;

    /* renamed from: e */
    public final /* synthetic */ WepkgCrossProcessTask f120738e;

    public C44520o(C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f120737d = aVar;
        this.f120738e = wepkgCrossProcessTask;
    }

    public void run() {
        C44488a aVar = this.f120737d;
        if (aVar != null) {
            aVar.mo66027a(this.f120738e);
        }
        this.f120738e.mo114397h();
    }
}
