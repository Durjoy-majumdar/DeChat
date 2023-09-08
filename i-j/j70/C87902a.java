package j70;

import android.net.Uri;
import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import k70.C88119c;
import qe3.C89625d;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: j70.a */
public final class C87902a extends C88119c {

    /* renamed from: i */
    public static final C87903a f254431i = new C87903a((C8480h) null);

    /* renamed from: e */
    public final String f254432e = "MagicSclPkgSelector";

    /* renamed from: f */
    public final String f254433f = "wx-wspkg";

    /* renamed from: g */
    public final HashMap<String, C40427l0> f254434g = new HashMap<>();

    /* renamed from: h */
    public final C13601g f254435h = C36568h.m40985a(new C87904b(this));

    /* renamed from: j70.a$a */
    public static final class C87903a {
        public C87903a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo122377a(long j) {
            C115669n.INSTANCE.mo175913w(1811, j, 1);
        }
    }

    /* renamed from: j70.a$b */
    public static final class C87904b extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public final /* synthetic */ C87902a f254436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87904b(C87902a aVar) {
            super(0);
            this.f254436d = aVar;
        }

        public Object invoke() {
            C40427l0 c = this.f254436d.mo120823c("wx2f3fb5db9f226462");
            if (c == null) {
                ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicLiveCardBasicLibNull.name(), 1, (String) null);
            }
            C87412m.m108591d(c);
            return c;
        }
    }

    /* renamed from: j70.a$c */
    public static final class C87905c extends C87413o implements C32228q<C40427l0, String, String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C87902a f254437d;

        /* renamed from: e */
        public final /* synthetic */ String f254438e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87905c(C87902a aVar, String str) {
            super(3);
            this.f254437d = aVar;
            this.f254438e = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C40427l0 l0Var = (C40427l0) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            String str3 = this.f254437d.f254432e;
            Log.m105924i(str3, "#getWxaPkg appid=" + this.f254438e + ", assetsVersion=" + str2 + ", resVersion=" + str);
            if (C88119c.f254874a.mo122514a(str2, str) >= 0) {
                C87902a.f254431i.mo122377a(13);
                return Boolean.FALSE;
            }
            Integer valueOf = Integer.valueOf(new C104289g(C81291m0.m99666b(l0Var, "/version.json")).optInt("minAndroidClientVersion"));
            if (valueOf == null || valueOf.intValue() <= C89625d.f257841g) {
                C87902a.f254431i.mo122377a(15);
                return Boolean.TRUE;
            }
            C87902a.f254431i.mo122377a(11);
            return Boolean.FALSE;
        }
    }

    /* renamed from: e */
    public static final C40427l0 m109402e(C8479f0<String> f0Var, String str, C32228q<? super C40427l0, ? super String, ? super String, Boolean> qVar, C8479f0<String> f0Var2, C8477a0 a0Var, C87902a aVar, String str2) {
        T t = null;
        if (!C86013q1.m106450k(str2)) {
            return null;
        }
        WxaPkg wxaPkg = new WxaPkg(str2);
        wxaPkg.mo63189b();
        C87412m.m108594g(str, "<this>");
        T t2 = "";
        if (C87412m.m108589b(str, "wx2f3fb5db9f226462")) {
            T optString = new C104289g(C81291m0.m99666b(wxaPkg, "/version.json")).optString(ProviderConstants.API_COLNAME_FEATURE_VERSION, t2);
            if (optString != null) {
                t2 = optString;
            }
        } else {
            String f = C81291m0.m99670f(wxaPkg, "/app-config.json");
            if (!(f.length() > 0)) {
                f = null;
            }
            C104289g gVar = f != null ? new C104289g(f) : null;
            if (gVar != null) {
                t = gVar.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION, t2);
            }
            if (t != null) {
                t2 = t;
            }
        }
        f0Var.f27484d = t2;
        if (qVar.invoke(wxaPkg, t2, f0Var2.f27484d).booleanValue()) {
            a0Var.f27482d = true;
            Log.m105924i(aVar.f254432e, "#readPkg " + str + " use res");
        }
        return wxaPkg;
    }

    /* renamed from: a */
    public String mo120821a(String str) {
        C87412m.m108594g(str, "url");
        Uri parse = Uri.parse(str);
        if (C87412m.m108589b(parse.getScheme(), this.f254433f)) {
            String host = parse.getHost();
            if ((host != null ? host.length() : 0) > 0) {
                return String.valueOf(parse.getHost());
            }
        }
        return "wx2f3fb5db9f226462";
    }

    /* renamed from: b */
    public String mo120822b(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "appId");
        Uri parse = Uri.parse(str);
        if (!C87412m.m108589b(parse.getScheme(), this.f254433f)) {
            return str;
        }
        String host = parse.getHost();
        return (host != null ? host.length() : 0) > 0 ? String.valueOf(parse.getPath()) : str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.tencent.mm.plugin.appbrand.appcache.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.tencent.mm.plugin.appbrand.appcache.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: com.tencent.mm.plugin.appbrand.appcache.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x032d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 mo120823c(java.lang.String r25) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<qy.f> r0 = p671qy.C36186f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qy.f r0 = (p671qy.C36186f) r0
            java.lang.String r1 = "wx2f3fb5db9f226462"
            java.lang.String r10 = r0.mo60371br(r1)
            j70.a$c r3 = new j70.a$c
            r3.<init>(r8, r9)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r0 = r8.f254434g
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.appbrand.appcache.l0 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C40427l0) r0
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r8.f254432e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#readPkg use cache appId="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x032e
        L_0x003f:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            java.lang.String r11 = ""
            r0.f27484d = r11
            gy3.f0 r12 = new gy3.f0
            r12.<init>()
            r12.f27484d = r11
            gy3.a0 r13 = new gy3.a0
            r13.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = a70.C112760b.m154195C()
            r2.append(r4)
            java.lang.String r14 = "surface/wx2f3fb5db9f226462.wspkg"
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            k70.c$c r4 = k70.C88119c.f254874a
            rx3.g<java.lang.Boolean> r5 = k70.C88119c.f254875b
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ae
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r5 == 0) goto L_0x00ae
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
            r0.<init>((java.lang.String) r2)
            r0.mo63189b()
            java.lang.String r1 = r8.f254432e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#readPkg use sdcard "
            r3.append(r5)
            r3.append(r2)
            r2 = 32
            r3.append(r2)
            java.lang.String r2 = r4.mo122517d(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0325
        L_0x00ae:
            rx3.g<java.util.HashSet<java.lang.String>> r2 = k70.C88119c.f254876c
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r5 = "jsapi/surface/wx2f3fb5db9f226462.wspkg"
            boolean r2 = r2.contains(r5)
            java.lang.String r7 = " error: "
            java.lang.String r6 = ", path="
            java.lang.String r15 = "#readPkg "
            r16 = 5
            r17 = 1
            r18 = 4
            r19 = 3
            r20 = 2
            r21 = r15
            r15 = 6
            if (r2 != 0) goto L_0x01ae
            r1 = r0
            r2 = r25
            r4 = r12
            r5 = r13
            r12 = r6
            r6 = r24
            r13 = r7
            r7 = r10
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = m109402e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x015f }
            if (r1 != 0) goto L_0x0116
            j70.a$a r0 = f254431i     // Catch:{ Exception -> 0x015f }
            r1 = 6
            r0.mo122377a(r1)     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = r8.f254432e     // Catch:{ Exception -> 0x015f }
            java.lang.String r1 = "pkg asset jsapi/surface/wx2f3fb5db9f226462.wspkg and downloadPath surface/wx2f3fb5db9f226462.wspkg not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ Exception -> 0x015f }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x015f }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x015f }
            r2 = 0
            r1[r2] = r9     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x015f }
            r1[r17] = r3     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x015f }
            r1[r20] = r3     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x015f }
            r1[r19] = r2     // Catch:{ Exception -> 0x015f }
            r1[r18] = r11     // Catch:{ Exception -> 0x015f }
            r1[r16] = r11     // Catch:{ Exception -> 0x015f }
            r2 = 20781(0x512d, float:2.912E-41)
            r0.mo160131h(r2, r1)     // Catch:{ Exception -> 0x015f }
            goto L_0x01ab
        L_0x0116:
            java.lang.String r2 = r8.f254432e     // Catch:{ Exception -> 0x015f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015f }
            r3.<init>()     // Catch:{ Exception -> 0x015f }
            java.lang.String r4 = "#readPkg without assets appId="
            r3.append(r4)     // Catch:{ Exception -> 0x015f }
            r3.append(r9)     // Catch:{ Exception -> 0x015f }
            r3.append(r12)     // Catch:{ Exception -> 0x015f }
            r3.append(r14)     // Catch:{ Exception -> 0x015f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x015f }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x015f }
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x015f }
            r4 = 0
            r3[r4] = r9     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x015f }
            r3[r17] = r5     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x015f }
            r3[r20] = r5     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x015f }
            r3[r19] = r4     // Catch:{ Exception -> 0x015f }
            r3[r18] = r11     // Catch:{ Exception -> 0x015f }
            T r0 = r0.f27484d     // Catch:{ Exception -> 0x015f }
            r3[r16] = r0     // Catch:{ Exception -> 0x015f }
            r4 = 20781(0x512d, float:2.912E-41)
            r2.mo160131h(r4, r3)     // Catch:{ Exception -> 0x015f }
            r0 = r1
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg) r0     // Catch:{ Exception -> 0x015f }
            r0.mo63189b()     // Catch:{ Exception -> 0x015f }
            r0 = r1
            goto L_0x032e
        L_0x015f:
            r0 = move-exception
            j70.a$a r1 = f254431i
            r2 = 7
            r1.mo122377a(r2)
            java.lang.String r1 = r8.f254432e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r7 = r21
            r2.append(r7)
            r2.append(r10)
            r2.append(r13)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r3] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2[r17] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r20] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r2[r19] = r3
            java.lang.String r0 = r0.getMessage()
            r2[r18] = r0
            r2[r16] = r11
            r3 = 20781(0x512d, float:2.912E-41)
            r1.mo160131h(r3, r2)
        L_0x01ab:
            r0 = 0
            goto L_0x0325
        L_0x01ae:
            r2 = r6
            r6 = r7
            r7 = r21
            java.lang.String r15 = r8.f254432e
            r22 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r23 = r7
            java.lang.String r7 = "#readPkg appId="
            r6.append(r7)
            r6.append(r9)
            r6.append(r2)
            r6.append(r14)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            e42.a r2 = new e42.a
            java.util.Map<java.lang.String, java.lang.String> r6 = k70.C88119c.f254877d
            java.lang.Object r6 = r6.get(r9)
            gy3.C87412m.m108591d(r6)
            java.lang.String r6 = (java.lang.String) r6
            r14 = 1
            r2.<init>(r5, r14, r6)
            com.tencent.mm.plugin.appbrand.appcache.l0 r2 = q52.C89480u.m111875d(r2, r9)
            if (r2 != 0) goto L_0x0211
            java.lang.String r2 = r8.f254432e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "hy: "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = " save wxa file failed!! use fallback"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            com.tencent.mm.plugin.appbrand.appcache.h r2 = new com.tencent.mm.plugin.appbrand.appcache.h
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.<init>(r6, r5)
            r2.mo63189b()
        L_0x0211:
            r14 = r2
            boolean r1 = gy3.C87412m.m108589b(r9, r1)     // Catch:{ Exception -> 0x0287 }
            if (r1 == 0) goto L_0x021d
            java.lang.String r1 = r4.mo122517d(r14)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0221
        L_0x021d:
            java.lang.String r1 = r4.mo122516c(r14)     // Catch:{ Exception -> 0x0287 }
        L_0x0221:
            r12.f27484d = r1     // Catch:{ Exception -> 0x0287 }
            r1 = r0
            r2 = r25
            r4 = r12
            r5 = r13
            r15 = r22
            r6 = r24
            r22 = r12
            r12 = r23
            r7 = r10
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = m109402e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0285 }
            if (r1 == 0) goto L_0x027d
            boolean r2 = r13.f27482d     // Catch:{ Exception -> 0x0285 }
            if (r2 == 0) goto L_0x027d
            java.lang.String r2 = r8.f254432e     // Catch:{ Exception -> 0x0285 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0285 }
            r3.<init>()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r4 = "use resPkg appId:"
            r3.append(r4)     // Catch:{ Exception -> 0x0285 }
            r3.append(r9)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0285 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0285 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0285 }
            r3 = 6
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0285 }
            r3 = 0
            r4[r3] = r9     // Catch:{ Exception -> 0x0285 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0285 }
            r4[r17] = r5     // Catch:{ Exception -> 0x0285 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0285 }
            r4[r20] = r5     // Catch:{ Exception -> 0x0285 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0285 }
            r4[r19] = r3     // Catch:{ Exception -> 0x0285 }
            r4[r18] = r11     // Catch:{ Exception -> 0x0285 }
            T r0 = r0.f27484d     // Catch:{ Exception -> 0x0285 }
            r4[r16] = r0     // Catch:{ Exception -> 0x0285 }
            r3 = 20781(0x512d, float:2.912E-41)
            r2.mo160131h(r3, r4)     // Catch:{ Exception -> 0x0285 }
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r14)     // Catch:{ Exception -> 0x0285 }
            r0 = r1
            goto L_0x0325
        L_0x027d:
            if (r1 == 0) goto L_0x0282
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r1)     // Catch:{ Exception -> 0x0285 }
        L_0x0282:
            r2 = r22
            goto L_0x02df
        L_0x0285:
            r0 = move-exception
            goto L_0x028e
        L_0x0287:
            r0 = move-exception
            r15 = r22
            r22 = r12
            r12 = r23
        L_0x028e:
            java.lang.String r1 = r8.f254432e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r10)
            r2.append(r15)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
            j70.a$a r1 = f254431i
            r4 = 8
            r1.mo122377a(r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 6
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4[r20] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r4[r19] = r2
            java.lang.String r0 = r0.getMessage()
            r4[r18] = r0
            r2 = r22
            T r0 = r2.f27484d
            r4[r16] = r0
            r3 = 20781(0x512d, float:2.912E-41)
            r1.mo160131h(r3, r4)
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r14)
        L_0x02df:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r17] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r20] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1[r19] = r3
            r1[r18] = r11
            T r3 = r2.f27484d
            r1[r16] = r3
            r3 = 20781(0x512d, float:2.912E-41)
            r0.mo160131h(r3, r1)
            java.lang.String r0 = r8.f254432e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r9)
            java.lang.String r3 = " use asset version:"
            r1.append(r3)
            T r2 = r2.f27484d
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = r14
        L_0x0325:
            if (r0 == 0) goto L_0x032d
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r1 = r8.f254434g
            r1.put(r9, r0)
            goto L_0x032e
        L_0x032d:
            r0 = 0
        L_0x032e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j70.C87902a.mo120823c(java.lang.String):com.tencent.mm.plugin.appbrand.appcache.l0");
    }
}
