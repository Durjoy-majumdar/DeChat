package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import g83.C45900i;
import t03.C22426h;
import te3.jh4;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.d */
public class C43270d extends C45900i {

    /* renamed from: c */
    public jh4 f117084c;

    public C43270d(jh4 jh4) {
        super(1);
        this.f117084c = jh4;
    }

    public void onPageFinished(WebView webView, String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageFinished %s  %d", str, Long.valueOf(Thread.currentThread().getId()));
        super.onPageFinished(webView, str);
        C22426h.m26099a(this.f117084c, "pageFinish", System.currentTimeMillis());
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C22426h.m26099a(this.f117084c, "pageStart", System.currentTimeMillis());
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageStarted %s %d", str, Long.valueOf(Thread.currentThread().getId()));
        super.onPageStarted(webView, str, bitmap);
    }
}
