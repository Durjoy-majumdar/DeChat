package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.q */
public class C83024q extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 113;
    public static final String NAME = "getStorageInfo";

    /* renamed from: w */
    public static void m101831w(C83024q qVar, List list, int i, int i2, C82381f fVar, int i3) {
        qVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("keys", list);
        hashMap.put("currentSize", Integer.valueOf(i));
        hashMap.put("limitSize", Integer.valueOf(i2));
        fVar.mo109647a(i3, qVar.mo115112m("ok", hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        int optInt = jSONObject.optInt("storageId", 0);
        if (C81420m0.m99897c(optInt)) {
            kVar.mo109647a(i, mo115109j("fail:nonexistent storage space"));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        WeakReference weakReference = new WeakReference(kVar);
        int i2 = kVar.getRuntime().mo113051d0().f261073s;
        String str = kVar.getRuntime().mo113051d0().f261075u;
        if (i2 != 1) {
            ThreadPool.post(new C83022o(this, weakReference, i2, str, optInt, i, currentTimeMillis), "JsApiGetStorageInfo");
            return;
        }
        JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new JsApiGetStorageInfoTask();
        jsApiGetStorageInfoTask.f242661f = mo115275x(kVar);
        jsApiGetStorageInfoTask.f242662g = optInt;
        jsApiGetStorageInfoTask.f242666n = new C83023p(this, jsApiGetStorageInfoTask, weakReference, i, currentTimeMillis);
        jsApiGetStorageInfoTask.mo114395c();
    }

    /* renamed from: x */
    public String mo115275x(C82381f fVar) {
        return fVar.getAppId();
    }
}
