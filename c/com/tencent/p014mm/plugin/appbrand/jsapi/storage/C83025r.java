package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.r */
public class C83025r extends C82016a0<C82554k> {
    public static final int CTRL_INDEX = 113;
    public static final String NAME = "getStorageInfoSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        int i;
        ArrayList<String> arrayList;
        int i2;
        C82554k kVar = (C82554k) fVar;
        int optInt = jSONObject.optInt("storageId", 0);
        if (C81420m0.m99897c(optInt)) {
            return mo115109j("fail:nonexistent storage space");
        }
        int i3 = 1;
        if (!kVar.isRunning() || TextUtils.isEmpty(kVar.getAppId())) {
            Log.m105921e("Luggage.FULL.JsApiGetStorageInfoSync", "invoke with storageId(%s) but service destroyed", Integer.valueOf(optInt));
            return "fail:internal error";
        }
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = kVar.getRuntime().mo113051d0().f261073s;
        String str = kVar.getRuntime().mo113051d0().f261075u;
        if (i4 != 1) {
            Object[] Bh = ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), i4, str).mo56588Bh(optInt, kVar.getAppId());
            int ceil = (int) Math.ceil(((Integer) Bh[1]).doubleValue() / 1000.0d);
            i = (int) Math.ceil(((Integer) Bh[2]).doubleValue() / 1000.0d);
            i2 = ceil;
            arrayList = (ArrayList) Bh[0];
            i3 = 2;
        } else {
            JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new JsApiGetStorageInfoTask();
            jsApiGetStorageInfoTask.f242661f = kVar.getAppId();
            jsApiGetStorageInfoTask.f242662g = optInt;
            jsApiGetStorageInfoTask.mo114396f();
            ArrayList<String> arrayList2 = jsApiGetStorageInfoTask.f242663h;
            int i5 = jsApiGetStorageInfoTask.f242664i;
            arrayList = arrayList2;
            i = jsApiGetStorageInfoTask.f242665j;
            i2 = i5;
        }
        C81419l0.m99894a(i3, 3, i2 * 1000, arrayList == null ? 0 : arrayList.size(), System.currentTimeMillis() - currentTimeMillis, kVar);
        hashMap.put("keys", arrayList);
        hashMap.put("currentSize", Integer.valueOf(i2));
        hashMap.put("limitSize", Integer.valueOf(i));
        return mo115112m("ok", hashMap);
    }
}
