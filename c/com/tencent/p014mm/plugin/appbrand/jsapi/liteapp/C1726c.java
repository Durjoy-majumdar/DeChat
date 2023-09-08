package com.tencent.p014mm.plugin.appbrand.jsapi.liteapp;

import com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp;
import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.c */
public class C1726c implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ Boolean[] f11428a;

    public C1726c(JsApiOpenLiteApp.C1720c cVar, Boolean[] boolArr) {
        this.f11428a = boolArr;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp success");
        this.f11428a[0] = Boolean.TRUE;
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp fail");
        this.f11428a[0] = Boolean.FALSE;
    }
}
