package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p235sm.C64053t0;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.q */
public class C4793q extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        String optString = jSONObject.optString("targetAppId");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("invalid_targetAppId");
            return;
        }
        ((C64053t0) C86312j.m106911c(C64053t0.class)).mo88811EW(optString, optJSONObject.toString());
        this.f19815f.mo5690b();
    }
}
