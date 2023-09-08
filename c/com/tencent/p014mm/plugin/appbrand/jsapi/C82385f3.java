package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f3 */
public final class C82385f3 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 916;
    public static final String NAME = "getRandomValues";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null) {
            int i2 = -1;
            if (jSONObject != null) {
                i2 = jSONObject.optInt("length", -1);
            }
            if (i2 <= 0) {
                i2Var.mo109647a(i, mo115109j("fail: illegal length"));
                return;
            }
            byte[] bArr = new byte[i2];
            new SecureRandom().nextBytes(bArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ByteBuffer e = C84782s1.m104464e(bArr);
            C87412m.m108593f(e, "wrapDirectByteBuffer(byteArray)");
            linkedHashMap.put("randomValues", e);
            if (C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(i2Var.getJsRuntime(), linkedHashMap, (C84782s1.C84783a) i2Var.mo109671p(C84782s1.C84783a.class))) {
                i2Var.mo109647a(i, mo115109j("fail: internal error"));
                Log.m105928w("MicroMsg.JsApiGetRandomValues", "invoke, convert NativeBuffer fail");
                return;
            }
            i2Var.mo109647a(i, mo115112m("ok", linkedHashMap));
        }
    }
}
