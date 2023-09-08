package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.k */
public final class C55529k extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1140;
    public static final String NAME = "enterWCCoinHomePage";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null && jSONObject != null) {
            EnterWCCoinHomePageRequest enterWCCoinHomePageRequest = new EnterWCCoinHomePageRequest();
            String optString = jSONObject.optString("businessId");
            C87412m.m108593f(optString, "data.optString(\"businessId\")");
            enterWCCoinHomePageRequest.f158119d = optString;
            C81956c.m100675c(kVar.getContext(), enterWCCoinHomePageRequest, new C55528j(kVar, i, this), (Intent) null);
        }
    }
}
