package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.xweb.WebViewCallbackClient;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$p */
public class WebViewUI$$p implements WebViewCallbackClient {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118649a;

    public WebViewUI$$p(WebViewUI webViewUI) {
        this.f118649a = webViewUI;
    }

    public void onContentHeightChanged(int i) {
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
        WebViewUI webViewUI = this.f118649a;
        if (webViewUI.f118523f == null) {
            return false;
        }
        MMWebView.C45104c cVar = webViewUI.f118449A2;
        if (cVar == null) {
            return true;
        }
        cVar.mo70479a(i, i2, i3, i4, i5, i6, i7, i8, z);
        return true;
    }
}
