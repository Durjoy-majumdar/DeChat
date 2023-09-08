package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.notification.base.b */
public class C115641b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115642c f346887d;

    public C115641b(C115642c cVar) {
        this.f346887d = cVar;
    }

    public void run() {
        C115669n.INSTANCE.mo160131h(11425, Integer.valueOf(this.f346887d.f346888a.mo56033k()), 2, 0, 0);
        this.f346887d.f346888a.mo175846a();
        this.f346887d.f346888a.mo175849l();
        this.f346887d.f346888a.mo175855v();
        this.f346887d.f346888a.f346877b.mo175868a();
    }
}
