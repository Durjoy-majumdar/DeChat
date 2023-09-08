package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Util;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$e$$a */
public final /* synthetic */ class JsApiOpenGameUrlWithExtraWebView$$e$$a implements C48478n.C13791d {

    /* renamed from: a */
    public final /* synthetic */ C1256g f19211a;

    public /* synthetic */ JsApiOpenGameUrlWithExtraWebView$$e$$a(C1256g gVar) {
        this.f19211a = gVar;
    }

    /* renamed from: a */
    public final void mo5391a(C48478n.C13790c cVar) {
        C1256g gVar = this.f19211a;
        if (cVar == null || Util.isNullOrNil(cVar.f38905a) || Util.isNullOrNil(cVar.f38906b)) {
            gVar.mo894a(null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", cVar.f38905a);
        bundle.putString("path", cVar.f38906b);
        gVar.mo894a(bundle);
    }
}
