package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import kk0.C88174b;
import org.json.JSONObject;
import qk0.C89696k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n */
public final class C82254n extends C88174b<C81879g> {
    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C82241i.m100982a(116);
        String appId = gVar.getAppId();
        Log.m105925i("MicroMsg.JsApiCloseBluetoothAdapter", "appId:%s closeBluetoothAdapter!", appId);
        C89696k a = C82220a.m100946a(appId);
        Log.m105925i("MicroMsg.JsApiCloseBluetoothAdapter", "result:%s", a);
        if (a.f257988a != 0) {
            gVar.mo109647a(i, mo115111l(a.f257989b, a.f257990c, (JSONObject) null));
            C82241i.m100982a(118);
        } else {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("ok", jSONObject2));
            C82241i.m100982a(117);
        }
        AppBrandRuntime runtime = gVar.getRuntime();
        if (runtime != null) {
            C82234f.C82235a aVar = C82234f.f241133b;
            C82250m a2 = aVar.mo114632a(runtime);
            if (a2 != null) {
                C82250m.C82251a.m101007a(a2, false, 1, (Object) null);
            }
            aVar.mo114634c(runtime);
        }
    }
}
