package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.k */
public class C4789k extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetUin", "Invoke getUin");
        HashMap hashMap = new HashMap();
        hashMap.put("uin", C86709a0.m107523b().mo121111i());
        this.f19815f.mo5692d(new JSONObject(hashMap), false);
    }
}
