package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.util.Base64;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONObject;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.c */
public class C4781c extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiCalRqt", "Invoke calRqt");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("rqt");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("fail: dataIn is null");
            return;
        }
        byte[] bytes = optString.getBytes(Charset.forName("UTF-8"));
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        PByteArray pByteArray = new PByteArray();
        if (C118418g.INSTANCE.mo175794F6(1, bytes, 0, bytes.length, pInt, pInt2, pByteArray)) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("k1", Integer.valueOf(pInt.value));
            hashMap.put("k2", Integer.valueOf(pInt2.value));
            hashMap.put("data", Base64.encodeToString(pByteArray.value, 2));
            this.f19815f.mo5691c(hashMap);
            return;
        }
        Log.m105920e("LiteAppJsApiCalRqt", "calrqt, connot calculate hash of rqt data.");
        this.f19815f.mo5689a("fail");
    }
}
