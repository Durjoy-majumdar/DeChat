package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m3 */
public class C1730m3 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ C82554k f11429d;

    /* renamed from: e */
    public final /* synthetic */ int f11430e;

    /* renamed from: f */
    public final /* synthetic */ C1759n3 f11431f;

    public C1730m3(C1759n3 n3Var, C82554k kVar, int i) {
        this.f11431f = n3Var;
        this.f11429d = kVar;
        this.f11430e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("ret", "fail");
        Log.m105925i("MicroMsg.JsApiKindaRequestQueryCashier", "callback ret is：%s", string);
        this.f11429d.mo109647a(this.f11430e, this.f11431f.mo115109j(string));
        if (bundle.getInt("closeWindow", 0) == 1) {
            this.f11429d.getRuntime().mo113063k();
        }
    }
}
