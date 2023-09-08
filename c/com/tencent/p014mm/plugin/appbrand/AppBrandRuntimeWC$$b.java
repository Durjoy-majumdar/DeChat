package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$b */
public final /* synthetic */ class AppBrandRuntimeWC$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238307d;

    /* renamed from: e */
    public final /* synthetic */ C91291c f238308e;

    /* renamed from: f */
    public final /* synthetic */ int f238309f;

    /* renamed from: g */
    public final /* synthetic */ String f238310g;

    /* renamed from: h */
    public final /* synthetic */ String f238311h;

    /* renamed from: i */
    public final /* synthetic */ String f238312i;

    public /* synthetic */ AppBrandRuntimeWC$$b(AppBrandRuntimeWC appBrandRuntimeWC, C91291c cVar, int i, String str, String str2, String str3) {
        this.f238307d = appBrandRuntimeWC;
        this.f238308e = cVar;
        this.f238309f = i;
        this.f238310g = str;
        this.f238311h = str2;
        this.f238312i = str3;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238307d;
        C91291c cVar = this.f238308e;
        int i = this.f238309f;
        String str = this.f238310g;
        String str2 = this.f238311h;
        String str3 = this.f238312i;
        boolean z = AppBrandRuntimeWC.f238264Q1;
        C88267e eVar = (C88267e) appBrandRuntimeWC.f238150p;
        if (eVar == null) {
            cVar.getClass();
        } else {
            Log.m105925i("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, intVersion:%d, stringVersion:%s, passThroughInfo:%s, stablePassThroughInfo:%s", cVar.f261893d, eVar.getAppId(), Integer.valueOf(eVar.hashCode()), Integer.valueOf(i), str, str2, str3);
            HashMap hashMap = new HashMap(1);
            hashMap.put("state", cVar.f261893d);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("passThroughInfo", new JSONObject(str2));
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("stablePassThroughInfo", new JSONObject(str3));
                }
                if (jSONObject.length() > 0) {
                    hashMap.put("appContactInfo", jSONObject);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, put passThroughInfo get Exception:%s", cVar.f261893d, eVar.getAppId(), Integer.valueOf(eVar.hashCode()), e);
            }
            hashMap.put("appVersion", Integer.valueOf(i));
            hashMap.put("customVersion", str);
            C91291c.C91293b bVar = new C91291c.C91293b((C91291c.C91292a) null);
            bVar.mo115194p(eVar);
            bVar.mo115165o(hashMap);
            bVar.mo115158h();
        }
        if (C91291c.UPDATE_READY == cVar) {
            C84090r1 r1Var = appBrandRuntimeWC.f238270F1;
            if (!r1Var.f245505b.getAndSet(true) && r1Var.f245504a.get()) {
                ((r1$$a) r1Var.f245507d).run();
            }
        }
    }
}
