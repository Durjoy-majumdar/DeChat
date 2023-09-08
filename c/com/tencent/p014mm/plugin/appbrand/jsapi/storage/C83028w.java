package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.w */
public class C83028w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82554k f242743d;

    /* renamed from: e */
    public final /* synthetic */ int f242744e;

    /* renamed from: f */
    public final /* synthetic */ String f242745f;

    /* renamed from: g */
    public final /* synthetic */ C83029x f242746g;

    public C83028w(C83029x xVar, C82554k kVar, int i, String str) {
        this.f242746g = xVar;
        this.f242743d = kVar;
        this.f242744e = i;
        this.f242745f = str;
    }

    public void run() {
        C90988l d0 = this.f242743d.getRuntime().mo113051d0();
        ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(this.f242743d.getAppId(), d0.f261073s, d0.f261075u).mo56593cg(this.f242744e, this.f242746g.mo115280w(this.f242743d), this.f242745f);
    }
}
