package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C55469m;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.u */
public class C82203u implements C55469m.C55472b {

    /* renamed from: a */
    public final /* synthetic */ JsApiAuthorize$AuthorizeTask$$b f241075a;

    public C82203u(JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b) {
        this.f241075a = jsApiAuthorize$AuthorizeTask$$b;
    }

    /* renamed from: a */
    public void mo76928a(String str) {
        this.f241075a.f240799a.f240761C = str;
        StringBuilder sb = new StringBuilder();
        sb.append(" userHeadIconPath=");
        String str2 = this.f241075a.f240799a.f240761C;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        Log.m105924i("MicroMsg.JsApiAuthorize", sb.toString());
        this.f241075a.f240799a.mo114394b();
    }
}
