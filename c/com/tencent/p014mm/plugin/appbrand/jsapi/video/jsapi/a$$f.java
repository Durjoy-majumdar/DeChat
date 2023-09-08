package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.page.C83798e4;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$f */
public class a$$f implements C83798e4 {

    /* renamed from: a */
    public final /* synthetic */ AppBrandVideoView f49587a;

    public a$$f(C17988a aVar, AppBrandVideoView appBrandVideoView) {
        this.f49587a = appBrandVideoView;
    }

    /* renamed from: a */
    public void mo22379a() {
        AppBrandVideoView appBrandVideoView = this.f49587a;
        appBrandVideoView.getClass();
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onExitFullScreen");
        if (appBrandVideoView.f49524i.mo22370y()) {
            appBrandVideoView.f49524i.mo22368w();
        }
        appBrandVideoView.mo22216c(false);
    }
}
