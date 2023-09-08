package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p680ru.C77570i;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$f0 */
public class WebViewUI$$f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118599d;

    public WebViewUI$$f0(WebViewUI webViewUI) {
        this.f118599d = webViewUI;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("WebViewUI_");
        WebViewUI webViewUI = this.f118599d;
        sb.append(webViewUI.mo68291k8(Util.nullAsNil(webViewUI.f118542m1)));
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, sb.toString(), this.f118599d.mo68267Y7());
    }
}
