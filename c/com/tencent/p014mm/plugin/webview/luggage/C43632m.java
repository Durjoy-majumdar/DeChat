package com.tencent.p014mm.plugin.webview.luggage;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.m */
public class C43632m extends WebChromeClient {

    /* renamed from: a */
    public WebChromeClient f117888a = new WebChromeClient();

    public View getVideoLoadingProgressView() {
        return this.f117888a.getVideoLoadingProgressView();
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.f117888a.onConsoleMessage(consoleMessage);
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.f117888a.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f117888a.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onHideCustomView() {
        this.f117888a.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f117888a.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f117888a.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.f117888a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onProgressChanged(WebView webView, int i) {
        this.f117888a.onProgressChanged(webView, i);
    }

    public void onReceivedTitle(WebView webView, String str) {
        this.f117888a.onReceivedTitle(webView, str);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f117888a.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.f117888a.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        this.f117888a.openFileChooser(valueCallback, str, str2);
    }
}
