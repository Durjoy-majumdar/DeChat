package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86295k;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.z */
public final class C55585z implements C86295k {

    /* renamed from: d */
    public int f158255d;

    /* renamed from: e */
    public String f158256e = "";

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sessionId", this.f158255d);
            jSONObject.put("dataBuffer", Util.nullAsNil(this.f158256e));
            String jSONObject2 = new JSONObject().put("bizVideoChannelInfo", jSONObject).toString();
            C87412m.m108593f(jSONObject2, "{\n            val obj = …obj).toString()\n        }");
            return jSONObject2;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.BizVideoChannelNativeExtraData", e, "", new Object[0]);
            return "{}";
        }
    }
}
