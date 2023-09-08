package com.tencent.p014mm.plugin.box.webview;

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
import cx0.C45212a;
import cx0.C45214c;
import java.lang.Thread;
import java.lang.reflect.Field;
import js0.C46574u;
import p206nj.C11171e;
import p224ra.C89909e;
import p977hj.C87527b;

/* renamed from: com.tencent.mm.plugin.box.webview.BoxWebView */
public class BoxWebView extends MMWebView {

    /* renamed from: t */
    public Context f109023t;

    public BoxWebView(Context context) {
        super(context);
        this.f109023t = context;
        mo63454a0();
    }

    /* renamed from: a0 */
    public final void mo63454a0() {
        Log.m105924i("MicroMsg.Flight.FlightWebView", "init FlightWebView");
        if (!C11171e.m11046c(19)) {
            try {
                Object a = new C87527b(this, "mSysWebView", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", a);
                Object a2 = new C87527b(a, "mProvider", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", a2);
                Object a3 = new C87527b(a2, "mWebViewCore", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", a3);
                Object a4 = new C87527b(a3, "sWebCoreHandler", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", a4);
                Object a5 = new C87527b(a4, "mLooper", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", a5);
                Object a6 = new C87527b(a5, "mThread", (String) null).mo121998a();
                Log.m105919d("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", a6);
                if (a6 instanceof Thread) {
                    Thread thread = (Thread) a6;
                    Log.m105925i("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e);
            }
        }
    }

    /* renamed from: c0 */
    public void mo63455c0(C45212a aVar, C45214c cVar) {
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        getSettings().setMixedContentMode(0);
        getSettings().setUserAgentString(C46574u.m51897a(getContext(), getSettings().getUserAgentString(), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)));
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setMixedContentMode(0);
        getSettings().setAppCacheMaxSize(10485760);
        getSettings().setAppCachePath(this.f109023t.getDir("webviewcache", 0).getAbsolutePath());
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
        if (aVar != null) {
            super.setWebChromeClient(aVar);
        }
        if (cVar != null) {
            super.setWebViewClient(cVar);
        }
        setBackgroundColor(-1);
        mo70469W();
    }

    public void destroy() {
        this.f109023t = null;
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

    public BoxWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109023t = context;
        mo63454a0();
    }

    public BoxWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f109023t = context;
        mo63454a0();
    }
}
