package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.o */
public class C82027o implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f240494a;

    /* renamed from: b */
    public final /* synthetic */ int f240495b;

    /* renamed from: c */
    public final /* synthetic */ JsApiJumpDownloaderWidgetForNative f240496c;

    public C82027o(JsApiJumpDownloaderWidgetForNative jsApiJumpDownloaderWidgetForNative, C81925i2 i2Var, int i) {
        this.f240496c = jsApiJumpDownloaderWidgetForNative;
        this.f240494a = i2Var;
        this.f240495b = i;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        this.f240494a.mo109647a(this.f240495b, this.f240496c.mo115109j("ok"));
    }
}
