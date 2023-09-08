package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONObject;
import p166hy.C60229z;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a3 */
public class C1574a3 extends C82268c {
    public static final int CTRL_INDEX = 711;
    public static final String NAME = "getOAID";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String r4 = ((C60229z) C86312j.m106911c(C60229z.class)).mo85224r4();
        Log.m105924i("MicroMsg.JsApiGetOAID", "AppBrand getOAID, oaid=" + r4);
        C115669n.INSTANCE.mo175911u(1896, 22);
        if (Util.isNullOrNil(r4)) {
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", r4);
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
