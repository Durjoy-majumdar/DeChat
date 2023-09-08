package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Build;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82547i7;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h7 */
public class C82530h7 extends C82547i7 {
    /* renamed from: a */
    public void mo114862a(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "config");
        C82547i7.C82548a aVar = C82547i7.f241644a;
        aVar.mo114875a(jSONObject, "platform", Platform.ANDROID);
        aVar.mo114875a(jSONObject, "brand", Build.BRAND);
        aVar.mo114875a(jSONObject, "model", C87203t.m108275k());
        try {
            jSONObject.put("nativeBufferEnabled", Boolean.TRUE);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e, "put with key(nativeBufferEnabled)", new Object[0]);
        }
    }
}
