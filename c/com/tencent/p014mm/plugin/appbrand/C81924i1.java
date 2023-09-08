package com.tencent.p014mm.plugin.appbrand;

import java.util.concurrent.atomic.AtomicBoolean;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.i1 */
public class C81924i1 implements Runnable {

    /* renamed from: d */
    public final AtomicBoolean f240280d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ C86812g f240281e;

    public C81924i1(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, C86812g gVar) {
        this.f240281e = gVar;
    }

    public void run() {
        if (!this.f240280d.getAndSet(true)) {
            ((AppBrandRuntimeWC) this.f240281e).mo113199d2();
        }
    }
}
