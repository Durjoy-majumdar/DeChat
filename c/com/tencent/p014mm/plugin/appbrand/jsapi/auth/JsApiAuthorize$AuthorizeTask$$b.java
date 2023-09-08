package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$b */
public class JsApiAuthorize$AuthorizeTask$$b implements JsApiAuthorize$AuthorizeTask$$f {

    /* renamed from: a */
    public final /* synthetic */ JsApiAuthorize.AuthorizeTask f240799a;

    public JsApiAuthorize$AuthorizeTask$$b(JsApiAuthorize.AuthorizeTask authorizeTask) {
        this.f240799a = authorizeTask;
    }

    /* renamed from: a */
    public void mo114538a(int i, String str) {
        Log.m105920e("MicroMsg.JsApiAuthorize", "onFailure !");
        JsApiAuthorize.AuthorizeTask authorizeTask = this.f240799a;
        authorizeTask.f240783r = "fail";
        authorizeTask.f240769K = i;
        authorizeTask.f240770L = str;
        authorizeTask.mo114394b();
    }
}
