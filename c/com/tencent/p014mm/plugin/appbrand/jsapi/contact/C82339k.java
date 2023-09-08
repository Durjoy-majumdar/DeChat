package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82334j;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50098k92;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.k */
public class C82339k implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C82334j.C82338c f241319a;

    /* renamed from: b */
    public final /* synthetic */ C83928t1 f241320b;

    /* renamed from: c */
    public final /* synthetic */ AppBrandSysConfigWC f241321c;

    /* renamed from: d */
    public final /* synthetic */ C82334j f241322d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.k$a */
    public class C82340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C50098k92 f241323d;

        public C82340a(C50098k92 k922) {
            this.f241323d = k922;
        }

        public void run() {
            C82339k kVar = C82339k.this;
            kVar.f241322d.mo114723w(kVar.f241320b, kVar.f241321c, this.f241323d.f136626d, kVar.f241319a);
        }
    }

    public C82339k(C82334j jVar, C82334j.C82338c cVar, C83928t1 t1Var, AppBrandSysConfigWC appBrandSysConfigWC) {
        this.f241322d = jVar;
        this.f241319a = cVar;
        this.f241320b = t1Var;
        this.f241321c = appBrandSysConfigWC;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C50098k92 k922 = (C50098k92) aVar;
            Log.m105925i("MicroMsg.JsApiEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", k922.f136626d);
            MMHandlerThread.postToMainThread(new C82340a(k922));
            return;
        }
        Log.m105921e("MicroMsg.JsApiEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
        C82334j.C82338c cVar2 = this.f241319a;
        if (cVar2 != null) {
            ((C82334j.C82335a) cVar2).mo114725a(false, "fail:cgi fail", (Intent) null);
        }
    }
}
