package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.util.ArrayMap;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.z */
public final class C1685z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayMap<String, String> f11365d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f11366e;

    /* renamed from: f */
    public final /* synthetic */ int f11367f;

    /* renamed from: g */
    public final /* synthetic */ C82411b0 f11368g;

    public C1685z(ArrayMap<String, String> arrayMap, C83780d1 d1Var, int i, C82411b0 b0Var) {
        this.f11365d = arrayMap;
        this.f11366e = d1Var;
        this.f11367f = i;
        this.f11368g = b0Var;
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.f11365d.entrySet()) {
            jSONObject.put((String) next.getKey(), (String) next.getValue());
        }
        C83780d1 d1Var = this.f11366e;
        int i = this.f11367f;
        C82411b0 b0Var = this.f11368g;
        b0Var.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        try {
            jSONObject.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        d1Var.mo109647a(i, b0Var.mo115115p("ok", jSONObject));
    }
}
