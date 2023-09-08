package com.tencent.p014mm.plugin.finder.webview;

import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.finder.webview.e0 */
public class C41629e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f112068d;

    public C41629e0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112068d = webViewLongClickHelper;
    }

    public void run() {
        WebViewLongClickHelper webViewLongClickHelper = this.f112068d;
        WebView.HitTestResult hitTestResult = webViewLongClickHelper.f112001c;
        if (hitTestResult != null) {
            webViewLongClickHelper.mo64774k(hitTestResult);
            return;
        }
        WebView.HitTestResult hitTestResult2 = webViewLongClickHelper.f112002d;
        if (hitTestResult2 != null) {
            webViewLongClickHelper.mo64773j(hitTestResult2);
        }
    }
}
