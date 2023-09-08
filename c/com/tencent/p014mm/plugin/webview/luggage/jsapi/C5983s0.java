package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C76630x0;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.s0 */
public class C5983s0 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return C82801g.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiLaunchMiniProgram", "invoke");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.JsApiLaunchMiniProgram", "data is null");
            bVar.mo6945a("fail_null_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("targetAppId");
        String optString2 = e.optString("currentUrl");
        String optString3 = e.optString("preVerifyAppId");
        if (Util.isNullOrNil(optString3)) {
            optString3 = e.optString("referrerAppId");
        }
        String str2 = optString3;
        if (Util.isNullOrNil(optString)) {
            bVar.mo6945a("invalid_targetAppId", (JSONObject) null);
        } else if (Util.isNullOrNil(str2)) {
            bVar.mo6945a("invalid_referrerAppId", (JSONObject) null);
        } else {
            String nullAsNil = Util.nullAsNil(e.optString("envVersion"));
            nullAsNil.getClass();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Kw0(context, optString2, str2, optString, !nullAsNil.equals("trial") ? !nullAsNil.equals("develop") ? 0 : 1 : 2, e.optString("path"), 0);
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
