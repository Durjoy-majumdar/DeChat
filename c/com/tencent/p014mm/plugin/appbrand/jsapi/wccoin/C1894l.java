package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.l */
public final class C1894l<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C82554k f11737d;

    /* renamed from: e */
    public final /* synthetic */ int f11738e;

    /* renamed from: f */
    public final /* synthetic */ C1895m f11739f;

    public C1894l(C82554k kVar, int i, C1895m mVar) {
        this.f11737d = kVar;
        this.f11738e = i;
        this.f11739f = mVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCLong iPCLong = (IPCLong) obj;
        if (iPCLong.f10314d < 0) {
            Log.m105920e("MicroMsg.JsApiGetWCCoinBalance", "fail");
            C82554k kVar = this.f11737d;
            int i = this.f11738e;
            C1895m mVar = this.f11739f;
            mVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo109647a(i, mVar.mo115115p("fail:internal error", jSONObject));
            return;
        }
        Log.m105924i("MicroMsg.JsApiGetWCCoinBalance", "success");
        C82554k kVar2 = this.f11737d;
        int i2 = this.f11738e;
        C1895m mVar2 = this.f11739f;
        HashMap e2 = C90364q0.m113146e(new C13604l("balance", Long.valueOf(iPCLong.f10314d)));
        mVar2.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        e2.put("errno", 0);
        kVar2.mo109647a(i2, mVar2.mo115114o("ok", e2));
    }
}
