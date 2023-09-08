package p172io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import p359m4.C21483b;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl */
public class WebViewClientHostApiImpl implements GeneratedAndroidWebView.WebViewClientHostApi {
    private final WebViewClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebViewClientCreator webViewClientCreator;

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$ReleasableWebViewClient */
    public interface ReleasableWebViewClient extends Releasable {
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCreator */
    public static class WebViewClientCreator {
        public WebViewClient createWebViewClient(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            return Build.VERSION.SDK_INT >= 24 ? new WebViewClientImpl(webViewClientFlutterApiImpl, z) : new WebViewClientCompatImpl(webViewClientFlutterApiImpl, z);
        }
    }

    public WebViewClientHostApiImpl(InstanceManager instanceManager2, WebViewClientCreator webViewClientCreator2, WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.webViewClientCreator = webViewClientCreator2;
        this.flutterApi = webViewClientFlutterApiImpl;
    }

    public void create(Long l, Boolean bool) {
        this.instanceManager.addInstance(this.webViewClientCreator.createWebViewClient(this.flutterApi, bool.booleanValue()), l.longValue());
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl */
    public static class WebViewClientCompatImpl extends WebViewClientCompat implements ReleasableWebViewClient {
        private WebViewClientFlutterApiImpl flutterApi;
        private final boolean shouldOverrideUrlLoading;

        public WebViewClientCompatImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            this.shouldOverrideUrlLoading = z;
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$release$6(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(Void voidR) {
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageFinished(this, webView, str, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$a());
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageStarted(this, webView, str, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$g());
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, C21483b bVar) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, bVar, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) new WebViewClientHostApiImpl$WebViewClientCompatImpl$$b());
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void release() {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.dispose(this, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$e());
            }
            this.flutterApi = null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.requestLoading(this, webView, webResourceRequest, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$d());
            }
            return this.shouldOverrideUrlLoading;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedError(this, webView, Long.valueOf((long) i), str, str2, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$f());
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.urlLoading(this, webView, str, new WebViewClientHostApiImpl$WebViewClientCompatImpl$$c());
            }
            return this.shouldOverrideUrlLoading;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl */
    public static class WebViewClientImpl extends WebViewClient implements ReleasableWebViewClient {
        private WebViewClientFlutterApiImpl flutterApi;
        private final boolean shouldOverrideUrlLoading;

        public WebViewClientImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            this.shouldOverrideUrlLoading = z;
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$release$6(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(Void voidR) {
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageFinished(this, webView, str, new WebViewClientHostApiImpl$WebViewClientImpl$$c());
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageStarted(this, webView, str, new WebViewClientHostApiImpl$WebViewClientImpl$$a());
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, webResourceError, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) new WebViewClientHostApiImpl$WebViewClientImpl$$g());
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void release() {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.dispose(this, new WebViewClientHostApiImpl$WebViewClientImpl$$b());
            }
            this.flutterApi = null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.requestLoading(this, webView, webResourceRequest, new WebViewClientHostApiImpl$WebViewClientImpl$$f());
            }
            return this.shouldOverrideUrlLoading;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedError(this, webView, Long.valueOf((long) i), str, str2, new WebViewClientHostApiImpl$WebViewClientImpl$$d());
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.urlLoading(this, webView, str, new WebViewClientHostApiImpl$WebViewClientImpl$$e());
            }
            return this.shouldOverrideUrlLoading;
        }
    }
}
