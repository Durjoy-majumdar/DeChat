package com.tencent.p014mm.xwebutil;

import com.tencent.p014mm.autogen.events.XWebViewInitCompleteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.xwebutil.p */
public class C19914p implements WebView.PreInitCallback {

    /* renamed from: a */
    public final /* synthetic */ WebView.PreInitCallback f56758a;

    public C19914p(WebView.PreInitCallback preInitCallback) {
        this.f56758a = preInitCallback;
    }

    public void onCoreInitFailed() {
        Log.m105924i("XWeb.MM.XWebUtil", "onCoreInitFailed");
        XWebViewInitCompleteEvent xWebViewInitCompleteEvent = new XWebViewInitCompleteEvent();
        xWebViewInitCompleteEvent.f48138d.f48139a = false;
        xWebViewInitCompleteEvent.publish();
        WebView.PreInitCallback preInitCallback = this.f56758a;
        if (preInitCallback != null) {
            preInitCallback.onCoreInitFailed();
        }
    }

    public void onCoreInitFinished() {
        Log.m105924i("XWeb.MM.XWebUtil", "onCoreInitFinished");
        XWebViewInitCompleteEvent xWebViewInitCompleteEvent = new XWebViewInitCompleteEvent();
        xWebViewInitCompleteEvent.f48138d.f48139a = true;
        xWebViewInitCompleteEvent.publish();
        WebView.PreInitCallback preInitCallback = this.f56758a;
        if (preInitCallback != null) {
            preInitCallback.onCoreInitFinished();
        }
    }
}
