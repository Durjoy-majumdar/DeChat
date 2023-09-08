package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import ir0.C9238c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b4 */
public class C1629b4 extends C82268c {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "opNativeRedDot";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString("op");
        int optInt = jSONObject.optInt("redDotType", 0);
        Log.m105925i("MicroMsg.JsApiOpNativeRedDot", "op:%s redDotType:%d", optString, Integer.valueOf(optInt));
        optString.getClass();
        if (!optString.equals("clear")) {
            Log.m105929w("MicroMsg.JsApiOpNativeRedDot", "unknown op:%s", optString);
            fVar.mo109647a(i, mo115109j("fail unknown op"));
            return;
        }
        C9238c.m8884a(optInt);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
