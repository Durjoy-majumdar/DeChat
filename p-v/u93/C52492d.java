package u93;

import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C90107a;

/* renamed from: u93.d */
public final class C52492d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C52492d f146644d = new C52492d();

    public C52492d() {
        super(0);
    }

    public Object invoke() {
        C52496h hVar = C52495g.f146647a;
        if (hVar != null) {
            try {
                BaseWebSearchWebView baseWebSearchWebView = hVar.f146649b;
                if (baseWebSearchWebView != null) {
                    baseWebSearchWebView.destroy();
                }
                hVar.f146649b = null;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebSearch.WebSearchPreloadLogic", C90107a.m112736b(e));
            }
        }
        return C13598b0.f38549a;
    }
}
