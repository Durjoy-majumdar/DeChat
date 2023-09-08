package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import gy3.C87412m;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e4 */
public final class C82378e4 extends C82369d4 {
    public static final int CTRL_INDEX = 905;
    public static final String NAME = "openAddressWithLightMode";

    public C82378e4() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: w */
    public void mo114775w(Intent intent, C82554k kVar, JSONObject jSONObject) {
        C87412m.m108594g(intent, "intent");
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("forceLightMode", false);
        }
        intent.putExtra("force_light_mode", z);
    }
}
