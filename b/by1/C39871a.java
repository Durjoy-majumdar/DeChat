package by1;

import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import p824tc.C48619a;
import p828wa.C53133t;

/* renamed from: by1.a */
public class C39871a extends IStaticListener<DestroyPreloadedWebViewEvent> {
    public boolean callback(IEvent iEvent) {
        DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = (DestroyPreloadedWebViewEvent) iEvent;
        C41985r.f113086a.size();
        Log.m105924i("MicroMsg.PreloadGameWebCoreHelp", "MultiWebView-Trace destroy 1 webView for GameCenter");
        for (C53133t next : C41985r.f113086a.values()) {
            next.mo73822j();
            C48619a aVar = next.f148245i;
            if (aVar != null) {
                aVar.destroy();
            }
        }
        C41985r.f113086a.clear();
        return false;
    }
}
