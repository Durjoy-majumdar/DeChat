package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$d */
public class WebViewUI$$d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f118593a;

    /* renamed from: b */
    public final /* synthetic */ WebViewUI f118594b;

    public WebViewUI$$d(WebViewUI webViewUI, View view) {
        this.f118594b = webViewUI;
        this.f118593a = view;
    }

    public void onSystemUiVisibilityChange(int i) {
        if ((i & 4) == 0 && this.f118594b.f118450B) {
            WebViewUI.m47808J7(this.f118593a, 5894);
        }
    }
}
