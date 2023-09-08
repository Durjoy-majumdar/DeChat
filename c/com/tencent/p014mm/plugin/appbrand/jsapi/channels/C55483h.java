package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.h */
public class C55483h extends C55480f {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "private_openChannelsLive";

    /* renamed from: h */
    public final boolean f158071h = true;

    /* renamed from: A */
    public boolean mo77018A() {
        return this.f158071h;
    }

    /* renamed from: C */
    public JSONObject mo77019C(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("feedbackInfo", new JSONArray(jSONObject.getString("feedbackInfo")));
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLivePrivate", "process feedbackInfo failure since " + e);
        }
        return jSONObject;
    }

    /* renamed from: z */
    public boolean mo77020z() {
        return false;
    }
}
