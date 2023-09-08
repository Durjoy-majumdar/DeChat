package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import pb1.C100714h1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w0 */
public final class C1886w0 {
    /* renamed from: a */
    public static final int m1907a(String str, String str2, String str3) {
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        ((C100714h1) C86312j.m106911c(C100714h1.class)).Gh0(doFavoriteEvent, 6, str, C1675e7.m1724a(str, str2, str3), "");
        doFavoriteEvent.publish();
        int i = doFavoriteEvent.f264675e.f9046a;
        Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteMainProcess, ret: " + i);
        return i;
    }
}
