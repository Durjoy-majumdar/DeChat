package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import org.json.JSONObject;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.g */
public class C83015g extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 18;
    public static final String NAME = "clearStorage";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        int i2 = kVar.getRuntime().mo113051d0().f261073s;
        int optInt = jSONObject.optInt("storageId", 0);
        if (C81420m0.m99897c(optInt)) {
            kVar.mo109647a(i, mo115109j("fail:nonexistent storage space"));
            return;
        }
        if (C90988l.m114155a(i2)) {
            ThreadPool.post(new C83014f(this, kVar, optInt), "JsApiClearStorage");
        } else if (i2 == 3) {
            ThreadPool.post(new C83014f(this, kVar, optInt), "JsApiClearStorage");
            JsApiClearStorageTask jsApiClearStorageTask = new JsApiClearStorageTask();
            jsApiClearStorageTask.f242659f = kVar.getAppId();
            jsApiClearStorageTask.f242660g = optInt;
            jsApiClearStorageTask.mo114395c();
        } else {
            JsApiClearStorageTask jsApiClearStorageTask2 = new JsApiClearStorageTask();
            jsApiClearStorageTask2.f242659f = kVar.getAppId();
            jsApiClearStorageTask2.f242660g = optInt;
            jsApiClearStorageTask2.mo114395c();
        }
        kVar.mo109647a(i, mo115109j("ok"));
    }
}
