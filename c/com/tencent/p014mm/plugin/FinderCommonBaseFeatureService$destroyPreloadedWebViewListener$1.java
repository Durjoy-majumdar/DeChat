package com.tencent.p014mm.plugin;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.plugin.finder.webview.C30036j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DestroyPreloadedWebViewEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1 */
public final class FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1 extends IListener<DestroyPreloadedWebViewEvent> {
    public FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = (DestroyPreloadedWebViewEvent) iEvent;
        C87412m.m108594g(destroyPreloadedWebViewEvent, "event");
        long j = destroyPreloadedWebViewEvent.f78769d.f78770a;
        C30036j jVar = C30036j.f81277a;
        synchronized (C30036j.class) {
            if (C30036j.f81278b != null) {
                Log.m105924i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for FinderWebView");
                BoxWebView boxWebView = C30036j.f81278b;
                if (boxWebView != null) {
                    boxWebView.destroy();
                }
                C30036j.f81278b = null;
            }
        }
        return false;
    }
}
