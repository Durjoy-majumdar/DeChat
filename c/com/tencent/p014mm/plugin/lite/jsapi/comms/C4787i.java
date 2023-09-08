package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.i */
public class C4787i extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetAccountInfo", "Invoke getAccountInfo");
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        Boolean valueOf = Boolean.valueOf(Util.isNullOrNil(str2) || "CN".equalsIgnoreCase(str2));
        HashMap hashMap = new HashMap();
        hashMap.put("isRegInChina", valueOf);
        this.f19815f.mo5692d(new JSONObject(hashMap), false);
    }
}
