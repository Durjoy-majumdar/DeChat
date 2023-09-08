package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.u */
public final class C1874u extends C82268c<C88267e> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "private_getBackgroundFetchData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (jSONObject == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1002, "fail:empty request");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 1002);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                eVar.mo109647a(i, mo115115p("fail:empty request", jSONObject2));
                return;
            }
            int optInt = jSONObject.optInt("fetchType", -1);
            byte[] bArr = eVar.getRuntime().mo113213o1().f234873R;
            if (optInt < 0 || bArr == null || optInt > bArr.length - 1 || bArr[optInt] != 1) {
                Log.m105928w("MicroMsg.JsApiPrivateGetBackgroundFetchData", "no matched type. prefetchType=" + optInt);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                eVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject3));
                return;
            }
            ((C119157j) C119157j.f356862d).mo183884o(new C1873t(eVar, optInt, i, this));
        }
    }
}
