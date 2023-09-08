package xn0;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMFalseProgressBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83105a;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83106b;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83108g;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83109i;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83110j;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83111k;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83112l;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C68632h0;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84241t;
import com.tencent.p014mm.plugin.appbrand.report.model.C84172s;
import com.tencent.p014mm.plugin.appbrand.report.model.C84173t;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebSettings;
import di3.C86312j;
import e00.C45513i0;
import gy3.C8480h;
import gy3.C87412m;
import hr0.C87584b;
import iu0.C46288c;
import java.util.WeakHashMap;
import js0.C46574u;
import kg3.C76577a;
import kr0.C88267e;
import org.json.JSONObject;
import p1042u.C90590d;
import p224ra.C89909e;
import p849e3.C107168a0;
import p849e3.C107207u;
import p963fc.C86812g;
import rq0.C90088g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u24.C90599h;
import z04.C112550d0;

/* renamed from: xn0.m */
public final class C91304m extends FrameLayout implements C40478h, C53442v, C83112l {

    /* renamed from: z */
    public static final /* synthetic */ int f261898z = 0;

    /* renamed from: d */
    public final AppBrandRuntimeWC f261899d;

    /* renamed from: e */
    public final C83928t1 f261900e;

    /* renamed from: f */
    public final int f261901f;

    /* renamed from: g */
    public boolean f261902g;

    /* renamed from: h */
    public int f261903h;

    /* renamed from: i */
    public String f261904i;

    /* renamed from: j */
    public String f261905j;

    /* renamed from: n */
    public C84967l0 f261906n;

    /* renamed from: o */
    public final C91309o f261907o;

    /* renamed from: p */
    public final C91311r f261908p;

    /* renamed from: q */
    public final MMWebView f261909q;

    /* renamed from: r */
    public final MMFalseProgressBar f261910r;

    /* renamed from: s */
    public final VideoControl f261911s;

    /* renamed from: t */
    public final C13601g f261912t;

    /* renamed from: u */
    public final C90590d<C40478h.C40479a> f261913u;

    /* renamed from: v */
    public final C84173t f261914v;

    /* renamed from: w */
    public final C13601g f261915w;

    /* renamed from: x */
    public final C91308n f261916x;

    /* renamed from: y */
    public final Runnable f261917y;

    /* renamed from: xn0.m$a */
    public static final class C91305a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91304m f261918d;

        public C91305a(C91304m mVar) {
            this.f261918d = mVar;
        }

        public final void run() {
            C91304m mVar = this.f261918d;
            if (!mVar.f261902g) {
                Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "destroy hash[%d]", Integer.valueOf(mVar.hashCode()));
                this.f261918d.getWebViewController().mo74060t();
                this.f261918d.f261909q.stopLoading();
                this.f261918d.getWebViewController().mo74077d();
                this.f261918d.mo63232f(MMApplicationContext.getContext());
                MMWebView mMWebView = this.f261918d.f261909q;
                if (!mMWebView.f122358h) {
                    mMWebView.destroy();
                }
                this.f261918d.f261913u.clear();
                SparseArray<C40478h> sparseArray = C83105a.f242910a;
                C91304m mVar2 = this.f261918d;
                C87412m.m108594g(mVar2, "webview");
                SparseArray<C40478h> sparseArray2 = C83105a.f242910a;
                synchronized (sparseArray2) {
                    sparseArray2.remove(mVar2.getBinderID());
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                this.f261918d.f261902g = true;
            }
        }
    }

    /* renamed from: xn0.m$b */
    public static final class C91306b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91304m f261919d;

        public C91306b(C91304m mVar) {
            this.f261919d = mVar;
        }

        public final void run() {
            this.f261919d.f261910r.mo25981a();
        }
    }

    /* renamed from: xn0.m$c */
    public static final class C91307c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91304m f261920d;

        public C91307c(C91304m mVar) {
            this.f261920d = mVar;
        }

        public final void run() {
            this.f261920d.f261910r.mo25983c();
        }
    }

    public C91304m(C84543i2 i2Var, AppBrandRuntimeWC appBrandRuntimeWC, C83928t1 t1Var, C8480h hVar) {
        super(i2Var);
        this.f261899d = appBrandRuntimeWC;
        this.f261900e = t1Var;
        this.f261901f = mo125292A() ? 55 : 49;
        mo125292A();
        this.f261907o = new C91309o(this);
        this.f261908p = new C91311r(this);
        this.f261912t = C36568h.m40985a(new C53440t(this));
        C53438p pVar = new C53438p();
        Log.m105924i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> start hash[" + hashCode() + ']');
        MMWebView a = MMWebView.C45103b.m49948a(i2Var);
        this.f261909q = a;
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
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAppCacheEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setBackgroundAudioPause(true);
        a.setWebViewClientExtension(pVar);
        settings.setUsingForAppBrand(2);
        String userAgentString = settings.getUserAgentString();
        C46574u.C46575a aVar = (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class);
        aVar = aVar == null ? ((C45513i0) C86312j.m106911c(C45513i0.class)).Nh0(i2Var) : aVar;
        C87412m.m108593f(userAgentString, "currentUa");
        if (!C112550d0.m153801u(userAgentString, " MicroMessenger/", false)) {
            settings.setUserAgentString(C46574u.m51897a(i2Var, userAgentString, aVar) + " miniProgram/" + appBrandRuntimeWC.f238147j);
        }
        a.setDownloadListener(new C91300h(this));
        this.f261911s = a.setVideoJsCallback(new C53435i(this));
        Log.m105924i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end WebView construct hash[" + hashCode() + ']');
        addView(a, new FrameLayout.LayoutParams(-1, -1));
        MMFalseProgressBar mMFalseProgressBar = new MMFalseProgressBar(i2Var);
        mMFalseProgressBar.setProgressDrawable(C76577a.m92158i(i2Var, C0966R.C0969drawable.agt));
        this.f261910r = mMFalseProgressBar;
        addView(mMFalseProgressBar, new FrameLayout.LayoutParams(-1, C76577a.m92151b(i2Var, 3)));
        t1Var.mo114865m(new C91301j(this));
        SparseArray<C40478h> sparseArray = C83105a.f242910a;
        synchronized (sparseArray) {
            sparseArray.put(getBinderID(), this);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Log.m105924i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end hash[" + hashCode() + "], supportOrientationControl[" + getXwVideoOrientationControlSupported() + ']');
        this.f261913u = new C90590d<>();
        this.f261914v = appBrandRuntimeWC.mo113212m1().getReporter().mo115888e();
        this.f261915w = C36568h.m40985a(new C91303l(this));
        this.f261916x = new C91308n();
        this.f261917y = new C91310q(this);
    }

    private final C82381f getEventContext() {
        if (!AppBrandRuntimeWCAccessible.m99327c(this.f261900e)) {
            return this.f261900e;
        }
        C88267e K1 = this.f261900e.mo116160O0();
        C87412m.m108593f(K1, "pv.service");
        return K1;
    }

    private final C90088g getMPullDown() {
        return (C90088g) this.f261900e.mo116150E0(C90088g.class);
    }

    /* access modifiers changed from: private */
    public final C83108g getREPORTER() {
        return (C83108g) ((C36570n) this.f261915w).getValue();
    }

    /* access modifiers changed from: private */
    public final C53441u<C91304m> getWebViewController() {
        return (C53441u) ((C36570n) this.f261912t).getValue();
    }

    private final boolean getXwVideoOrientationControlSupported() {
        VideoControl videoControl = this.f261911s;
        return videoControl != null && videoControl.supportSetRequestedOrientationCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[Catch:{ Exception -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034 A[Catch:{ Exception -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setCurrentUrl(java.lang.String r6) {
        /*
            r5 = this;
            r5.f261904i = r6
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x000f
            int r2 = r6.length()
            if (r2 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = 0
            goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x004d
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = r6.getHost()     // Catch:{ Exception -> 0x0056 }
            if (r6 == 0) goto L_0x0027
            int r2 = r6.length()     // Catch:{ Exception -> 0x0056 }
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x0034
            rq0.g r6 = r5.getMPullDown()     // Catch:{ Exception -> 0x0056 }
            if (r6 == 0) goto L_0x0056
            r6.mo116508h(r3)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0056
        L_0x0034:
            rq0.g r2 = r5.getMPullDown()     // Catch:{ Exception -> 0x0056 }
            if (r2 == 0) goto L_0x0056
            android.content.Context r3 = r5.getContext()     // Catch:{ Exception -> 0x0056 }
            r4 = 2131840027(0x7f114c1b, float:1.9313322E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            r1[r0] = r6     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = r3.getString(r4, r1)     // Catch:{ Exception -> 0x0056 }
            r2.mo116508h(r6)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0056
        L_0x004d:
            rq0.g r6 = r5.getMPullDown()
            if (r6 == 0) goto L_0x0056
            r6.mo116508h(r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C91304m.setCurrentUrl(java.lang.String):void");
    }

    /* renamed from: A */
    public boolean mo125292A() {
        try {
            return this.f261899d.mo113213o1().f234894z ? this.f261899d.mo113213o1().f234892y : this.f261899d.mo113213o1().f234889w;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: E */
    public void mo63228E(String str) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageStarted url[%s] hash[%d] destroyed[%b] attached[%b]", str, Integer.valueOf(hashCode()), Boolean.valueOf(this.f261902g), Boolean.valueOf(C107207u.C107211e.m145207b(this)));
        if (!this.f261902g) {
            this.f261905j = str;
            this.f261909q.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", (ValueCallback<String>) null);
            C83110j jVar = new C83110j();
            jVar.mo115194p(getEventContext());
            jVar.mo115164n("src", str);
            jVar.mo115164n("htmlId", Integer.valueOf(this.f261903h));
            jVar.mo115158h();
        }
    }

    /* renamed from: G0 */
    public void mo63229G0() {
        C83820i0 i0Var = this.f261900e.f244572U;
        if (i0Var != null) {
            this.f261899d.mo113212m1().mo116379y(i0Var, "scene_other");
        }
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "pauseRendering hash[%d]", Integer.valueOf(hashCode()));
        this.f261909q.onHide();
    }

    /* renamed from: a1 */
    public void mo63230a1(String str, int i, String str2) {
        C83111k kVar = new C83111k();
        kVar.mo115194p(getEventContext());
        kVar.mo115164n("htmlId", Integer.valueOf(this.f261903h));
        kVar.mo115164n(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, Integer.valueOf(i));
        kVar.mo115164n("description", str2);
        kVar.mo115164n("src", str);
        kVar.mo115158h();
    }

    public void destroy() {
        removeCallbacks(this.f261917y);
        C91305a aVar = new C91305a(this);
        if (MMHandlerThread.isMainThread()) {
            aVar.run();
        } else {
            MMHandlerThread.postToMainThread(aVar);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C90088g mPullDown;
        C90088g mPullDown2;
        C87412m.m108594g(motionEvent, "ev");
        if (this.f261902g) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C90088g mPullDown3 = getMPullDown();
            if (mPullDown3 != null) {
                mPullDown3.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (mPullDown2 = getMPullDown()) != null) {
            mPullDown2.requestDisallowInterceptTouchEvent(false);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && (mPullDown = getMPullDown()) != null) {
            mPullDown.requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: f */
    public void mo63232f(Context context) {
        if (context != null) {
            Context context2 = getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
            ((C84543i2) context2).setBaseContext(context);
            try {
                this.f261909q.mo70470f(context);
            } catch (Exception unused) {
            }
            getController().mo74058f(context);
            if (AndroidContextUtil.castActivityOrNull(getContext()) == null) {
                this.f261906n = null;
            } else if (AndroidContextUtil.castActivityOrNull(getContext()) != null) {
                C84967l0 e = C85004y.m104826e(this);
                if (e != null) {
                    e.mo117844a(this.f261907o);
                }
                this.f261906n = e;
            }
        }
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "restoreRendering hash[%d]", Integer.valueOf(hashCode()));
        this.f261909q.onShow();
    }

    /* renamed from: g0 */
    public void mo63233g0(C40478h.C40479a aVar) {
        if (aVar != null && !this.f261902g) {
            this.f261913u.add(aVar);
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
        String str = this.f261899d.f238147j;
        C87412m.m108591d(str);
        return str;
    }

    public int getBinderID() {
        return getController().getBinderID();
    }

    public int getCoverViewId() {
        return this.f261903h;
    }

    public String getCurrentUrl() {
        return this.f261904i;
    }

    public final C84172s getExitReporter() {
        C84172s g = this.f261899d.mo113212m1().getReporter().mo115890g();
        C87412m.m108593f(g, "rt.pageContainer.reporte…tmlWebViewUrlExitReporter");
        return g;
    }

    public final int getHtmlId() {
        return this.f261903h;
    }

    public String[] getJsApiReportArgs() {
        if (this.f261902g) {
            return new String[0];
        }
        C83928t1 t1Var = this.f261900e;
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        AppBrandStatObject n1 = J1.mo121253n1();
        AppBrandInitConfigWC M1 = J1.mo113210l1();
        C91304m I1 = t1Var.mo116520A1();
        String[] strArr = new String[19];
        strArr[0] = "" + n1.f245533f;
        strArr[1] = n1.f245534g;
        strArr[2] = J1.f238147j;
        strArr[3] = "" + J1.mo113213o1().f261072r.pkgVersion;
        strArr[4] = M1.f234837q;
        strArr[5] = "" + (J1.mo113213o1().f261072r.f238585d + 1);
        strArr[6] = "" + n1.f245535h;
        strArr[7] = t1Var.mo116162Q0();
        strArr[8] = I1 == null ? "" : I1.getWebView().getUrl();
        strArr[9] = C84116i0.m103659b(t1Var.getContext());
        strArr[10] = "";
        strArr[11] = "";
        strArr[12] = "";
        strArr[13] = "";
        strArr[14] = "";
        strArr[15] = "";
        strArr[16] = "" + n1.f245531d;
        strArr[17] = "" + n1.f245532e;
        strArr[18] = "" + (J1.mo113210l1().f234841u + 1000);
        return strArr;
    }

    public C83108g getReporter() {
        return getREPORTER();
    }

    public String getUrl() {
        return getWebView().getUrl();
    }

    public MMWebView getWebView() {
        return this.f261909q;
    }

    /* renamed from: h1 */
    public void mo63244h1(String str) {
        if (!URLUtil.isValidUrl(str)) {
            this.f261900e.mo116199u1(str);
        } else if (C90599h.m113508a(str, this.f261904i) || C90599h.m113508a(str, this.f261905j)) {
            this.f261900e.mo116199u1("");
        }
    }

    /* renamed from: i */
    public void mo74079i() {
        runOnUiThread(new C91306b(this));
    }

    /* renamed from: i1 */
    public void mo63245i1(String str) {
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageCommitVisible url[%s] hash[%d] destroyed[%b]", str, Integer.valueOf(hashCode()), Boolean.valueOf(this.f261902g));
        if (!this.f261902g) {
            setCurrentUrl(str);
            this.f261909q.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", (ValueCallback<String>) null);
        }
    }

    /* renamed from: k */
    public boolean mo63246k() {
        return this.f261899d.mo121254q1();
    }

    /* renamed from: l */
    public void mo74080l() {
        runOnUiThread(new C91307c(this));
    }

    /* renamed from: l1 */
    public boolean mo63247l1() {
        if (this.f261902g) {
            return false;
        }
        if (this.f261909q.canGoBack()) {
            getExitReporter().mo116847a(this.f261900e, true);
            this.f261909q.goBack();
            this.f261916x.f261921a = true;
            return true;
        }
        getExitReporter().mo116847a(this.f261900e, false);
        return false;
    }

    /* renamed from: m0 */
    public void mo63248m0(JSONObject jSONObject) {
        C83106b bVar = new C83106b();
        bVar.mo115195q(this.f261900e.mo116160O0(), this.f261900e.getComponentId());
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        if (jSONObject2 == null) {
            jSONObject2 = "";
        }
        bVar.f242407f = jSONObject2;
        bVar.mo115158h();
    }

    /* renamed from: o1 */
    public void mo63249o1(String str) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageFinished url[%s] hash[%d] destroyed[%b] attached[%b]", str, Integer.valueOf(hashCode()), Boolean.valueOf(this.f261902g), Boolean.valueOf(C107207u.C107211e.m145207b(this)));
        if (!this.f261902g) {
            setCurrentUrl(str);
            this.f261909q.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", (ValueCallback<String>) null);
            C91308n nVar = this.f261916x;
            if (!nVar.f261922b && !nVar.f261921a) {
                C84172s exitReporter = getExitReporter();
                C83928t1 t1Var = this.f261900e;
                String str2 = nVar.f261923c;
                exitReporter.f245799p = exitReporter.f245786c.peekFirst();
                exitReporter.f245800q = 2;
                exitReporter.f245801r = str;
                exitReporter.f245786c.push(str2);
                exitReporter.mo116848b(t1Var);
            }
            nVar.f261922b = false;
            nVar.f261921a = false;
            nVar.f261923c = str;
            C83109i iVar = new C83109i();
            iVar.mo115194p(getEventContext());
            iVar.mo115164n("src", str);
            iVar.mo115164n("htmlId", Integer.valueOf(this.f261903h));
            iVar.mo115158h();
            postDelayed(this.f261917y, 1000);
            this.f261905j = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (AndroidContextUtil.castActivityOrNull(getContext()) != null) {
            C84967l0 e = C85004y.m104826e(this);
            if (e != null) {
                e.mo117844a(this.f261907o);
            }
            this.f261906n = e;
        }
        this.f261900e.mo114868y(this.f261908p);
        this.f261900e.mo114864j(this.f261908p);
        if (this.f261900e.f244563P) {
            this.f261908p.mo22090c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f261900e.isRunning()) {
            this.f261908p.mo22089b();
            destroy();
        }
        C84967l0 l0Var = this.f261906n;
        if (l0Var != null) {
            l0Var.mo117847e(this.f261907o);
        }
        this.f261900e.mo114866q(this.f261908p);
        this.f261900e.mo114863i(this.f261908p);
    }

    public void onMeasure(int i, int i2) {
        if (getParent() instanceof ViewGroup) {
            ViewParent parent = getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(viewGroup.getMeasuredHeight(), View.MeasureSpec.getSize(i2))), Integer.MIN_VALUE);
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE);
            } else if (mode == 1073741824 && View.MeasureSpec.getSize(i2) > viewGroup.getMeasuredHeight()) {
                i2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: r1 */
    public boolean mo63251r1() {
        return !getXwVideoOrientationControlSupported();
    }

    public void runOnUiThread(Runnable runnable) {
        this.f261900e.mo116274i0(runnable);
    }

    public void setAndroidViewId(int i) {
        getAndroidView().setId(i);
    }

    public void setCoverViewId(int i) {
        this.f261903h = i;
    }

    /* renamed from: y */
    public void mo63255y(String str, WebResourceRequest webResourceRequest) {
        C84173t tVar = this.f261914v;
        C83928t1 t1Var = this.f261900e;
        AppBrandInitConfigLU appBrandInitConfigLU = null;
        C46288c cVar = webResourceRequest != null ? new C46288c(webResourceRequest) : null;
        if (!tVar.f245811a && cVar != null) {
            tVar.f245818h = str;
            tVar.f245819i = cVar.getUrl().toString();
            tVar.f245820j = cVar.getMethod();
            tVar.f245821k = cVar.getRequestHeaders().get("Referer");
            AppBrandSysConfigLU o1 = t1Var.getRuntime().mo113051d0();
            if (o1 != null) {
                tVar.f245814d = o1.f261072r.pkgVersion;
            }
            tVar.f245817g = C84116i0.m103659b(MMApplicationContext.getContext());
            C86812g B1 = t1Var.getRuntime();
            if (B1 != null) {
                appBrandInitConfigLU = B1.mo113036W();
            }
            if (appBrandInitConfigLU != null) {
                tVar.f245816f = appBrandInitConfigLU.f234841u;
            } else {
                int b = C84241t.m103848b(tVar.f245812b);
                tVar.f245816f = b;
                Log.m105925i("MicroMsg.AppBrand.Report.kv_19358", "prepareCommonFields null = initConfig! apptype:%s", Integer.valueOf(b));
            }
            tVar.f245816f += 1000;
            if (!tVar.f245811a) {
                Log.m105924i("MicroMsg.AppBrand.Report.kv_19358", "report " + tVar.toString());
                ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(19358, C68632h0.m80873a(tVar.f245812b, Integer.valueOf(tVar.f245814d), Integer.valueOf(tVar.f245815e), Integer.valueOf(tVar.f245816f), tVar.f245817g, tVar.f245818h, tVar.f245819i, tVar.f245820j, 0, 0, 0, 0, tVar.f245821k));
            }
        }
    }

    public C53441u<C91304m> getController() {
        return getWebViewController();
    }

    public C83928t1 getPageView() {
        return this.f261900e;
    }
}
