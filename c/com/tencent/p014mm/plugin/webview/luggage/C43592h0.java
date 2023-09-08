package com.tencent.p014mm.plugin.webview.luggage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: com.tencent.mm.plugin.webview.luggage.h0 */
public class C43592h0 extends WebViewClient {

    /* renamed from: a */
    public WebViewClient f117835a = new WebViewClient();

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f117835a.doUpdateVisitedHistory(webView, str, z);
    }

    public void onLoadResource(WebView webView, String str) {
        this.f117835a.onLoadResource(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f117835a.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f117835a.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f117835a.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f117835a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f117835a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.f117835a.onScaleChanged(webView, f, f2);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f117835a.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f117835a.shouldOverrideUrlLoading(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f117835a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f117835a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        return this.f117835a.shouldInterceptRequest(webView, webResourceRequest, bundle);
    }
}
