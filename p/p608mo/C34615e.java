package p608mo;

import ay0.C39656k;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43503a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;

/* renamed from: mo.e */
public class C34615e extends IStaticListener<DestroyPreloadedWebViewEvent> {
    public boolean callback(IEvent iEvent) {
        long j = ((DestroyPreloadedWebViewEvent) iEvent).f78769d.f78770a;
        C39656k kVar = C39656k.f106417a;
        synchronized (C39656k.class) {
            ConcurrentHashMap<Integer, MpWebViewController> concurrentHashMap = C39656k.f106419c;
            int size = concurrentHashMap.size();
            Log.m105924i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + size + " webView for MpStartedWebView");
            for (Map.Entry<Integer, MpWebViewController> value : concurrentHashMap.entrySet()) {
                MpWebViewController mpWebViewController = (MpWebViewController) value.getValue();
                mpWebViewController.getClass();
                C61926c.m72668M(new C43503a(mpWebViewController));
            }
            C39656k.f106419c.clear();
            ConcurrentHashMap<Integer, MpWebViewController> concurrentHashMap2 = C39656k.f106418b;
            int size2 = concurrentHashMap2.size();
            Log.m105924i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + size2 + " webView for MpCachedWebView");
            for (Map.Entry<Integer, MpWebViewController> value2 : concurrentHashMap2.entrySet()) {
                MpWebViewController mpWebViewController2 = (MpWebViewController) value2.getValue();
                mpWebViewController2.getClass();
                C61926c.m72668M(new C43503a(mpWebViewController2));
            }
            C39656k.f106418b.clear();
        }
        return false;
    }
}
