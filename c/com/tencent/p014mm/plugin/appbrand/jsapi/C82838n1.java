package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import pb1.C100714h1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n1 */
public final class C82838n1 {
    /* renamed from: a */
    public static final int m101588a(String str, String str2) {
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        int b = C82388f7.m101145b(str);
        if (b <= 0) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, durationS: " + b);
            return Integer.MIN_VALUE;
        }
        String a = C82388f7.m101144a(str, str2);
        if (a == null || a.length() == 0) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, thumbPath is empty");
            return Integer.MIN_VALUE;
        }
        ((C100714h1) C86312j.m106911c(C100714h1.class)).Zp0(doFavoriteEvent, 6, str, a, b, "", "");
        doFavoriteEvent.publish();
        int i = doFavoriteEvent.f264675e.f9046a;
        Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, ret: " + i);
        return i;
    }
}
