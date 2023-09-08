package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.i */
public class C82969i extends C82962g {
    public static final int CTRL_INDEX = 552;
    public static final String NAME = "shareAppMessageToSpecificContactDirectly";

    /* renamed from: z */
    public JsApiShareAppMessageBase.C82939f mo115210z(C88267e eVar, JSONObject jSONObject) {
        JsApiShareAppMessageBase.C82939f z = super.mo115210z(eVar, jSONObject);
        if (!Util.isNullOrNil(z.f242462E) || !Util.isNullOrNil(z.f242463F)) {
            return z;
        }
        Log.m105924i("MicroMsg.JsApiShareAppMessageToSpecificContactDirectly", "openid and chatroom is null");
        throw new JsApiShareAppMessageBase.C82938e("openid and chatroom is null");
    }
}
