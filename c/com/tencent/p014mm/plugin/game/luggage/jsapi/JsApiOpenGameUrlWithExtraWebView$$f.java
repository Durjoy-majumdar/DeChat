package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$f */
public class JsApiOpenGameUrlWithExtraWebView$$f implements C80883e<JsApiOpenGameUrlWithExtraWebView.OpenLiteAppData, IPCBoolean> {
    private JsApiOpenGameUrlWithExtraWebView$$f() {
    }

    public void invoke(Object obj, C1256g gVar) {
        JsApiOpenGameUrlWithExtraWebView.OpenLiteAppData openLiteAppData = (JsApiOpenGameUrlWithExtraWebView.OpenLiteAppData) obj;
        Class cls = C14088e.class;
        Log.m105918d("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp in mm process");
        boolean[] zArr = {true};
        try {
            Bundle bundle = openLiteAppData.f19210d;
            String string = bundle.getString("appId");
            if (Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp appId is null");
                zArr[0] = false;
            } else if (((C14088e) C86312j.m106911c(cls)).mo13509NR(string) == null) {
                Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp");
                zArr[0] = false;
            } else {
                Log.m105925i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp, appId : %s, path : %s, query : %s", string, bundle.getString("path"), bundle.getString(SearchIntents.EXTRA_QUERY));
                ((C14088e) C86312j.m106911c(cls)).mo13510OP(MMApplicationContext.getContext(), bundle, true, false, new C4545w0(this, zArr));
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", e.toString());
        }
        gVar.mo894a(new IPCBoolean(zArr[0]));
    }
}
