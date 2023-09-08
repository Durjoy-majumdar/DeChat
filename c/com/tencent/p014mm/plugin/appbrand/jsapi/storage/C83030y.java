package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.y */
public class C83030y extends C82016a0<C82554k> {
    public static final int CTRL_INDEX = 98;
    public static final String NAME = "removeStorageSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C82554k kVar = (C82554k) fVar;
        String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (Util.isNullOrNil(optString)) {
            return mo115109j("fail");
        }
        if (C81420m0.m99897c(optInt)) {
            return mo115109j("fail:nonexistent storage space");
        }
        if (Util.isNullOrNil(kVar.getAppId())) {
            return mo115109j("fail:appID is empty");
        }
        int i = kVar.getRuntime().mo113051d0().f261073s;
        if (C90988l.m114155a(i)) {
            mo115282v(kVar, optString, optInt);
        } else if (i == 3) {
            mo115282v(kVar, optString, optInt);
            JsApiRemoveStorageTask jsApiRemoveStorageTask = new JsApiRemoveStorageTask();
            jsApiRemoveStorageTask.f242678f = kVar.getAppId();
            jsApiRemoveStorageTask.f242679g = optInt;
            jsApiRemoveStorageTask.f242680h = optString;
            jsApiRemoveStorageTask.mo114396f();
        } else {
            JsApiRemoveStorageTask jsApiRemoveStorageTask2 = new JsApiRemoveStorageTask();
            jsApiRemoveStorageTask2.f242678f = kVar.getAppId();
            jsApiRemoveStorageTask2.f242679g = optInt;
            jsApiRemoveStorageTask2.f242680h = optString;
            jsApiRemoveStorageTask2.mo114396f();
        }
        return mo115109j("ok");
    }

    /* renamed from: v */
    public final void mo115282v(C82554k kVar, String str, int i) {
        C90988l d0 = kVar.getRuntime().mo113051d0();
        ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), d0.f261073s, d0.f261075u).mo56593cg(i, kVar.getAppId(), str);
    }
}
