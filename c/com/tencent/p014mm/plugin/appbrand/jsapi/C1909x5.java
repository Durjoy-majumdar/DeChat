package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONObject;
import p166hy.C8831u0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x5 */
public class C1909x5 extends C82268c {
    public static final int CTRL_INDEX = 731;
    public static final String NAME = "saveWaid";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        try {
            int dc02 = ((C8831u0) C86312j.m106911c(C8831u0.class)).dc0(jSONObject.toString());
            hashMap.put("result", String.valueOf(dc02));
            fVar.mo109647a(i, mo115112m("ok", hashMap));
            Log.m105924i("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, data=" + jSONObject + ", waidNum=" + dc02);
        } catch (Exception e) {
            hashMap.put("result", "0");
            fVar.mo109647a(i, mo115112m("fail", hashMap));
            Log.m105920e("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, exp=" + e.toString());
        }
    }
}
