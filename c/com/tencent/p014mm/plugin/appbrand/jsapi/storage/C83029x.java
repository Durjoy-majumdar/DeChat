package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import org.json.JSONObject;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.x */
public class C83029x extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 98;
    public static final String NAME = "removeStorage";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (Util.isNullOrNil(optString)) {
            kVar.mo109647a(i, mo115109j("fail"));
        } else if (C81420m0.m99897c(optInt)) {
            kVar.mo109647a(i, mo115109j("fail:nonexistent storage space"));
        } else {
            AppBrandRuntime runtime = kVar.getRuntime();
            if (runtime == null || runtime.mo113051d0() == null) {
                kVar.mo109647a(i, mo115109j("fail:internal error"));
                return;
            }
            int i2 = runtime.mo113051d0().f261073s;
            if (C90988l.m114155a(i2)) {
                ThreadPool.post(new C83028w(this, kVar, optInt, optString), "JsApiRemoveStorage");
            } else if (i2 == 3) {
                JsApiRemoveStorageTask jsApiRemoveStorageTask = new JsApiRemoveStorageTask();
                jsApiRemoveStorageTask.f242678f = mo115280w(kVar);
                jsApiRemoveStorageTask.f242679g = optInt;
                jsApiRemoveStorageTask.f242680h = optString;
                jsApiRemoveStorageTask.mo114395c();
                ThreadPool.post(new C83028w(this, kVar, optInt, optString), "JsApiRemoveStorage");
            } else {
                JsApiRemoveStorageTask jsApiRemoveStorageTask2 = new JsApiRemoveStorageTask();
                jsApiRemoveStorageTask2.f242678f = mo115280w(kVar);
                jsApiRemoveStorageTask2.f242679g = optInt;
                jsApiRemoveStorageTask2.f242680h = optString;
                jsApiRemoveStorageTask2.mo114395c();
            }
            kVar.mo109647a(i, mo115109j("ok"));
        }
    }

    /* renamed from: w */
    public String mo115280w(C82381f fVar) {
        return fVar.getAppId();
    }
}
