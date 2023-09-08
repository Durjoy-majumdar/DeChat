package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$e */
public class JsApiOpenGameUrlWithExtraWebView$$e implements C80883e<Bundle, Bundle> {
    private JsApiOpenGameUrlWithExtraWebView$$e() {
    }

    public void invoke(Object obj, C1256g gVar) {
        Log.m105918d("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "getLiteConfTask in mm process");
        ((C48478n) C86312j.m106911c(C48478n.class)).mo65690pN(((Bundle) obj).getString("url"), new JsApiOpenGameUrlWithExtraWebView$$e$$a(gVar));
    }
}
