package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.m */
public final class C1895m extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1100;
    public static final String NAME = "getWCCoinBalance";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null && jSONObject != null) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new Bundle(), C1893e.class, new C1894l(kVar, i, this));
        }
    }
}
