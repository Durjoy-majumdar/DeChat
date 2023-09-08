package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.c1 */
public class C43845c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f118757d;

    public C43845c1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118757d = webViewLongClickHelper;
    }

    public void run() {
        WebViewLongClickHelper webViewLongClickHelper = this.f118757d;
        WebView.HitTestResult hitTestResult = webViewLongClickHelper.f118394c;
        if (hitTestResult != null) {
            webViewLongClickHelper.mo68202p(hitTestResult);
            return;
        }
        WebView.HitTestResult hitTestResult2 = webViewLongClickHelper.f118395d;
        if (hitTestResult2 != null) {
            webViewLongClickHelper.mo68201o(hitTestResult2);
        }
    }
}
