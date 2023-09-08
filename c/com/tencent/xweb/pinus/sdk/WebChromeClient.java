package com.tencent.xweb.pinus.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import java.util.Map;

public class WebChromeClient {
    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    public View getVideoLoadingProgressView() {
        return null;
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(WebView webView) {
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return false;
    }

    public void onExitFullscreenVideo(Bitmap bitmap) {
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
    }

    public void onGetSampleString(WebView webView, Map<String, String> map) {
    }

    public void onGetTranslateString(WebView webView, Map<String, String> map) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
        return false;
    }

    public boolean onJsAlertInner(WebView webView, String str, String str2, Object obj) {
        return false;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
        return false;
    }

    public boolean onJsBeforeUnloadInner(WebView webView, String str, String str2, Object obj) {
        return false;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
        return false;
    }

    public boolean onJsConfirmInner(WebView webView, String str, String str2, Object obj) {
        return false;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsResultInterface jsResultInterface) {
        return false;
    }

    public boolean onJsPromptInner(WebView webView, String str, String str2, String str3, Object obj) {
        return false;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    public void onProgressChanged(WebView webView, int i) {
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    public void onReceivedTitle(WebView webView, String str) {
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    public void onRequestFocus(WebView webView) {
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
