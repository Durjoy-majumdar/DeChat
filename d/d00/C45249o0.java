package d00;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.util.WebViewControllerPreloadMrg;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import e00.C45520t;
import e00.C58468e0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

@C86522b
/* renamed from: d00.o0 */
public final class C45249o0 extends C86301e implements C58468e0 {
    /* renamed from: QF */
    public void mo70772QF(String str, C45520t tVar, boolean z, int i, int i2, int i3) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(tVar, "controller");
        WebViewControllerPreloadMrg.f120348a.mo69174a(str, (BaseWebViewController) tVar, z, i, i2, i3);
    }

    /* renamed from: V3 */
    public void mo70773V3(String str) {
        C87412m.m108594g(str, "url");
        WebViewControllerPreloadMrg.f120348a.getClass();
        ConcurrentHashMap<String, BaseWebViewController> concurrentHashMap = WebViewControllerPreloadMrg.f120349b;
        BaseWebViewController baseWebViewController = concurrentHashMap.get(str);
        if (baseWebViewController != null) {
            if (!baseWebViewController.f117530G) {
                MMWebView mMWebView = baseWebViewController.f117553a;
                if (mMWebView != null) {
                    mMWebView.destroy();
                }
                baseWebViewController.onDestroy();
                Log.m105924i("MicroMsg.WebViewControllerPreloadMrg", "destroy " + str);
            }
            WebViewControllerPreloadMrg.f120350c.remove(str);
            concurrentHashMap.remove(str);
        }
    }

    /* renamed from: Zw */
    public boolean mo70774Zw() {
        WebViewControllerPreloadMrg.f120348a.getClass();
        if (WebViewControllerPreloadMrg.f120349b.size() <= 0) {
            return true;
        }
        Log.m105928w("MicroMsg.WebViewControllerPreloadMrg", "banner canPreload, do not cache more than 2 WebViewController!!!");
        return false;
    }

    public void clear() {
        WebViewControllerPreloadMrg.f120348a.mo69175b();
    }

    /* renamed from: jp */
    public boolean mo70776jp(String str) {
        C87412m.m108594g(str, "url");
        return WebViewControllerPreloadMrg.f120348a.mo69176c(str);
    }

    /* renamed from: lb */
    public boolean mo70777lb(String str) {
        C87412m.m108594g(str, "url");
        WebViewControllerPreloadMrg.f120348a.getClass();
        return WebViewControllerPreloadMrg.f120349b.get(str) != null;
    }
}
