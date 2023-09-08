package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.m */
public class C83020m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiGetStorageTask f242724d;

    /* renamed from: e */
    public final /* synthetic */ C82554k f242725e;

    /* renamed from: f */
    public final /* synthetic */ int f242726f;

    /* renamed from: g */
    public final /* synthetic */ String f242727g;

    /* renamed from: h */
    public final /* synthetic */ long f242728h;

    /* renamed from: i */
    public final /* synthetic */ long f242729i;

    /* renamed from: j */
    public final /* synthetic */ C83021n f242730j;

    public C83020m(C83021n nVar, JsApiGetStorageTask jsApiGetStorageTask, C82554k kVar, int i, String str, long j, long j2) {
        this.f242730j = nVar;
        this.f242724d = jsApiGetStorageTask;
        this.f242725e = kVar;
        this.f242726f = i;
        this.f242727g = str;
        this.f242728h = j;
        this.f242729i = j2;
    }

    public void run() {
        JsApiGetStorageTask jsApiGetStorageTask = this.f242724d;
        String str = jsApiGetStorageTask.f242675q;
        C83021n.m101828w(this.f242730j, str == null ? "fail:data not found" : "ok", str, jsApiGetStorageTask.f242676r, this.f242725e, this.f242726f);
        C83021n nVar = this.f242730j;
        int b = C81420m0.m99896b(this.f242727g, this.f242724d.f242675q);
        long j = this.f242728h;
        C82554k kVar = this.f242725e;
        nVar.getClass();
        C81419l0.m99894a(1, 2, b, 1, System.currentTimeMillis() - j, kVar);
        this.f242724d.mo114397h();
        Log.m105925i("MicroMsg.JsApiGetStorage", "getStorage: %s, time: %d", this.f242724d.f242674p, Long.valueOf(System.currentTimeMillis() - this.f242729i));
    }
}
