package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w2 */
public class C83057w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f242796d;

    /* renamed from: e */
    public final /* synthetic */ JsApiGetAppConfigTask f242797e;

    /* renamed from: f */
    public final /* synthetic */ C88267e f242798f;

    /* renamed from: g */
    public final /* synthetic */ int f242799g;

    /* renamed from: h */
    public final /* synthetic */ C83124x2 f242800h;

    public C83057w2(C83124x2 x2Var, int i, JsApiGetAppConfigTask jsApiGetAppConfigTask, C88267e eVar, int i2) {
        this.f242800h = x2Var;
        this.f242796d = i;
        this.f242797e = jsApiGetAppConfigTask;
        this.f242798f = eVar;
        this.f242799g = i2;
    }

    public void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "" + this.f242796d);
        hashMap.put("data", this.f242797e.f240414h);
        Log.m105925i("MicroMsg.JsApiGetAppConfig", "getAppConfig type:%d,data:\n%s", Integer.valueOf(this.f242796d), this.f242797e.f240414h);
        if (Util.isNullOrNil(this.f242797e.f240414h)) {
            this.f242798f.mo109647a(this.f242799g, this.f242800h.mo115109j("fail"));
        } else {
            this.f242798f.mo109647a(this.f242799g, this.f242800h.mo115112m("ok", hashMap));
        }
        this.f242797e.mo114397h();
    }
}
