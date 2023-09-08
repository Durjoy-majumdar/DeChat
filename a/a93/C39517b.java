package a93;

import a70.C112760b;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.p014mm.autogen.events.CloseImagePreviewEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.luggage.C43589g0;
import com.tencent.p014mm.plugin.webview.luggage.C43592h0;
import com.tencent.p014mm.plugin.webview.luggage.C43629l;
import com.tencent.p014mm.plugin.webview.luggage.C43632m;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.LuggageMMLocalResourceProvider;
import com.tencent.p014mm.plugin.webview.modeltools.C6085v;
import com.tencent.p014mm.pluginsdk.model.C30684o1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import d93.C45298c;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Map;
import js0.C46574u;
import js0.C88016e;
import lg3.C88496e;
import p206nj.C11171e;
import p224ra.C89909e;
import p824tc.C48619a;
import p828wa.C53133t;
import p977hj.C87527b;

/* renamed from: a93.b */
public class C39517b extends MMWebView implements C48619a {

    /* renamed from: A */
    public C43589g0 f106098A = new C39518a();

    /* renamed from: t */
    public Handler f106099t;

    /* renamed from: u */
    public C53133t f106100u;

    /* renamed from: v */
    public String f106101v;

    /* renamed from: w */
    public boolean f106102w = false;

    /* renamed from: x */
    public WeakReference<C43658n> f106103x;

    /* renamed from: y */
    public C43592h0 f106104y = new C39524g(this);

    /* renamed from: z */
    public C43632m f106105z = new C39525h(this);

    /* renamed from: a93.b$a */
    public class C39518a extends C43589g0 {
        public C39518a() {
        }

        public Object onMiscCallBack(String str, Bundle bundle) {
            WeakReference<C43658n> weakReference = C39517b.this.f106103x;
            if (weakReference == null || weakReference.get() == null) {
                Log.m105924i("MicroMsg.LuggageMMWebViewCoreImpl", "page is null");
                return super.onMiscCallBack(str, bundle);
            } else if (str == null) {
                Log.m105924i("MicroMsg.LuggageMMWebViewCoreImpl", "method is null");
                return super.onMiscCallBack(str, bundle);
            } else {
                if (str.equals("getDrawable")) {
                    String string = bundle.getString("packageName");
                    int i = bundle.getInt("resourceId");
                    if (!Util.isNullOrNil(string) && i > 0) {
                        try {
                            return C88496e.m110362f(MMApplicationContext.getContext().getPackageManager().getResourcesForApplication(string), i);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.LuggageMMWebViewCoreImpl", "get resource for package : %s, fail, : %s", string, e.getMessage());
                        }
                    }
                }
                if (str.equals("getShareUrl")) {
                    try {
                        String n = C39517b.this.f106103x.get().f117922L.mo70848n(C39517b.this.getUrl());
                        Log.m105925i("MicroMsg.LuggageMMWebViewCoreImpl", "getShareUrl by x5 core, shareurl = %s", n);
                        return n;
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.LuggageMMWebViewCoreImpl", "getShare url failed");
                    }
                }
                if (str.equals("supportImagePreview")) {
                    Log.m105924i("MicroMsg.LuggageMMWebViewCoreImpl", "supportImagePreview");
                    return Boolean.TRUE;
                } else if (str.equals("imagePreview")) {
                    C6085v.m5951b(bundle, C39517b.this.f106103x.get().f117947q, (Bundle) null, C39517b.this.f106103x.get().f148261n.getBoolean("show_full_screen", false));
                    return Boolean.TRUE;
                } else if (!str.equals("closeImagePreview")) {
                    return super.onMiscCallBack(str, bundle);
                } else {
                    int i2 = C6085v.f22418b;
                    new CloseImagePreviewEvent().publish();
                    return Boolean.TRUE;
                }
            }
        }
    }

    /* renamed from: a93.b$b */
    public class C39519b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f106107d;

        /* renamed from: e */
        public final /* synthetic */ ValueCallback f106108e;

        public C39519b(String str, ValueCallback valueCallback) {
            this.f106107d = str;
            this.f106108e = valueCallback;
        }

        public void run() {
            C39517b.super.evaluateJavascript(this.f106107d, this.f106108e);
        }
    }

    /* renamed from: a93.b$c */
    public class C39520c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C48619a.C48620a f106110d;

        public C39520c(C48619a.C48620a aVar) {
            this.f106110d = aVar;
        }

        public void run() {
            C39517b bVar = C39517b.this;
            C48619a.C48620a aVar = this.f106110d;
            bVar.getClass();
            bVar.setWebViewClientProxy(new C39526c(bVar, aVar));
        }
    }

    /* renamed from: a93.b$d */
    public class C39521d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f106112d;

        public C39521d(String str) {
            this.f106112d = str;
        }

        public void run() {
            C39517b.super.loadUrl(this.f106112d);
        }
    }

    /* renamed from: a93.b$e */
    public class C39522e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f106114d;

        /* renamed from: e */
        public final /* synthetic */ Map f106115e;

        public C39522e(String str, Map map) {
            this.f106114d = str;
            this.f106115e = map;
        }

        public void run() {
            C39517b.super.loadUrl(this.f106114d, this.f106115e);
        }
    }

    /* renamed from: a93.b$f */
    public class C39523f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f106117d;

        /* renamed from: e */
        public final /* synthetic */ String f106118e;

        /* renamed from: f */
        public final /* synthetic */ String f106119f;

        public C39523f(String str, String str2, String str3) {
            this.f106117d = str;
            this.f106118e = str2;
            this.f106119f = str3;
        }

        public void run() {
            C39517b.super.loadData(this.f106117d, this.f106118e, this.f106119f);
        }
    }

    /* renamed from: a93.b$g */
    public class C39524g extends C43592h0 {
        public C39524g(C39517b bVar) {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.m105924i(C39524g.class.getSimpleName(), "onPageStarted");
            super.onPageStarted(webView, str, bitmap);
        }
    }

    /* renamed from: a93.b$h */
    public class C39525h extends C43632m {
        public C39525h(C39517b bVar) {
        }
    }

    public C39517b(Context context) {
        super(context);
        new C45298c();
        this.f106099t = new Handler(Looper.getMainLooper());
        Looper.myQueue().addIdleHandler(new C30684o1(getContext()));
        if (!C11171e.m11046c(19)) {
            try {
                Object a = new C87527b(this, "mSysWebView", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", a);
                Object a2 = new C87527b(a, "mProvider", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", a2);
                Object a3 = new C87527b(a2, "mWebViewCore", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", a3);
                Object a4 = new C87527b(a3, "sWebCoreHandler", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", a4);
                Object a5 = new C87527b(a4, "mLooper", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mLooper = %s", a5);
                Object a6 = new C87527b(a5, "mThread", (String) null).mo121998a();
                Log.m105919d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mThread = %s", a6);
                if (a6 instanceof Thread) {
                    Thread thread = (Thread) a6;
                    Log.m105925i("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, exception = %s", e);
            }
        }
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMixedContentMode(0);
        getSettings().setAppCacheMaxSize(10485760);
        getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
        getSettings().setAppCacheEnabled(true);
        getSettings().setDatabaseEnabled(true);
        WebSettings settings = getSettings();
        settings.setDatabasePath(C112760b.m154216X() + "databases/");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        WebSettings settings2 = getSettings();
        StringBuilder sb = new StringBuilder();
        Context context2 = getContext();
        String userAgentString = getSettings().getUserAgentString();
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        sb.append(C46574u.m51897a(context2, userAgentString, (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)));
        sb.append(" Luggage");
        settings2.setUserAgentString(sb.toString());
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        super.setWebViewClient(this.f106104y);
        super.setWebChromeClient(this.f106105z);
        super.setWebViewClientExtension(this.f106098A);
        mo70468T();
    }

    /* renamed from: A */
    public void mo21039A(C48619a.C48620a aVar) {
        runOnUiThread(new C39520c(aVar));
    }

    public void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public boolean canGoBack() {
        return super.canGoBack();
    }

    public void destroy() {
        if (!this.f106102w) {
            try {
                super.destroy();
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.LuggageMMWebViewCoreImpl", e, "destroy()", new Object[0]);
            } catch (Throwable th) {
                this.f106102w = true;
                throw th;
            }
            this.f106102w = true;
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        runOnUiThread(new C39519b(str, valueCallback));
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getUrl() {
        return super.getUrl();
    }

    public String getUserAgent() {
        return getSettings().getUserAgentString();
    }

    public View getView() {
        return this;
    }

    public C53133t getWebCore() {
        return this.f106100u;
    }

    public void goBack() {
        super.goBack();
    }

    /* renamed from: l0 */
    public void mo62123l0() {
        if (getWebCore().f148248o != null) {
            getWebCore().f148248o.mo73445a(new LuggageMMLocalResourceProvider());
            getWebCore().f148248o.mo73445a(new C43629l(C88016e.m109548e("luggage_mm_adapter.js")));
        }
    }

    public void loadData(String str, String str2, String str3) {
        C39523f fVar = new C39523f(str, str2, str3);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            fVar.run();
        } else {
            MMHandlerThread.postToMainThread(fVar);
        }
    }

    public void loadUrl(String str) {
        C39521d dVar = new C39521d(str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            dVar.run();
        } else {
            MMHandlerThread.postToMainThread(dVar);
        }
    }

    public void runOnUiThread(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f106099t.post(runnable);
        }
    }

    public void setContext(Context context) {
        if (getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    public void setPage(C43658n nVar) {
        this.f106103x = new WeakReference<>(nVar);
    }

    public void setSource(String str) {
        this.f106101v = str;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        C43632m mVar = this.f106105z;
        if (webChromeClient != null) {
            mVar.f117888a = webChromeClient;
        } else {
            mVar.getClass();
        }
    }

    public void setWebChromeClientProxy(C43632m mVar) {
        if (mVar != null) {
            this.f106105z.f117888a = mVar;
            this.f106105z = mVar;
        }
    }

    public void setWebCore(C53133t tVar) {
        this.f106100u = tVar;
        mo62123l0();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        C43592h0 h0Var = this.f106104y;
        if (webViewClient != null) {
            h0Var.f117835a = webViewClient;
        } else {
            h0Var.getClass();
        }
    }

    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
        C43589g0 g0Var = this.f106098A;
        if (proxyWebViewClientExtension != null) {
            g0Var.f117833a = proxyWebViewClientExtension;
        } else {
            g0Var.getClass();
        }
    }

    public void setWebViewClientExtensionProxy(C43589g0 g0Var) {
        if (g0Var != null) {
            this.f106098A.f117833a = g0Var;
            this.f106098A = g0Var;
        }
    }

    public void setWebViewClientProxy(C43592h0 h0Var) {
        if (h0Var != null) {
            this.f106104y.f117835a = h0Var;
            this.f106104y = h0Var;
        }
    }

    public void stopLoading() {
        super.stopLoading();
    }

    public void loadUrl(String str, Map<String, String> map) {
        C39522e eVar = new C39522e(str, map);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            eVar.run();
        } else {
            MMHandlerThread.postToMainThread(eVar);
        }
    }
}
