package com.tencent.p014mm.plugin.webview.util;

import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import t83.C48590l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/webview/util/WebViewControllerPreloadMrg$addToCache$1$3", "Lcom/tencent/mm/plugin/webview/core/z;", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$3 */
public final class WebViewControllerPreloadMrg$addToCache$1$3 extends C43558z {

    /* renamed from: b */
    public final /* synthetic */ BaseWebViewController f120352b;

    /* renamed from: c */
    public final /* synthetic */ String f120353c;

    public WebViewControllerPreloadMrg$addToCache$1$3(BaseWebViewController baseWebViewController, String str) {
        this.f120352b = baseWebViewController;
        this.f120353c = str;
    }

    /* renamed from: e */
    public void mo64862e() {
        try {
            C44255f1 f1Var = new C44255f1(new WeakReference(this.f120352b));
            WebViewControllerPreloadMrg.f120350c.put(this.f120353c, f1Var);
            C48590l g0 = this.f120352b.mo67720g0();
            if (g0 != null) {
                g0.f130008m = f1Var;
            }
            this.f120352b.mo67731m().Np0(f1Var, this.f120352b.mo67719g());
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WebViewControllerPreloadMrg", th, "addToCache exception", new Object[0]);
        }
        this.f120352b.mo67756y(this);
    }
}
