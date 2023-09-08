package s83;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6520n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import t83.C48590l;
import te3.C52018xt1;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: s83.d */
public final class C48292d extends C43505b0 {

    @C91590f(mo125468c = "com.tencent.mm.plugin.webview.interceptor.SpaAuthInterceptor$overrideProcessResult$1", mo125469f = "SpaAuthInterceptor.kt", mo125470l = {87, 92, 110}, mo125471m = "invokeSuspend")
    /* renamed from: s83.d$a */
    public static final class C48293a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f129312d;

        /* renamed from: e */
        public Object f129313e;

        /* renamed from: f */
        public int f129314f;

        /* renamed from: g */
        public final /* synthetic */ C52018xt1 f129315g;

        /* renamed from: h */
        public final /* synthetic */ C48292d f129316h;

        /* renamed from: i */
        public final /* synthetic */ String f129317i;

        /* renamed from: j */
        public final /* synthetic */ C8479f0<String> f129318j;

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.interceptor.SpaAuthInterceptor$overrideProcessResult$1$1", mo125469f = "SpaAuthInterceptor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: s83.d$a$a */
        public static final class C48294a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f129319d;

            /* renamed from: e */
            public final /* synthetic */ C48292d f129320e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48294a(C8479f0<String> f0Var, C48292d dVar, C15601d<? super C48294a> dVar2) {
                super(2, dVar2);
                this.f129319d = f0Var;
                this.f129320e = dVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C48294a(this.f129319d, this.f129320e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C48294a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f129319d.f27484d = this.f129320e.mo67777c().f117553a.getUrl();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.interceptor.SpaAuthInterceptor$overrideProcessResult$1$3", mo125469f = "SpaAuthInterceptor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: s83.d$a$b */
        public static final class C48295b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f129321d;

            /* renamed from: e */
            public final /* synthetic */ C48292d f129322e;

            /* renamed from: f */
            public final /* synthetic */ String f129323f;

            /* renamed from: g */
            public final /* synthetic */ C52018xt1 f129324g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48295b(C8479f0<String> f0Var, C48292d dVar, String str, C52018xt1 xt12, C15601d<? super C48295b> dVar2) {
                super(2, dVar2);
                this.f129321d = f0Var;
                this.f129322e = dVar;
                this.f129323f = str;
                this.f129324g = xt12;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C48295b(this.f129321d, this.f129322e, this.f129323f, this.f129324g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C48295b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f129321d.f27484d = this.f129322e.mo67777c().f117553a.getUrl();
                if (C112551y.m153809i(this.f129323f, (String) this.f129321d.f27484d, true)) {
                    Log.m105924i("MicroMsg.BizMpVideoInterceptor", "WebView-Trace Spa notify auth：" + this.f129324g.f144941d);
                    this.f129322e.mo67777c().mo67717f0().mo73197a(this.f129324g.f144941d);
                    C6520n nVar = C6520n.f23666d;
                    C48590l g0 = this.f129322e.mo67777c().mo67720g0();
                    nVar.getClass();
                    C87412m.m108594g(g0, "jsApiHandler");
                    nVar.mo7505e(g0, "doAuthCurrentUrl:ok");
                } else {
                    Log.m105920e("MicroMsg.BizMpVideoInterceptor", "WebView-Trace Spa auth host not match");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48293a(C52018xt1 xt12, C48292d dVar, String str, C8479f0<String> f0Var, C15601d<? super C48293a> dVar2) {
            super(2, dVar2);
            this.f129315g = xt12;
            this.f129316h = dVar;
            this.f129317i = str;
            this.f129318j = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C48293a(this.f129315g, this.f129316h, this.f129317i, this.f129318j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C48293a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0107  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f129314f
                r2 = 3
                r3 = 2
                r4 = 1
                java.lang.String r5 = "MicroMsg.BizMpVideoInterceptor"
                r6 = 0
                if (r1 == 0) goto L_0x0030
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x01a5
            L_0x0017:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001f:
                java.lang.Object r1 = r13.f129313e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r13.f129312d
                java.util.Map r3 = (java.util.Map) r3
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00d1
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0090
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = "fetchPage start:"
                r14.append(r1)
                te3.xt1 r1 = r13.f129315g
                java.lang.String r1 = r1.f144941d
                r14.append(r1)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
                java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
                r14.<init>()
                s83.d r1 = r13.f129316h
                com.tencent.mm.plugin.webview.core.BaseWebViewController r1 = r1.mo67777c()
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f117540N
                r14.putAll(r1)
                java.lang.String r1 = "WeChat-SPA-Auth-Req-Flag"
                java.lang.String r7 = "1"
                r14.put(r1, r7)
                s83.d r1 = r13.f129316h
                te3.xt1 r7 = r13.f129315g
                java.lang.String r7 = r7.f144941d
                java.lang.String r8 = "resp.FullURL"
                gy3.C87412m.m108593f(r7, r8)
                r13.f129314f = r4
                r1.getClass()
                wx3.h r8 = new wx3.h
                wx3.d r9 = xx3.C66447b.m78392b(r13)
                r8.<init>(r9)
                com.tencent.mm.network.d0 r9 = new com.tencent.mm.network.d0
                r10 = 0
                r9.<init>(r7, r10)
                s83.c r7 = new s83.c
                r7.<init>(r1, r14, r8)
                com.tencent.p014mm.network.C40383o0.m43567a(r9, r6, r7)
                java.lang.Object r14 = r8.mo90314b()
                if (r14 != r0) goto L_0x0090
                return r0
            L_0x0090:
                java.util.Map r14 = (java.util.Map) r14
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "fetchPage end:"
                r1.append(r7)
                te3.xt1 r7 = r13.f129315g
                java.lang.String r7 = r7.f144941d
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                te3.xt1 r1 = r13.f129315g
                java.lang.String r1 = r1.f144941d
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.lang.String r1 = r1.getHost()
                a14.h0 r7 = a14.C53872d1.f151117a
                a14.k2 r7 = f14.C58901s.f168555a
                s83.d$a$a r8 = new s83.d$a$a
                gy3.f0<java.lang.String> r9 = r13.f129318j
                s83.d r10 = r13.f129316h
                r8.<init>(r9, r10, r6)
                r13.f129312d = r14
                r13.f129313e = r1
                r13.f129314f = r3
                java.lang.Object r3 = a14.C53895h.m60469g(r7, r8, r13)
                if (r3 != r0) goto L_0x00d0
                return r0
            L_0x00d0:
                r3 = r14
            L_0x00d1:
                java.lang.String r14 = r13.f129317i
                gy3.f0<java.lang.String> r7 = r13.f129318j
                T r7 = r7.f27484d
                java.lang.String r7 = (java.lang.String) r7
                boolean r14 = z04.C112551y.m153809i(r14, r7, r4)
                if (r14 != 0) goto L_0x0107
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = "url changed after fetch page, webUrl:"
                r14.append(r0)
                gy3.f0<java.lang.String> r0 = r13.f129318j
                T r0 = r0.f27484d
                java.lang.String r0 = (java.lang.String) r0
                r14.append(r0)
                java.lang.String r0 = ", reqUrl:"
                r14.append(r0)
                java.lang.String r0 = r13.f129317i
                r14.append(r0)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0107:
                if (r3 == 0) goto L_0x0185
                java.util.Set r14 = r3.entrySet()
                java.util.Iterator r14 = r14.iterator()
            L_0x0111:
                boolean r4 = r14.hasNext()
                if (r4 == 0) goto L_0x0185
                java.lang.Object r4 = r14.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                if (r1 == 0) goto L_0x0111
                java.lang.Object r7 = r4.getKey()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = r7.toLowerCase()
                java.lang.String r8 = "this as java.lang.String).toLowerCase()"
                gy3.C87412m.m108593f(r7, r8)
                java.lang.String r8 = "set-cookie"
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0111
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "WebView-Trace Spa set cookie:"
                r7.append(r8)
                java.lang.Object r8 = r4.getKey()
                java.lang.Object r8 = r3.get(r8)
                java.util.List r8 = (java.util.List) r8
                if (r8 == 0) goto L_0x0156
                int r8 = r8.size()
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r8)
                goto L_0x0157
            L_0x0156:
                r9 = r6
            L_0x0157:
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                java.lang.Object r4 = r4.getKey()
                java.lang.Object r4 = r3.get(r4)
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L_0x0111
                java.util.Iterator r4 = r4.iterator()
            L_0x0171:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0111
                java.lang.Object r7 = r4.next()
                java.lang.String r7 = (java.lang.String) r7
                com.tencent.xweb.CookieManager r8 = com.tencent.xweb.CookieManager.getInstance()
                r8.setCookie(r1, r7)
                goto L_0x0171
            L_0x0185:
                a14.h0 r14 = a14.C53872d1.f151117a
                a14.k2 r14 = f14.C58901s.f168555a
                s83.d$a$b r1 = new s83.d$a$b
                gy3.f0<java.lang.String> r8 = r13.f129318j
                s83.d r9 = r13.f129316h
                java.lang.String r10 = r13.f129317i
                te3.xt1 r11 = r13.f129315g
                r12 = 0
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12)
                r13.f129312d = r6
                r13.f129313e = r6
                r13.f129314f = r2
                java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
                if (r14 != r0) goto L_0x01a5
                return r0
            L_0x01a5:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: s83.C48292d.C48293a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: l */
    public boolean mo67782l(int i, String str, C52018xt1 xt12) {
        String str2 = str;
        C52018xt1 xt13 = xt12;
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt13, "resp");
        if (i != 11) {
            return false;
        }
        C8479f0 f0Var = new C8479f0();
        T url = mo67777c().f117553a.getUrl();
        f0Var.f27484d = url;
        if (!C112551y.m153809i(str, url, true)) {
            Log.m105920e("MicroMsg.BizMpVideoInterceptor", "url changed after do get A8key, webUrl:" + ((String) f0Var.f27484d) + ", reqUrl:" + str);
            return false;
        }
        if (!((xt13.f144947j.f131299d & 2097152) > 0)) {
            Log.m105924i("MicroMsg.BizMpVideoInterceptor", "spa auth getA8key not allow");
            C6520n.f23666d.mo7506f(mo67777c().mo67720g0(), "a8key not allow");
            return false;
        }
        Log.m105924i("MicroMsg.BizMpVideoInterceptor", "on spa auth resp handle start");
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C48293a(xt12, this, str, f0Var, (C15601d<? super C48293a>) null), 3, (Object) null);
        return true;
    }

    /* renamed from: n */
    public boolean mo67783n() {
        String currentUrl = mo67777c().getCurrentUrl();
        if (!(currentUrl != null && C112551y.m153819s(currentUrl, C113600ck.f339986i, false))) {
            C6520n.f23666d.mo7506f(mo67777c().mo67720g0(), "url is invalid");
            return false;
        }
        String currentUrl2 = mo67777c().getCurrentUrl();
        if (currentUrl2 == null || currentUrl2.length() == 0) {
            return false;
        }
        Log.m105924i("MicroMsg.BizMpVideoInterceptor", "RequestAuthCurrentUrl startGetA8Key:" + currentUrl2);
        mo67777c().mo67706Z0(currentUrl2, true, 11);
        return true;
    }

    /* renamed from: s */
    public boolean mo63689s(int i, boolean z, String str, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        return !z && i == 11;
    }
}
