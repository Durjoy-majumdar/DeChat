package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.p136ui.widget.MMWebView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.u1 */
public class C44204u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f119750d;

    public C44204u1(WebViewUI webViewUI) {
        this.f119750d = webViewUI;
    }

    public void run() {
        MMWebView mMWebView = this.f119750d.f118523f;
        if (mMWebView != null) {
            mMWebView.requestLayout();
        }
    }
}
