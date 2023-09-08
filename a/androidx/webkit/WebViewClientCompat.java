package androidx.webkit;

import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.util.Features;
import p359m4.C21482a;
import p359m4.C21483b;
import p359m4.C21484c;
import p364n4.C21596b;
import p364n4.C21597c;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {Features.VISUAL_STATE_CALLBACK, Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_HTTP_ERROR, Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SAFE_BROWSING_HIT};

    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (C21483b) new C21597c(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (C21482a) new C21596b(invocationHandler));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            onReceivedError(webView, webResourceRequest, (C21483b) new C21597c(webResourceError));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (C21482a) new C21596b(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, C21482a aVar) {
        if (C21484c.m24296a(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            aVar.mo33648a(true);
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, C21483b bVar) {
        if (C21484c.m24296a(Features.WEB_RESOURCE_ERROR_GET_CODE) && C21484c.m24296a(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION) && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, bVar.mo33650b(), bVar.mo33649a().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
