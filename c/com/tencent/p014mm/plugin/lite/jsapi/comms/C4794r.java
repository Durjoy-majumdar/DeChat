package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.r */
public class C4794r extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C14088e.class;
        Log.m105918d("LiteAppJsApiPreDownloadLiteApp", "Invoke preDownloadLiteApp");
        String optString = jSONObject.optString("appId");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("fail: appId is null");
        } else if (!jSONObject.optBoolean("onlyUpdate", false) || ((C14088e) C86312j.m106911c(cls)).mo13509NR(optString) != null) {
            ((C14088e) C86312j.m106911c(cls)).u50(optString, (C115477b) null);
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5690b();
        }
    }
}
