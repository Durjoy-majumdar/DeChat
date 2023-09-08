package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import p170ic.C87689c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.b0 */
public final class C82411b0 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "loadLibFiles";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83165i jsRuntime;
        C13598b0 b0Var;
        JSONArray optJSONArray;
        C83780d1 d1Var = (C83780d1) fVar;
        if (d1Var != null && (jsRuntime = d1Var.getJsRuntime()) != null) {
            ICommLibReader k = d1Var.mo114272k();
            if (k == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                d1Var.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
                return;
            }
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("paths")) == null) {
                b0Var = null;
            } else {
                C87689c.m109089b(optJSONArray, new C82407a0(optJSONArray, k, jsRuntime, d1Var, i, this));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                d1Var.mo109647a(i, mo115109j("fail:invalid data"));
            }
        }
    }
}
