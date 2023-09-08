package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import iu0.C33407g;
import iu0.C87814b;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import p170ic.C46213g;
import p170ic.C87690d;
import p817kd.C88140c;
import p830xc.C53319b;
import rq0.C90087f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.j2 */
public class C40502j2 extends WebView implements C40501f3, C53319b, C90087f, C87690d.C87691a {

    /* renamed from: d */
    public C40524u2 f108814d;

    /* renamed from: e */
    public C40517r2 f108815e = null;

    /* renamed from: f */
    public C40521t2 f108816f;

    /* renamed from: g */
    public C83857n2 f108817g = null;

    /* renamed from: h */
    public C39836d f108818h;

    /* renamed from: i */
    public Animator f108819i;

    /* renamed from: j */
    public boolean f108820j = false;

    /* renamed from: n */
    public String f108821n;

    /* renamed from: o */
    public C88140c f108822o;

    /* renamed from: p */
    public C40525w2 f108823p;

    /* renamed from: q */
    public final LinkedList<C40511h> f108824q = new LinkedList<>();

    /* renamed from: r */
    public WebViewClient f108825r = new C40507e();

    /* renamed from: s */
    public WebChromeClient f108826s = new C40508f();

    /* renamed from: t */
    public WebViewCallbackClient f108827t = new C40510g();

    /* renamed from: u */
    public ProxyWebViewClientExtension f108828u = new C40503a(this);

    /* renamed from: v */
    public Boolean f108829v = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$a */
    public class C40503a extends ProxyWebViewClientExtension {
        public C40503a(C40502j2 j2Var) {
        }

        public Object onMiscCallBack(String str, Bundle bundle) {
            if (!Util.isNullOrNil(str) && bundle != null) {
                Log.m105925i("MicroMsg.AppBrandWebView", "onMiscCallBack method = %s", str);
                if ("onJavascriptCloseWindow".equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$b */
    public class C40504b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f108830d;

        public C40504b(Map map) {
            this.f108830d = map;
        }

        public void run() {
            C40502j2.super.getSettings().setAppBrandInfo(this.f108830d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$c */
    public class C40505c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f108832d;

        /* renamed from: e */
        public final /* synthetic */ ValueCallback f108833e;

        public C40505c(String str, ValueCallback valueCallback) {
            this.f108832d = str;
            this.f108833e = valueCallback;
        }

        public void run() {
            C40502j2.this.mo63306W(this.f108832d, this.f108833e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$d */
    public class C40506d implements ValueAnimator.AnimatorUpdateListener {
        public C40506d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C40502j2.this.getView().setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$f */
    public class C40508f extends WebChromeClient {

        /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$f$a */
        public class C40509a implements WebChromeClient.CustomViewCallback {

            /* renamed from: a */
            public final /* synthetic */ WebChromeClient.CustomViewCallback f108838a;

            public C40509a(WebChromeClient.CustomViewCallback customViewCallback) {
                this.f108838a = customViewCallback;
            }

            public void onCustomViewHidden() {
                if (C40502j2.this.hasEnteredFullscreen()) {
                    Log.m105924i("MicroMsg.AppBrandWebView", "WebChromeClient leaveFullscreen");
                    C40502j2.this.leaveFullscreen();
                }
                WebChromeClient.CustomViewCallback customViewCallback = this.f108838a;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
            }
        }

        public C40508f() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C83857n2 n2Var;
            if (!(consoleMessage == null || (n2Var = C40502j2.this.f108817g) == null || n2Var.f244839a == null)) {
                C46213g.m51505a(consoleMessage, "Luggage.AppBrandWebViewClient" + String.format(Locale.ENGLISH, ":page[%s %s]", new Object[]{n2Var.f244839a.getAppId(), n2Var.f244839a.mo116162Q0()}), true);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        public boolean onEnterFullscreen(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Log.m105928w("MicroMsg.AppBrandWebView", "WebChromeClient onEnterFullscreen");
            if (!C40502j2.this.isXWalkKernel()) {
                return super.onEnterFullscreen(view, customViewCallback);
            }
            C39836d dVar = C40502j2.this.f108818h;
            if (dVar == null) {
                return true;
            }
            dVar.mo62474b(new C40509a(customViewCallback));
            return true;
        }

        public boolean onExitFullscreen() {
            Log.m105928w("MicroMsg.AppBrandWebView", "WebChromeClient onExitFullscreen");
            if (C40502j2.this.isXWalkKernel()) {
                return true;
            }
            return super.onExitFullscreen();
        }

        public void onHideCustomView() {
            try {
                C39836d dVar = C40502j2.this.f108818h;
                if (dVar != null) {
                    dVar.mo62476d();
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandWebView", "onHideCustomView error " + e.getMessage());
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                C39836d dVar = C40502j2.this.f108818h;
                if (dVar != null) {
                    dVar.mo62475c(view, 90);
                    C40502j2.this.f108818h.mo62474b(customViewCallback);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandWebView", "onShowCustomView error " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$g */
    public class C40510g implements WebViewCallbackClient {
        public C40510g() {
        }

        public void onContentHeightChanged(int i) {
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            C40521t2 t2Var = C40502j2.this.f108816f;
            if (t2Var != null) {
                t2Var.mo63352g(i, i2, z, z2);
            }
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            C40524u2 u2Var = C40502j2.this.f108814d;
            if (u2Var != null) {
                u2Var.onScrollChanged(i, i2, i3, i4, view);
            }
            C40502j2.this.f108817g.getClass();
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$h */
    public final class C40511h implements Runnable {

        /* renamed from: d */
        public final Runnable f108841d;

        public C40511h(Runnable runnable, C40512k2 k2Var) {
            this.f108841d = runnable;
            C40502j2.this.f108824q.add(this);
        }

        public void run() {
            C40502j2.this.f108824q.remove(this);
            this.f108841d.run();
        }
    }

    static {
        C87814b[] bVarArr = C87814b.f254221d;
        Log.m105924i("MicroMsg.AppBrandXWebSameLayerPluginInstaller", "<clinit>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40502j2(android.content.Context r6) {
        /*
            r5 = this;
            android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper
            r0.<init>(r6)
            r5.<init>(r0)
            r6 = 0
            r5.f108815e = r6
            r0 = 0
            r5.f108820j = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r5.f108824q = r1
            com.tencent.mm.plugin.appbrand.page.j2$e r1 = new com.tencent.mm.plugin.appbrand.page.j2$e
            r1.<init>()
            r5.f108825r = r1
            com.tencent.mm.plugin.appbrand.page.j2$f r1 = new com.tencent.mm.plugin.appbrand.page.j2$f
            r1.<init>()
            r5.f108826s = r1
            com.tencent.mm.plugin.appbrand.page.j2$g r1 = new com.tencent.mm.plugin.appbrand.page.j2$g
            r1.<init>()
            r5.f108827t = r1
            com.tencent.mm.plugin.appbrand.page.j2$a r1 = new com.tencent.mm.plugin.appbrand.page.j2$a
            r1.<init>(r5)
            r5.f108828u = r1
            r5.f108829v = r6
            r5.f108817g = r6
            r6 = 1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0048
            com.tencent.xweb.XWebSdk.setEnableRemoteDebug(r6)     // Catch:{ all -> 0x0047 }
            boolean r1 = com.tencent.xweb.XWebSdk.isSysWebView()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0048
            android.webkit.WebView.setWebContentsDebuggingEnabled(r6)     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            java.lang.String r1 = r1.getUserAgentString()
            if (r1 == 0) goto L_0x005d
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = wi0.C53171h.f148354a
            int r2 = r1.length()
            if (r2 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = 1
        L_0x005e:
            if (r2 == 0) goto L_0x007c
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = wi0.C53171h.f148354a
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "{\n            WebSetting…t.getContext())\n        }"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ all -> 0x0071 }
            goto L_0x007c
        L_0x0071:
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 != 0) goto L_0x007c
            java.lang.String r1 = ""
        L_0x007c:
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = wi0.C53171h.f148354a
            java.lang.Object r2 = r2.getAndSet(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "warmUpMemoryCache updated value = [ "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " ]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r2 = gy3.C87412m.m108589b(r1, r2)
            r3 = 2
            if (r2 != 0) goto L_0x00b4
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = wi0.C53171h.f148354a
            java.lang.String r2 = "AppBrandNetworkConfigUserAgentHelper"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2, r3)
            java.lang.String r4 = "UserAgent"
            r2.encode((java.lang.String) r4, (java.lang.String) r1)
        L_0x00b4:
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r1.setDomStorageEnabled(r6)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r1.setJavaScriptEnabled(r6)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r1.setMediaPlaybackRequiresUserGesture(r0)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r1.setMixedContentMode(r0)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            android.content.Context r2 = r5.getContext()
            com.tencent.xweb.WebSettings r4 = r5.getSettings()
            java.lang.String r4 = r4.getUserAgentString()
            java.lang.String r2 = wi0.C53172t.m59584a(r2, r4)
            r1.setUserAgentString(r2)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            java.lang.String r1 = r1.getUserAgentString()
            r5.f108821n = r1
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r2 = 100
            r1.setTextZoom(r2)
            android.view.View r1 = r5.getView()
            r1.setHorizontalScrollBarEnabled(r0)
            android.view.View r1 = r5.getView()
            r1.setVerticalScrollBarEnabled(r0)
            com.tencent.xweb.WebViewClient r1 = r5.f108825r
            r5.setWebViewClient(r1)
            com.tencent.xweb.WebChromeClient r1 = r5.f108826s
            r5.setWebChromeClient(r1)
            com.tencent.xweb.WebViewCallbackClient r1 = r5.f108827t
            r5.setWebViewCallbackClient(r1)
            com.tencent.xweb.internal.ProxyWebViewClientExtension r1 = r5.f108828u
            r5.setWebViewClientExtension(r1)
            com.tencent.xweb.WebSettings r1 = r5.getSettings()
            r1.setUsingForAppBrand(r6)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r2 = r5.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            com.tencent.xweb.WebView$WebViewKind r2 = com.tencent.xweb.WebView.getCurrentModuleWebCoreType()
            r1[r6] = r2
            java.lang.String r6 = "MicroMsg.AppBrandWebView"
            java.lang.String r2 = "<init> hash:%d, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            java.lang.Class<kd.d> r6 = p817kd.C88141d.class
            ra.b r6 = p224ra.C89909e.m112436a(r6)
            kd.d r6 = (p817kd.C88141d) r6
            if (r6 != 0) goto L_0x014a
            kd.b r6 = p817kd.C46689b.getInstance()
        L_0x014a:
            java.lang.Class<id.c> r1 = p980id.C87697c.class
            ra.b r1 = p224ra.C89909e.m112436a(r1)
            id.c r1 = (p980id.C87697c) r1
            if (r1 != 0) goto L_0x0161
            com.tencent.mm.plugin.appbrand.extendplugin.e r1 = com.tencent.p014mm.plugin.appbrand.extendplugin.C81826e.f240086d
            if (r1 != 0) goto L_0x015f
            com.tencent.mm.plugin.appbrand.extendplugin.e r1 = new com.tencent.mm.plugin.appbrand.extendplugin.e
            r1.<init>()
            com.tencent.p014mm.plugin.appbrand.extendplugin.C81826e.f240086d = r1
        L_0x015f:
            com.tencent.mm.plugin.appbrand.extendplugin.e r1 = com.tencent.p014mm.plugin.appbrand.extendplugin.C81826e.f240086d
        L_0x0161:
            com.tencent.mm.plugin.appbrand.page.m2 r2 = new com.tencent.mm.plugin.appbrand.page.m2
            r2.<init>(r5)
            kd.c r6 = p830xc.C91167d.m114400a(r5, r6, r1, r2)
            r5.f108822o = r6
            r5.setBackgroundColor(r0)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r6.<init>(r0, r0)
            r5.setLayoutParams(r6)
            com.tencent.mm.plugin.appbrand.page.k2 r6 = new com.tencent.mm.plugin.appbrand.page.k2
            r6.<init>(r5)
            r5.setOnLongClickListener(r6)
            com.tencent.mm.plugin.appbrand.page.l2 r6 = new com.tencent.mm.plugin.appbrand.page.l2
            r6.<init>(r5)
            r5.setDownloadListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C40502j2.<init>(android.content.Context):void");
    }

    /* renamed from: T */
    public static WebResourceResponse m43727T(C40502j2 j2Var, String str) {
        android.webkit.WebResourceResponse a;
        j2Var.getClass();
        if (!TextUtils.isEmpty(str) && (a = j2Var.f108817g.mo116415a(str)) != null) {
            return new WebResourceResponse(a.getMimeType(), a.getEncoding(), a.getStatusCode(), a.getReasonPhrase(), a.getResponseHeaders(), a.getData());
        }
        return null;
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        if (isXWalkKernel()) {
            drawCanvas(canvas);
            return true;
        }
        draw(canvas);
        return true;
    }

    /* renamed from: N */
    public void mo63302N(int i, long j) {
        Animator animator = this.f108819i;
        if (animator != null) {
            animator.cancel();
            this.f108819i = null;
        }
        if (super.supportFeature(2005)) {
            super.smoothScroll(getWebScrollX(), i, j);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getWebScrollY(), i});
        ofInt.addUpdateListener(new C40506d());
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.start();
        this.f108819i = ofInt;
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    /* renamed from: V0 */
    public final void mo63305V0() {
        Log.m105925i("MicroMsg.AppBrandWebView", "pauseRendering hash[%d]", Integer.valueOf(hashCode()));
        onHide();
    }

    /* renamed from: W */
    public final void mo63306W(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (IllegalStateException e) {
            Log.m105929w("MicroMsg.AppBrandWebView", "evaluateJavascript get exception:%s", e);
        }
    }

    /* renamed from: b */
    public void mo63307b() {
        onPause();
    }

    /* renamed from: c */
    public void mo63308c() {
        onResume();
    }

    /* renamed from: c1 */
    public boolean mo63309c1() {
        Boolean bool = this.f108829v;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(XWebSdk.getEnableRemoteDebug());
            this.f108829v = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void destroy() {
        if (!this.f108820j) {
            Log.m105925i("MicroMsg.AppBrandWebView", "fireAllPendingReRenderedTasks size=%d", Integer.valueOf(this.f108824q.size()));
            while (!this.f108824q.isEmpty()) {
                this.f108824q.pollFirst().run();
            }
            try {
                super.destroy();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandWebView", e, "[CAUGHT CRASH]", new Object[0]);
            }
            Animator animator = this.f108819i;
            if (animator != null) {
                animator.cancel();
                this.f108819i = null;
            }
            C39836d dVar = this.f108818h;
            if (dVar != null) {
                dVar.mo62474b((WebChromeClient.CustomViewCallback) null);
                this.f108818h.release();
            }
            this.f108818h = null;
            try {
                mo63312f(getContext().getApplicationContext());
            } catch (Exception unused) {
            }
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
            this.f108820j = true;
            Log.m105925i("MicroMsg.AppBrandWebView", "destroyed hash[%d]", Integer.valueOf(hashCode()));
        }
    }

    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.AppBrandWebView", "dispatchDraw %s", android.util.Log.getStackTraceString(new Throwable()));
        }
    }

    /* renamed from: e0 */
    public void mo63310e0(int i, int i2) {
        if (supportSetWebContentsSize()) {
            setWebContentsSize(i, i2);
        }
    }

    /* renamed from: e1 */
    public void mo63311e1(Runnable runnable) {
        if (runnable != null) {
            if (this.f108820j) {
                Log.m105929w("MicroMsg.AppBrandWebView", "postOnReRendered webview destroyed, stack=%s", android.util.Log.getStackTraceString(new Throwable()));
                return;
            }
            C40511h hVar = new C40511h(runnable, (C40512k2) null);
            if (isXWalkKernel()) {
                postDelayed(hVar, 200);
            } else {
                postOnAnimation(hVar);
            }
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo63306W(str, valueCallback);
        } else {
            MMHandlerThread.postToMainThread(new C40505c(str, valueCallback));
        }
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        if (getContext() instanceof MutableContextWrapper) {
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() != context) {
                mutableContextWrapper.setBaseContext(context);
            }
        }
    }

    /* renamed from: f0 */
    public final void mo63313f0() {
        Log.m105925i("MicroMsg.AppBrandWebView", "restoreRendering hash[%d]", Integer.valueOf(hashCode()));
        onShow();
    }

    /* renamed from: g1 */
    public void mo63314g1(String str, String str2) {
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public View getContentView() {
        return super.getView();
    }

    public C39836d getFullscreenImpl() {
        return this.f108818h;
    }

    public String getUserAgentString() {
        return this.f108821n;
    }

    public C88140c getWebViewPluginClientProxy() {
        return this.f108822o;
    }

    public View getWrapperView() {
        return this;
    }

    /* renamed from: l */
    public final String mo63320l() {
        return String.format(Locale.ENGLISH, "AppBrandWebView(%s)@%d", new Object[]{C84106b0.m103652a((C83928t1) null), Integer.valueOf(hashCode())});
    }

    /* renamed from: n0 */
    public final <T extends C40481j> T mo63321n0(Class<T> cls) {
        if (cls == C90087f.class) {
            C33407g gVar = C33407g.f90517a;
            if (supportFeature(XWebFeature.INTERFACE_SHOW_HIDE)) {
                return (C40481j) cls.cast(this);
            }
            return null;
        } else if (cls.isInstance(this)) {
            return (C40481j) cls.cast(this);
        } else {
            return null;
        }
    }

    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (SecurityException unused) {
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C40517r2 r2Var = this.f108815e;
        if (r2Var != null) {
            r2Var.mo63351g(z, i, i2, i3, i4);
        }
    }

    /* renamed from: p1 */
    public void mo63324p1() {
        getView().scrollTo(getWebScrollX(), 0);
    }

    public void setAppBrandInfo(Map<String, String> map) {
        C40504b bVar = new C40504b(map);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            bVar.run();
        } else {
            MMHandlerThread.postToMainThread(bVar);
        }
    }

    public void setAppBrandWebViewClient(C83857n2 n2Var) {
        this.f108817g = n2Var;
    }

    public void setFullscreenImpl(C39836d dVar) {
        this.f108818h = dVar;
    }

    public void setJsExceptionHandler(C83164h hVar) {
    }

    public void setOnScrollChangedListener(C40524u2 u2Var) {
        this.f108814d = u2Var;
    }

    public void setOnTrimListener(C40520s2 s2Var) {
    }

    public void setOverScrolledListener(C40521t2 t2Var) {
        this.f108816f = t2Var;
    }

    public void setWebViewLayoutListener(C40517r2 r2Var) {
        this.f108815e = r2Var;
    }

    public void setXWebKeyboardImpl(C40525w2 w2Var) {
        this.f108823p = w2Var;
    }

    /* renamed from: t0 */
    public boolean mo63333t0() {
        return (!isXWalkKernel() || XWebSdk.getAvailableVersion() < 472) ? getWebScrollY() == 0 : isOverScrollStart();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.j2$e */
    public class C40507e extends WebViewClient {
        public C40507e() {
        }

        public void onPageFinished(WebView webView, String str) {
            C40502j2.this.f108817g.mo116417c(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C40502j2.this.f108817g.getClass();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Log.m105921e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", Integer.valueOf(i), str, str2);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Uri url = webResourceRequest.getUrl();
            Log.m105921e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", url == null ? "null" : url.toString(), webResourceResponse.getMimeType(), Integer.valueOf(webResourceResponse.getStatusCode()));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError.getPrimaryError() != 3) {
                sslErrorHandler.cancel();
            } else if (C40502j2.this.f108817g.mo116416b(sslError.getCertificate())) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            return C40502j2.m43727T(C40502j2.this, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.m105925i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", str);
            return true;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null || Util.isNullOrNil(webResourceRequest.getUrl().toString())) {
                return null;
            }
            return C40502j2.m43727T(C40502j2.this, webResourceRequest.getUrl().toString());
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null || Util.isNullOrNil(webResourceRequest.getUrl().toString())) {
                return null;
            }
            return C40502j2.m43727T(C40502j2.this, webResourceRequest.getUrl().toString());
        }
    }
}
