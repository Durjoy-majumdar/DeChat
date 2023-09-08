package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83385m3;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.d */
public class C83413d extends C83385m3 {

    /* renamed from: e */
    public final /* synthetic */ Runnable f243768e;

    /* renamed from: f */
    public final /* synthetic */ C83410a f243769f;

    public C83413d(C83410a aVar, Runnable runnable) {
        this.f243769f = aVar;
        this.f243768e = runnable;
    }

    /* renamed from: c */
    public void mo115659c() {
        this.f243769f.mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
    }

    /* renamed from: e */
    public void mo115660e() {
        this.f243768e.run();
    }
}
