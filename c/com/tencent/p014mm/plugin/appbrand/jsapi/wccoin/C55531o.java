package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.o */
public final class C55531o extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1103;
    public static final String NAME = "showWCCoinFirstBuyCoinTips";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null && jSONObject != null) {
            ShowWCCoinFirstBuyCoinTipsRequest showWCCoinFirstBuyCoinTipsRequest = new ShowWCCoinFirstBuyCoinTipsRequest();
            showWCCoinFirstBuyCoinTipsRequest.f158121d = jSONObject.optInt("alwaysDarkMode");
            C81956c.m100675c(kVar.getContext(), showWCCoinFirstBuyCoinTipsRequest, new C55530n(kVar, i, this), (Intent) null);
        }
    }
}
