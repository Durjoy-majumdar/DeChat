package com.tencent.p014mm.plugin.voip.model;

import fy3.C32226l;

/* renamed from: com.tencent.mm.plugin.voip.model.g0$$l */
public final /* synthetic */ class g0$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l f82259d;

    /* renamed from: e */
    public final /* synthetic */ long f82260e;

    public /* synthetic */ g0$$l(C32226l lVar, long j) {
        this.f82259d = lVar;
        this.f82260e = j;
    }

    public final void run() {
        C32226l lVar = this.f82259d;
        long j = this.f82260e;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }
}
