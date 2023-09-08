package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$r */
public class WebViewUI$$r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118651d;

    public WebViewUI$$r(WebViewUI webViewUI) {
        this.f118651d = webViewUI;
    }

    public void run() {
        MMWebView mMWebView = this.f118651d.f118523f;
        if (mMWebView != null) {
            WebViewClient webViewClient = mMWebView.getWebViewClient();
            MMWebView mMWebView2 = this.f118651d.f118523f;
            webViewClient.onPageFinished(mMWebView2, mMWebView2.getUrl());
        }
    }
}
