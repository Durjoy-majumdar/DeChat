package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONArray;
import org.json.JSONObject;
import p170ic.C87689c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.c0 */
public final class C82414c0 extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "loadLibFiles";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.c0$a */
    public static final class C82415a extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ICommLibReader f241495d;

        /* renamed from: e */
        public final /* synthetic */ C40482o f241496e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82415a(ICommLibReader iCommLibReader, C40482o oVar) {
            super(1);
            this.f241495d = iCommLibReader;
            this.f241496e = oVar;
        }

        public Object invoke(Object obj) {
            String obj2 = obj != null ? obj.toString() : null;
            if (!(obj2 == null || obj2.length() == 0)) {
                this.f241496e.evaluateJavascript(this.f241495d.mo113372b(obj2), (ValueCallback<String>) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        return mo114482u(gVar, jSONObject, gVar != null ? gVar.getJsRuntime() : null);
    }

    /* renamed from: v */
    public String mo114482u(C81879g gVar, JSONObject jSONObject, C40482o oVar) {
        ICommLibReader k;
        JSONArray optJSONArray;
        if (oVar == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            String p = mo115115p("fail:internal error", jSONObject2);
            C87412m.m108593f(p, "makeReturnJson(AppBrandE…s.General.INTERNAL_ERROR)");
            return p;
        } else if (gVar == null || (k = gVar.mo114272k()) == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            String p2 = mo115115p("fail:internal error", jSONObject3);
            C87412m.m108593f(p2, "makeReturnJson(AppBrandE…s.General.INTERNAL_ERROR)");
            return p2;
        } else if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("paths")) == null) {
            String j = mo115109j("fail:invalid data");
            C87412m.m108593f(j, "makeReturnJson(Constants…sApiMsg.API_INVALID_DATA)");
            return j;
        } else {
            C87689c.m109089b(optJSONArray, new C82415a(k, oVar));
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            String p3 = mo115115p("ok", jSONObject4);
            C87412m.m108593f(p3, "makeReturnJson(AppBrandErrors.General.OK)");
            return p3;
        }
    }
}
