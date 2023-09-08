package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Process;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.HashMap;
import org.json.JSONObject;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.n */
public class C83021n extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 17;
    public static final String NAME = "getStorage";

    /* renamed from: w */
    public static void m101828w(C83021n nVar, String str, String str2, String str3, C82381f fVar, int i) {
        nVar.getClass();
        HashMap hashMap = new HashMap();
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("data", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("dataType", str3);
        fVar.mo109647a(i, nVar.mo115112m(str, hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82554k kVar = (C82554k) fVar;
        long currentTimeMillis = System.currentTimeMillis();
        String optString = jSONObject2.optString("key");
        int optInt = jSONObject2.optInt("storageId", 0);
        if (C81420m0.m99897c(optInt)) {
            kVar.mo109647a(i2, mo115109j("fail:nonexistent storage space"));
        } else if (Util.isNullOrNil(optString)) {
            kVar.mo109647a(i2, mo115109j("fail:key is empty"));
        } else {
            String x = mo115274x(kVar);
            if (Util.isNullOrNil(x)) {
                kVar.mo109647a(i2, mo115109j("fail:appID is empty"));
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C90988l d0 = kVar.getRuntime().mo113051d0();
            if (d0 == null) {
                Log.m105921e("MicroMsg.JsApiGetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", kVar.getAppId(), Integer.valueOf(i));
                kVar.mo109647a(i2, mo115109j("fail:internal error"));
            } else if (d0.f261073s != 1) {
                ThreadPool.post(new C83019l(this, kVar, d0, optInt, x, optString, i, currentTimeMillis2), "JsApiGetStorage");
            } else {
                JsApiGetStorageTask jsApiGetStorageTask = new JsApiGetStorageTask();
                jsApiGetStorageTask.f242667f = x;
                jsApiGetStorageTask.f242674p = optString;
                jsApiGetStorageTask.f242668g = optInt;
                jsApiGetStorageTask.f242677s = "" + Process.myPid() + "" + super.hashCode();
                jsApiGetStorageTask.f242669h = new C83020m(this, jsApiGetStorageTask, kVar, i, optString, currentTimeMillis2, currentTimeMillis);
                jsApiGetStorageTask.mo114395c();
            }
        }
    }

    /* renamed from: x */
    public String mo115274x(C82381f fVar) {
        return fVar.getAppId();
    }
}
