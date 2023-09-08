package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import p206nj.C117627q;
import p823sg.C77710q;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.c1 */
public class C5891c1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "openWeApp";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiOpenWeApp", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("fail_invalid_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("currentUrl");
        String optString2 = e.optString("preVerifyAppId");
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9531f = context;
        aVar.f9526a = e.optString("userName");
        startAppBrandUIFromOuterEvent.f9522d.f9533h = e.optString("appId");
        startAppBrandUIFromOuterEvent.f9522d.f9527b = e.optString("relativeURL");
        startAppBrandUIFromOuterEvent.f9522d.f9534i = e.optInt("appVersion", 0);
        startAppBrandUIFromOuterEvent.f9522d.f9529d = e.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1018);
        startAppBrandUIFromOuterEvent.f9522d.f9530e = e.optString("sceneNote");
        if (Util.isNullOrNil(startAppBrandUIFromOuterEvent.f9522d.f9530e)) {
            startAppBrandUIFromOuterEvent.f9522d.f9530e = C117627q.m165908a(Util.nullAsNil(optString));
        }
        startAppBrandUIFromOuterEvent.f9522d.f9536k = e.optString("downloadURL");
        startAppBrandUIFromOuterEvent.f9522d.f9528c = e.optInt("openType", 0);
        startAppBrandUIFromOuterEvent.f9522d.f9537l = e.optString("checkSumMd5");
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9539n = false;
        aVar2.f9540o.f237920f = e.optString("extJsonInfo");
        startAppBrandUIFromOuterEvent.f9522d.f9546u = optString2;
        if (Util.isNullOrNil(optString2)) {
            startAppBrandUIFromOuterEvent.f9522d.f9546u = e.optString("sourceAppId");
        }
        StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
        aVar3.f9547v = optString;
        aVar3.f9548w = e.optString("privateExtraData");
        if (e.has("devuin")) {
            startAppBrandUIFromOuterEvent.f9522d.f9535j = C77710q.m93739b(e.optString("devuin"));
        }
        startAppBrandUIFromOuterEvent.publish();
        StartAppBrandUIFromOuterEvent.C1143b bVar2 = startAppBrandUIFromOuterEvent.f9523e;
        if (bVar2.f9552a) {
            bVar.mo6945a((String) null, (JSONObject) null);
        } else {
            bVar.mo6945a(Util.nullAsNil(bVar2.f9553b), (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
