package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.d */
public final class C82143d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82136a f240944d;

    public C82143d(C82136a aVar) {
        this.f240944d = aVar;
    }

    public final void run() {
        C82136a aVar = this.f240944d;
        if (aVar != null) {
            aVar.onStart();
        }
    }
}
