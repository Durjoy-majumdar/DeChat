package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86295k;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.pluginsdk.model.j */
public final class C57536j implements C86295k {

    /* renamed from: d */
    public String f164779d = "";

    /* renamed from: e */
    public int f164780e;

    /* renamed from: f */
    public String f164781f = "";

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataBuffer", Util.nullAsNil(this.f164779d));
            jSONObject.put("enterScene", this.f164780e);
            jSONObject.put("bypass", this.f164781f);
            String jSONObject2 = new JSONObject().put("bizFinderLiveInfo", jSONObject).toString();
            C87412m.m108593f(jSONObject2, "{\n            val obj = …obj).toString()\n        }");
            return jSONObject2;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.BizFinderLiveNativeExtraData", e, "", new Object[0]);
            return "{}";
        }
    }
}
