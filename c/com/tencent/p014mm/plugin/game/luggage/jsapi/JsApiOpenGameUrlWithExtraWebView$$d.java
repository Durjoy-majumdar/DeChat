package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.os.Bundle;
import p828wa.C53106j;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$d */
public class JsApiOpenGameUrlWithExtraWebView$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53138x f19219d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f19220e;

    public JsApiOpenGameUrlWithExtraWebView$$d(JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView, C53138x xVar, Bundle bundle) {
        this.f19219d = xVar;
        this.f19220e = bundle;
    }

    public void run() {
        C53106j.this.mo73792g(this.f19220e.getString("rawUrl"), this.f19220e);
    }
}
