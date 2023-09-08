package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.t */
public final class C1873t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88267e f11710d;

    /* renamed from: e */
    public final /* synthetic */ int f11711e;

    /* renamed from: f */
    public final /* synthetic */ int f11712f;

    /* renamed from: g */
    public final /* synthetic */ C1874u f11713g;

    public C1873t(C88267e eVar, int i, int i2, C1874u uVar) {
        this.f11710d = eVar;
        this.f11711e = i;
        this.f11712f = i2;
        this.f11713g = uVar;
    }

    public final void run() {
        AppBrandCgiPrefetchApi appBrandCgiPrefetchApi = this.f11710d.getRuntime().f238281i1;
        String str = this.f11710d.getRuntime().mo113210l1().f234838r;
        int i = this.f11711e;
        C87412m.m108593f(str, "instanceId");
        AppBrandCgiPrefetchedResp a = appBrandCgiPrefetchApi.mo1809a(i, str);
        if (a == null || a.f11796e != 0) {
            C88267e eVar = this.f11710d;
            int i2 = this.f11712f;
            C1874u uVar = this.f11713g;
            uVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            eVar.mo109647a(i2, uVar.mo115115p("fail:internal error", jSONObject));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fetchedData", a.f11795d);
        C88267e eVar2 = this.f11710d;
        int i3 = this.f11712f;
        C1874u uVar2 = this.f11713g;
        uVar2.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        eVar2.mo109647a(i3, uVar2.mo115114o("ok", hashMap));
    }
}
