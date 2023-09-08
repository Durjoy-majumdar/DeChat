package com.tencent.p014mm.plugin.appbrand.report.quality;

import p170ic.C87690d;
import p935cb.C79990l;
import p935cb.C79991m;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.c */
public class C84189c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ QualitySessionRuntime f245926d;

    public C84189c(QualitySessionRuntime qualitySessionRuntime) {
        this.f245926d = qualitySessionRuntime;
    }

    public void run() {
        QualitySessionRuntime qualitySessionRuntime = this.f245926d;
        C79991m.C79992a aVar = (C79991m.C79992a) C87690d.m109090a("MemoryInspector.getMemoryMB", new C79990l(C79991m.INST));
        qualitySessionRuntime.f245862w = aVar == null ? 0 : aVar.f234284a;
    }
}
