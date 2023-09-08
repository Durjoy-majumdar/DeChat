package p172io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl */
public class WebSettingsHostApiImpl implements GeneratedAndroidWebView.WebSettingsHostApi {
    private final InstanceManager instanceManager;
    private final WebSettingsCreator webSettingsCreator;

    /* renamed from: io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl$WebSettingsCreator */
    public static class WebSettingsCreator {
        public WebSettings createWebSettings(WebView webView) {
            return webView.getSettings();
        }
    }

    public WebSettingsHostApiImpl(InstanceManager instanceManager2, WebSettingsCreator webSettingsCreator2) {
        this.instanceManager = instanceManager2;
        this.webSettingsCreator = webSettingsCreator2;
    }

    public void create(Long l, Long l2) {
        this.instanceManager.addInstance(this.webSettingsCreator.createWebSettings((WebView) this.instanceManager.getInstance(l2.longValue())), l.longValue());
    }

    public void dispose(Long l) {
        this.instanceManager.removeInstanceWithId(l.longValue());
    }

    public void setAllowFileAccess(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setAllowFileAccess(bool.booleanValue());
    }

    public void setBuiltInZoomControls(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setBuiltInZoomControls(bool.booleanValue());
    }

    public void setDisplayZoomControls(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setDisplayZoomControls(bool.booleanValue());
    }

    public void setDomStorageEnabled(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setDomStorageEnabled(bool.booleanValue());
    }

    public void setJavaScriptCanOpenWindowsAutomatically(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    public void setJavaScriptEnabled(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setJavaScriptEnabled(bool.booleanValue());
    }

    public void setLoadWithOverviewMode(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setLoadWithOverviewMode(bool.booleanValue());
    }

    public void setMediaPlaybackRequiresUserGesture(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    public void setSupportMultipleWindows(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setSupportMultipleWindows(bool.booleanValue());
    }

    public void setSupportZoom(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setSupportZoom(bool.booleanValue());
    }

    public void setUseWideViewPort(Long l, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setUseWideViewPort(bool.booleanValue());
    }

    public void setUserAgentString(Long l, String str) {
        ((WebSettings) this.instanceManager.getInstance(l.longValue())).setUserAgentString(str);
    }
}
