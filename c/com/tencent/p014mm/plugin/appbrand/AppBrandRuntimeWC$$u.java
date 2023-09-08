package com.tencent.p014mm.plugin.appbrand;

import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$u */
public class AppBrandRuntimeWC$$u implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ Runnable f238339d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f238340e;

    public AppBrandRuntimeWC$$u(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        this.f238340e = appBrandRuntimeWC;
        this.f238339d = runnable;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.DESTROYED == bVar) {
            this.f238339d.run();
        }
    }
}
