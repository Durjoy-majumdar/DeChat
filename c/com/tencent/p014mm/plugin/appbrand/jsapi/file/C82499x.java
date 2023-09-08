package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82492w;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import p1044ub.C90636f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.x */
public final class C82499x implements C82492w.C82496b {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f241563d;

    /* renamed from: e */
    public final /* synthetic */ JSONArray f241564e;

    /* renamed from: f */
    public final /* synthetic */ int f241565f;

    /* renamed from: g */
    public final /* synthetic */ C82492w f241566g;

    public C82499x(C83780d1 d1Var, JSONArray jSONArray, int i, C82492w wVar) {
        this.f241563d = d1Var;
        this.f241564e = jSONArray;
        this.f241565f = i;
        this.f241566g = wVar;
    }

    /* renamed from: N */
    public void mo114828N(String str, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2) {
        C87412m.m108594g(aVarArr, "scripts");
        C87412m.m108594g(zArr, "results");
        C87412m.m108594g(objArr, "extras");
        StringBuilder sb = new StringBuilder();
        sb.append("invoke with appId:");
        sb.append(this.f241563d.getAppId());
        sb.append(" paths:");
        sb.append(this.f241564e);
        sb.append(" key:");
        String str2 = str;
        sb.append(str);
        sb.append(", results:");
        String arrays = Arrays.toString(zArr);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        Log.m105924i("Luggage.WXA.JsApiLoadJsFiles", sb.toString());
        C83780d1 d1Var = this.f241563d;
        int i = this.f241565f;
        C82492w wVar = this.f241566g;
        wVar.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        d1Var.mo109647a(i, wVar.mo115115p("ok", jSONObject));
        C82492w.C82496b bVar = (C82492w.C82496b) this.f241563d.mo116150E0(C82492w.C82496b.class);
        if (bVar != null) {
            bVar.mo114828N(str, aVarArr, zArr, objArr, j, j2);
        }
    }
}
