package com.tencent.p014mm.plugin.wepkg.model;

/* renamed from: com.tencent.mm.plugin.wepkg.model.p */
public class C44521p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WepkgCrossProcessTask f120739d;

    /* renamed from: e */
    public final /* synthetic */ C44488a f120740e;

    public C44521p(WepkgCrossProcessTask wepkgCrossProcessTask, C44488a aVar) {
        this.f120739d = wepkgCrossProcessTask;
        this.f120740e = aVar;
    }

    public void run() {
        this.f120739d.mo1553j();
        C44488a aVar = this.f120740e;
        if (aVar != null) {
            aVar.mo66027a(this.f120739d);
        }
    }
}
