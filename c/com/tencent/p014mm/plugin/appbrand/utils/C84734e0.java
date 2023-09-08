package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83056w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.e0 */
public class C84734e0 {

    /* renamed from: a */
    public ScreenShotUtil.ScreenShotCallback f247133a = new C84735a();

    /* renamed from: b */
    public C82381f f247134b;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.e0$a */
    public class C84735a implements ScreenShotUtil.ScreenShotCallback {
        public C84735a() {
        }

        public void onScreenShot(String str, long j) {
            Log.m105924i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onScreenShot callback");
            C82381f fVar = C84734e0.this.f247134b;
            Log.m105925i("MicroMsg.AppBrandOnUserCaptureScreenEvent", "user capture screen event dispatch, appId:%s", fVar.getAppId());
            C83056w wVar = new C83056w();
            wVar.mo115194p(fVar);
            wVar.mo115158h();
        }
    }
}
