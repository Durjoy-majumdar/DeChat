package com.tencent.p014mm.plugin.webview.util;

import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/webview/util/WebViewControllerPreloadMrg$addToCache$1$2", "Lcom/tencent/xweb/WebChromeClient;", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$2 */
public final class WebViewControllerPreloadMrg$addToCache$1$2 extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ BaseWebViewController f120351a;

    public WebViewControllerPreloadMrg$addToCache$1$2(BaseWebViewController baseWebViewController) {
        this.f120351a = baseWebViewController;
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f120351a.f117581o = str;
    }
}
