package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.l */
public class C83019l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82554k f242716d;

    /* renamed from: e */
    public final /* synthetic */ C90988l f242717e;

    /* renamed from: f */
    public final /* synthetic */ int f242718f;

    /* renamed from: g */
    public final /* synthetic */ String f242719g;

    /* renamed from: h */
    public final /* synthetic */ String f242720h;

    /* renamed from: i */
    public final /* synthetic */ int f242721i;

    /* renamed from: j */
    public final /* synthetic */ long f242722j;

    /* renamed from: n */
    public final /* synthetic */ C83021n f242723n;

    public C83019l(C83021n nVar, C82554k kVar, C90988l lVar, int i, String str, String str2, int i2, long j) {
        this.f242723n = nVar;
        this.f242716d = kVar;
        this.f242717e = lVar;
        this.f242718f = i;
        this.f242719g = str;
        this.f242720h = str2;
        this.f242721i = i2;
        this.f242722j = j;
    }

    public void run() {
        String appId = this.f242716d.getAppId();
        C90988l lVar = this.f242717e;
        Object[] xf = ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(appId, lVar.f261073s, lVar.f261075u).mo56596xf(this.f242718f, this.f242719g, this.f242720h);
        C81414g0.C29326a aVar = (C81414g0.C29326a) xf[0];
        C81414g0.C29326a aVar2 = C81414g0.C29326a.NONE;
        String str = null;
        String str2 = aVar == aVar2 ? (String) xf[1] : null;
        if (aVar == aVar2) {
            str = (String) xf[2];
        }
        C83021n.m101828w(this.f242723n, str2 == null ? "fail:data not found" : "ok", str2, str, this.f242716d, this.f242721i);
        C83021n nVar = this.f242723n;
        int b = C81420m0.m99896b(this.f242720h, str2);
        long j = this.f242722j;
        C82554k kVar = this.f242716d;
        nVar.getClass();
        C81419l0.m99894a(2, 2, b, 1, System.currentTimeMillis() - j, kVar);
    }
}
