package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.h */
public class C83016h extends C82016a0<C82554k> {
    public static final int CTRL_INDEX = 18;
    public static final String NAME = "clearStorageSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C82554k kVar = (C82554k) fVar;
        int i = kVar.getRuntime().mo113051d0().f261073s;
        int optInt = jSONObject.optInt("storageId", 0);
        if (C81420m0.m99897c(optInt)) {
            return mo115109j("fail:nonexistent storage space");
        }
        if (C90988l.m114155a(i)) {
            return mo115273v(kVar, optInt);
        }
        if (i == 3) {
            JsApiClearStorageTask jsApiClearStorageTask = new JsApiClearStorageTask();
            jsApiClearStorageTask.f242659f = kVar.getAppId();
            jsApiClearStorageTask.f242660g = optInt;
            jsApiClearStorageTask.mo114396f();
            mo115109j("ok");
            return mo115273v(kVar, optInt);
        }
        JsApiClearStorageTask jsApiClearStorageTask2 = new JsApiClearStorageTask();
        jsApiClearStorageTask2.f242659f = kVar.getAppId();
        jsApiClearStorageTask2.f242660g = optInt;
        jsApiClearStorageTask2.mo114396f();
        return mo115109j("ok");
    }

    /* renamed from: v */
    public final String mo115273v(C82554k kVar, int i) {
        C90988l d0 = kVar.getRuntime().mo113051d0();
        ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), d0.f261073s, d0.f261075u).mo56590S(i, kVar.getAppId());
        return mo115109j("ok");
    }
}
