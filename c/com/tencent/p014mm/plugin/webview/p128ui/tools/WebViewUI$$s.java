package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$s */
public class WebViewUI$$s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f118652d;

    /* renamed from: e */
    public final /* synthetic */ String f118653e;

    /* renamed from: f */
    public final /* synthetic */ WebViewUI f118654f;

    public WebViewUI$$s(WebViewUI webViewUI, boolean z, String str) {
        this.f118654f = webViewUI;
        this.f118652d = z;
        this.f118653e = str;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.f118652d) {
            this.f118654f.mo68318w9();
            return true;
        }
        this.f118654f.mo68316v9(this.f118653e);
        return true;
    }
}
