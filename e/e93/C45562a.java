package e93;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43504a0;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43507c;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.core.C5857x;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C85655x0;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import e00.C45520t;
import ea3.C45604u;
import ex0.C45700h;
import f40.C86709a0;
import f93.C31965e;
import f93.C45764a;
import f93.C45765b;
import f93.C45766c;
import f93.C45767f;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i93.C46206e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C12969d;
import p910lj.C76701a;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s24.C90125c;
import t83.C36979g1;
import te3.C52018xt1;
import z04.C112551y;
import z04.C119027c;
import z04.C66725r;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: e93.a */
public final class C45562a extends C43505b0 {

    /* renamed from: c */
    public C45700h.C45703c f123243c;

    /* renamed from: d */
    public boolean f123244d;

    /* renamed from: e */
    public boolean f123245e;

    /* renamed from: f */
    public boolean f123246f;

    /* renamed from: g */
    public boolean f123247g;

    /* renamed from: h */
    public final C13601g f123248h = C36568h.m40985a(C45563a.f123258d);

    /* renamed from: i */
    public boolean f123249i;

    /* renamed from: j */
    public C45570e f123250j;

    /* renamed from: k */
    public boolean f123251k;

    /* renamed from: l */
    public C45579l f123252l = new C45579l();

    /* renamed from: m */
    public long f123253m;

    /* renamed from: n */
    public final C13601g f123254n = C36568h.m40985a(new C45566d(this));

    /* renamed from: o */
    public Boolean f123255o;

    /* renamed from: p */
    public final C43519u f123256p = new C45564b(this);

    /* renamed from: q */
    public final C43504a0 f123257q = new C45565c(this);

    /* renamed from: e93.a$a */
    public static final class C45563a extends C87413o implements C32224a<C45700h> {

        /* renamed from: d */
        public static final C45563a f123258d = new C45563a();

        public C45563a() {
            super(0);
        }

        public Object invoke() {
            return (C45700h) C86709a0.m107533q(C45700h.class);
        }
    }

    /* renamed from: e93.a$b */
    public static final class C45564b extends C43519u {

        /* renamed from: a */
        public final /* synthetic */ C45562a f123259a;

        public C45564b(C45562a aVar) {
            this.f123259a = aVar;
        }

        /* renamed from: b */
        public void mo64752b(WebView webView, String str) {
            Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "onPageCommitVisible, url = %s", str);
            C45562a aVar = this.f123259a;
            if (!aVar.f123249i) {
                MMWebView mMWebView = aVar.mo67777c().f117553a;
                mMWebView.evaluateJavascript(C66725r.m78728b("(function(p){\n                p.wx=p.wx||{};\n                p.wx.timeOrigin=" + this.f123259a.mo67777c().f117543Q.f123352s + ";\n                p.wx.info=Object.assign(p.wx.info||{}, {\n                    preauth:" + this.f123259a.f123245e + ",\n                    prefetch:" + this.f123259a.f123244d + ",\n                    predns:" + this.f123259a.f123246f + "\n                })\n                return p.wx.info;\n            })(window.performance);"), C7604c.f25871a);
                C45562a aVar2 = this.f123259a;
                aVar2.f123249i = true;
                C45700h.C45703c cVar = aVar2.f123243c;
                if (cVar != null) {
                    C31965e.m39600a(C31965e.C31966a.ACTION_PREFETCH_PAGE_COMMIT, str, cVar != null ? cVar.f123515a : null, cVar != null ? cVar.f123523i : 0, cVar != null ? cVar.f123518d : 0, cVar != null ? cVar.f123522h : 0);
                }
                C45767f.f123649a.mo71242b(C45764a.PageCommit, this.f123259a.mo67777c().f117563f);
            }
            C45570e eVar = this.f123259a.f123250j;
            if (eVar != null) {
                eVar.f123280l = false;
            }
        }

        /* renamed from: c */
        public void mo64753c(WebView webView, String str) {
            Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "onPageFinished, url = %s", str);
            C45767f.f123649a.mo71242b(C45764a.PageFinish, this.f123259a.mo67777c().f117563f);
            C45579l lVar = this.f123259a.f123252l;
            lVar.getClass();
            String str2 = "dumpPrefetchLoadResPerformance prefetch: " + lVar.f123287a + ", enableLoadResOpt: " + true + ", loadContentCost: " + lVar.f123290d + ", loadResCostTotal: " + lVar.f123290d + ", loadResAvg: %s, url = %s";
            Object[] objArr = new Object[2];
            int i = lVar.f123292f;
            objArr[0] = i > 0 ? Long.valueOf(lVar.f123291e / ((long) i)) : null;
            objArr[1] = lVar.f123288b;
            Log.m105925i("MicroMsg.WebPrefetcherResPerformanceHelper", str2, objArr);
            if (lVar.f123287a) {
                ((C119157j) C119157j.f356862d).mo183875f(new C45578k(lVar));
            }
        }

        /* renamed from: d */
        public void mo62156d(WebView webView, String str) {
            C45570e eVar;
            Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "onPageStarted, prefetch: " + this.f123259a.f123244d + ", url = %s", str);
            C45767f.f123649a.mo71242b(C45764a.PageStart, this.f123259a.mo67777c().f117563f);
            C45562a aVar = this.f123259a;
            if (aVar.f123244d && (eVar = aVar.f123250j) != null) {
                Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "updateRandomStr isDgtVerify: " + eVar.f123278j);
                if (eVar.f123277i && eVar.f123278j) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("__event_id", "sys:updateRandomStr");
                        jSONObject2.put("randomStr", eVar.f123279k);
                        jSONObject.put("__json_message", jSONObject2);
                        MMWebView mMWebView = eVar.f123271c;
                        C87412m.m108591d(mMWebView);
                        mMWebView.evaluateJavascript("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + jSONObject + ')', new C45576h());
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e, "updateRandomStr exception", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: e93.a$c */
    public static final class C45565c extends C43504a0 {

        /* renamed from: b */
        public final /* synthetic */ C45562a f123260b;

        public C45565c(C45562a aVar) {
            this.f123260b = aVar;
        }

        /* renamed from: k */
        public void mo67855k(int i, String str, C52018xt1 xt12) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(xt12, "response");
            super.mo67855k(i, str, xt12);
            String str2 = xt12.f144941d;
            if (str2 == null) {
                str2 = "";
            }
            Log.m105927v("MicroMsg.WebPrefetcherInterceptor", "onPermissionUpdate reason: " + i + ", prefetch: " + this.f123260b.f123244d + ", reqUrl: %s, fullUrl: %s", str, str2);
        }

        /* renamed from: r */
        public void mo63690r(C45604u uVar) {
            C87412m.m108594g(uVar, "performanceHelper");
            Log.m105919d("MicroMsg.WebPrefetcherInterceptor", "onPerformanceCollect prefetch: %s", Boolean.valueOf(uVar.f123340g));
            if (C36979g1.m41111a()) {
                uVar.f123337d = ((C45700h) C86709a0.m107533q(C45700h.class)).mo71030OO(this.f123260b.mo71083w(), this.f123260b.mo71082v());
            }
        }

        /* renamed from: s */
        public void mo67774s(C45604u uVar) {
            C87412m.m108594g(uVar, "performanceHelper");
            C45700h x = this.f123260b.mo71084x();
            C45520t tVar = this.f117774a;
            if (tVar != null) {
                int ss02 = x.ss0(tVar.mo63683n0());
                C13601g gVar = C46206e.f124554a;
                if (uVar.f123338e) {
                    C46206e.m51496c(1, 1, ss02);
                    return;
                }
                return;
            }
            C87412m.m108603p("controller");
            throw null;
        }
    }

    /* renamed from: e93.a$d */
    public static final class C45566d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C45562a f123261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45566d(C45562a aVar) {
            super(0);
            this.f123261d = aVar;
        }

        public Object invoke() {
            return (String) ((C36570n) this.f123261d.mo67777c().f117593u).getValue();
        }
    }

    /* renamed from: e93.a$e */
    public static final class C45567e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f123262d;

        /* renamed from: e */
        public final /* synthetic */ boolean f123263e;

        /* renamed from: f */
        public final /* synthetic */ C45700h.C45703c f123264f;

        public C45567e(Context context, boolean z, C45700h.C45703c cVar) {
            this.f123262d = context;
            this.f123263e = z;
            this.f123264f = cVar;
        }

        public final void run() {
            String string = this.f123262d.getString(C0966R.string.lex);
            C87412m.m108593f(string, "it.getString(com.tencent…g_web_prefetch_hit_toast)");
            Object[] objArr = new Object[4];
            objArr[0] = this.f123263e ? "HTML" : "JS/CSS";
            objArr[1] = Long.valueOf(this.f123264f.f123519e);
            C45700h.C45705e eVar = this.f123264f.f123521g;
            objArr[2] = Integer.valueOf(eVar != null ? eVar.f123533c : -1);
            C45700h.C45705e eVar2 = this.f123264f.f123521g;
            String str = eVar2 != null ? eVar2.f123534d : null;
            if (str == null) {
                str = "null";
            }
            objArr[3] = str;
            String format = String.format(string, Arrays.copyOf(objArr, 4));
            C87412m.m108593f(format, "format(format, *args)");
            C76701a.makeText(this.f123262d, (CharSequence) format, 0).show();
        }
    }

    /* renamed from: A */
    public final void mo71081A(boolean z, C45700h.C45703c cVar, long j) {
        String str;
        WebResourceResponse webResourceResponse;
        String mimeType;
        C43520v.C43521b bVar = C43520v.f117665a;
        if (BuildInfo.DEBUG || (BuildInfo.IS_FLAVOR_RED && C5857x.m5577a().getInt("showDebugToast", -1) == 1)) {
            Object[] objArr = new Object[1];
            C45700h.C45705e eVar = cVar.f123521g;
            if (eVar == null || (webResourceResponse = eVar.f123531a) == null || (mimeType = webResourceResponse.getMimeType()) == null) {
                str = null;
            } else {
                str = mimeType.toLowerCase(Locale.ROOT);
                C87412m.m108593f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            objArr[0] = str;
            Log.m105927v("MicroMsg.WebPrefetcherInterceptor", "showDebugToast mimeType: %s", objArr);
            Context activityContextIfHas = mo67777c().f117553a.getActivityContextIfHas();
            if (activityContextIfHas != null) {
                C119179t tVar = C119157j.f356862d;
                C45567e eVar2 = new C45567e(activityContextIfHas, z, cVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(eVar2, j, false);
            }
        }
    }

    /* renamed from: a */
    public int mo67775a(String str) {
        C87412m.m108594g(str, "url");
        if (!mo71085y(str)) {
            C45700h.C45703c cVar = this.f123243c;
            return C87412m.m108589b(str, cVar != null ? cVar.f123515a : null) ? 10 : -1;
        }
    }

    /* renamed from: b */
    public C43519u mo67776b() {
        return this.f123256p;
    }

    /* renamed from: d */
    public C43558z mo63687d() {
        return this.f123257q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r7 != false) goto L_0x0046;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.WebResourceResponse mo62378f(com.tencent.xweb.WebView r18, com.tencent.xweb.WebResourceRequest r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "webview"
            r2 = r18
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "request"
            r2 = r19
            gy3.C87412m.m108594g(r2, r0)
            ex0.h$c r0 = r1.f123243c
            r3 = 0
            if (r0 == 0) goto L_0x01d2
            android.net.Uri r0 = r19.getUrl()
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "request.url.toString()"
            gy3.C87412m.m108593f(r0, r4)
            boolean r4 = r19.isForMainFrame()
            java.lang.String r5 = "MicroMsg.WebPrefetcherInterceptor"
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00a3
            ex0.h$c r2 = r1.f123243c
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = r2.f123515a
            goto L_0x0035
        L_0x0034:
            r2 = r3
        L_0x0035:
            boolean r2 = gy3.C87412m.m108589b(r0, r2)
            if (r2 != 0) goto L_0x0046
            ex0.h$c r2 = r1.f123243c
            if (r2 == 0) goto L_0x0044
            boolean r2 = r2.f123527m
            if (r2 != r6) goto L_0x0044
            r7 = 1
        L_0x0044:
            if (r7 == 0) goto L_0x01d2
        L_0x0046:
            ex0.h$c r2 = r1.f123243c
            if (r2 == 0) goto L_0x00a2
            ex0.h$e r2 = r2.f123521g
            if (r2 == 0) goto L_0x00a2
            com.tencent.xweb.WebResourceResponse r2 = r2.f123531a
            if (r2 == 0) goto L_0x00a2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "webPrefetch intercepted html hitByPrefetchId: "
            r4.append(r7)
            ex0.h$c r7 = r1.f123243c
            if (r7 == 0) goto L_0x0067
            boolean r3 = r7.f123527m
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x0067:
            r4.append(r3)
            java.lang.String r3 = ", "
            r4.append(r3)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r2.getMimeType()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r0)
            com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r17.mo67777c()
            ea3.u r0 = r0.f117543Q
            java.lang.String r3 = r17.mo71082v()
            java.lang.String r4 = "prefetchId"
            gy3.C87412m.m108593f(r3, r4)
            r0.getClass()
            r0.f123341h = r3
            ex0.h$c r0 = r1.f123243c
            gy3.C87412m.m108591d(r0)
            r3 = 0
            r1.mo71081A(r6, r0, r3)
            r3 = r2
        L_0x00a2:
            return r3
        L_0x00a3:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01ca }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r4 = r17.mo67777c()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r4 = r4.getCurrentUrl()     // Catch:{ Exception -> 0x01ca }
            if (r4 == 0) goto L_0x01c9
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r4 = r4.getHost()     // Catch:{ Exception -> 0x01ca }
            if (r4 == 0) goto L_0x01c9
            ex0.h r10 = r17.mo71084x()     // Catch:{ Exception -> 0x01ca }
            if (r10 == 0) goto L_0x00d4
            ex0.h$c r11 = r1.f123243c     // Catch:{ Exception -> 0x01ca }
            if (r11 == 0) goto L_0x00c8
            java.lang.String r12 = r11.f123524j     // Catch:{ Exception -> 0x01ca }
            goto L_0x00c9
        L_0x00c8:
            r12 = r3
        L_0x00c9:
            if (r11 == 0) goto L_0x00ce
            java.lang.String r11 = r11.f123526l     // Catch:{ Exception -> 0x01ca }
            goto L_0x00cf
        L_0x00ce:
            r11 = r3
        L_0x00cf:
            ex0.h$c r4 = r10.mo71037fH(r4, r0, r12, r11)     // Catch:{ Exception -> 0x01ca }
            goto L_0x00d5
        L_0x00d4:
            r4 = r3
        L_0x00d5:
            if (r4 == 0) goto L_0x01c9
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01ca }
            e93.l r12 = r1.f123252l     // Catch:{ Exception -> 0x01ca }
            long r10 = r10 - r8
            r12.mo71102a(r10)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r8 = "webPrefetch intercepted res mimeType: %s, prefetchType: %s, url: %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01ca }
            ex0.h$e r10 = r4.f123521g     // Catch:{ Exception -> 0x01ca }
            if (r10 == 0) goto L_0x00f4
            com.tencent.xweb.WebResourceResponse r10 = r10.f123531a     // Catch:{ Exception -> 0x01ca }
            if (r10 == 0) goto L_0x00f4
            java.lang.String r10 = r10.getMimeType()     // Catch:{ Exception -> 0x01ca }
            goto L_0x00f5
        L_0x00f4:
            r10 = r3
        L_0x00f5:
            r9[r7] = r10     // Catch:{ Exception -> 0x01ca }
            java.lang.String r10 = r4.f123520f     // Catch:{ Exception -> 0x01ca }
            r9[r6] = r10     // Catch:{ Exception -> 0x01ca }
            r10 = 2
            r9[r10] = r0     // Catch:{ Exception -> 0x01ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r8, r9)     // Catch:{ Exception -> 0x01ca }
            boolean r0 = r1.f123251k     // Catch:{ Exception -> 0x01ca }
            if (r0 != 0) goto L_0x010c
            r1.f123251k = r6     // Catch:{ Exception -> 0x01ca }
            r8 = 1000(0x3e8, double:4.94E-321)
            r1.mo71081A(r7, r4, r8)     // Catch:{ Exception -> 0x01ca }
        L_0x010c:
            java.lang.String r0 = r4.f123520f     // Catch:{ Exception -> 0x01ca }
            java.lang.String r6 = "JS"
            boolean r6 = gy3.C87412m.m108589b(r0, r6)     // Catch:{ Exception -> 0x01ca }
            r8 = 1
            java.lang.String r10 = ""
            r11 = 59
            if (r6 == 0) goto L_0x016c
            com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r17.mo67777c()     // Catch:{ Exception -> 0x01ca }
            ea3.u r0 = r0.f117543Q     // Catch:{ Exception -> 0x01ca }
            java.util.LinkedList<java.lang.String> r0 = r0.f123345l     // Catch:{ Exception -> 0x01ca }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca }
            r6.<init>()     // Catch:{ Exception -> 0x01ca }
            android.net.Uri r2 = r19.getUrl()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01ca }
            r6.append(r2)     // Catch:{ Exception -> 0x01ca }
            r6.append(r11)     // Catch:{ Exception -> 0x01ca }
            ex0.h$e r2 = r4.f123521g     // Catch:{ Exception -> 0x01ca }
            if (r2 == 0) goto L_0x013e
            java.lang.String r2 = r2.f123532b     // Catch:{ Exception -> 0x01ca }
            goto L_0x013f
        L_0x013e:
            r2 = r3
        L_0x013f:
            if (r2 != 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r10 = r2
        L_0x0143:
            r6.append(r10)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x01ca }
            r0.add(r2)     // Catch:{ Exception -> 0x01ca }
            rx3.g r0 = i93.C46206e.f124554a     // Catch:{ Exception -> 0x01ca }
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01ca }
            r11 = 1200(0x4b0, double:5.93E-321)
            r13 = 11
            r15 = 1
            r10.mo175913w(r11, r13, r15)     // Catch:{ Exception -> 0x01ca }
            ex0.h r0 = r17.mo71084x()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r17.mo71083w()     // Catch:{ Exception -> 0x01ca }
            int r0 = r0.ss0(r2)     // Catch:{ Exception -> 0x01ca }
            r10 = 8
            i93.C46206e.m51496c(r10, r8, r0)     // Catch:{ Exception -> 0x01ca }
            goto L_0x01c3
        L_0x016c:
            java.lang.String r6 = "CSS"
            boolean r0 = gy3.C87412m.m108589b(r0, r6)     // Catch:{ Exception -> 0x01ca }
            if (r0 == 0) goto L_0x01c3
            com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r17.mo67777c()     // Catch:{ Exception -> 0x01ca }
            ea3.u r0 = r0.f117543Q     // Catch:{ Exception -> 0x01ca }
            java.util.LinkedList<java.lang.String> r0 = r0.f123346m     // Catch:{ Exception -> 0x01ca }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca }
            r6.<init>()     // Catch:{ Exception -> 0x01ca }
            android.net.Uri r2 = r19.getUrl()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01ca }
            r6.append(r2)     // Catch:{ Exception -> 0x01ca }
            r6.append(r11)     // Catch:{ Exception -> 0x01ca }
            ex0.h$e r2 = r4.f123521g     // Catch:{ Exception -> 0x01ca }
            if (r2 == 0) goto L_0x0196
            java.lang.String r2 = r2.f123532b     // Catch:{ Exception -> 0x01ca }
            goto L_0x0197
        L_0x0196:
            r2 = r3
        L_0x0197:
            if (r2 != 0) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r10 = r2
        L_0x019b:
            r6.append(r10)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x01ca }
            r0.add(r2)     // Catch:{ Exception -> 0x01ca }
            rx3.g r0 = i93.C46206e.f124554a     // Catch:{ Exception -> 0x01ca }
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01ca }
            r11 = 1200(0x4b0, double:5.93E-321)
            r13 = 12
            r15 = 1
            r10.mo175913w(r11, r13, r15)     // Catch:{ Exception -> 0x01ca }
            ex0.h r0 = r17.mo71084x()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r17.mo71083w()     // Catch:{ Exception -> 0x01ca }
            int r0 = r0.ss0(r2)     // Catch:{ Exception -> 0x01ca }
            r10 = 9
            i93.C46206e.m51496c(r10, r8, r0)     // Catch:{ Exception -> 0x01ca }
        L_0x01c3:
            ex0.h$e r0 = r4.f123521g     // Catch:{ Exception -> 0x01ca }
            if (r0 == 0) goto L_0x01c9
            com.tencent.xweb.WebResourceResponse r3 = r0.f123531a     // Catch:{ Exception -> 0x01ca }
        L_0x01c9:
            return r3
        L_0x01ca:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r4 = "interceptRequest getCurrentUrl host"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r2)
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e93.C45562a.mo62378f(com.tencent.xweb.WebView, com.tencent.xweb.WebResourceRequest):com.tencent.xweb.WebResourceResponse");
    }

    /* renamed from: k */
    public boolean mo67781k(String str) {
        C87412m.m108594g(str, "url");
        return !mo71085y(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9 A[Catch:{ IOException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa A[Catch:{ IOException -> 0x00b5 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67782l(int r10, java.lang.String r11, te3.C52018xt1 r12) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.WebPrefetcherInterceptor"
            java.lang.String r1 = "reqUrl"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r1 = "resp"
            gy3.C87412m.m108594g(r12, r1)
            int r1 = r12.f144943f
            r2 = 0
            r3 = 1
            r4 = 38
            if (r1 != r4) goto L_0x00be
            boolean r10 = r9.mo71085y(r11)
            if (r10 == 0) goto L_0x00bd
            te3.qv3 r10 = r12.f144938C
            r12 = 0
            if (r10 == 0) goto L_0x0024
            byte[] r10 = sf0.C48374j0.m53715d(r10)
            goto L_0x0025
        L_0x0024:
            r10 = r12
        L_0x0025:
            te3.yt1 r1 = new te3.yt1     // Catch:{ IOException -> 0x00b5 }
            r1.<init>()     // Catch:{ IOException -> 0x00b5 }
            r1.parseFrom(r10)     // Catch:{ IOException -> 0x00b5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b5 }
            r10.<init>()     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = "overrideProcessResultL, prefetchVersion: "
            r10.append(r4)     // Catch:{ IOException -> 0x00b5 }
            ex0.h$c r4 = r9.f123243c     // Catch:{ IOException -> 0x00b5 }
            r5 = 0
            if (r4 == 0) goto L_0x0040
            long r7 = r4.f123519e     // Catch:{ IOException -> 0x00b5 }
            goto L_0x0041
        L_0x0040:
            r7 = r5
        L_0x0041:
            r10.append(r7)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = ", verifyInfo.Version: "
            r10.append(r4)     // Catch:{ IOException -> 0x00b5 }
            long r7 = r1.f145505e     // Catch:{ IOException -> 0x00b5 }
            r10.append(r7)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = ", redirectUrl: "
            r10.append(r4)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = r1.f145504d     // Catch:{ IOException -> 0x00b5 }
            r10.append(r4)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x00b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ IOException -> 0x00b5 }
            ex0.h$c r10 = r9.f123243c     // Catch:{ IOException -> 0x00b5 }
            if (r10 == 0) goto L_0x0065
            long r5 = r10.f123519e     // Catch:{ IOException -> 0x00b5 }
        L_0x0065:
            long r7 = r1.f145505e     // Catch:{ IOException -> 0x00b5 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00bd
            ex0.h r10 = r9.mo71084x()     // Catch:{ IOException -> 0x00b5 }
            if (r10 == 0) goto L_0x0089
            ex0.h$c r4 = r9.f123243c     // Catch:{ IOException -> 0x00b5 }
            if (r4 == 0) goto L_0x0078
            java.lang.String r5 = r4.f123517c     // Catch:{ IOException -> 0x00b5 }
            goto L_0x0079
        L_0x0078:
            r5 = r12
        L_0x0079:
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x007e
            r5 = r6
        L_0x007e:
            if (r4 == 0) goto L_0x0082
            java.lang.String r12 = r4.f123516b     // Catch:{ IOException -> 0x00b5 }
        L_0x0082:
            if (r12 != 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r6 = r12
        L_0x0086:
            r10.mo71028Fu(r5, r6, r11)     // Catch:{ IOException -> 0x00b5 }
        L_0x0089:
            java.lang.String r10 = r1.f145504d     // Catch:{ IOException -> 0x00b5 }
            r9.mo71086z()     // Catch:{ IOException -> 0x00b5 }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r12 = r9.mo67777c()     // Catch:{ IOException -> 0x00b5 }
            r12.f117549W = r3     // Catch:{ IOException -> 0x00b5 }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r12 = r9.mo67777c()     // Catch:{ IOException -> 0x00b5 }
            r12.mo67692R()     // Catch:{ IOException -> 0x00b5 }
            if (r10 == 0) goto L_0x00a6
            int r12 = r10.length()     // Catch:{ IOException -> 0x00b5 }
            if (r12 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r12 = 0
            goto L_0x00a7
        L_0x00a6:
            r12 = 1
        L_0x00a7:
            if (r12 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r11 = r10
        L_0x00ab:
            com.tencent.mm.plugin.webview.core.BaseWebViewController r10 = r9.mo67777c()     // Catch:{ IOException -> 0x00b5 }
            r12 = 8
            r10.mo67706Z0(r11, r3, r12)     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00bd
        L_0x00b5:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = "parse GetA8KeyRespVerifyPrefetchInfo"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r12, r11)
        L_0x00bd:
            return r3
        L_0x00be:
            boolean r11 = r9.f123244d
            if (r11 == 0) goto L_0x00cc
            r11 = 9
            if (r10 != r11) goto L_0x00cc
            com.tencent.mm.plugin.webview.core.BaseWebViewController r10 = r9.mo67777c()
            r10.f117549W = r3
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e93.C45562a.mo67782l(int, java.lang.String, te3.xt1):boolean");
    }

    /* renamed from: m */
    public boolean mo63688m(String str) {
        C87412m.m108594g(str, "url");
        C45700h.C45703c cVar = this.f123243c;
        if ((!C87412m.m108589b(str, cVar != null ? cVar.f123515a : null) && !this.f123244d) || !mo67777c().mo67692R()) {
            return false;
        }
        Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "overrideReload url: %s", str);
        mo71086z();
        mo67777c().f117549W = true;
        mo67777c().mo67706Z0(str, true, 8);
        mo67777c().f117563f.f123645l = true;
        return true;
    }

    /* renamed from: o */
    public boolean mo67784o(String str) {
        String str2;
        String str3;
        C45764a aVar = C45764a.StartLoad;
        C87412m.m108594g(str, "url");
        boolean z = false;
        if (!mo71085y(str)) {
            Log.m105924i("MicroMsg.WebPrefetcherInterceptor", "not match " + str + ", rawUrl: " + mo67777c().mo63683n0() + ", prefetchResp: " + this.f123243c);
            mo71086z();
            return false;
        }
        this.f123251k = false;
        C45700h.C45703c cVar = this.f123243c;
        JsapiPermissionWrapper jsapiPermissionWrapper = null;
        if ((cVar != null ? cVar.f123521g : null) != null) {
            C45767f.f123649a.mo71242b(aVar, mo67777c().f117563f);
            Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "url has been cached, bizScene:" + cVar.f123518d + ", subBizScene:" + cVar.f123522h + ", prefetchId: " + mo71082v() + ", resp.url: %s", cVar.f123515a);
            C7605i iVar = C7605i.f25872b;
            C89349b bVar = cVar.f123525k;
            C45570e eVar = new C45570e(iVar, new JsapiPermissionWrapper(bVar != null ? bVar.f257327a : null), mo67777c().f117553a);
            this.f123250j = eVar;
            JsapiPermissionWrapper jsapiPermissionWrapper2 = eVar.f123270b;
            if (jsapiPermissionWrapper2 != null ? jsapiPermissionWrapper2.mo69447f(434) : false) {
                this.f123247g = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("initPrefetcherJsApiHandler canInjectPrefetcherJsBridge: ");
            sb.append(this.f123247g);
            sb.append(", controlBytes size: ");
            C89349b bVar2 = cVar.f123525k;
            sb.append(bVar2 != null ? Integer.valueOf(bVar2.f257327a.length) : null);
            Log.m105924i("MicroMsg.WebPrefetcherInterceptor", sb.toString());
            String str4 = "";
            if (this.f123247g) {
                C45570e eVar2 = this.f123250j;
                if (!(eVar2 == null || !eVar2.f123276h || eVar2.f123278j)) {
                    eVar2.f123278j = true;
                    MMWebView mMWebView = eVar2.f123271c;
                    String randomStr = mMWebView != null ? mMWebView.getRandomStr() : null;
                    if (!(randomStr == null || randomStr.length() == 0)) {
                        MMWebView mMWebView2 = eVar2.f123271c;
                        C87412m.m108591d(mMWebView2);
                        str3 = mMWebView2.getRandomStr();
                        if (str3 == null) {
                            str3 = str4;
                        }
                    } else {
                        str3 = Util.getRandomString(16);
                        C87412m.m108593f(str3, "getRandomString(16)");
                    }
                    eVar2.f123279k = str3;
                    Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "setDigestVerify isDigestVerify: " + eVar2.f123278j + ", randomStr: " + eVar2.f123279k + ", hashCode: " + eVar2.hashCode());
                }
                C45570e eVar3 = this.f123250j;
                if (eVar3 != null) {
                    eVar3.f123280l = true;
                }
                C87412m.m108591d(eVar3);
                MMWebView mMWebView3 = mo67777c().f117553a;
                int i = C45577j.f123285a;
                C87412m.m108594g(mMWebView3, "wv");
                try {
                    Log.m105924i("MicroMsg.WebPrefetcherJsLoader", "injectWebPrefetcherJsBridge");
                    MMWebView mMWebView4 = eVar3.f123271c;
                    if (mMWebView4 != null) {
                        mMWebView4.addJavascriptInterface(eVar3, "__wxPrefetcher");
                    }
                    mMWebView3.evaluateJavascript("window.__wx_web_prefetcher_js_isLoaded = 'loaded';", (ValueCallback<String>) null);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WebPrefetcherJsLoader", e, "injectWebPrefetcherJsBridge exception", new Object[0]);
                }
                InputStream data = cVar.f123521g.f123531a.getData();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("<script>");
                Log.m105925i("MicroMsg.WebPrefetcherJsLoader", "getWebPrefetcherJs path: %s", "jsapi/WebPrefetcherWebView.js");
                try {
                    str2 = new String(C90125c.m112776c(MMApplicationContext.getContext().getAssets().open("jsapi/WebPrefetcherWebView.js")), C119027c.f356488a);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.WebPrefetcherJsLoader", e2, "getWebPrefetcherJs exception", new Object[0]);
                    str2 = str4;
                }
                sb4.append(str2);
                sb4.append("</script>");
                byte[] bytes = sb4.toString().getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                C87412m.m108593f(data, "originInputStream");
                C85655x0 x0Var = new C85655x0(byteArrayInputStream, data);
                Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "updatePrefetchResp origin: %s, prefetch: %s, merged: %s", Integer.valueOf(data.available()), Integer.valueOf(byteArrayInputStream.available()), Integer.valueOf(x0Var.available()));
                cVar.f123521g.f123531a.setData(x0Var);
                this.f123243c = cVar;
            } else {
                this.f123243c = cVar;
            }
            C45700h.C45703c cVar2 = this.f123243c;
            String str5 = cVar2 != null ? cVar2.f123524j : null;
            if (!(str5 == null || C112551y.m153811k(str5))) {
                mo67777c().f117553a.addJavascriptInterface(new C45568b(str5, this), "wxPrefetcherClient");
            }
            C31965e.m39600a(C31965e.C31966a.ACTION_HIT_PREFETCH_CACHE, str, cVar.f123515a, cVar.f123523i, cVar.f123518d, cVar.f123522h);
            BaseWebViewController c = mo67777c();
            String str6 = cVar.f123528n;
            if (str6 != null) {
                str4 = str6;
            }
            C45570e eVar4 = this.f123250j;
            if (eVar4 != null) {
                jsapiPermissionWrapper = eVar4.f123270b;
            }
            c.mo67711c1(true, str4, jsapiPermissionWrapper);
            BaseWebViewController c2 = mo67777c();
            String str7 = cVar.f123515a;
            C87412m.m108593f(str7, "resp.url");
            Map<String, String> responseHeaders = cVar.f123521g.f123531a.getResponseHeaders();
            Log.m105924i(c2.mo67703X(), "WebView-Trace loadCacheUrl#" + c2.mo67719g() + " baseUrl " + str7);
            c2.f117518A = str7;
            c2.f117587r = true;
            c2.mo67685N(c2.f117562e0);
            c2.f117543Q.mo73829a("clientLoadUrl", System.currentTimeMillis());
            c2.f117553a.loadUrl(str7, responseHeaders);
            c2.mo67697T0(str7);
            c2.mo67685N(c2.f117560d0);
            ((C119157j) C119157j.f356862d).mo183895z(new C43507c(c2));
            BaseWebViewController c3 = mo67777c();
            String str8 = cVar.f123515a;
            C87412m.m108593f(str8, "resp.url");
            BaseWebViewController.m47006a1(c3, str8, false, 10, 2, (Object) null);
            this.f123244d = true;
            mo67777c().f117543Q.f123340g = this.f123244d;
            mo67777c().f117543Q.f123347n.putAll(cVar.f123521g.f123531a.getResponseHeaders());
            C13601g gVar = C46206e.f124554a;
            C115669n.INSTANCE.mo175913w(1200, 10, 1);
            C45700h x = mo71084x();
            C46206e.m51496c(7, 1, x != null ? x.ss0(mo71083w()) : 0);
            C45579l lVar = this.f123252l;
            lVar.f123287a = true;
            lVar.getClass();
            lVar.f123288b = str;
            lVar.f123289c = cVar;
            C45579l lVar2 = this.f123252l;
            long j = this.f123253m;
            lVar2.getClass();
            Log.m105927v("MicroMsg.WebPrefetcherResPerformanceHelper", "recordContentCost: %d ms", Long.valueOf(j));
            lVar2.f123290d = j;
        } else {
            mo67777c().f117543Q.f123340g = false;
            C45767f.f123649a.mo71242b(aVar, mo67777c().f117563f);
            Log.m105924i("MicroMsg.WebPrefetcherInterceptor", "async geta8key:" + str);
            String ul02 = mo71084x().ul0(str);
            if (ul02 == null) {
                ul02 = str;
            }
            if (ul02.length() == 0) {
                ul02 = str;
            }
            Log.m105924i("MicroMsg.WebPrefetcherInterceptor", "async geta8key respUrl:" + ul02);
            if (!C12969d.m12408b(ul02, "http", true)) {
                ul02 = HttpWrapperBase.PROTOCAL_HTTP + str;
            }
            C31965e.m39600a(C31965e.C31966a.ACTION_ONLY_GETA8KEY_ASYNC, str, ul02, 0, 0, 0);
            mo67777c().f117553a.loadUrl(ul02);
            BaseWebViewController.m47006a1(mo67777c(), ul02, false, 10, 2, (Object) null);
        }
        this.f123245e = true;
        C45700h x2 = mo71084x();
        if (x2 != null) {
            z = x2.Gw0(str);
        }
        this.f123246f = z;
        mo67777c().f117543Q.f123338e = this.f123245e;
        mo67777c().f117543Q.f123339f = this.f123246f;
        mo67777c().f117543Q.f123345l.clear();
        mo67777c().f117543Q.f123346m.clear();
        return true;
    }

    /* renamed from: p */
    public boolean mo67785p(String str, Intent intent) {
        String str2 = str;
        C87412m.m108594g(str2, "url");
        if (C112551y.m153819s(str2, "http", false)) {
            C45767f fVar = C45767f.f123649a;
            C45766c cVar = mo67777c().f117563f;
            C87412m.m108594g(cVar, "controllerInfo");
            long j = cVar.f123638e;
            boolean z = true;
            if (j - cVar.f123637d > 50000) {
                Log.m105929w("MicroMsg.WebViewPrefetchTestReportUtil", "checkValid WebViewUI create cost invalid, create: %d, start: %d", Long.valueOf(j), Long.valueOf(cVar.f123637d));
                C13601g gVar = C46206e.f124554a;
                C115669n.INSTANCE.mo175913w(1281, 14, 1);
                cVar.f123645l = true;
                z = false;
            }
            if (z) {
                if (!mo71085y(str)) {
                    mo71086z();
                    C45766c cVar2 = mo67777c().f117563f;
                    C45765b bVar = C45765b.NothingComplete;
                    cVar2.getClass();
                    cVar2.f123647n = bVar;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    C45700h x = mo71084x();
                    C45700h.C45705e eVar = null;
                    C45700h.C45703c jM = x != null ? x.mo71039jM(str2, mo71082v()) : null;
                    this.f123253m = System.currentTimeMillis() - currentTimeMillis;
                    if (jM != null) {
                        eVar = jM.f123521g;
                    }
                    if (eVar != null) {
                        this.f123243c = jM;
                        C45766c cVar3 = mo67777c().f117563f;
                        C45765b bVar2 = C45765b.CompletePrefetch;
                        cVar3.getClass();
                        cVar3.f123647n = bVar2;
                    } else {
                        C45766c cVar4 = mo67777c().f117563f;
                        C45765b bVar3 = C45765b.CompleteA8keyAsyncOnly;
                        cVar4.getClass();
                        cVar4.f123647n = bVar3;
                    }
                }
                fVar.mo71242b(C45764a.OnCreateUI, mo67777c().f117563f);
            }
        }
        return false;
    }

    /* renamed from: q */
    public C43505b0.C43506a mo62381q(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(webResourceRequest, "request");
        BaseWebViewController c = mo67777c();
        if (webResourceRequest.isForMainFrame() && webResourceRequest.getUrl() != null && c.mo67692R()) {
            Log.m105925i("MicroMsg.WebPrefetcherInterceptor", "shouldOverride url exitTmpl %s", webResourceRequest.getUrl());
            mo71086z();
        }
        return super.mo62381q(webView, webResourceRequest);
    }

    /* renamed from: s */
    public boolean mo63689s(int i, boolean z, String str, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        return !z && i == 10;
    }

    /* renamed from: v */
    public final String mo71082v() {
        return (String) ((C36570n) this.f123254n).getValue();
    }

    /* renamed from: w */
    public final String mo71083w() {
        return mo67777c().mo63683n0();
    }

    /* renamed from: x */
    public final C45700h mo71084x() {
        return (C45700h) ((C36570n) this.f123248h).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo71085y(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mo71083w()
            boolean r0 = gy3.C87412m.m108589b(r6, r0)
            if (r0 == 0) goto L_0x0016
            java.lang.Boolean r0 = r5.f123255o
            if (r0 == 0) goto L_0x0016
            gy3.C87412m.m108591d(r0)
            boolean r6 = r0.booleanValue()
            return r6
        L_0x0016:
            com.tencent.mm.plugin.webview.webcompt.c$b r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
            r0.getClass()
            java.lang.String r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120396f
            r1 = 0
            boolean r0 = z04.C112551y.m153819s(r6, r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0051
            ex0.h r0 = r5.mo71084x()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = r5.mo71083w()
            boolean r0 = r0.mo71032Xq(r3, r6)
            if (r0 != r2) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x0051
            ex0.h r0 = r5.mo71084x()
            if (r0 == 0) goto L_0x004c
            java.lang.String r3 = r5.mo71082v()
            boolean r0 = r0.mo71027B3(r6, r3)
            if (r0 != r2) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "alvinluo isUrlIntercepted "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " url: %s"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            java.lang.String r1 = "MicroMsg.WebPrefetcherInterceptor"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            java.lang.String r1 = r5.mo71083w()
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 == 0) goto L_0x0081
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r5.f123255o = r6
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e93.C45562a.mo71085y(java.lang.String):boolean");
    }

    /* renamed from: z */
    public final void mo71086z() {
        Log.m105924i("MicroMsg.WebPrefetcherInterceptor", "resetPrefetchInfo");
        this.f123243c = null;
        this.f123244d = false;
        this.f123245e = false;
        this.f123246f = false;
        this.f123247g = false;
        this.f123255o = null;
        C45570e eVar = this.f123250j;
        if (eVar != null) {
            MMHandler mMHandler = eVar.f123272d;
            if (mMHandler != null) {
                Message obtain = Message.obtain();
                obtain.what = 3;
                obtain.obj = null;
                mMHandler.sendMessage(obtain);
            }
            MMWebView mMWebView = eVar.f123271c;
            if (mMWebView != null) {
                mMWebView.removeJavascriptInterface("__wxPrefetcher");
            }
        }
        this.f123250j = null;
        C45579l lVar = this.f123252l;
        lVar.f123290d = 0;
        lVar.f123291e = 0;
        lVar.f123292f = 0;
    }
}
