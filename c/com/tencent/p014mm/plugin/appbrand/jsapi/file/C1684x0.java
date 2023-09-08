package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.x0 */
public final class C1684x0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1168;
    public static final String NAME = "setFileSpaceStatistics";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (jSONObject == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                eVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            String appId = eVar.getAppId();
            C87412m.m108593f(appId, "env.appId");
            boolean optBoolean = jSONObject.optBoolean("enable");
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null) {
                SharedPreferences.Editor putBoolean = a.putBoolean("appbrand_enable_file_storage_space_statistics_for_" + appId, optBoolean);
                if (putBoolean != null) {
                    putBoolean.commit();
                }
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            eVar.mo109647a(i, mo115115p("ok", jSONObject3));
        }
    }
}
