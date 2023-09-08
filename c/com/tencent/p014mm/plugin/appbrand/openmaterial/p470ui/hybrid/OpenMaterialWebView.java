package com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid;

import a70.C112760b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import di3.C86312j;
import e00.C45519s0;
import java.lang.Thread;
import java.lang.reflect.Field;
import p206nj.C11171e;
import p977hj.C87527b;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView */
public class OpenMaterialWebView extends MMWebView {

    /* renamed from: t */
    public Context f108810t;

    public OpenMaterialWebView(Context context) {
        super(context);
        this.f108810t = context;
        mo63291a0();
    }

    /* renamed from: a0 */
    public final void mo63291a0() {
        Log.printInfoStack("MicroMsg.AppBrand.OpenMaterialWebView", "init OpenMaterialWebView", new Object[0]);
        if (!C11171e.m11046c(19)) {
            try {
                Object a = new C87527b(this, "mSysWebView", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", a);
                Object a2 = new C87527b(a, "mProvider", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", a2);
                Object a3 = new C87527b(a2, "mWebViewCore", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", a3);
                Object a4 = new C87527b(a3, "sWebCoreHandler", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", a4);
                Object a5 = new C87527b(a4, "mLooper", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", a5);
                Object a6 = new C87527b(a5, "mThread", (String) null).mo121998a();
                Log.m105919d("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", a6);
                if (a6 instanceof Thread) {
                    Thread thread = (Thread) a6;
                    Log.m105925i("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e);
            }
        }
    }

    /* renamed from: c0 */
    public void mo63292c0(WebChromeClient webChromeClient, WebViewClient webViewClient) {
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        getSettings().setMixedContentMode(0);
        getSettings().setUserAgentString(((C45519s0) C86312j.m106911c(C45519s0.class)).mo70763Bi(getContext(), getSettings().getUserAgentString()));
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setMixedContentMode(0);
        getSettings().setAppCacheMaxSize(10485760);
        getSettings().setAppCachePath(this.f108810t.getDir("webviewcache", 0).getAbsolutePath());
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
        super.setWebChromeClient(webChromeClient);
        super.setWebViewClient(webViewClient);
        setBackgroundColor(-1);
        mo70469W();
    }

    public void destroy() {
        this.f108810t = null;
        super.setWebChromeClient((WebChromeClient) null);
        super.setWebViewClient((WebViewClient) null);
        super.destroy();
    }

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

    public OpenMaterialWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108810t = context;
        mo63291a0();
    }

    public OpenMaterialWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108810t = context;
        mo63291a0();
    }
}
