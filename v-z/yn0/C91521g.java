package yn0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83106b;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83107f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83108g;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import di3.C86312j;
import e00.C45513i0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C46574u;
import js0.C88016e;
import kr0.C88267e;
import org.json.JSONObject;
import p1042u.C90590d;
import p1044ub.C90636f;
import p224ra.C89909e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;

/* renamed from: yn0.g */
public final class C91521g extends FrameLayout implements C40478h {

    /* renamed from: p */
    public static final C91522b f262330p = new C91522b((C8480h) null);

    /* renamed from: d */
    public final AppBrandRuntimeWC f262331d;

    /* renamed from: e */
    public int f262332e;

    /* renamed from: f */
    public boolean f262333f;

    /* renamed from: g */
    public final MMWebView f262334g;

    /* renamed from: h */
    public final AtomicBoolean f262335h = new AtomicBoolean(false);

    /* renamed from: i */
    public final C91517b f262336i = new C91517b(this);

    /* renamed from: j */
    public final C91527j f262337j = new C91527j(this);

    /* renamed from: n */
    public final C13601g f262338n = C36568h.m40985a(new C91523c(this));

    /* renamed from: o */
    public final C90590d<C40478h.C40479a> f262339o;

    /* renamed from: yn0.g$a */
    public static final class C53547a implements DownloadListener {

        /* renamed from: d */
        public static final C53547a f150515d = new C53547a();

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }
    }

    /* renamed from: yn0.g$f */
    public static final class C53549f extends ProxyWebViewClientExtension {
        public Object onMiscCallBack(String str, Bundle bundle) {
            if (Util.isNullOrNil(str) || bundle == null) {
                return null;
            }
            Log.m105925i("MicroMsg.AppBrand.HTMLVConsoleView", "method = %s", str);
            if (C87412m.m108589b("onJavascriptCloseWindow", str)) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    /* renamed from: yn0.g$b */
    public static final class C91522b {
        public C91522b(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo125435a(ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "root");
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C91521g) {
                        C91521g gVar = (C91521g) childAt;
                        gVar.destroy();
                        gVar.removeAllViewsInLayout();
                    } else if (childAt instanceof ViewGroup) {
                        mo125435a((ViewGroup) childAt);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: yn0.g$c */
    public static final class C91523c extends C87413o implements C32224a<C91525h> {

        /* renamed from: d */
        public final /* synthetic */ C91521g f262340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91523c(C91521g gVar) {
            super(0);
            this.f262340d = gVar;
        }

        public Object invoke() {
            return new C91525h(this.f262340d);
        }
    }

    /* renamed from: yn0.g$d */
    public static final class C91524d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91521g f262341d;

        public C91524d(C91521g gVar) {
            this.f262341d = gVar;
        }

        public final void run() {
            C91521g gVar = this.f262341d;
            if (!gVar.f262333f) {
                Log.m105925i("MicroMsg.AppBrand.HTMLVConsoleView", "destroy hash[%d]", Integer.valueOf(gVar.hashCode()));
                this.f262341d.f262336i.getClass();
                this.f262341d.getViewWV().stopLoading();
                this.f262341d.mo63232f(MMApplicationContext.getContext());
                if (!this.f262341d.getViewWV().f122358h) {
                    this.f262341d.getViewWV().destroy();
                }
                this.f262341d.f262339o.clear();
                this.f262341d.f262333f = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91521g(C84543i2 i2Var, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(i2Var);
        C87412m.m108594g(i2Var, "context");
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        this.f262331d = appBrandRuntimeWC;
        C53549f fVar = new C53549f();
        C53548e eVar = new C53548e(this);
        MMWebView a = MMWebView.C45103b.m49948a(i2Var);
        a.setBackgroundColor(0);
        WebSettings settings = a.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        a.setHorizontalScrollBarEnabled(false);
        a.setVerticalScrollBarEnabled(false);
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAppCacheEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setBackgroundAudioPause(true);
        a.setWebViewClientExtension(fVar);
        a.setWebViewClient(eVar);
        settings.setUsingForAppBrand(2);
        settings.setAllowFileAccess(false);
        String userAgentString = settings.getUserAgentString();
        C46574u.C46575a aVar = (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class);
        aVar = aVar == null ? ((C45513i0) C86312j.m106911c(C45513i0.class)).Nh0(i2Var) : aVar;
        C87412m.m108593f(userAgentString, "currentUa");
        if (!C112550d0.m153801u(userAgentString, " MicroMessenger/", false)) {
            settings.setUserAgentString(C46574u.m51897a(i2Var, userAgentString, aVar) + " miniProgram/" + appBrandRuntimeWC.f238147j);
        }
        a.setDownloadListener(C53547a.f150515d);
        this.f262334g = a;
        addView(a, new FrameLayout.LayoutParams(-1, -1));
        a.addJavascriptInterface(new C91520e(this), "WeixinJSCore");
        a.loadDataWithBaseURL(C90636f.f260394G0 + getAppId() + XVFSFile.SEPARATOR_CHAR + appBrandRuntimeWC.mo121252j1() + "/vConsole.html", appBrandRuntimeWC.mo113184O1(false).mo113372b("WAPageFrame.html"), "text/html", "UTF-8", (String) null);
        this.f262339o = new C90590d<>();
    }

    private final C91525h getREPORTER() {
        return (C91525h) ((C36570n) this.f262338n).getValue();
    }

    /* renamed from: E */
    public void mo63228E(String str) {
    }

    /* renamed from: G0 */
    public void mo63229G0() {
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        Log.m105925i("MicroMsg.AppBrand.HTMLVConsoleView", "pauseRendering hash[%d]", Integer.valueOf(hashCode()));
        this.f262334g.onHide();
    }

    /* renamed from: a1 */
    public void mo63230a1(String str, int i, String str2) {
        Log.m105920e("MicroMsg.AppBrand.HTMLVConsoleView", "url:" + str + ", code:" + i + ", message:" + str2);
    }

    public void destroy() {
        C91524d dVar = new C91524d(this);
        if (MMHandlerThread.isMainThread()) {
            dVar.run();
        } else {
            MMHandlerThread.postToMainThread(dVar);
        }
    }

    /* renamed from: f */
    public void mo63232f(Context context) {
        if (context != null) {
            Context context2 = getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
            ((C84543i2) context2).setBaseContext(context);
        }
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        Log.m105925i("MicroMsg.AppBrand.HTMLVConsoleView", "restoreRendering hash[%d]", Integer.valueOf(hashCode()));
        this.f262334g.onShow();
    }

    /* renamed from: g0 */
    public void mo63233g0(C40478h.C40479a aVar) {
        if (aVar != null && !this.f262333f) {
            this.f262339o.add(aVar);
        }
    }

    public Context getAndroidContext() {
        Context context = getContext();
        C87412m.m108593f(context, "this.context");
        return context;
    }

    public View getAndroidView() {
        return this;
    }

    public String getAppId() {
        String str = this.f262331d.f238147j;
        C87412m.m108593f(str, "rt.appId");
        return str;
    }

    public int getBinderID() {
        return this.f262336i.hashCode();
    }

    public C83107f getController() {
        return this.f262336i;
    }

    public int getCoverViewId() {
        return this.f262332e;
    }

    public String getCurrentUrl() {
        if (this.f262333f) {
            return null;
        }
        return this.f262334g.getUrl();
    }

    public final int getHtmlId() {
        return this.f262332e;
    }

    public String[] getJsApiReportArgs() {
        return new String[0];
    }

    public final C91527j getJsBridgeComponentDelegate() {
        return this.f262337j;
    }

    public C83780d1 getPageView() {
        C83820i0 currentPage;
        AppBrandPageContainerWC P1 = this.f262331d.mo113212m1();
        if (P1 == null || (currentPage = P1.getCurrentPage()) == null) {
            return null;
        }
        return currentPage.getCurrentPageView();
    }

    public C83108g getReporter() {
        return getREPORTER();
    }

    public final AppBrandRuntimeWC getRt() {
        return this.f262331d;
    }

    public final MMWebView getViewWV() {
        return this.f262334g;
    }

    public MMWebView getWebView() {
        return this.f262334g;
    }

    /* renamed from: h1 */
    public void mo63244h1(String str) {
    }

    /* renamed from: i */
    public final void mo125434i() {
        if (!this.f262335h.getAndSet(true)) {
            this.f262334g.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", (ValueCallback<String>) null);
            this.f262334g.evaluateJavascript(C88016e.m109548e("wxa_library/vconsole-wxjs.js"), (ValueCallback<String>) null);
            this.f262337j.mo109652f("sys:init", "{}", 0);
            this.f262334g.evaluateJavascript(this.f262331d.mo113184O1(false).mo113372b("WAGlobalConsole.js"), (ValueCallback<String>) null);
        }
    }

    /* renamed from: i1 */
    public void mo63245i1(String str) {
        mo125434i();
    }

    /* renamed from: k */
    public boolean mo63246k() {
        return this.f262331d.mo121254q1();
    }

    /* renamed from: l1 */
    public boolean mo63247l1() {
        return false;
    }

    /* renamed from: m0 */
    public void mo63248m0(JSONObject jSONObject) {
        C88267e eVar = (C88267e) this.f262331d.f238150p;
        if (eVar != null) {
            C83106b bVar = new C83106b();
            bVar.mo115195q(eVar, this.f262332e);
            String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            bVar.f242407f = jSONObject2;
            bVar.mo115158h();
        }
    }

    /* renamed from: o1 */
    public void mo63249o1(String str) {
        mo125434i();
    }

    /* renamed from: r1 */
    public boolean mo63251r1() {
        return false;
    }

    public void runOnUiThread(Runnable runnable) {
        this.f262331d.mo113024P0(runnable);
    }

    public void setAndroidViewId(int i) {
        getAndroidView().setId(i);
    }

    public void setCoverViewId(int i) {
        this.f262332e = i;
    }

    /* renamed from: y */
    public void mo63255y(String str, WebResourceRequest webResourceRequest) {
    }

    /* renamed from: yn0.g$e */
    public static final class C53548e extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C91521g f150516a;

        public C53548e(C91521g gVar) {
            this.f150516a = gVar;
        }

        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            this.f150516a.mo125434i();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f150516a.mo125434i();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f150516a.getClass();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f150516a.mo63230a1(str2, i, str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceError != null) {
                C91521g gVar = this.f150516a;
                String str = null;
                String url = webView != null ? webView.getUrl() : null;
                int errorCode = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                if (description != null) {
                    str = description.toString();
                }
                gVar.mo63230a1(url, errorCode, str);
            }
        }
    }
}
