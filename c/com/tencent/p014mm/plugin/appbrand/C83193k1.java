package com.tencent.p014mm.plugin.appbrand;

import java.util.concurrent.atomic.AtomicBoolean;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.k1 */
public class C83193k1 implements Runnable {

    /* renamed from: d */
    public final AtomicBoolean f242993d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ C86812g f242994e;

    public C83193k1(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, C86812g gVar) {
        this.f242994e = gVar;
    }

    public void run() {
        if (!this.f242993d.getAndSet(true)) {
            ((AppBrandRuntimeWC) this.f242994e).mo113199d2();
        }
    }
}
