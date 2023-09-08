package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$c */
public final /* synthetic */ class a$$c implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ AppBrandVideoView f49585d;

    /* renamed from: e */
    public final /* synthetic */ C17989b f49586e;

    public /* synthetic */ a$$c(AppBrandVideoView appBrandVideoView, C17989b bVar) {
        this.f49585d = appBrandVideoView;
        this.f49586e = bVar;
    }

    public final void onDestroy() {
        AppBrandVideoView appBrandVideoView = this.f49585d;
        C17989b bVar = this.f49586e;
        appBrandVideoView.getClass();
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIDestroy");
        appBrandVideoView.mo22219f();
        bVar.run();
    }
}
