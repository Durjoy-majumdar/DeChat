package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import qq0.C89816t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.b0 */
public class C82577b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82572a0 f241690d;

    public C82577b0(C82572a0 a0Var) {
        this.f241690d = a0Var;
    }

    public void run() {
        C89816t.C89818b bVar = this.f241690d.f241684b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }
}
