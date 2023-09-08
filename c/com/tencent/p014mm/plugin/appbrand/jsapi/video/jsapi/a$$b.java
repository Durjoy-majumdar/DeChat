package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$b */
public final /* synthetic */ class a$$b implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C82520h f242777d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandVideoView f242778e;

    public /* synthetic */ a$$b(C82520h hVar, AppBrandVideoView appBrandVideoView) {
        this.f242777d = hVar;
        this.f242778e = appBrandVideoView;
    }

    /* renamed from: b */
    public final void mo22089b() {
        C82520h hVar = this.f242777d;
        AppBrandVideoView appBrandVideoView = this.f242778e;
        C83231l.C83235e d = C83231l.m102143d(hVar.getAppId());
        Log.m105925i("MicroMsg.JsApiInsertVideoPlayer", "VideoPlayer enter background, pause type:%s", d.name());
        appBrandVideoView.getClass();
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onUIPause, type:%s", d);
        C82732k0 RV = C82731k.f242051e.mo115008RV(appBrandVideoView.f49529p0, appBrandVideoView.f49538x0);
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onUIPause, autoPauseStrategy: %s", RV);
        if (!RV.mo114992a(appBrandVideoView.f49541z, d)) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIPause, should skip ui pause");
            appBrandVideoView.f49540y0 = true;
            return;
        }
        appBrandVideoView.f49521f.mo22296b();
    }
}
