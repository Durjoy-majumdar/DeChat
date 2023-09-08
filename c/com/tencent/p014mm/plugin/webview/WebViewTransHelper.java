package com.tencent.p014mm.plugin.webview;

import a14.C53973z1;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C103769x;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import i83.C33245r;
import i83.C33246y;
import i83.C46176a0;
import i83.C46177b0;
import i83.C46178e;
import i83.C46184h0;
import i83.C46185i0;
import i83.C46187j0;
import i83.C46189k0;
import i83.C46190l;
import i83.C46191m;
import i83.C46194p;
import i83.C46195q;
import i83.C46198u;
import i83.C46201v;
import i83.C46205z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p206nj.C117627q;
import t83.C48590l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/WebViewTransHelper;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "destroyPageLogicController", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper;", "webViewUIHelper", "<init>", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper;)V", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.WebViewTransHelper */
public final class WebViewTransHelper implements C0124r {

    /* renamed from: d */
    public final WebViewUIStyleHelper f117504d;

    /* renamed from: e */
    public C46198u f117505e;

    /* renamed from: f */
    public boolean f117506f;

    /* renamed from: g */
    public Map<String, String> f117507g = new LinkedHashMap();

    /* renamed from: h */
    public C54219z<C46176a0> f117508h = new C54219z<>();

    /* renamed from: i */
    public C54219z<Integer> f117509i = new C54219z<>();

    /* renamed from: j */
    public C103769x<?> f117510j = new C103769x<>();

    /* renamed from: n */
    public boolean f117511n;

    /* renamed from: o */
    public String f117512o = "";

    /* renamed from: com.tencent.mm.plugin.webview.WebViewTransHelper$a */
    public static final class C43475a extends C43519u {

        /* renamed from: a */
        public final WeakReference<WebViewTransHelper> f117513a;

        public C43475a(WeakReference<WebViewTransHelper> weakReference) {
            C87412m.m108594g(weakReference, "weakWebViewTransHelper");
            this.f117513a = weakReference;
        }

        /* renamed from: b */
        public void mo64752b(WebView webView, String str) {
            WebViewTransHelper webViewTransHelper;
            Log.m105924i("MicroMsg.WebViewTransHelper", "page commit");
            WebViewTransHelper webViewTransHelper2 = this.f117513a.get();
            boolean z = true;
            if (webViewTransHelper2 == null || !webViewTransHelper2.f117511n) {
                z = false;
            }
            if (z && (webViewTransHelper = this.f117513a.get()) != null) {
                webViewTransHelper.destroyPageLogicController();
            }
            WebViewTransHelper webViewTransHelper3 = this.f117513a.get();
            if (webViewTransHelper3 != null) {
                webViewTransHelper3.mo67656c(webView);
            }
            WebViewTransHelper webViewTransHelper4 = this.f117513a.get();
            if (webViewTransHelper4 != null) {
                C46198u b = webViewTransHelper4.mo67655b();
                b.f124533p.mo145136d(C39623j.C39626c.STARTED);
                C46178e eVar = b.f124531n;
                if ((eVar != null ? eVar.mo67664e() : null) == C46176a0.DoTrans) {
                    b.mo71624c();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r1 = r1.f117508h;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo62156d(com.tencent.xweb.WebView r1, java.lang.String r2) {
            /*
                r0 = this;
                java.lang.String r1 = "MicroMsg.WebViewTransHelper"
                java.lang.String r2 = "page start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.WebViewTransHelper> r1 = r0.f117513a
                java.lang.Object r1 = r1.get()
                com.tencent.mm.plugin.webview.WebViewTransHelper r1 = (com.tencent.p014mm.plugin.webview.WebViewTransHelper) r1
                r2 = 0
                if (r1 == 0) goto L_0x0017
                boolean r1 = r1.f117511n
                if (r1 != 0) goto L_0x0017
                r2 = 1
            L_0x0017:
                if (r2 == 0) goto L_0x001a
                return
            L_0x001a:
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.WebViewTransHelper> r1 = r0.f117513a
                java.lang.Object r1 = r1.get()
                com.tencent.mm.plugin.webview.WebViewTransHelper r1 = (com.tencent.p014mm.plugin.webview.WebViewTransHelper) r1
                if (r1 == 0) goto L_0x002f
                androidx.lifecycle.z<i83.a0> r1 = r1.f117508h
                if (r1 == 0) goto L_0x002f
                java.lang.Object r1 = r1.getValue()
                i83.a0 r1 = (i83.C46176a0) r1
                goto L_0x0030
            L_0x002f:
                r1 = 0
            L_0x0030:
                i83.a0 r2 = i83.C46176a0.DoTrans
                if (r1 != r2) goto L_0x0041
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.WebViewTransHelper> r1 = r0.f117513a
                java.lang.Object r1 = r1.get()
                com.tencent.mm.plugin.webview.WebViewTransHelper r1 = (com.tencent.p014mm.plugin.webview.WebViewTransHelper) r1
                if (r1 == 0) goto L_0x0041
                com.tencent.p014mm.plugin.webview.WebViewTransHelper.m46993a(r1)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.WebViewTransHelper.C43475a.mo62156d(com.tencent.xweb.WebView, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.WebViewTransHelper$b */
    public /* synthetic */ class C43476b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f117514a;

        static {
            int[] iArr = new int[C46176a0.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            f117514a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.WebViewTransHelper$c */
    public static final class C43477c implements C46178e {

        /* renamed from: a */
        public final /* synthetic */ WebViewTransHelper f117515a;

        public C43477c(WebViewTransHelper webViewTransHelper) {
            this.f117515a = webViewTransHelper;
        }

        /* renamed from: a */
        public String mo67660a() {
            return this.f117515a.f117512o;
        }

        /* renamed from: b */
        public Map<String, String> mo67661b() {
            return this.f117515a.f117507g;
        }

        /* renamed from: c */
        public void mo67662c() {
            C43522y yVar;
            C48590l g0;
            HashMap hashMap = new HashMap();
            hashMap.put("action", "revert");
            WebViewUI webViewUI = this.f117515a.f117504d.f118667d;
            if (webViewUI != null && (yVar = webViewUI.f118513b1) != null && (g0 = yVar.mo67720g0()) != null) {
                g0.mo8701f("onCallWebTranslateApi", hashMap);
            }
        }

        /* renamed from: d */
        public void mo67663d() {
            C43522y yVar;
            C48590l g0;
            HashMap hashMap = new HashMap();
            hashMap.put("action", "trans");
            WebViewUI webViewUI = this.f117515a.f117504d.f118667d;
            if (webViewUI != null && (yVar = webViewUI.f118513b1) != null && (g0 = yVar.mo67720g0()) != null) {
                g0.mo8701f("onCallWebTranslateApi", hashMap);
            }
        }

        /* renamed from: e */
        public C46176a0 mo67664e() {
            if (this.f117515a.f117508h.getValue() == null) {
                return C46176a0.None;
            }
            C46176a0 value = this.f117515a.f117508h.getValue();
            C87412m.m108591d(value);
            return value;
        }

        /* renamed from: f */
        public void mo67665f(String str, String str2) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "value");
            this.f117515a.f117507g.put(str, str2);
        }
    }

    public WebViewTransHelper(WebViewUIStyleHelper webViewUIStyleHelper) {
        C43522y yVar;
        C87412m.m108594g(webViewUIStyleHelper, "webViewUIHelper");
        this.f117504d = webViewUIStyleHelper;
        boolean z = false;
        this.f117511n = false;
        WebViewUI webViewUI = webViewUIStyleHelper.f118667d;
        if (!(webViewUI == null || (yVar = webViewUI.f118513b1) == null || !yVar.f117596v0.contains(Integer.valueOf(yVar.f117568h0)))) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.WebViewTransHelper", "fast open");
            mo67656c(webViewUIStyleHelper.f118666c);
            C46198u b = mo67655b();
            b.f124533p.mo145136d(C39623j.C39626c.STARTED);
            C46178e eVar = b.f124531n;
            if ((eVar != null ? eVar.mo67664e() : null) == C46176a0.DoTrans) {
                b.mo71624c();
            }
        }
    }

    /* renamed from: a */
    public static final void m46993a(WebViewTransHelper webViewTransHelper) {
        C46195q qVar = C46195q.SwitchToHelpImmediate;
        C46176a0 a0Var = C46176a0.DoTrans;
        C33245r rVar = C33245r.Trans;
        C46195q qVar2 = C46195q.SwitchToOrgImmediate;
        WebViewUI webViewUI = webViewTransHelper.f117504d.f118667d;
        boolean z = true;
        if (webViewUI != null && !webViewUI.isOptionMenuShow(0)) {
            webViewTransHelper.f117504d.mo68384q(qVar2, rVar);
            Log.m105924i("MicroMsg.WebViewTransHelper", "forbid menu!");
            return;
        }
        C46176a0 value = webViewTransHelper.f117508h.getValue();
        if ((value == null ? -1 : C43476b.f117514a[value.ordinal()]) == 1) {
            rVar = C33245r.Revert;
        }
        if (webViewTransHelper.mo67655b().f124539v.getValue() == C46191m.NeedTrans || webViewTransHelper.mo67655b().f124530j || webViewTransHelper.f117508h.getValue() == a0Var) {
            if (webViewTransHelper.f117508h.getValue() != a0Var) {
                z = false;
            }
            if (z) {
                webViewTransHelper.f117504d.mo68384q(qVar, rVar);
                return;
            }
            Integer value2 = webViewTransHelper.f117509i.getValue() == null ? 0 : webViewTransHelper.f117509i.getValue();
            if (value2 == null) {
                return;
            }
            if (value2.intValue() < 100) {
                webViewTransHelper.f117504d.mo68384q(qVar, rVar);
            } else {
                webViewTransHelper.f117504d.mo68384q(qVar2, rVar);
            }
        } else {
            webViewTransHelper.f117504d.mo68384q(qVar2, rVar);
        }
    }

    /* renamed from: b */
    public final C46198u mo67655b() {
        C46198u uVar = this.f117505e;
        if (uVar != null) {
            return uVar;
        }
        C87412m.m108603p("pageLogicController");
        throw null;
    }

    /* renamed from: c */
    public final void mo67656c(WebView webView) {
        Log.m105924i("MicroMsg.WebViewTransHelper", "initPage");
        C87412m.m108592e(webView, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMWebView");
        C46198u uVar = new C46198u((MMWebView) webView);
        uVar.f124531n = new C43477c(this);
        this.f117505e = uVar;
        this.f117511n = true;
        if (this.f117504d.f118667d == null) {
            Log.m105924i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
            return;
        }
        Log.m105924i("MicroMsg.WebViewTransHelper", "initObserver");
        mo67655b().f124532o.observe(this.f117504d.f118667d, new C46184h0(this));
        C103769x<?> xVar = new C103769x<>();
        xVar.addSource(mo67655b().f124539v, new C46185i0(this));
        xVar.addSource(this.f117508h, new C46187j0(this));
        xVar.observe(this.f117504d.f118667d, new C46189k0(this));
        this.f117510j = xVar;
    }

    /* renamed from: d */
    public final void mo67657d(C46194p pVar) {
        C33246y yVar = C33246y.Click;
        C46194p pVar2 = C46194p.HelpBtn;
        C87412m.m108594g(pVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (this.f117505e == null) {
            Log.m105924i("MicroMsg.WebViewTransHelper", "pageLogic is not initialized!");
        } else if (this.f117504d.f118667d == null) {
            Log.m105924i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
        } else {
            Log.m105924i("MicroMsg.WebViewTransHelper", "onChangeTransStatus Entry Scene " + pVar);
            C46176a0 value = this.f117508h.getValue();
            int i = value == null ? -1 : C43476b.f117514a[value.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    mo67659e(yVar, pVar == pVar2 ? C46205z.HelpRevertButton : C46205z.MenuRevertButton);
                    Log.m105924i("MicroMsg.WebViewTransHelper", "revertTrans");
                    this.f117508h.setValue(C46176a0.DoRevert);
                    C46198u b = mo67655b();
                    b.f124532o.setValue(C46177b0.Hide);
                    C46190l lVar = b.f124527g;
                    lVar.f124497f.clear();
                    lVar.f124495d.mo145136d(C39623j.C39626c.DESTROYED);
                    C53973z1 z1Var = b.f124534q;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    b.mo71622a(b.f124524d, "window.WeixinTranslate.revertTrans()");
                    C46178e eVar = b.f124531n;
                    if (eVar != null) {
                        eVar.mo67662c();
                        return;
                    }
                    return;
                } else if (!(i == 2 || i == 3)) {
                    return;
                }
            }
            mo67659e(yVar, pVar == pVar2 ? C46205z.HelpTransButton : C46205z.MenuTransButton);
            C46198u b2 = mo67655b();
            String b3 = b2.mo71623b(b2.f124529i);
            if (Util.isNullOrNil(b3)) {
                Log.m105920e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
                return;
            }
            b2.f124537t = 0;
            b2.f124524d.evaluateJavascript(b3, new C46201v(b2, b3));
        }
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void destroyPageLogicController() {
        Log.m105924i("MicroMsg.WebViewTransHelper", "destroy");
        if (this.f117505e != null) {
            mo67655b().f124533p.mo145136d(C39623j.C39626c.DESTROYED);
        }
    }

    /* renamed from: e */
    public final void mo67659e(C33246y yVar, C46205z zVar) {
        C87412m.m108594g(yVar, "action");
        C87412m.m108594g(zVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        String url = this.f117504d.f118666c.getUrl();
        C87412m.m108593f(url, "webViewUIHelper.webView.url");
        HashMap<String, Integer> hashMap = C44404a.f120354a;
        String b = C117627q.m165909b(url, "UTF-8");
        boolean i = this.f117504d.mo68377i();
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        String str = yVar.ordinal() + ',' + zVar.ordinal() + ',' + b + ',' + (i ? 1 : 0) + ',' + applicationLanguage;
        Log.m105924i("MicroMsg.WebViewTransHelper", "webTrans reportStr:" + str);
        C115669n.INSTANCE.kvStat(21129, str);
    }
}
