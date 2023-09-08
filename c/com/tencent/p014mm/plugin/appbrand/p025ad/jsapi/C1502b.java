package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.b */
public final class C1502b<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C82510g f10853d;

    /* renamed from: e */
    public final /* synthetic */ int f10854e;

    /* renamed from: f */
    public final /* synthetic */ C1500a f10855f;

    public C1502b(C82510g gVar, int i, C1500a aVar) {
        this.f10853d = gVar;
        this.f10854e = i;
        this.f10855f = aVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        if (((IPCBoolean) obj).f10312d) {
            C82510g gVar = this.f10853d;
            if (gVar != null) {
                int i = this.f10854e;
                C1500a aVar = this.f10855f;
                aVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, aVar.mo115115p("ok", jSONObject));
                return;
            }
            return;
        }
        C82510g gVar2 = this.f10853d;
        if (gVar2 != null) {
            int i2 = this.f10854e;
            C1500a aVar2 = this.f10855f;
            aVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "db operation failed");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar2.mo109647a(i2, aVar2.mo115115p("db operation failed", jSONObject2));
        }
    }
}
