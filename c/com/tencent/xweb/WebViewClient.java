package com.tencent.xweb;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.SafeBrowsingResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WebViewClient {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    @Deprecated
    private void onTooManyRedirects(WebView webView, Message message, Message message2) {
        message.sendToTarget();
    }

    private void onUnhandledInputEventInternal(WebView webView, InputEvent inputEvent) {
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        message.sendToTarget();
    }

    public void onLoadResource(WebView webView, String str) {
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        httpAuthHandler.cancel();
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (Build.VERSION.SDK_INT >= 27) {
            safeBrowsingResponse.showInterstitial(true);
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
    }

    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
        if (inputEvent instanceof KeyEvent) {
            onUnhandledKeyEvent(webView, (KeyEvent) inputEvent);
        } else {
            onUnhandledInputEventInternal(webView, inputEvent);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        onUnhandledInputEventInternal(webView, keyEvent);
    }

    public boolean shouldInterceptLoadError(WebView webView, int i, String str, String str2) {
        return false;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        return null;
    }

    @Deprecated
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
