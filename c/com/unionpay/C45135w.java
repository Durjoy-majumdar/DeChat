package com.unionpay;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

/* renamed from: com.unionpay.w */
final class C45135w extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ C116516b f122408a;

    public C45135w(C116516b bVar, byte b) {
        this.f122408a = bVar;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.cancel();
        Toast.makeText(this.f122408a.f349480e, str2, 0).show();
        return true;
    }
}
