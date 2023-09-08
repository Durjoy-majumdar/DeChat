package com.tencent.p014mm.plugin.appbrand.jsapi;

import di3.C86312j;
import f62.C7994b0;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q1 */
public final class C1840q1 extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 876;
    public static final String NAME = "joinGroup";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        String appId = fVar.getAppId();
        if (appId == null || appId.length() == 0) {
            fVar.mo109647a(i, mo115109j("fail:appId is null"));
            return;
        }
        String optString = jSONObject.optString("signature");
        String optString2 = jSONObject.optString("groupId");
        String optString3 = jSONObject.optString("nonceStr");
        C7994b0.C7996b bVar = new C7994b0.C7996b();
        bVar.f26678d = appId;
        bVar.f26681g = optString;
        bVar.f26679e = optString2;
        bVar.f26680f = optString3;
        ((C7994b0) C86312j.m106911c(C7994b0.class)).vt0(fVar.getContext(), bVar);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
