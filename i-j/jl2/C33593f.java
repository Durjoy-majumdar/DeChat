package jl2;

import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import vk2.C37745o;

/* renamed from: jl2.f */
public class C33593f extends IStaticListener<DestroyPreloadedWebViewEvent> {
    public boolean callback(IEvent iEvent) {
        long j = ((DestroyPreloadedWebViewEvent) iEvent).f78769d.f78770a;
        C37745o oVar = C37745o.f99965a;
        synchronized (C37745o.class) {
            if (C37745o.f99966b != null) {
                Log.m105924i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for ScannerWebView");
                BoxWebView boxWebView = C37745o.f99966b;
                if (boxWebView != null) {
                    boxWebView.destroy();
                }
                C37745o.f99966b = null;
            }
        }
        return false;
    }
}
