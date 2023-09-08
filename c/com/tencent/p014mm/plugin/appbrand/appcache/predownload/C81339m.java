package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kr0.C88273g1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.m */
public final class C81339m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f238802d;

    /* renamed from: e */
    public final /* synthetic */ long f238803e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81339m(String str, long j) {
        super(0);
        this.f238802d = str;
        this.f238803e = j;
    }

    public Object invoke() {
        LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
        C88273g1 g1Var = C88273g1.QRCODE_LONG_PRESS;
        WxaAttributes LL = C81161g2.Cx0().mo114000LL(this.f238802d, "appInfo");
        WxaAttributes.C81628a m2 = LL != null ? LL.mo113940m2() : null;
        if (m2 != null) {
            if (m2.mo113970a()) {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WAGAME username:" + this.f238802d + ", timestamp:" + this.f238803e);
                AppBrandProcessesManager.f246131g.mo116962a().mo116954S(LuggageServiceType.WAGAME, g1Var);
            } else if (m2.mo113971b()) {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload FAKE NATIVE username:" + this.f238802d + ", timestamp:" + this.f238803e);
                AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
            } else {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WASERVICE username:" + this.f238802d + ", timestamp:" + this.f238803e);
                AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
            }
        }
        return C13598b0.f38549a;
    }
}
