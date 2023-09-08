package p172io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import p359m4.C21483b;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl */
public class WebViewClientFlutterApiImpl extends GeneratedAndroidWebView.WebViewClientFlutterApi {
    private final InstanceManager instanceManager;

    public WebViewClientFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager2) {
        super(binaryMessenger);
        this.instanceManager = instanceManager2;
    }

    public static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(WebResourceError webResourceError) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf((long) webResourceError.getErrorCode())).setDescription(webResourceError.getDescription().toString()).build();
    }

    public static GeneratedAndroidWebView.WebResourceRequestData createWebResourceRequestData(WebResourceRequest webResourceRequest) {
        GeneratedAndroidWebView.WebResourceRequestData.Builder requestHeaders = new GeneratedAndroidWebView.WebResourceRequestData.Builder().setUrl(webResourceRequest.getUrl().toString()).setIsForMainFrame(Boolean.valueOf(webResourceRequest.isForMainFrame())).setHasGesture(Boolean.valueOf(webResourceRequest.hasGesture())).setMethod(webResourceRequest.getMethod()).setRequestHeaders(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new HashMap());
        if (Build.VERSION.SDK_INT >= 24) {
            requestHeaders.setIsRedirect(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return requestHeaders.build();
    }

    public void dispose(WebViewClient webViewClient, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        Long removeInstance = this.instanceManager.removeInstance(webViewClient);
        if (removeInstance != null) {
            dispose(removeInstance, reply);
        } else {
            reply.reply(null);
        }
    }

    public void onPageFinished(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onPageFinished(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }

    public void onPageStarted(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onPageStarted(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }

    public void onReceivedError(WebViewClient webViewClient, WebView webView, Long l, String str, String str2, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), l, str, str2, reply);
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedRequestError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceError), reply);
    }

    public void requestLoading(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        requestLoading(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), reply);
    }

    public void urlLoading(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        urlLoading(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }

    public static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(C21483b bVar) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf((long) bVar.mo33650b())).setDescription(bVar.mo33649a().toString()).build();
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, C21483b bVar, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedRequestError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(bVar), reply);
    }
}
