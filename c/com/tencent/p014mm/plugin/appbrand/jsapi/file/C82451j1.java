package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.j1 */
public final class C82451j1 extends C82491v1 {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        try {
            jSONObject.put("append", true);
            return super.mo114803b(fVar, str, jSONObject);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.UnitAppendFile", "call with path(%s), put append fail ex = %s", str, e);
            return new C82446i("fail ERR_OP_FAIL", new Object[0]);
        }
    }
}
