package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.f */
public final class C82894f extends C82892e {
    private static final int CTRL_INDEX = 1229;
    private static final String NAME = "openWeComUserProfileForFakeNative";

    /* renamed from: w */
    public AppBrandProxyUIProcessTask.ProcessRequest mo115149w(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "data.toString()");
        return new ReqJumpToProfileRequest(jSONObject2);
    }
}
