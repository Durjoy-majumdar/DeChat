package com.tencent.p014mm.plugin.appbrand.jsapi.liteapp;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.a */
public class C1724a implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11424a;

    /* renamed from: b */
    public final /* synthetic */ int f11425b;

    /* renamed from: c */
    public final /* synthetic */ JsApiOpenLiteApp f11426c;

    public C1724a(JsApiOpenLiteApp jsApiOpenLiteApp, C81925i2 i2Var, int i) {
        this.f11426c = jsApiOpenLiteApp;
        this.f11424a = i2Var;
        this.f11425b = i;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp success");
        this.f11424a.mo109647a(this.f11425b, this.f11426c.mo115109j("ok"));
        JsApiOpenLiteApp jsApiOpenLiteApp = this.f11426c;
        if (jsApiOpenLiteApp.f11413g) {
            C119179t tVar = C119157j.f356862d;
            C1725b bVar = new C1725b(jsApiOpenLiteApp);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(bVar, 1000, false);
        }
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp fail");
        this.f11424a.mo109647a(this.f11425b, this.f11426c.mo115109j("fail"));
    }
}
