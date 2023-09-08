package ox2;

import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx2.C86411e;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h70.C8494c;
import java.util.HashMap;
import k70.C88119c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ox2.a */
public final class C89299a extends C88119c {

    /* renamed from: e */
    public final String f257255e = "MagicLiveCardPackageManager";

    /* renamed from: f */
    public final HashMap<String, C40427l0> f257256f = new HashMap<>();

    /* renamed from: g */
    public final C13601g f257257g = C36568h.m40985a(new C89300a(this));

    /* renamed from: ox2.a$a */
    public static final class C89300a extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public final /* synthetic */ C89299a f257258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89300a(C89299a aVar) {
            super(0);
            this.f257258d = aVar;
        }

        public Object invoke() {
            C89299a aVar = this.f257258d;
            aVar.getClass();
            C40427l0 c = aVar.mo120823c("wxe208ce76dfa39515");
            C87412m.m108591d(c);
            return c;
        }
    }

    /* renamed from: ox2.a$b */
    public static final class C89301b extends C87413o implements C32228q<C40427l0, String, String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C89299a f257259d;

        /* renamed from: e */
        public final /* synthetic */ String f257260e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89301b(C89299a aVar, String str) {
            super(3);
            this.f257259d = aVar;
            this.f257260e = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C40427l0 l0Var = (C40427l0) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            String str3 = this.f257259d.f257255e;
            Log.m105924i(str3, "#getWxaPkg appid=" + this.f257260e + ", assetsVersion=" + str2 + ", resVersion=" + str);
            C88119c.C88121c cVar = C88119c.f254874a;
            if (cVar.mo122514a(str2, str) >= 0) {
                C86411e.f251188h.mo58083a(14);
                return Boolean.FALSE;
            }
            C40427l0 Ba0 = ((C8494c) C86312j.m106911c(C8494c.class)).Ba0();
            String str4 = null;
            String d = Ba0 != null ? cVar.mo122517d(Ba0) : null;
            C104289g b = cVar.mo122515b(l0Var);
            if (b != null) {
                str4 = b.optString("requiredMinLibVersion");
            }
            if (str4 == null) {
                str4 = "";
            }
            String str5 = this.f257259d.f257255e;
            Log.m105924i(str5, "#getWxaPkg appid=" + this.f257260e + ", baseVersion=" + d + ", requiredMinLibVersion=" + str4);
            if (cVar.mo122514a(str4, d) > 0) {
                C86411e.f251188h.mo58083a(12);
                return Boolean.FALSE;
            }
            C86411e.f251188h.mo58083a(16);
            return Boolean.TRUE;
        }
    }

    /* renamed from: e */
    public static final C40427l0 m111625e(C8479f0<String> f0Var, C32228q<? super C40427l0, ? super String, ? super String, Boolean> qVar, C8479f0<String> f0Var2, C8477a0 a0Var, C89299a aVar, String str, String str2) {
        T t = null;
        if (!C86013q1.m106450k(str2)) {
            return null;
        }
        WxaPkg wxaPkg = new WxaPkg(str2);
        wxaPkg.mo63189b();
        String f = C81291m0.m99670f(wxaPkg, "/app-config.json");
        if (!(f.length() > 0)) {
            f = null;
        }
        C104289g gVar = f != null ? new C104289g(f) : null;
        T t2 = "";
        if (gVar != null) {
            t = gVar.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION, t2);
        }
        if (t != null) {
            t2 = t;
        }
        f0Var.f27484d = t2;
        if (qVar.invoke(wxaPkg, t2, f0Var2.f27484d).booleanValue()) {
            a0Var.f27482d = true;
            Log.m105924i(aVar.f257255e, "#readPkg " + str + " use res");
        }
        return wxaPkg;
    }

    /* renamed from: a */
    public String mo120821a(String str) {
        C87412m.m108594g(str, "url");
        return "wxe208ce76dfa39515";
    }

    /* renamed from: b */
    public String mo120822b(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "appId");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x03a6 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 mo120823c(java.lang.String r32) {
        /*
            r31 = this;
            r8 = r31
            r9 = r32
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "surface/app/"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ".wspkg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            dx2.d r1 = dx2.C31343d.f83890a
            java.lang.String r10 = r1.mo58080e(r9)
            ox2.a$b r2 = new ox2.a$b
            r2.<init>(r8, r9)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r1 = r8.f257256f
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = (com.tencent.p014mm.plugin.appbrand.appcache.C40427l0) r1
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = r8.f257255e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#readPkg use cache appId="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x03a7
        L_0x004d:
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            java.lang.String r12 = ""
            r11.f27484d = r12
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            r13.f27484d = r12
            gy3.a0 r14 = new gy3.a0
            r14.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = a70.C112760b.m154195C()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            rx3.g<java.lang.Boolean> r3 = k70.C88119c.f254875b
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00ab
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r0 = r8.f257255e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#readPkg use sdcard "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
            r0.<init>((java.lang.String) r1)
            r0.mo63189b()
            goto L_0x039d
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "jsapi/"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            rx3.g<java.util.HashSet<java.lang.String>> r4 = k70.C88119c.f254876c
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.util.HashSet r4 = (java.util.HashSet) r4
            boolean r1 = r4.contains(r1)
            java.lang.String r7 = " error: "
            java.lang.String r6 = ", path="
            java.lang.String r5 = "#readPkg "
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 2
            r20 = 1
            r4 = 20781(0x512d, float:2.912E-41)
            r15 = 0
            if (r1 != 0) goto L_0x01dd
            r1 = r11
            r3 = r13
            r13 = 20781(0x512d, float:2.912E-41)
            r4 = r14
            r14 = r5
            r5 = r31
            r21 = r6
            r6 = r32
            r22 = r7
            r7 = r10
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = m111625e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x018d }
            if (r1 != 0) goto L_0x0145
            r26 = 6
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x018d }
            r24 = 1811(0x713, double:8.948E-321)
            r28 = 1
            r23 = r1
            r23.mo175913w(r24, r26, r28)     // Catch:{ Exception -> 0x018d }
            java.lang.String r2 = r8.f257255e     // Catch:{ Exception -> 0x018d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r3.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = "pkg asset jsapi/"
            r3.append(r4)     // Catch:{ Exception -> 0x018d }
            r3.append(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = " and downloadPath "
            r3.append(r4)     // Catch:{ Exception -> 0x018d }
            r3.append(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r0 = " not found"
            r3.append(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x018d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x018d }
            r2 = 6
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x018d }
            r0[r15] = r9     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x018d }
            r0[r20] = r2     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x018d }
            r0[r19] = r2     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x018d }
            r0[r18] = r2     // Catch:{ Exception -> 0x018d }
            r0[r17] = r12     // Catch:{ Exception -> 0x018d }
            r0[r16] = r12     // Catch:{ Exception -> 0x018d }
            r1.mo160131h(r13, r0)     // Catch:{ Exception -> 0x018d }
            goto L_0x01da
        L_0x0145:
            java.lang.String r2 = r8.f257255e     // Catch:{ Exception -> 0x018d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r3.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = "#readPkg without assets appId="
            r3.append(r4)     // Catch:{ Exception -> 0x018d }
            r3.append(r9)     // Catch:{ Exception -> 0x018d }
            r4 = r21
            r3.append(r4)     // Catch:{ Exception -> 0x018d }
            r3.append(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x018d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x018d }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x018d }
            r2 = 6
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x018d }
            r3[r15] = r9     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x018d }
            r3[r20] = r2     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x018d }
            r3[r19] = r2     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x018d }
            r3[r18] = r2     // Catch:{ Exception -> 0x018d }
            r3[r17] = r12     // Catch:{ Exception -> 0x018d }
            T r2 = r11.f27484d     // Catch:{ Exception -> 0x018d }
            r3[r16] = r2     // Catch:{ Exception -> 0x018d }
            r0.mo160131h(r13, r3)     // Catch:{ Exception -> 0x018d }
            r0 = r1
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg) r0     // Catch:{ Exception -> 0x018d }
            r0.mo63189b()     // Catch:{ Exception -> 0x018d }
            goto L_0x03a7
        L_0x018d:
            r0 = move-exception
            r4 = 7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1811(0x713, double:8.948E-321)
            r6 = 1
            r1 = r11
            r1.mo175913w(r2, r4, r6)
            java.lang.String r1 = r8.f257255e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r2.append(r10)
            r7 = r22
            r2.append(r7)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r15] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r20] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r19] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1[r18] = r2
            java.lang.String r0 = r0.getMessage()
            r1[r17] = r0
            r1[r16] = r12
            r11.mo160131h(r13, r1)
        L_0x01da:
            r0 = 0
            goto L_0x039d
        L_0x01dd:
            r4 = r6
            r6 = r5
            r5 = 20781(0x512d, float:2.912E-41)
            java.lang.String r1 = r8.f257255e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "#readPkg appId="
            r5.append(r15)
            r5.append(r9)
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            e42.a r1 = new e42.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.util.Map<java.lang.String, java.lang.String> r5 = k70.C88119c.f254877d
            java.lang.Object r5 = r5.get(r9)
            gy3.C87412m.m108591d(r5)
            java.lang.String r5 = (java.lang.String) r5
            r23 = r6
            r15 = r7
            r6 = 1
            r1.<init>(r4, r6, r5)
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = q52.C89480u.m111875d(r1, r9)
            if (r1 != 0) goto L_0x025d
            java.lang.String r1 = r8.f257255e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "hy: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = " save wxa file failed!! use fallback"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            com.tencent.mm.plugin.appbrand.appcache.h r1 = new com.tencent.mm.plugin.appbrand.appcache.h
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.<init>(r4, r0)
            r1.mo63189b()
        L_0x025d:
            r7 = r1
            java.lang.String r0 = "/app-config.json"
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99670f(r7, r0)     // Catch:{ Exception -> 0x02ff }
            int r1 = r0.length()     // Catch:{ Exception -> 0x02ff }
            if (r1 <= 0) goto L_0x026c
            r1 = 1
            goto L_0x026d
        L_0x026c:
            r1 = 0
        L_0x026d:
            if (r1 == 0) goto L_0x0270
            goto L_0x0271
        L_0x0270:
            r0 = 0
        L_0x0271:
            if (r0 == 0) goto L_0x0285
            c30.g r1 = new c30.g     // Catch:{ Exception -> 0x02ff }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x02ff }
            goto L_0x0286
        L_0x0279:
            r21 = r7
            r30 = r15
            r15 = r23
            r23 = r13
            r13 = 20781(0x512d, float:2.912E-41)
            goto L_0x0302
        L_0x0285:
            r1 = 0
        L_0x0286:
            if (r1 == 0) goto L_0x0290
            java.lang.String r0 = "version"
            java.lang.String r0 = r1.optString(r0, r12)     // Catch:{ Exception -> 0x02ff }
            goto L_0x0291
        L_0x0290:
            r0 = 0
        L_0x0291:
            if (r0 != 0) goto L_0x0294
            r0 = r12
        L_0x0294:
            r13.f27484d = r0     // Catch:{ Exception -> 0x02ff }
            r1 = r11
            r3 = r13
            r4 = r14
            r6 = 20781(0x512d, float:2.912E-41)
            r5 = r31
            r21 = r15
            r15 = r23
            r23 = r13
            r13 = 20781(0x512d, float:2.912E-41)
            r6 = r32
            r30 = r21
            r21 = r7
            r7 = r10
            com.tencent.mm.plugin.appbrand.appcache.l0 r0 = m111625e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02fd }
            if (r0 == 0) goto L_0x02f5
            boolean r1 = r14.f27482d     // Catch:{ Exception -> 0x02fd }
            if (r1 == 0) goto L_0x02f5
            java.lang.String r1 = r8.f257255e     // Catch:{ Exception -> 0x02fd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fd }
            r2.<init>()     // Catch:{ Exception -> 0x02fd }
            java.lang.String r3 = "use resPkg appId:"
            r2.append(r3)     // Catch:{ Exception -> 0x02fd }
            r2.append(r9)     // Catch:{ Exception -> 0x02fd }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x02fd }
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02fd }
            r2 = 6
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02fd }
            r2 = 0
            r3[r2] = r9     // Catch:{ Exception -> 0x02fd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02fd }
            r3[r20] = r4     // Catch:{ Exception -> 0x02fd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02fd }
            r3[r19] = r4     // Catch:{ Exception -> 0x02fd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x02fd }
            r3[r18] = r2     // Catch:{ Exception -> 0x02fd }
            r3[r17] = r12     // Catch:{ Exception -> 0x02fd }
            T r2 = r11.f27484d     // Catch:{ Exception -> 0x02fd }
            r3[r16] = r2     // Catch:{ Exception -> 0x02fd }
            r1.mo160131h(r13, r3)     // Catch:{ Exception -> 0x02fd }
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r21)     // Catch:{ Exception -> 0x02fd }
            goto L_0x039d
        L_0x02f5:
            if (r0 == 0) goto L_0x02fa
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r0)     // Catch:{ Exception -> 0x02fd }
        L_0x02fa:
            r2 = r23
            goto L_0x0358
        L_0x02fd:
            r0 = move-exception
            goto L_0x0302
        L_0x02ff:
            r0 = move-exception
            goto L_0x0279
        L_0x0302:
            java.lang.String r1 = r8.f257255e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r10)
            r3 = r30
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
            r27 = 8
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = 1811(0x713, double:8.948E-321)
            r29 = 1
            r24 = r1
            r24.mo175913w(r25, r27, r29)
            r2 = 6
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r20] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r19] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r3[r18] = r2
            java.lang.String r0 = r0.getMessage()
            r3[r17] = r0
            r2 = r23
            T r0 = r2.f27484d
            r3[r16] = r0
            r1.mo160131h(r13, r3)
            com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r21)
        L_0x0358:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r20] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r19] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r1[r18] = r3
            r1[r17] = r12
            T r3 = r2.f27484d
            r1[r16] = r3
            r0.mo160131h(r13, r1)
            java.lang.String r0 = r8.f257255e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r9)
            java.lang.String r3 = " use asset version:"
            r1.append(r3)
            T r2 = r2.f27484d
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = r21
        L_0x039d:
            if (r0 == 0) goto L_0x03a6
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.l0> r1 = r8.f257256f
            r1.put(r9, r0)
            r1 = r0
            goto L_0x03a7
        L_0x03a6:
            r1 = 0
        L_0x03a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.C89299a.mo120823c(java.lang.String):com.tencent.mm.plugin.appbrand.appcache.l0");
    }

    /* renamed from: f */
    public final C40427l0 mo123643f() {
        return (C40427l0) ((C36570n) this.f257257g).getValue();
    }
}
