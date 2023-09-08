package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.plugin.appbrand.media.record.record_imp.RecordParam;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.n */
public class C83641n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecordParam f244256d;

    /* renamed from: e */
    public final /* synthetic */ C83631l f244257e;

    public C83641n(C83631l lVar, RecordParam recordParam) {
        this.f244257e = lVar;
        this.f244256d = recordParam;
    }

    public void run() {
        synchronized (this.f244257e.f244224c) {
            C83631l lVar = this.f244257e;
            lVar.f244225d = this.f244256d;
            C83631l.m102665c(lVar);
        }
    }
}
