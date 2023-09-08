package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.s */
public class C4795s extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("currentRequestId", LiteAppCenter.mUICallback.get(Integer.valueOf(this.f19814e.f31713a)).getExtraData().get("sessionId"));
        this.f19815f.mo5691c(hashMap);
    }
}
