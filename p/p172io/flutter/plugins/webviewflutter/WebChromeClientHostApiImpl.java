package p172io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl */
public class WebChromeClientHostApiImpl implements GeneratedAndroidWebView.WebChromeClientHostApi {
    private final WebChromeClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebChromeClientCreator webChromeClientCreator;

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientCreator */
    public static class WebChromeClientCreator {
        public WebChromeClientImpl createWebChromeClient(WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl, WebViewClient webViewClient) {
            return new WebChromeClientImpl(webChromeClientFlutterApiImpl, webViewClient);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl */
    public static class WebChromeClientImpl extends WebChromeClient implements Releasable {
        private WebChromeClientFlutterApiImpl flutterApi;
        /* access modifiers changed from: private */
        public WebViewClient webViewClient;

        public WebChromeClientImpl(WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl, WebViewClient webViewClient2) {
            this.flutterApi = webChromeClientFlutterApiImpl;
            this.webViewClient = webViewClient2;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onProgressChanged$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$release$1(Void voidR) {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        public void onProgressChanged(WebView webView, int i) {
            WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl = this.flutterApi;
            if (webChromeClientFlutterApiImpl != null) {
                webChromeClientFlutterApiImpl.onProgressChanged(this, webView, Long.valueOf((long) i), new WebChromeClientHostApiImpl$WebChromeClientImpl$$b());
            }
        }

        public void release() {
            WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl = this.flutterApi;
            if (webChromeClientFlutterApiImpl != null) {
                webChromeClientFlutterApiImpl.dispose(this, new WebChromeClientHostApiImpl$WebChromeClientImpl$$a());
            }
            this.flutterApi = null;
        }

        public void setWebViewClient(WebViewClient webViewClient2) {
            this.webViewClient = webViewClient2;
        }

        public boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
            C211271 r0 = new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (WebChromeClientImpl.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (WebChromeClientImpl.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(r0);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public WebChromeClientHostApiImpl(InstanceManager instanceManager2, WebChromeClientCreator webChromeClientCreator2, WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.webChromeClientCreator = webChromeClientCreator2;
        this.flutterApi = webChromeClientFlutterApiImpl;
    }

    public void create(Long l, Long l2) {
        this.instanceManager.addInstance(this.webChromeClientCreator.createWebChromeClient(this.flutterApi, (WebViewClient) this.instanceManager.getInstance(l2.longValue())), l.longValue());
    }
}
