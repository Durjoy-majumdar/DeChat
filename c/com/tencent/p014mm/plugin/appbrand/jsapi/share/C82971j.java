package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82965h;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.j */
public class C82971j extends C82965h {
    public static final int CTRL_INDEX = 773;
    public static final String NAME = "shareAppMessageToSpecificContactForFakeNativeDirectly";

    /* renamed from: H */
    public C82965h.C82966a mo115210z(C88267e eVar, JSONObject jSONObject) {
        C82965h.C82966a H = super.mo115210z(eVar, jSONObject);
        if (!Util.isNullOrNil(H.f242462E) || !Util.isNullOrNil(H.f242463F)) {
            return H;
        }
        Log.m105924i("MicroMsg.JsApiShareAppMessageToSpecificContactForFakeNativeDirectly", "openid and chatroom is null");
        throw new JsApiShareAppMessageBase.C82938e("openid and chatroom is null");
    }
}
