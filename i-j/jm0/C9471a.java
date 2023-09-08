package jm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84228v;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: jm0.a */
public final class C9471a extends C82268c<C81925i2> {
    @Deprecated
    private static final int CTRL_INDEX = -2;
    @Deprecated
    private static final String NAME = "appendRuntimeContext";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        JSONObject jSONObject2;
        C81925i2 i2Var = (C81925i2) fVar;
        C84228v vVar = null;
        if (jSONObject != null) {
            try {
                str = jSONObject.optString("data");
            } catch (Throwable th) {
                if (i2Var != null) {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    i2Var.mo109647a(i, mo115115p("ok", jSONObject3));
                }
                throw th;
            }
        } else {
            str = null;
        }
        if (str != null) {
            AppBrandRuntime runtime = i2Var != null ? i2Var.getRuntime() : null;
            AppBrandRuntimeWC appBrandRuntimeWC = runtime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) runtime : null;
            if (appBrandRuntimeWC != null) {
                vVar = appBrandRuntimeWC.f238272H1;
            }
            if (vVar != null) {
                vVar.f246039b = str;
            }
            if (i2Var != null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
            } else {
                return;
            }
        } else if (i2Var != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
        } else {
            return;
        }
        i2Var.mo109647a(i, mo115115p("ok", jSONObject2));
    }
}
