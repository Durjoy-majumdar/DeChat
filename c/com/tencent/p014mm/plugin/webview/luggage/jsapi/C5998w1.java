package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.w1 */
public class C5998w1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setFontSizeCallback";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        int optInt = aVar.f148190b.f129368c.optInt("fontSize");
        ((C43658n) aVar.f148189a).mo67931D(optInt);
        Log.m105924i("MicroMsg.JsApiSetFrontSizeCallback", "doSetFontSizeCb, fontSize = " + optInt);
        aVar.mo73776a();
    }
}
