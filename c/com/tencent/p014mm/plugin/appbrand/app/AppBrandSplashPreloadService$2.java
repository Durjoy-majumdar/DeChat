package com.tencent.p014mm.plugin.appbrand.app;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.XWebViewInitCompleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandSplashPreloadService$2 */
class AppBrandSplashPreloadService$2 extends IListener<XWebViewInitCompleteEvent> {
    public AppBrandSplashPreloadService$2(C81180q qVar, C0125s sVar) {
        super(sVar);
        this.__eventId = 844954368;
    }

    public boolean callback(IEvent iEvent) {
        XWebViewInitCompleteEvent xWebViewInitCompleteEvent = (XWebViewInitCompleteEvent) iEvent;
        Log.m105924i("MicroMsg.PluginAppBrand", "recv XWebViewInitCompleteEvent in none appbrand processes");
        return false;
    }
}
