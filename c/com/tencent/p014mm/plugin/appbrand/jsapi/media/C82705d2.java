package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import km0.C88224a;
import km0.C88226c;
import org.json.JSONObject;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.d2 */
public final class C82705d2 {
    /* renamed from: a */
    public static void m101475a(C82381f fVar, JSONObject jSONObject, Intent intent, String str) {
        C88224a aVar = (C88224a) C89909e.m112436a(C88224a.class);
        if (aVar == null) {
            Log.m105928w("MicroMsg.AppBrand.ReferrerHelper", "mayPutReferrer, referrerHelper is null");
            return;
        }
        C88226c f2 = aVar.mo117493f2(jSONObject, fVar);
        if (f2 == null) {
            f2 = aVar.mo117491e4();
        }
        if (C88226c.NO_REFERRER != f2) {
            intent.putExtra("IsFromWebViewReffer", str);
        }
    }
}
