package p172io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p172io.flutter.plugin.platform.C21123a;
import p172io.flutter.plugin.platform.PlatformView;
import p172io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import p172io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl */
public class WebViewHostApiImpl implements GeneratedAndroidWebView.WebViewHostApi {
    private final View containerView;
    private Context context;
    private final InstanceManager instanceManager;
    private final WebViewProxy webViewProxy;

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$InputAwareWebViewPlatformView */
    public static class InputAwareWebViewPlatformView extends InputAwareWebView implements PlatformView, Releasable {
        private final ReleasableValue<DownloadListenerHostApiImpl.DownloadListenerImpl> currentDownloadListener = new ReleasableValue<>();
        private final ReleasableValue<WebChromeClientHostApiImpl.WebChromeClientImpl> currentWebChromeClient = new ReleasableValue<>();
        private final ReleasableValue<WebViewClientHostApiImpl.ReleasableWebViewClient> currentWebViewClient = new ReleasableValue<>();
        private final Map<String, ReleasableValue<JavaScriptChannel>> javaScriptInterfaces = new HashMap();

        public InputAwareWebViewPlatformView(Context context, View view) {
            super(context, view);
        }

        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof JavaScriptChannel) {
                ReleasableValue releasableValue = this.javaScriptInterfaces.get(str);
                if (!(releasableValue == null || releasableValue.get() == obj)) {
                    releasableValue.release();
                }
                this.javaScriptInterfaces.put(str, new ReleasableValue((JavaScriptChannel) obj));
            }
        }

        public /* bridge */ /* synthetic */ boolean checkInputConnectionProxy(View view) {
            return super.checkInputConnectionProxy(view);
        }

        public /* bridge */ /* synthetic */ void clearFocus() {
            super.clearFocus();
        }

        public void dispose() {
            super.dispose();
            destroy();
        }

        public View getView() {
            return this;
        }

        public void onFlutterViewAttached(View view) {
            setContainerView(view);
        }

        public void onFlutterViewDetached() {
            setContainerView((View) null);
        }

        public void onInputConnectionLocked() {
            lockInputConnection();
        }

        public void onInputConnectionUnlocked() {
            unlockInputConnection();
        }

        public void release() {
            this.currentWebViewClient.release();
            this.currentDownloadListener.release();
            this.currentWebChromeClient.release();
            for (ReleasableValue<JavaScriptChannel> release : this.javaScriptInterfaces.values()) {
                release.release();
            }
            this.javaScriptInterfaces.clear();
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.javaScriptInterfaces.get(str).release();
            this.javaScriptInterfaces.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.currentDownloadListener.set((DownloadListenerHostApiImpl.DownloadListenerImpl) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.currentWebChromeClient.set((WebChromeClientHostApiImpl.WebChromeClientImpl) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient.set((WebViewClientHostApiImpl.ReleasableWebViewClient) webViewClient);
            WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = this.currentWebChromeClient.get();
            if (webChromeClientImpl != null) {
                webChromeClientImpl.setWebViewClient(webViewClient);
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$ReleasableValue */
    public static class ReleasableValue<T extends Releasable> {
        private T value;

        public ReleasableValue() {
        }

        public ReleasableValue(T t) {
            this.value = t;
        }

        public T get() {
            return this.value;
        }

        public void release() {
            T t = this.value;
            if (t != null) {
                t.release();
            }
            this.value = null;
        }

        public void set(T t) {
            release();
            this.value = t;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewPlatformView */
    public static class WebViewPlatformView extends WebView implements PlatformView, Releasable {
        private final ReleasableValue<DownloadListenerHostApiImpl.DownloadListenerImpl> currentDownloadListener = new ReleasableValue<>();
        private final ReleasableValue<WebChromeClientHostApiImpl.WebChromeClientImpl> currentWebChromeClient = new ReleasableValue<>();
        private final ReleasableValue<WebViewClientHostApiImpl.ReleasableWebViewClient> currentWebViewClient = new ReleasableValue<>();
        private final Map<String, ReleasableValue<JavaScriptChannel>> javaScriptInterfaces = new HashMap();

        public WebViewPlatformView(Context context) {
            super(context);
        }

        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof JavaScriptChannel) {
                ReleasableValue releasableValue = this.javaScriptInterfaces.get(str);
                if (!(releasableValue == null || releasableValue.get() == obj)) {
                    releasableValue.release();
                }
                this.javaScriptInterfaces.put(str, new ReleasableValue((JavaScriptChannel) obj));
            }
        }

        public void dispose() {
            destroy();
        }

        public View getView() {
            return this;
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            C21123a.m23437a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            C21123a.m23438b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            C21123a.m23439c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            C21123a.m23440d(this);
        }

        public void release() {
            this.currentWebViewClient.release();
            this.currentDownloadListener.release();
            this.currentWebChromeClient.release();
            for (ReleasableValue<JavaScriptChannel> release : this.javaScriptInterfaces.values()) {
                release.release();
            }
            this.javaScriptInterfaces.clear();
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.javaScriptInterfaces.get(str).release();
            this.javaScriptInterfaces.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.currentDownloadListener.set((DownloadListenerHostApiImpl.DownloadListenerImpl) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.currentWebChromeClient.set((WebChromeClientHostApiImpl.WebChromeClientImpl) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient.set((WebViewClientHostApiImpl.ReleasableWebViewClient) webViewClient);
            WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = this.currentWebChromeClient.get();
            if (webChromeClientImpl != null) {
                webChromeClientImpl.setWebViewClient(webViewClient);
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewProxy */
    public static class WebViewProxy {
        public InputAwareWebViewPlatformView createInputAwareWebView(Context context, View view) {
            return new InputAwareWebViewPlatformView(context, view);
        }

        public WebViewPlatformView createWebView(Context context) {
            return new WebViewPlatformView(context);
        }

        public void setWebContentsDebuggingEnabled(boolean z) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    public WebViewHostApiImpl(InstanceManager instanceManager2, WebViewProxy webViewProxy2, Context context2, View view) {
        this.instanceManager = instanceManager2;
        this.webViewProxy = webViewProxy2;
        this.context = context2;
        this.containerView = view;
    }

    public void addJavaScriptChannel(Long l, Long l2) {
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l2.longValue());
        ((WebView) this.instanceManager.getInstance(l.longValue())).addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    public Boolean canGoBack(Long l) {
        return Boolean.valueOf(((WebView) this.instanceManager.getInstance(l.longValue())).canGoBack());
    }

    public Boolean canGoForward(Long l) {
        return Boolean.valueOf(((WebView) this.instanceManager.getInstance(l.longValue())).canGoForward());
    }

    public void clearCache(Long l, Boolean bool) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).clearCache(bool.booleanValue());
    }

    public void create(Long l, Boolean bool) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        Object createWebView = bool.booleanValue() ? this.webViewProxy.createWebView(this.context) : this.webViewProxy.createInputAwareWebView(this.context, this.containerView);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addInstance(createWebView, l.longValue());
    }

    public void dispose(Long l) {
        WebView webView = (WebView) this.instanceManager.getInstance(l.longValue());
        if (webView != null) {
            ((Releasable) webView).release();
            this.instanceManager.removeInstance(webView);
        }
    }

    public void evaluateJavascript(Long l, String str, GeneratedAndroidWebView.Result<String> result) {
        Objects.requireNonNull(result);
        ((WebView) this.instanceManager.getInstance(l.longValue())).evaluateJavascript(str, new WebViewHostApiImpl$$a(result));
    }

    public Long getScrollX(Long l) {
        return Long.valueOf((long) ((WebView) this.instanceManager.getInstance(l.longValue())).getScrollX());
    }

    public Long getScrollY(Long l) {
        return Long.valueOf((long) ((WebView) this.instanceManager.getInstance(l.longValue())).getScrollY());
    }

    public String getTitle(Long l) {
        return ((WebView) this.instanceManager.getInstance(l.longValue())).getTitle();
    }

    public String getUrl(Long l) {
        return ((WebView) this.instanceManager.getInstance(l.longValue())).getUrl();
    }

    public void goBack(Long l) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).goBack();
    }

    public void goForward(Long l) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).goForward();
    }

    public void loadData(Long l, String str, String str2, String str3) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).loadData(str, str2, str3);
    }

    public void loadDataWithBaseUrl(Long l, String str, String str2, String str3, String str4, String str5) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(Long l, String str, Map<String, String> map) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).loadUrl(str, map);
    }

    public void postUrl(Long l, String str, byte[] bArr) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).postUrl(str, bArr);
    }

    public void reload(Long l) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).reload();
    }

    public void removeJavaScriptChannel(Long l, Long l2) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).removeJavascriptInterface(((JavaScriptChannel) this.instanceManager.getInstance(l2.longValue())).javaScriptChannelName);
    }

    public void scrollBy(Long l, Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).scrollBy(l2.intValue(), l3.intValue());
    }

    public void scrollTo(Long l, Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).scrollTo(l2.intValue(), l3.intValue());
    }

    public void setBackgroundColor(Long l, Long l2) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).setBackgroundColor(l2.intValue());
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setDownloadListener(Long l, Long l2) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).setDownloadListener((DownloadListener) this.instanceManager.getInstance(l2.longValue()));
    }

    public void setWebChromeClient(Long l, Long l2) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).setWebChromeClient((WebChromeClient) this.instanceManager.getInstance(l2.longValue()));
    }

    public void setWebContentsDebuggingEnabled(Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    public void setWebViewClient(Long l, Long l2) {
        ((WebView) this.instanceManager.getInstance(l.longValue())).setWebViewClient((WebViewClient) this.instanceManager.getInstance(l2.longValue()));
    }
}
