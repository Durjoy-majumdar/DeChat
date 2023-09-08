package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.model.C43704h2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$w */
public class WebViewUI$$w implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118658d;

    public WebViewUI$$w(WebViewUI webViewUI) {
        this.f118658d = webViewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        WebViewUI webViewUI = this.f118658d;
        if (webViewUI.f118491T0.mo70863f(webViewUI.getCurrentURL())) {
            C43704h2.C43711h j = this.f118658d.f118459E1.mo68012j();
            j.mo68019a(this.f118658d.mo6901n0(), 6);
            C115669n.INSTANCE.mo160137l(11576, j.f118154a);
        } else {
            C43704h2.C43711h j2 = this.f118658d.f118459E1.mo68012j();
            j2.mo68019a(this.f118658d.mo6901n0(), 5);
            C115669n.INSTANCE.mo160137l(11576, j2.f118154a);
        }
        this.f118658d.mo68318w9();
        return true;
    }
}
