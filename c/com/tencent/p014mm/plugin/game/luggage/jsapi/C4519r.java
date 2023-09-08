package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.util.Base64;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.r */
public final class C4519r extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return JsApiEcdSaSign.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e != null && context != null && bVar != null) {
            String optString = e.optString("signText");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("signText is null", (JSONObject) null);
                return;
            }
            String optString2 = e.optString("h5Url", "");
            if (e.has("shortPrefix")) {
                C87412m.m108593f(optString2, "url");
                String optString3 = e.optString("shortPrefix");
                C87412m.m108593f(optString3, "data.optString(\"shortPrefix\")");
                if (C112550d0.m153801u(optString2, optString3, false)) {
                    optString2 = e.optString("shortPrefix");
                }
            }
            String str2 = '|' + C31543z5.m39451a() + '|' + optString2;
            String c = C114766b.f344135e.mo174418c(optString + str2);
            if (Util.isNullOrNil(c)) {
                bVar.mo6945a("client signContent is null", (JSONObject) null);
                return;
            }
            Charset charset = StandardCharsets.ISO_8859_1;
            C87412m.m108593f(charset, "ISO_8859_1");
            byte[] bytes = c.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signature", encodeToString);
            jSONObject.put("suffix", str2);
            bVar.mo6945a((String) null, jSONObject);
        } else if (bVar != null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
