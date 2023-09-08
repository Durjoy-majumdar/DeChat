package dx2;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import k70.C88119c;
import qe3.C89625d;
import rx3.C36570n;
import z04.C112550d0;

/* renamed from: dx2.e */
public final class C86411e extends C88119c {

    /* renamed from: h */
    public static final C31344a f251188h = new C31344a((C8480h) null);

    /* renamed from: e */
    public final HashMap<String, C40427l0> f251189e = new HashMap<>();

    /* renamed from: f */
    public final C40427l0 f251190f;

    /* renamed from: g */
    public final C40427l0 f251191g;

    /* renamed from: dx2.e$a */
    public static final class C31344a {
        public C31344a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo58083a(long j) {
            C115669n.INSTANCE.mo175913w(1811, j, 1);
        }
    }

    /* renamed from: dx2.e$b */
    public static final class C86412b extends C87413o implements C32228q<C40427l0, String, String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f251192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86412b(String str) {
            super(3);
            this.f251192d = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C40427l0 l0Var = (C40427l0) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "#getWxaPkg appid=" + this.f251192d + ", assetsVersion=" + str2 + ", resVersion=" + str);
            if (C88119c.f254874a.mo122514a(str2, str) >= 0) {
                C86411e.f251188h.mo58083a(13);
                return Boolean.FALSE;
            }
            Integer valueOf = Integer.valueOf(new C104289g(C81291m0.m99666b(l0Var, "/version.json")).optInt("minAndroidClientVersion"));
            if (valueOf == null || valueOf.intValue() <= C89625d.f257841g) {
                C86411e.f251188h.mo58083a(15);
                return Boolean.TRUE;
            }
            C86411e.f251188h.mo58083a(11);
            return Boolean.FALSE;
        }
    }

    /* renamed from: dx2.e$c */
    public static final class C86413c extends C87413o implements C32228q<C40427l0, String, String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f251193d;

        /* renamed from: e */
        public final /* synthetic */ C86411e f251194e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86413c(String str, C86411e eVar) {
            super(3);
            this.f251193d = str;
            this.f251194e = eVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C40427l0 l0Var = (C40427l0) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "#getWxaPkg appid=" + this.f251193d + ", assetsVersion=" + str2 + ", resVersion=" + str);
            C88119c.C88121c cVar = C88119c.f254874a;
            if (cVar.mo122514a(str2, str) >= 0) {
                C86411e.f251188h.mo58083a(14);
                return Boolean.FALSE;
            }
            String d = cVar.mo122517d(this.f251194e.f251190f);
            C104289g b = cVar.mo122515b(l0Var);
            String optString = b != null ? b.optString("requiredMinLibVersion") : null;
            if (optString == null) {
                optString = "";
            }
            Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "#getWxaPkg appid=" + this.f251193d + ", baseVersion=" + d + ", requiredMinLibVersion=" + optString);
            if (cVar.mo122514a(optString, d) > 0) {
                C86411e.f251188h.mo58083a(12);
                return Boolean.FALSE;
            }
            C86411e.f251188h.mo58083a(16);
            return Boolean.TRUE;
        }
    }

    public C86411e() {
        C40427l0 c = mo120823c("wx");
        C87412m.m108591d(c);
        this.f251190f = c;
        C40427l0 c2 = mo120823c("wx9e221f7828fa7482");
        C87412m.m108591d(c2);
        this.f251191g = c2;
    }

    /* renamed from: f */
    public static final C40427l0 m107079f(C8479f0<String> f0Var, String str, C32228q<? super C40427l0, ? super String, ? super String, Boolean> qVar, C8479f0<String> f0Var2, C8477a0 a0Var, String str2) {
        if (!C86013q1.m106450k(str2)) {
            return null;
        }
        WxaPkg wxaPkg = new WxaPkg(str2);
        wxaPkg.mo63189b();
        C88119c.C88121c cVar = C88119c.f254874a;
        C87412m.m108594g(str, "<this>");
        T d = C87412m.m108589b(str, "wx") ? cVar.mo122517d(wxaPkg) : cVar.mo122516c(wxaPkg);
        f0Var.f27484d = d;
        if (qVar.invoke(wxaPkg, d, f0Var2.f27484d).booleanValue()) {
            a0Var.f27482d = true;
            Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "#readPkg " + str + " use res");
        }
        return wxaPkg;
    }

    /* renamed from: a */
    public String mo120821a(String str) {
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "getAppid url:" + str);
        return C112550d0.m153795e0(str, "://", "wx");
    }

    /* renamed from: b */
    public String mo120822b(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "appId");
        Log.m105924i("MicroMsg.SurfaceApp.SurfacePackageManager", "getPath url:" + str + " appId:" + str2);
        return C112550d0.m153791a0(str, str2 + "://", str);
    }

    /* renamed from: c */
    public C40427l0 mo120823c(String str) {
        C87412m.m108594g(str, "appId");
        if (C87412m.m108589b(str, "wx")) {
            C7533g gVar = C7533g.f25793a;
            return mo120824e(str, "surface/basic.wspkg", ((Boolean) ((C36570n) C7533g.f25794b).getValue()).booleanValue() ? C31343d.f83890a.mo58080e("wx4edd479d258d7f25") : null, new C86412b(str));
        }
        return mo120824e(str, "surface/app/" + str + ".wspkg", C31343d.f83890a.mo58080e(str), new C86413c(str, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0322  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 mo120824e(java.lang.String r24, java.lang.String r25, java.lang.String r26, fy3.C32228q<? super com.tencent.p014mm.plugin.appbrand.appcache.C40427l0, ? super java.lang.String, ? super java.lang.String, java.lang.Boolean> r27) {
        /*
            r23 = this;
            r1 = r23
            r8 = r24
            r0 = r25
            r9 = r26
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r2 = r1.f251189e
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.appbrand.appcache.l0 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C40427l0) r2
            java.lang.String r10 = "MicroMsg.SurfaceApp.SurfacePackageManager"
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "#readPkg use cache appId="
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0182
        L_0x002a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "findWxaPkg appId:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " path:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " downloadPath:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            java.lang.String r12 = ""
            r11.f27484d = r12
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            r13.f27484d = r12
            gy3.a0 r14 = new gy3.a0
            r14.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154195C()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            k70.c$c r3 = k70.C88119c.f254874a
            rx3.g<java.lang.Boolean> r4 = k70.C88119c.f254875b
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00ac
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r4 == 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "#readPkg use sdcard "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
            r0.<init>((java.lang.String) r2)
            r0.mo63189b()
            goto L_0x0317
        L_0x00ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "jsapi/"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            rx3.g<java.util.HashSet<java.lang.String>> r5 = k70.C88119c.f254876c
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.util.HashSet r5 = (java.util.HashSet) r5
            boolean r2 = r5.contains(r2)
            java.lang.String r7 = " error: "
            java.lang.String r6 = ", path="
            java.lang.String r5 = "#readPkg "
            r16 = 5
            r17 = 1
            r18 = 4
            r19 = 3
            r20 = 2
            r15 = 6
            if (r2 != 0) goto L_0x01d0
            r2 = r11
            r3 = r24
            r4 = r27
            r21 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            r14 = r7
            r7 = r26
            com.tencent.mm.plugin.appbrand.appcache.l0 r2 = m107079f(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0183 }
            if (r2 != 0) goto L_0x013e
            dx2.e$a r2 = f251188h     // Catch:{ Exception -> 0x0183 }
            r3 = 6
            r2.mo58083a(r3)     // Catch:{ Exception -> 0x0183 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r2.<init>()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = "pkg asset jsapi/"
            r2.append(r3)     // Catch:{ Exception -> 0x0183 }
            r2.append(r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = " and downloadPath "
            r2.append(r3)     // Catch:{ Exception -> 0x0183 }
            r2.append(r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = " not found"
            r2.append(r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0183 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x0183 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0183 }
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0183 }
            r3 = 0
            r2[r3] = r8     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0183 }
            r2[r17] = r4     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0183 }
            r2[r20] = r4     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0183 }
            r2[r19] = r3     // Catch:{ Exception -> 0x0183 }
            r2[r18] = r12     // Catch:{ Exception -> 0x0183 }
            r2[r16] = r12     // Catch:{ Exception -> 0x0183 }
            r3 = 20781(0x512d, float:2.912E-41)
            r0.mo160131h(r3, r2)     // Catch:{ Exception -> 0x0183 }
            goto L_0x01cd
        L_0x013e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r3.<init>()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r4 = "#readPkg without assets appId="
            r3.append(r4)     // Catch:{ Exception -> 0x0183 }
            r3.append(r8)     // Catch:{ Exception -> 0x0183 }
            r3.append(r13)     // Catch:{ Exception -> 0x0183 }
            r3.append(r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0183 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x0183 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0183 }
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0183 }
            r4 = 0
            r3[r4] = r8     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0183 }
            r3[r17] = r5     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0183 }
            r3[r20] = r5     // Catch:{ Exception -> 0x0183 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0183 }
            r3[r19] = r4     // Catch:{ Exception -> 0x0183 }
            r3[r18] = r12     // Catch:{ Exception -> 0x0183 }
            T r4 = r11.f27484d     // Catch:{ Exception -> 0x0183 }
            r3[r16] = r4     // Catch:{ Exception -> 0x0183 }
            r4 = 20781(0x512d, float:2.912E-41)
            r0.mo160131h(r4, r3)     // Catch:{ Exception -> 0x0183 }
            r0 = r2
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg) r0     // Catch:{ Exception -> 0x0183 }
            r0.mo63189b()     // Catch:{ Exception -> 0x0183 }
        L_0x0182:
            return r2
        L_0x0183:
            r0 = move-exception
            dx2.e$a r2 = f251188h
            r3 = 7
            r2.mo58083a(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r7 = r21
            r2.append(r7)
            r2.append(r9)
            r2.append(r14)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r4)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r3] = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r17] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r20] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r4[r19] = r3
            java.lang.String r0 = r0.getMessage()
            r4[r18] = r0
            r4[r16] = r12
            r3 = 20781(0x512d, float:2.912E-41)
            r2.mo160131h(r3, r4)
        L_0x01cd:
            r0 = 0
            goto L_0x0317
        L_0x01d0:
            r2 = r6
            r6 = r7
            r7 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "#readPkg appId="
            r5.append(r15)
            r5.append(r8)
            r5.append(r2)
            r5.append(r0)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            com.tencent.mm.plugin.appbrand.appcache.h r15 = new com.tencent.mm.plugin.appbrand.appcache.h
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r15.<init>(r2, r0)
            r15.mo63189b()
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r8, r0)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r0 = "wx"
            boolean r0 = gy3.C87412m.m108589b(r8, r0)     // Catch:{ Exception -> 0x0289 }
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = r3.mo122517d(r15)     // Catch:{ Exception -> 0x0289 }
            goto L_0x021f
        L_0x021b:
            java.lang.String r0 = r3.mo122516c(r15)     // Catch:{ Exception -> 0x0289 }
        L_0x021f:
            r13.f27484d = r0     // Catch:{ Exception -> 0x0289 }
            r2 = r11
            r3 = r24
            r4 = r27
            r5 = r13
            r1 = r6
            r6 = r14
            r22 = r13
            r13 = r7
            r7 = r26
            com.tencent.mm.plugin.appbrand.appcache.l0 r0 = m107079f(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0287 }
            if (r0 == 0) goto L_0x0277
            boolean r2 = r14.f27482d     // Catch:{ Exception -> 0x0287 }
            if (r2 == 0) goto L_0x0277
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r2.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r3 = "use resPkg appId:"
            r2.append(r3)     // Catch:{ Exception -> 0x0287 }
            r2.append(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0287 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)     // Catch:{ Exception -> 0x0287 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0287 }
            r3 = 6
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0287 }
            r3 = 0
            r4[r3] = r8     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0287 }
            r4[r17] = r5     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0287 }
            r4[r20] = r5     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0287 }
            r4[r19] = r3     // Catch:{ Exception -> 0x0287 }
            r4[r18] = r12     // Catch:{ Exception -> 0x0287 }
            T r3 = r11.f27484d     // Catch:{ Exception -> 0x0287 }
            r4[r16] = r3     // Catch:{ Exception -> 0x0287 }
            r3 = 20781(0x512d, float:2.912E-41)
            r2.mo160131h(r3, r4)     // Catch:{ Exception -> 0x0287 }
            com.tencent.mapsdk.rastercore.tools.C40004IO.safeClose(r15)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0317
        L_0x0277:
            if (r0 == 0) goto L_0x0284
            boolean r2 = r0 instanceof java.io.Closeable     // Catch:{ Exception -> 0x0287 }
            if (r2 == 0) goto L_0x0280
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x0287 }
            goto L_0x0281
        L_0x0280:
            r0 = 0
        L_0x0281:
            com.tencent.mapsdk.rastercore.tools.C40004IO.safeClose(r0)     // Catch:{ Exception -> 0x0287 }
        L_0x0284:
            r2 = r22
            goto L_0x02da
        L_0x0287:
            r0 = move-exception
            goto L_0x028e
        L_0x0289:
            r0 = move-exception
            r1 = r6
            r22 = r13
            r13 = r7
        L_0x028e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r9)
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r1, r3)
            dx2.e$a r1 = f251188h
            r3 = 8
            r1.mo58083a(r3)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 6
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4[r17] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4[r20] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r4[r19] = r2
            java.lang.String r0 = r0.getMessage()
            r4[r18] = r0
            r2 = r22
            T r0 = r2.f27484d
            r4[r16] = r0
            r3 = 20781(0x512d, float:2.912E-41)
            r1.mo160131h(r3, r4)
        L_0x02da:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r17] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r20] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1[r19] = r3
            r1[r18] = r12
            T r2 = r2.f27484d
            r1[r16] = r2
            r2 = 20781(0x512d, float:2.912E-41)
            r0.mo160131h(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r8)
            java.lang.String r1 = " use asset"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = r15
        L_0x0317:
            if (r0 == 0) goto L_0x0322
            r1 = r23
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r2 = r1.f251189e
            r2.put(r8, r0)
            r15 = r0
            goto L_0x0325
        L_0x0322:
            r1 = r23
            r15 = 0
        L_0x0325:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dx2.C86411e.mo120824e(java.lang.String, java.lang.String, java.lang.String, fy3.q):com.tencent.mm.plugin.appbrand.appcache.l0");
    }
}
