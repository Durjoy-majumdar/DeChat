package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.b */
public final class C81844b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f240115d;

    /* renamed from: e */
    public final /* synthetic */ C81845c f240116e;

    public C81844b(AppBrandRuntime appBrandRuntime, C81845c cVar) {
        this.f240115d = appBrandRuntime;
        this.f240116e = cVar;
    }

    public final void run() {
        if (!C82234f.f241133b.mo114636e(this.f240115d)) {
            this.f240116e.mo64003o();
        }
    }
}
