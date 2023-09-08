package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s */
public final class C1655s extends C87413o implements C32226l<Result<? extends C13598b0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f11312d;

    /* renamed from: e */
    public final /* synthetic */ int f11313e;

    /* renamed from: f */
    public final /* synthetic */ C82260t f11314f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1655s(C81879g gVar, int i, C82260t tVar) {
        super(1);
        this.f11312d = gVar;
        this.f11313e = i;
        this.f11314f = tVar;
    }

    public Object invoke(Object obj) {
        Object r132 = ((Result) obj).m168123unboximpl();
        Log.m105918d("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, result: " + Result.m168122toStringimpl(r132));
        if (Result.m168121isSuccessimpl(r132)) {
            C81879g gVar = this.f11312d;
            int i = this.f11313e;
            C82260t tVar = this.f11314f;
            tVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, tVar.mo115115p("ok", jSONObject));
        } else {
            C81879g gVar2 = this.f11312d;
            int i2 = this.f11313e;
            C82260t tVar2 = this.f11314f;
            tVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar2.mo109647a(i2, tVar2.mo115115p("fail:internal error", jSONObject2));
        }
        return C13598b0.f38549a;
    }
}
