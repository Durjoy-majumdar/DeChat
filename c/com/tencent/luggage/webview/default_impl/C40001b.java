package com.tencent.luggage.webview.default_impl;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p824tc.C48619a;
import p828wa.C53133t;
import p828wa.C53135u;

/* renamed from: com.tencent.luggage.webview.default_impl.b */
public class C40001b extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C48619a.C48620a f107234a;

    public C40001b(C17638a aVar, C48619a.C48620a aVar2) {
        this.f107234a = aVar2;
    }

    public void onPageFinished(WebView webView, String str) {
        ((C53133t.C53134a) this.f107234a).mo73825b(str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C53133t.C53134a aVar = (C53133t.C53134a) this.f107234a;
        C53133t tVar = C53133t.this;
        tVar.f148251r = false;
        tVar.f148250q = str;
        tVar.f148246j.f129380d.getClass();
        C53135u uVar = C53133t.this.f148244h;
        if (uVar != null) {
            uVar.mo65891c(str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ((C53133t.C53134a) this.f107234a).mo73826c(webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return ((C53133t.C53134a) this.f107234a).mo73824a(str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return ((C53133t.C53134a) this.f107234a).mo73826c(str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return ((C53133t.C53134a) this.f107234a).mo73824a(webResourceRequest.getUrl().toString());
    }
}
