package g00;

import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.plugin.webview.util.WebViewControllerPreloadMrg;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.SoftReference;
import java.util.Map;
import u93.C52495g;
import u93.C52496h;

/* renamed from: g00.a */
public class C45872a extends IStaticListener<DestroyPreloadedWebViewEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        boolean z2;
        BaseWebSearchWebView baseWebSearchWebView;
        BaseWebSearchWebView baseWebSearchWebView2;
        BaseWebSearchWebView baseWebSearchWebView3;
        DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = (DestroyPreloadedWebViewEvent) iEvent;
        synchronized (C52495g.class) {
            C52496h hVar = C52495g.f146647a;
            z = true;
            int i = (hVar != null ? hVar.f146649b : null) != null ? 1 : 0;
            Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "MultiWebView-Trace destroy " + i + " webView for WebSearch");
            C52496h hVar2 = C52495g.f146647a;
            if (!(hVar2 == null || (baseWebSearchWebView3 = hVar2.f146649b) == null)) {
                baseWebSearchWebView3.clearHistory();
            }
            C52496h hVar3 = C52495g.f146647a;
            if (!(hVar3 == null || (baseWebSearchWebView2 = hVar3.f146649b) == null)) {
                baseWebSearchWebView2.clearView();
            }
            C52496h hVar4 = C52495g.f146647a;
            if (!(hVar4 == null || (baseWebSearchWebView = hVar4.f146649b) == null)) {
                baseWebSearchWebView.destroy();
            }
            C52496h hVar5 = C52495g.f146647a;
            if (hVar5 != null) {
                hVar5.f146649b = null;
            }
            C52495g.f146647a = null;
        }
        boolean isBackground = ProcessDeepBackgroundOwner.INSTANCE.isBackground();
        boolean isBackground2 = AppDeepBackgroundOwner.INSTANCE.isBackground();
        if (!isBackground && !isBackground2) {
            z = false;
        }
        boolean z3 = destroyPreloadedWebViewEvent.f78769d.f78771b;
        if (z || !z3) {
            for (Map.Entry next : C43861d.f118785c.entrySet()) {
                String str = (String) next.getKey();
                C43522y yVar = (C43522y) ((SoftReference) next.getValue()).get();
                if (yVar != null && (z2 = yVar.f117532H) && z2) {
                    yVar.mo67812d();
                }
            }
            C43861d.f118785c.clear();
        }
        if (z) {
            WebViewControllerPreloadMrg.f120348a.mo69175b();
        }
        return false;
    }
}
