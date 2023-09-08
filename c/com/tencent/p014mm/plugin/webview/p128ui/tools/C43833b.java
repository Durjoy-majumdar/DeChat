package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.b */
public class C43833b extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ ContactQZoneWebView f118705a;

    public C43833b(ContactQZoneWebView contactQZoneWebView) {
        this.f118705a = contactQZoneWebView;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (str.startsWith("weixin://viewimage/")) {
            this.f118705a.mo68165I9(str);
            webView.stopLoading();
        } else if (str.equals(this.f118705a.f118314K2)) {
            Util.jump(this.f118705a, str);
            webView.stopLoading();
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("weixin://viewimage/")) {
            this.f118705a.mo68165I9(str);
            webView.stopLoading();
        } else if (!str.startsWith("weixinping://iframe") && !str.startsWith("weixinpreinject://iframe")) {
            webView.loadUrl(str);
        }
        return true;
    }
}
