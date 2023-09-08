package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.f */
public class C83014f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82554k f242714d;

    /* renamed from: e */
    public final /* synthetic */ int f242715e;

    public C83014f(C83015g gVar, C82554k kVar, int i) {
        this.f242714d = kVar;
        this.f242715e = i;
    }

    public void run() {
        C90988l d0 = this.f242714d.getRuntime().mo113051d0();
        ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(this.f242714d.getAppId(), d0.f261073s, d0.f261075u).mo56590S(this.f242715e, this.f242714d.getAppId());
    }
}
