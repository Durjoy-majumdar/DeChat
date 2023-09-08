package rl0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import x20.C15618a;

/* renamed from: rl0.c */
public final class C13011c extends C82268c<C81879g> {
    @Deprecated
    private static final int CTRL_INDEX = 1145;
    @Deprecated
    private static final String NAME = "callbackDataToNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        AppBrandRuntime runtime;
        C81879g gVar = (C81879g) fVar;
        if (jSONObject == null || jSONObject.length() <= 0) {
            if (gVar != null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "fail:invalid data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject2));
            }
        } else if (gVar != null && (runtime = gVar.getRuntime()) != null) {
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "data.toString()");
            String str = runtime.f238147j;
            C87412m.m108593f(str, "rt.appId");
            C15618a.m14626b(new NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(str, jSONObject3), new C13012g(), (C1256g) null);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar.mo109647a(i, mo115115p("ok", jSONObject4));
        } else if (gVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("errno", 4);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            gVar.mo109647a(i, mo115115p("fail:internal error", jSONObject5));
        }
    }
}
