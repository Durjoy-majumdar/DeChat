package com.tencent.p014mm.plugin.websearch.webview;

import a70.C112760b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import java.lang.Thread;
import java.lang.reflect.Field;
import kg3.C76577a;
import p206nj.C11171e;
import p977hj.C87527b;

/* renamed from: com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView */
public abstract class BaseWebSearchWebView extends MMWebView {

    /* renamed from: t */
    public Context f117493t;

    public BaseWebSearchWebView(Context context) {
        super(context);
        this.f117493t = context;
        mo67632a0();
    }

    /* renamed from: a0 */
    public final void mo67632a0() {
        Log.m105924i("MicroMsg.WebSearch.WebSearchWebView", "init WebSearchWebView");
        if (!C11171e.m11046c(19)) {
            try {
                Object a = new C87527b(this, "mSysWebView", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", a);
                Object a2 = new C87527b(a, "mProvider", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", a2);
                Object a3 = new C87527b(a2, "mWebViewCore", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", a3);
                Object a4 = new C87527b(a3, "sWebCoreHandler", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", a4);
                Object a5 = new C87527b(a4, "mLooper", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", a5);
                Object a6 = new C87527b(a5, "mThread", (String) null).mo121998a();
                Log.m105919d("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", a6);
                if (a6 instanceof Thread) {
                    Thread thread = (Thread) a6;
                    Log.m105925i("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e);
            }
        }
    }

    /* renamed from: c0 */
    public void mo67633c0(WebChromeClient webChromeClient, WebViewClient webViewClient) {
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        getSettings().setMixedContentMode(0);
        getSettings().setUserAgentString(getUserAgentString());
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setMixedContentMode(0);
        getSettings().setAppCacheMaxSize(10485760);
        getSettings().setAppCachePath(this.f117493t.getDir("webviewcache", 0).getAbsolutePath());
        getSettings().setAppCacheEnabled(true);
        getSettings().setDatabaseEnabled(true);
        WebSettings settings = getSettings();
        settings.setDatabasePath(C112760b.m154216X() + "databases/");
        getSettings().setAllowFileAccess(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(true);
        setConfigCallback((WindowManager) MMApplicationContext.getContext().getSystemService("window"));
        if (webChromeClient != null) {
            super.setWebChromeClient(webChromeClient);
        }
        if (webViewClient != null) {
            super.setWebViewClient(webViewClient);
        }
        Log.m105925i("MicroMsg.WebSearch.WebSearchWebView", "current webview core %s", getCurrentInstanceWebCoreType());
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mo70469W();
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        C76577a.m92172w(getContext());
        float f = sharedPreferences.getFloat("current_text_size_scale_key", 1.0f);
        if (f >= C76577a.m92170u(getContext())) {
            getSettings().setTextZoom(132);
        } else if (f >= C76577a.m92169t(getContext())) {
            getSettings().setTextZoom(132);
        } else if (f >= C76577a.m92168s(getContext())) {
            getSettings().setTextZoom(132);
        } else if (f >= C76577a.m92167r(getContext())) {
            getSettings().setTextZoom(124);
        } else if (f >= C76577a.m92174y(getContext())) {
            getSettings().setTextZoom(116);
        } else if (f >= C76577a.m92171v(getContext())) {
            getSettings().setTextZoom(108);
        } else {
            C76577a.m92172w(getContext());
            if (f >= 1.0f) {
                getSettings().setTextZoom(100);
            } else if (f >= C76577a.m92173x(getContext())) {
                getSettings().setTextZoom(92);
            } else {
                getSettings().setTextZoom(80);
            }
        }
        Log.m105925i("MicroMsg.WebSearch.WebSearchWebView", "SetFontSize, fontSize = %f", Float.valueOf(f));
    }

    public abstract String getUserAgentString();

    public void setConfigCallback(WindowManager windowManager) {
        try {
            Field declaredField = WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((Object) null);
            if (obj != null) {
                Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, windowManager);
            }
        } catch (Exception unused) {
        }
    }

    public BaseWebSearchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117493t = context;
        mo67632a0();
    }

    public BaseWebSearchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117493t = context;
        mo67632a0();
    }
}
