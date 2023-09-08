package s73;

import a70.C112760b;
import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import kj2.C117407d;
import o40.C61926c;
import o90.C100308d;
import q73.C35812s;
import r73.C47930c;
import r73.C47942o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48262e;
import s73.C48273f;
import sx3.C110818d0;
import z04.C112551y;

/* renamed from: s73.c */
public abstract class C48255c extends C83188y implements C47930c {

    /* renamed from: A */
    public static C100308d<String, C104289g> f129276A = new C100308d<>(1);

    /* renamed from: x */
    public static final C36632b f129277x = new C36632b((C8480h) null);

    /* renamed from: y */
    public static final C13601g<Boolean> f129278y = C36568h.m40985a(C36635c.f97389d);

    /* renamed from: z */
    public static final String f129279z;

    /* renamed from: q */
    public final HashMap<String, Integer> f129280q = new HashMap<>();

    /* renamed from: r */
    public final C13601g f129281r = C36568h.m40985a(new C48257f(this));

    /* renamed from: s */
    public final C13601g f129282s = C36568h.m40985a(new C48261k(this));

    /* renamed from: t */
    public final C13601g f129283t = C36568h.m40985a(new C48260j(this));

    /* renamed from: u */
    public final HashMap<String, Integer> f129284u = new HashMap<>();

    /* renamed from: v */
    public boolean f129285v;

    /* renamed from: w */
    public final C13601g f129286w = C36568h.m40985a(C48258g.f129289d);

    /* renamed from: s73.c$a */
    public static final class C36631a {

        /* renamed from: a */
        public final String f97380a;

        /* renamed from: b */
        public final long f97381b;

        public C36631a(String str, long j) {
            C87412m.m108594g(str, "appId");
            this.f97380a = str;
            this.f97381b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36631a)) {
                return false;
            }
            C36631a aVar = (C36631a) obj;
            return C87412m.m108589b(this.f97380a, aVar.f97380a) && this.f97381b == aVar.f97381b;
        }

        public int hashCode() {
            long j = this.f97381b;
            return (this.f97380a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "ClientInfo(appId=" + this.f97380a + ", idKey=" + this.f97381b + ')';
        }
    }

    /* renamed from: s73.c$b */
    public static final class C36632b {

        /* renamed from: s73.c$b$a */
        public static final class C36633a {

            /* renamed from: a */
            public final boolean f97382a;

            /* renamed from: b */
            public final boolean f97383b;

            /* renamed from: c */
            public final String f97384c;

            /* renamed from: d */
            public final String f97385d;

            /* renamed from: e */
            public final String f97386e;

            public C36633a(boolean z, boolean z2, String str, String str2, String str3) {
                C87412m.m108594g(str2, "assetsPath");
                C87412m.m108594g(str3, "appId");
                this.f97382a = z;
                this.f97383b = z2;
                this.f97384c = str;
                this.f97385d = str2;
                this.f97386e = str3;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C36633a)) {
                    return false;
                }
                C36633a aVar = (C36633a) obj;
                return this.f97382a == aVar.f97382a && this.f97383b == aVar.f97383b && C87412m.m108589b(this.f97384c, aVar.f97384c) && C87412m.m108589b(this.f97385d, aVar.f97385d) && C87412m.m108589b(this.f97386e, aVar.f97386e);
            }

            public int hashCode() {
                boolean z = this.f97382a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f97383b;
                if (!z3) {
                    z2 = z3;
                }
                int i2 = (i + (z2 ? 1 : 0)) * 31;
                String str = this.f97384c;
                return ((((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.f97385d.hashCode()) * 31) + this.f97386e.hashCode();
            }

            public String toString() {
                return "ReadPkgInfo(isDebugger=" + this.f97382a + ", isPreview=" + this.f97383b + ", resPath=" + this.f97384c + ", assetsPath=" + this.f97385d + ", appId=" + this.f97386e + ')';
            }
        }

        /* renamed from: s73.c$b$b */
        public static final class C36634b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C36633a f97387d;

            /* renamed from: e */
            public final /* synthetic */ int f97388e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C36634b(C36633a aVar, int i) {
                super(0);
                this.f97387d = aVar;
                this.f97388e = i;
            }

            public Object invoke() {
                int i;
                C35812s sVar = C35812s.f95615a;
                String str = this.f97387d.f97386e;
                C87412m.m108594g(str, "appId");
                C29315z2 a = sVar.mo60420a(str, 0);
                if (a == null) {
                    Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "getWxaPkgVersion pkgInfo is null");
                    i = 0;
                } else {
                    i = a.field_version;
                }
                C115669n.INSTANCE.mo160131h(20781, this.f97387d.f97386e, Integer.valueOf(i), Integer.valueOf(this.f97388e), 3, "");
                return C13598b0.f38549a;
            }
        }

        public C36632b(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01a0  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 m41016b(s73.C48255c.C36632b r16, s73.C48255c.C36632b.C36633a r17, fy3.C32228q r18, fy3.C32228q r19, boolean r20, int r21, java.lang.Object r22) {
            /*
                r1 = r17
                r0 = r18
                r2 = r21 & 4
                if (r2 == 0) goto L_0x000a
                r2 = 0
                goto L_0x000c
            L_0x000a:
                r2 = r19
            L_0x000c:
                r3 = r21 & 8
                r4 = 1
                if (r3 == 0) goto L_0x0013
                r3 = 1
                goto L_0x0015
            L_0x0013:
                r3 = r20
            L_0x0015:
                r16.getClass()
                java.lang.String r5 = "pkgInfo"
                gy3.C87412m.m108594g(r1, r5)
                java.lang.String r5 = "validResPkg"
                gy3.C87412m.m108594g(r0, r5)
                boolean r5 = r1.f97382a
                r6 = 3
                java.lang.String r7 = ""
                java.lang.String r8 = "#readPkg "
                java.lang.String r9 = "MicroMsg.WebJsEngine"
                r10 = 2
                r11 = 0
                r12 = 5
                r13 = 4
                r14 = 20781(0x512d, float:2.912E-41)
                if (r5 == 0) goto L_0x00a6
                java.lang.String r5 = r1.f97384c
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                if (r5 == 0) goto L_0x00a6
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
                java.lang.String r3 = r1.f97384c
                r0.<init>((java.lang.String) r3)
                r0.mo63189b()
                int r3 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.m48766c(r0)
                s73.c$b r5 = s73.C48255c.f129277x
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r8)
                java.lang.String r8 = r1.f97386e
                r5.append(r8)
                java.lang.String r8 = " use "
                r5.append(r8)
                boolean r8 = r1.f97383b
                if (r8 == 0) goto L_0x0065
                java.lang.String r8 = "preview"
                goto L_0x0067
            L_0x0065:
                java.lang.String r8 = "debug"
            L_0x0067:
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r8 = new java.lang.Object[r12]
                java.lang.String r9 = r1.f97386e
                r8[r11] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
                r8[r4] = r9
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r8[r10] = r4
                boolean r4 = r1.f97383b
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r8[r6] = r4
                r8[r13] = r7
                r5.mo160131h(r14, r8)
                if (r2 == 0) goto L_0x01aa
                boolean r1 = r1.f97383b
                if (r1 == 0) goto L_0x009b
                s73.c$d r1 = s73.C48255c.C36636d.UsePreviewPkg
                goto L_0x009d
            L_0x009b:
                s73.c$d r1 = s73.C48255c.C36636d.UseDebugPkg
            L_0x009d:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.invoke(r1, r3, r7)
                goto L_0x01aa
            L_0x00a6:
                if (r3 != 0) goto L_0x00d5
                com.tencent.mm.plugin.appbrand.appcache.l0 r0 = m41017c(r1, r0, r2, r11)     // Catch:{ Exception -> 0x00b1 }
                gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x00b1 }
                goto L_0x01aa
            L_0x00b1:
                r0 = move-exception
                s73.c$b r2 = s73.C48255c.f129277x
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r8)
                java.lang.String r1 = r1.f97386e
                r2.append(r1)
                java.lang.String r1 = "  fail "
                r2.append(r1)
                java.lang.String r1 = r0.getMessage()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
                throw r0
            L_0x00d5:
                com.tencent.mm.plugin.appbrand.appcache.h r3 = new com.tencent.mm.plugin.appbrand.appcache.h
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r15 = r1.f97385d
                r3.<init>(r5, r15)
                r3.mo63189b()
                int r5 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.m48766c(r3)     // Catch:{ Exception -> 0x00f4 }
                com.tencent.mm.plugin.appbrand.appcache.l0 r0 = m41017c(r1, r0, r2, r5)     // Catch:{ Exception -> 0x00f2 }
                if (r0 == 0) goto L_0x015e
                com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99669e(r3)     // Catch:{ Exception -> 0x00f2 }
                goto L_0x01aa
            L_0x00f2:
                r0 = move-exception
                goto L_0x00f6
            L_0x00f4:
                r0 = move-exception
                r5 = 0
            L_0x00f6:
                s73.c$b r15 = s73.C48255c.f129277x
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r8)
                java.lang.String r14 = r1.f97384c
                r15.append(r14)
                java.lang.String r14 = " handle error: "
                r15.append(r14)
                java.lang.String r14 = r1.f97386e
                r15.append(r14)
                r14 = 32
                r15.append(r14)
                java.lang.String r14 = r0.getMessage()
                r15.append(r14)
                java.lang.String r14 = " version:"
                r15.append(r14)
                r15.append(r5)
                java.lang.String r14 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r14)
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r15 = new java.lang.Object[r12]
                java.lang.String r12 = r1.f97386e
                r15[r11] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
                r15[r4] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                r15[r10] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
                r15[r6] = r12
                java.lang.String r12 = r0.getMessage()
                r15[r13] = r12
                r12 = 20781(0x512d, float:2.912E-41)
                r14.mo160131h(r12, r15)
                if (r2 == 0) goto L_0x015e
                s73.c$d r12 = s73.C48255c.C36636d.FallbackAssetsPkg
                java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
                java.lang.String r0 = r0.getMessage()
                r2.invoke(r12, r14, r0)
            L_0x015e:
                s73.c$b r0 = s73.C48255c.f129277x
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = r1.f97386e
                r0.append(r8)
                java.lang.String r8 = " use assert version:"
                r0.append(r8)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 5
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r1 = r1.f97386e
                r8[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                r8[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r8[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r8[r6] = r1
                r8[r13] = r7
                r1 = 20781(0x512d, float:2.912E-41)
                r0.mo160131h(r1, r8)
                if (r2 == 0) goto L_0x01a9
                s73.c$d r0 = s73.C48255c.C36636d.UseAssetsPkg
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r2.invoke(r0, r1, r7)
            L_0x01a9:
                r0 = r3
            L_0x01aa:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s73.C48255c.C36632b.m41016b(s73.c$b, s73.c$b$a, fy3.q, fy3.q, boolean, int, java.lang.Object):com.tencent.mm.plugin.appbrand.appcache.l0");
        }

        /* renamed from: c */
        public static final C40427l0 m41017c(C36633a aVar, C32228q<? super Integer, ? super Integer, ? super C40427l0, Boolean> qVar, C32228q<? super C36636d, ? super Integer, ? super String, C13598b0> qVar2, int i) {
            try {
                if (C86013q1.m106450k(aVar.f97384c)) {
                    WxaPkg wxaPkg = new WxaPkg(aVar.f97384c);
                    wxaPkg.mo63189b();
                    int c = C44404a.m48766c(wxaPkg);
                    C36632b bVar = C48255c.f129277x;
                    Log.m105924i("MicroMsg.WebJsEngine", "#readPkg " + aVar.f97386e + " resVersion = " + c + " assetsVersion=" + i);
                    if (qVar.invoke(Integer.valueOf(i), Integer.valueOf(c), wxaPkg).booleanValue()) {
                        Log.m105924i("MicroMsg.WebJsEngine", "#readPkg " + aVar.f97386e + " use res");
                        C61926c.m72656A((String) null, new C36634b(aVar, c));
                        if (qVar2 != null) {
                            qVar2.invoke(C36636d.UseResPkg, Integer.valueOf(c), "");
                        }
                        return wxaPkg;
                    }
                    C81291m0.m99669e(wxaPkg);
                } else if (!Util.isNullOrNil(aVar.f97384c)) {
                    C115669n.INSTANCE.mo160131h(20781, aVar.f97386e, 0, 0, 0, "", "", 1);
                    C117407d.INSTANCE.mo182089r(1454, 122, 1);
                }
            } catch (Throwable th) {
                C36632b bVar2 = C48255c.f129277x;
                Log.printErrStackTrace("MicroMsg.WebJsEngine", th, "readResPkg", new Object[0]);
            }
            return null;
        }

        /* renamed from: a */
        public final C36633a mo60770a(String str, boolean z, String str2, String str3) {
            C87412m.m108594g(str, "file");
            C87412m.m108594g(str3, "appId");
            String str4 = C48255c.f129279z + XVFSFile.SEPARATOR_CHAR + str;
            String str5 = "jsapi/" + str;
            return ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) && C86013q1.m106450k(str4)) ? new C36633a(true, z, str4, str5, str3) : new C36633a(false, z, str2, str5, str3);
        }
    }

    /* renamed from: s73.c$c */
    public static final class C36635c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C36635c f97389d = new C36635c();

        public C36635c() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_jscore_recycle, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: s73.c$d */
    public enum C36636d {
        UseDebugPkg,
        UsePreviewPkg,
        UseResPkg,
        UseAssetsPkg,
        FallbackAssetsPkg
    }

    /* renamed from: s73.c$h */
    public static final class C36637h implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C32226l f97396a;

        public C36637h(C32226l lVar) {
            this.f97396a = lVar;
        }

        public final /* synthetic */ void onReceiveValue(Object obj) {
            this.f97396a.invoke(obj);
        }
    }

    /* renamed from: s73.c$e */
    public static final class C48256e implements C47942o {

        /* renamed from: d */
        public final /* synthetic */ C48255c f129287d;

        public C48256e(C48255c cVar) {
            this.f129287d = cVar;
        }

        /* renamed from: M */
        public void mo72710M(String str, String str2) {
            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
            C87412m.m108594g(str2, "targetOrigin");
            this.f129287d.mo73000K1(str, str2);
        }
    }

    /* renamed from: s73.c$f */
    public static final class C48257f extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public final /* synthetic */ C48255c f129288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48257f(C48255c cVar) {
            super(0);
            this.f129288d = cVar;
        }

        public Object invoke() {
            return C44404a.m48765b(this.f129288d.mo72996G1());
        }
    }

    /* renamed from: s73.c$g */
    public static final class C48258g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C48258g f129289d = new C48258g();

        public C48258g() {
            super(0);
        }

        public Object invoke() {
            return Util.convertStreamToString(MMApplicationContext.getContext().getAssets().open("jsapi/context.js"));
        }
    }

    /* renamed from: s73.c$i */
    public static final class C48259i implements C83164h {

        /* renamed from: a */
        public final /* synthetic */ String f129290a;

        /* renamed from: b */
        public final /* synthetic */ C48262e f129291b;

        /* renamed from: c */
        public final /* synthetic */ C48255c f129292c;

        /* renamed from: d */
        public final /* synthetic */ C40480g f129293d;

        /* renamed from: e */
        public final /* synthetic */ String f129294e;

        /* renamed from: f */
        public final /* synthetic */ String f129295f;

        public C48259i(String str, C48262e eVar, C48255c cVar, C40480g gVar, String str2, String str3) {
            this.f129290a = str;
            this.f129291b = eVar;
            this.f129292c = cVar;
            this.f129293d = gVar;
            this.f129294e = str2;
            this.f129295f = str3;
        }

        /* renamed from: a */
        public final void mo69211a(String str, String str2) {
            C48273f.C48288o oVar;
            String str3 = str;
            String str4 = str2;
            C36632b bVar = C48255c.f129277x;
            Log.m105920e("MicroMsg.WebJsEngine", "JsException[" + this.f129290a + "]:" + str3 + 10 + str4);
            this.f129291b.mo73005a(new C48262e.C48266d());
            C48273f E1 = this.f129292c.mo72994E1();
            int ordinal = this.f129291b.f129299b.ordinal();
            String str5 = null;
            if (ordinal == 0) {
                oVar = new C48273f.C48285l();
                String str6 = this.f129295f;
                String str7 = this.f129294e;
                String str8 = str3 + 9 + str4;
                if (str8 != null) {
                    str5 = C112551y.m153815o(str8, ',', '.', false, 4, (Object) null);
                }
                C117407d.INSTANCE.mo160131h(20821, str6, str7, str5);
            } else if (ordinal == 1) {
                oVar = new C48273f.C48279f();
                String str9 = this.f129295f;
                String str10 = this.f129294e;
                String str11 = str3 + 9 + str4;
                if (str11 != null) {
                    str5 = C112551y.m153815o(str11, ',', '.', false, 4, (Object) null);
                }
                C117407d.INSTANCE.mo160131h(20821, str9, str10, str5);
            } else if (ordinal != 2) {
                oVar = new C48273f.C48275b();
            } else {
                oVar = new C48273f.C48275b();
                String str12 = this.f129295f;
                String str13 = this.f129294e;
                String str14 = str3 + 9 + str4;
                if (str14 != null) {
                    str5 = C112551y.m153815o(str14, ',', '.', false, 4, (Object) null);
                }
                C117407d.INSTANCE.mo160131h(20821, str12, str13, str5);
            }
            E1.mo73006a(oVar);
            C48255c cVar = this.f129292c;
            int contextId = this.f129293d.getContextId();
            String str15 = this.f129294e;
            cVar.getClass();
            C87412m.m108594g(str15, "name");
            C104289g gVar = new C104289g();
            gVar.mo145953n("id", contextId);
            gVar.put("name", str15);
            gVar.put(StateEvent.Name.MESSAGE, str3);
            gVar.put("stackTrace", str4);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "err.toString()");
            C47930c.C47931a.m53253a(cVar, "error", gVar2, (ValueCallback) null, 4, (Object) null);
        }
    }

    /* renamed from: s73.c$j */
    public static final class C48260j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C48255c f129296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48260j(C48255c cVar) {
            super(0);
            this.f129296d = cVar;
        }

        public Object invoke() {
            return Integer.valueOf(C44404a.m48766c(this.f129296d.mo72996G1()));
        }
    }

    /* renamed from: s73.c$k */
    public static final class C48261k extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public final /* synthetic */ C48255c f129297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48261k(C48255c cVar) {
            super(0);
            this.f129297d = cVar;
        }

        public Object invoke() {
            return ((C104289g) ((C36570n) this.f129297d.f129281r).getValue()).getJSONObject("logic");
        }
    }

    static {
        String str = C112760b.m154195C() + "jsengine/pkg";
        Log.m105924i("DEBUG_PATH", "WebCanvas debug path = " + str);
        f129279z = str;
    }

    /* renamed from: M1 */
    public static /* synthetic */ void m53592M1(C48255c cVar, C104289g gVar, C40480g gVar2, C48262e eVar, boolean z, String str, String str2, C32226l lVar, int i, Object obj) {
        String str3;
        if (obj == null) {
            boolean z2 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                C104289g gVar3 = gVar;
                String string = gVar.getString("name");
                C87412m.m108593f(string, "getString(\"name\")");
                str3 = string;
            } else {
                C104289g gVar4 = gVar;
                str3 = str;
            }
            cVar.mo73001L1(gVar, gVar2, eVar, z2, str3, (i & 16) != 0 ? "wxfedb0854e2b1820d" : str2, (i & 32) != 0 ? null : lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m53593z1(C48255c cVar, C40480g gVar, String str, String str2, C32226l lVar, C36631a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str2 = "unspecified";
            }
            cVar.mo73004y1(gVar, str, str2, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configClient");
    }

    /* renamed from: A1 */
    public final String mo72990A1(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        return str + XVFSFile.PATH_SEPARATOR_CHAR + URLEncoder.encode(str2);
    }

    /* renamed from: B1 */
    public C104289g mo72991B1(String str) {
        C87412m.m108594g(str, "type");
        C104289g k = mo72995F1().getJSONObject("client");
        C87412m.m108593f(k, "vmConfig.getJSONObject(\"client\")");
        return k;
    }

    /* renamed from: C1 */
    public abstract C36631a mo72992C1(String str);

    /* renamed from: D1 */
    public String mo72993D1() {
        return getClass().getSimpleName();
    }

    /* renamed from: E1 */
    public abstract C48273f mo72994E1();

    /* renamed from: F1 */
    public C104289g mo72995F1() {
        Object value = ((C36570n) this.f129282s).getValue();
        C87412m.m108593f(value, "<get-vmConfig>(...)");
        return (C104289g) value;
    }

    /* renamed from: G1 */
    public abstract C40427l0 mo72996G1();

    /* renamed from: H1 */
    public final void mo72997H1(String str, String str2, List<? extends Object> list, C32226l<? super String, C13598b0> lVar) {
        String str3;
        C87412m.m108594g(str, "target");
        C87412m.m108594g(str2, "func");
        C87412m.m108594g(lVar, "callback");
        StringBuilder sb = new StringBuilder();
        sb.append("invokeMethod('");
        sb.append(str2);
        sb.append("', { target: '");
        sb.append(str);
        sb.append("', data: { params: ");
        if (list != null) {
            str3 = C110818d0.m150921S(list, ",", "[", "]", 0, (CharSequence) null, C13630d.f38623d, 24, (Object) null);
        } else {
            str3 = "[]";
        }
        sb.append(str3);
        sb.append("}})");
        evaluateJavascript(sb.toString(), new C36637h(lVar));
    }

    /* renamed from: I0 */
    public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "eventType");
        C87412m.m108594g(str2, "event");
        if (C87412m.m108589b(str, "")) {
            Log.m105924i("MicroMsg.WebJsEngine", "skip dispath");
            return;
        }
        evaluateJavascript("dispatchEvent('" + str + "', " + str2 + ')', valueCallback);
        if (!C112551y.m153819s(str, "touch", false) && !C87412m.m108589b(str, "scroll") && !C87412m.m108589b(str, StateEvent.Name.MESSAGE)) {
            Log.m105918d("MicroMsg.WebJsEngine", "dispatch: " + str + ", " + str2);
        }
    }

    /* renamed from: I1 */
    public final void mo72998I1(String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "targetOrigin");
        C47930c.C47931a.m53253a(this, StateEvent.Name.MESSAGE, "{ target:'" + str2 + "', data: " + str + " }", (ValueCallback) null, 4, (Object) null);
    }

    /* renamed from: J1 */
    public void mo72999J1(String str, String str2, C40480g gVar, C48262e eVar, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "type");
        C87412m.m108594g(gVar, "context");
        C87412m.m108594g(eVar, "contextReporter");
    }

    /* renamed from: K1 */
    public abstract void mo73000K1(String str, String str2);

    /* JADX WARNING: Removed duplicated region for block: B:54:0x016c A[Catch:{ Exception -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0269  */
    /* renamed from: L1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73001L1(c30.C104289g r28, com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g r29, s73.C48262e r30, boolean r31, java.lang.String r32, java.lang.String r33, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r34) {
        /*
            r27 = this;
            r8 = r27
            r0 = r28
            r9 = r29
            r10 = r30
            r11 = r32
            r12 = r33
            r13 = r34
            java.lang.String r14 = "dependencies"
            java.lang.String r15 = "path"
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "clientReporter"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r7 = "name"
            gy3.C87412m.m108594g(r11, r7)
            java.lang.String r1 = "appId"
            gy3.C87412m.m108594g(r12, r1)
            boolean r1 = r8.f129285v
            java.lang.String r6 = "setup but engine destroyed"
            java.lang.String r5 = "MicroMsg.WebJsEngine"
            if (r1 == 0) goto L_0x0037
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = " :"
            r1.append(r2)
            int r2 = r29.getContextId()
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            r16 = 2
            r3 = 3
            r2 = 20821(0x5155, float:2.9176E-41)
            r1 = 1
            r17 = 0
            s73.c$i r11 = new s73.c$i     // Catch:{ Exception -> 0x023c }
            r12 = 1
            r1 = r11
            r2 = r4
            r3 = r30
            r12 = r4
            r4 = r27
            r10 = r5
            r5 = r29
            r13 = r6
            r6 = r32
            r22 = r7
            r7 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0237 }
            r9.setJsExceptionHandler(r11)     // Catch:{ Exception -> 0x0237 }
            r73.h r1 = new r73.h     // Catch:{ Exception -> 0x0237 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0237 }
            r1.mo72687a(r9)     // Catch:{ Exception -> 0x0237 }
            boolean r1 = r0.has(r14)     // Catch:{ Exception -> 0x01ee }
            if (r1 == 0) goto L_0x00e2
            c30.e r1 = r0.mo110108i(r14)     // Catch:{ Exception -> 0x01ee }
            if (r1 == 0) goto L_0x00e2
            int r2 = r1.length()     // Catch:{ Exception -> 0x01ee }
            r3 = 0
        L_0x008a:
            if (r3 >= r2) goto L_0x00e2
            java.lang.String r4 = r1.getString(r3)     // Catch:{ Exception -> 0x01ee }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r8.f129280q     // Catch:{ Exception -> 0x01ee }
            boolean r5 = r5.containsKey(r4)     // Catch:{ Exception -> 0x01ee }
            if (r5 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r8.f129280q     // Catch:{ Exception -> 0x01ee }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x01ee }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x01ee }
            goto L_0x00b4
        L_0x00a1:
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r8.f129284u     // Catch:{ Exception -> 0x01ee }
            boolean r5 = r5.containsKey(r4)     // Catch:{ Exception -> 0x01ee }
            if (r5 == 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r8.f129284u     // Catch:{ Exception -> 0x01ee }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x01ee }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x01ee }
            goto L_0x00b4
        L_0x00b2:
            r5 = r17
        L_0x00b4:
            if (r5 == 0) goto L_0x00df
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x01ee }
            com.tencent.mm.plugin.appbrand.jsruntime.g r5 = r8.mo115375F0(r5)     // Catch:{ Exception -> 0x01ee }
            if (r5 == 0) goto L_0x00c3
            r5.mo63256J(r9, r4)     // Catch:{ Exception -> 0x01ee }
        L_0x00c3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ee }
            r5.<init>()     // Catch:{ Exception -> 0x01ee }
            java.lang.String r6 = "shareObject "
            r5.append(r6)     // Catch:{ Exception -> 0x01ee }
            r5.append(r4)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r4 = " to "
            r5.append(r4)     // Catch:{ Exception -> 0x01ee }
            r5.append(r12)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r4)     // Catch:{ Exception -> 0x01ee }
        L_0x00df:
            int r3 = r3 + 1
            goto L_0x008a
        L_0x00e2:
            java.lang.String r11 = r0.getString(r15)     // Catch:{ Exception -> 0x01a3 }
            boolean r1 = r8.f129285v     // Catch:{ Exception -> 0x01a3 }
            if (r1 == 0) goto L_0x00ee
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r13)     // Catch:{ Exception -> 0x01a3 }
            return
        L_0x00ee:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x01a3 }
            if (r1 == 0) goto L_0x0117
            int r1 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()     // Catch:{ Exception -> 0x01a3 }
            r13 = 1
            if (r13 <= r1) goto L_0x0114
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = r27.mo72996G1()     // Catch:{ Exception -> 0x01a1 }
            gy3.C87412m.m108593f(r11, r15)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99666b(r1, r11)     // Catch:{ Exception -> 0x01a1 }
            r2 = r34
            if (r2 == 0) goto L_0x010e
            s73.c$h r3 = new s73.c$h     // Catch:{ Exception -> 0x01a1 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x0110
        L_0x010e:
            r3 = r17
        L_0x0110:
            r9.evaluateJavascript(r1, r3)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x016a
        L_0x0114:
            r2 = r34
            goto L_0x011a
        L_0x0117:
            r2 = r34
            r13 = 1
        L_0x011a:
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x01a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a1 }
            r1.<init>()     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r4 = "https://ws/lib"
            r1.append(r4)     // Catch:{ Exception -> 0x01a1 }
            r1.append(r11)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01a1 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = "base"
            gy3.C87412m.m108593f(r11, r15)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r4 = r8.mo72990A1(r1, r11)     // Catch:{ Exception -> 0x01a1 }
            rx3.g r1 = r8.f129283t     // Catch:{ Exception -> 0x01a1 }
            rx3.n r1 = (rx3.C36570n) r1     // Catch:{ Exception -> 0x01a1 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x01a1 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x01a1 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x01a1 }
            r6 = 0
            com.tencent.mm.plugin.appbrand.appcache.l0 r1 = r27.mo72996G1()     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99666b(r1, r11)     // Catch:{ Exception -> 0x01a1 }
            if (r2 == 0) goto L_0x015d
            s73.c$h r1 = new s73.c$h     // Catch:{ Exception -> 0x01a1 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01a1 }
            r14 = r1
            goto L_0x015f
        L_0x015d:
            r14 = r17
        L_0x015f:
            r1 = r29
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r14
            r1.mo63303P0(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01a1 }
        L_0x016a:
            if (r31 == 0) goto L_0x0184
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r8.f129280q     // Catch:{ Exception -> 0x01a1 }
            r2 = r22
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r2 = "getString(\"name\")"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x01a1 }
            int r2 = r29.getContextId()     // Catch:{ Exception -> 0x01a1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01a1 }
            r1.put(r0, r2)     // Catch:{ Exception -> 0x01a1 }
        L_0x0184:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a1 }
            r0.<init>()     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = "client setup succ "
            r0.append(r1)     // Catch:{ Exception -> 0x01a1 }
            r0.append(r12)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = " from "
            r0.append(r1)     // Catch:{ Exception -> 0x01a1 }
            r0.append(r11)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x01a1 }
            return
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a5
        L_0x01a3:
            r0 = move-exception
            r13 = 1
        L_0x01a5:
            s73.e$e r1 = new s73.e$e
            r1.<init>()
            r2 = r30
            r3 = r10
            r2.mo73005a(r1)
            java.lang.String r21 = r0.getMessage()
            if (r21 == 0) goto L_0x01c4
            r22 = 44
            r23 = 46
            r24 = 0
            r25 = 4
            r26 = 0
            java.lang.String r17 = z04.C112551y.m153815o(r21, r22, r23, r24, r25, r26)
        L_0x01c4:
            kj2.d r1 = kj2.C117407d.INSTANCE
            r4 = 3
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r5 = 1
            r2[r4] = r33
            r6 = 0
            r2[r5] = r32
            r2[r16] = r17
            r7 = 20821(0x5155, float:2.9176E-41)
            r1.mo160131h(r7, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "context setup inject script "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r1, r2)
            throw r0
        L_0x01ee:
            r0 = move-exception
            r2 = r30
            r3 = r10
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 20821(0x5155, float:2.9176E-41)
            s73.e$a r1 = new s73.e$a
            r1.<init>()
            r2.mo73005a(r1)
            java.lang.String r18 = r0.getMessage()
            if (r18 == 0) goto L_0x0213
            r19 = 44
            r20 = 46
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r17 = z04.C112551y.m153815o(r18, r19, r20, r21, r22, r23)
        L_0x0213:
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r6] = r33
            r2[r5] = r32
            r2[r16] = r17
            r1.mo160131h(r7, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "context setup dependencies "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r1, r2)
            throw r0
        L_0x0237:
            r0 = move-exception
            r2 = r30
            r3 = r10
            goto L_0x0240
        L_0x023c:
            r0 = move-exception
            r12 = r4
            r3 = r5
            r2 = r10
        L_0x0240:
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 20821(0x5155, float:2.9176E-41)
            s73.e$c r1 = new s73.e$c
            r1.<init>()
            r2.mo73005a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "context setup jsapi "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r1, r2)
            java.lang.String r9 = r0.getMessage()
            if (r9 == 0) goto L_0x0274
            r10 = 44
            r11 = 46
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.String r17 = z04.C112551y.m153815o(r9, r10, r11, r12, r13, r14)
        L_0x0274:
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r6] = r33
            r2[r5] = r32
            r2[r16] = r17
            r1.mo160131h(r7, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s73.C48255c.mo73001L1(c30.g, com.tencent.mm.plugin.appbrand.jsruntime.g, s73.e, boolean, java.lang.String, java.lang.String, fy3.l):void");
    }

    public void destroy() {
        this.f129285v = true;
        super.destroy();
    }

    /* renamed from: v1 */
    public IJSRuntime mo73002v1(IJSRuntime.Config config) {
        if (config == null) {
            config = new IJSRuntime.Config();
        }
        config.f235983k = mo72993D1() + '#';
        Log.m105918d("MicroMsg.WebJsEngine", "createJSRuntime " + config.f235983k);
        C86009m1 m1Var = new C86009m1(C112760b.m154225d() + "webservice/codecache");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        config.f235973a = m1Var.mo119976n();
        config.f235976d = null;
        return super.mo73002v1(config);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d5  */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73003x1(fy3.C32226l<? super java.lang.String, rx3.C13598b0> r29) {
        /*
            r28 = this;
            r11 = r28
            java.lang.String r0 = "name"
            java.lang.String r12 = "idKey"
            java.lang.String r1 = "mainJsContext"
            java.lang.String r9 = "main"
            java.lang.String r13 = "wxfedb0854e2b1820d"
            boolean r2 = r11.f129285v
            java.lang.String r14 = "MicroMsg.WebJsEngine"
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = "config but engine destroyed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            return
        L_0x0019:
            s73.f r2 = r28.mo72994E1()
            s73.f$i r3 = new s73.f$i
            r3.<init>()
            r2.mo73006a(r3)
            c30.g r10 = r28.mo72995F1()     // Catch:{ Exception -> 0x01e6 }
            r16 = 2
            r8 = 3
            r17 = 1
            r6 = 0
            s73.f r2 = r28.mo72994E1()     // Catch:{ Exception -> 0x01a6 }
            s73.f$m r3 = new s73.f$m     // Catch:{ Exception -> 0x01a6 }
            r3.<init>()     // Catch:{ Exception -> 0x01a6 }
            r2.mo73006a(r3)     // Catch:{ Exception -> 0x01a6 }
            r73.n r2 = new r73.n     // Catch:{ Exception -> 0x01a6 }
            s73.c$e r3 = new s73.c$e     // Catch:{ Exception -> 0x01a6 }
            r3.<init>(r11)     // Catch:{ Exception -> 0x01a6 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r3 = r28.mo115383z()     // Catch:{ Exception -> 0x01a6 }
            gy3.C87412m.m108593f(r3, r1)     // Catch:{ Exception -> 0x01a6 }
            r2.mo72687a(r3)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r2 = r28.mo115383z()     // Catch:{ Exception -> 0x01a6 }
            rx3.g r3 = r11.f129286w     // Catch:{ Exception -> 0x01a6 }
            rx3.n r3 = (rx3.C36570n) r3     // Catch:{ Exception -> 0x01a6 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01a6 }
            r2.evaluateJavascript(r3, r6)     // Catch:{ Exception -> 0x01a6 }
            c30.g r2 = r10.getJSONObject(r9)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = ""
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r3 = r28.mo115383z()     // Catch:{ Exception -> 0x01a6 }
            gy3.C87412m.m108593f(r3, r1)     // Catch:{ Exception -> 0x01a6 }
            s73.e r4 = new s73.e     // Catch:{ Exception -> 0x01a6 }
            r6 = 0
            long r5 = r2.optLong(r12, r6)     // Catch:{ Exception -> 0x019f }
            s73.e$j r1 = s73.C48262e.C48272j.Main     // Catch:{ Exception -> 0x019f }
            r4.<init>(r5, r1)     // Catch:{ Exception -> 0x019f }
            r5 = 1
            java.lang.String r6 = r2.optString(r0)     // Catch:{ Exception -> 0x019f }
            java.lang.String r1 = "optString(\"name\")"
            gy3.C87412m.m108593f(r6, r1)     // Catch:{ Exception -> 0x019f }
            java.lang.String r7 = "wxfedb0854e2b1820d"
            r1 = r28
            r19 = 0
            r8 = r29
            r1.mo73001L1(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x019d }
            s73.f r1 = r28.mo72994E1()     // Catch:{ Exception -> 0x019d }
            s73.f$n r2 = new s73.f$n     // Catch:{ Exception -> 0x019d }
            r2.<init>()     // Catch:{ Exception -> 0x019d }
            r1.mo73006a(r2)     // Catch:{ Exception -> 0x019d }
            java.lang.String r9 = "engine"
            boolean r1 = r10.has(r9)
            if (r1 == 0) goto L_0x0190
            s73.f r1 = r28.mo72994E1()     // Catch:{ Exception -> 0x0153 }
            s73.f$g r2 = new s73.f$g     // Catch:{ Exception -> 0x0153 }
            r2.<init>()     // Catch:{ Exception -> 0x0153 }
            r1.mo73006a(r2)     // Catch:{ Exception -> 0x0153 }
            c30.e r10 = r10.mo110108i(r9)     // Catch:{ Exception -> 0x0153 }
            if (r10 == 0) goto L_0x0142
            int r8 = r10.length()     // Catch:{ Exception -> 0x0153 }
            r7 = 0
        L_0x00be:
            if (r7 >= r8) goto L_0x0142
            c30.g r2 = r10.mo53814m(r7)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = r2.getString(r0)     // Catch:{ Exception -> 0x0153 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r11.f129284u     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = "engineName"
            gy3.C87412m.m108593f(r6, r1)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r18 = r28.mo115378X()     // Catch:{ Exception -> 0x0153 }
            s73.e r4 = new s73.e     // Catch:{ Exception -> 0x0153 }
            r22 = r0
            long r0 = r2.getLong(r12)     // Catch:{ Exception -> 0x0153 }
            s73.e$j r3 = s73.C48262e.C48272j.Engine     // Catch:{ Exception -> 0x0153 }
            r4.<init>(r0, r3)     // Catch:{ Exception -> 0x0153 }
            r0 = 1
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r1 = r28
            r3 = r18
            r15 = r5
            r5 = r0
            r0 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r8
            r8 = r25
            r25 = r9
            r9 = r26
            r26 = r10
            r10 = r27
            m53592M1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0151 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r1.<init>()     // Catch:{ Exception -> 0x0151 }
            java.lang.String r2 = "start engine "
            r1.append(r2)     // Catch:{ Exception -> 0x0151 }
            r1.append(r0)     // Catch:{ Exception -> 0x0151 }
            r2 = 35
            r1.append(r2)     // Catch:{ Exception -> 0x0151 }
            r2 = r18
            com.tencent.mm.plugin.appbrand.jsruntime.f r2 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f) r2     // Catch:{ Exception -> 0x0151 }
            int r2 = r2.f242978h     // Catch:{ Exception -> 0x0151 }
            r1.append(r2)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0151 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)     // Catch:{ Exception -> 0x0151 }
            r1 = r18
            com.tencent.mm.plugin.appbrand.jsruntime.f r1 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f) r1     // Catch:{ Exception -> 0x0151 }
            int r1 = r1.f242978h     // Catch:{ Exception -> 0x0151 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0151 }
            r15.put(r0, r1)     // Catch:{ Exception -> 0x0151 }
            int r7 = r23 + 1
            r0 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            goto L_0x00be
        L_0x0142:
            r25 = r9
            s73.f r0 = r28.mo72994E1()     // Catch:{ Exception -> 0x0151 }
            s73.f$h r1 = new s73.f$h     // Catch:{ Exception -> 0x0151 }
            r1.<init>()     // Catch:{ Exception -> 0x0151 }
            r0.mo73006a(r1)     // Catch:{ Exception -> 0x0151 }
            goto L_0x0190
        L_0x0151:
            r0 = move-exception
            goto L_0x0156
        L_0x0153:
            r0 = move-exception
            r25 = r9
        L_0x0156:
            s73.f r1 = r28.mo72994E1()
            s73.f$e r2 = new s73.f$e
            r2.<init>()
            r1.mo73006a(r2)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "config engineContext err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r1, r2)
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x017c
            r4 = 44
            r5 = 46
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r6 = z04.C112551y.m153815o(r3, r4, r5, r6, r7, r8)
            goto L_0x017e
        L_0x017c:
            r6 = r19
        L_0x017e:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r13
            r1[r17] = r25
            r1[r16] = r6
            r2 = 20821(0x5155, float:2.9176E-41)
            r0.mo160131h(r2, r1)
            return
        L_0x0190:
            s73.f r0 = r28.mo72994E1()
            s73.f$j r1 = new s73.f$j
            r1.<init>()
            r0.mo73006a(r1)
            return
        L_0x019d:
            r0 = move-exception
            goto L_0x01a9
        L_0x019f:
            r0 = move-exception
            r1 = 3
            r2 = 20821(0x5155, float:2.9176E-41)
            r19 = 0
            goto L_0x01ac
        L_0x01a6:
            r0 = move-exception
            r19 = r6
        L_0x01a9:
            r1 = 3
            r2 = 20821(0x5155, float:2.9176E-41)
        L_0x01ac:
            s73.f r3 = r28.mo72994E1()
            s73.f$k r4 = new s73.f$k
            r4.<init>()
            r3.mo73006a(r4)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "config mainContext err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r3, r4)
            java.lang.String r20 = r0.getMessage()
            if (r20 == 0) goto L_0x01d5
            r21 = 44
            r22 = 46
            r23 = 0
            r24 = 4
            r25 = 0
            java.lang.String r6 = z04.C112551y.m153815o(r20, r21, r22, r23, r24, r25)
            goto L_0x01d7
        L_0x01d5:
            r6 = r19
        L_0x01d7:
            kj2.d r0 = kj2.C117407d.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r13
            r1[r17] = r9
            r1[r16] = r6
            r0.mo160131h(r2, r1)
            return
        L_0x01e6:
            r0 = move-exception
            r3 = 0
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "get vmConfig ex"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s73.C48255c.mo73003x1(fy3.l):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x010c  */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73004y1(com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g r27, java.lang.String r28, java.lang.String r29, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r30, s73.C48255c.C36631a r31) {
        /*
            r26 = this;
            r11 = r26
            r12 = r28
            r13 = r29
            java.lang.String r0 = "context"
            r14 = r27
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r13, r0)
            boolean r0 = r11.f129285v
            java.lang.String r15 = "MicroMsg.WebJsEngine"
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "configClient but engine destroyed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
            return
        L_0x0023:
            r16 = 2
            r17 = 1
            r10 = 3
            r9 = 20821(0x5155, float:2.9176E-41)
            r18 = 0
            r8 = 0
            if (r31 != 0) goto L_0x0062
            s73.c$a r0 = r11.mo72992C1(r13)     // Catch:{ Exception -> 0x0035 }
            r7 = r0
            goto L_0x0064
        L_0x0035:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "configClient getClientInfo err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r1, r2, r0)
            java.lang.String r19 = r1.getMessage()
            if (r19 == 0) goto L_0x0052
            r20 = 44
            r21 = 46
            r22 = 0
            r23 = 4
            r24 = 0
            java.lang.String r18 = z04.C112551y.m153815o(r19, r20, r21, r22, r23, r24)
        L_0x0052:
            kj2.d r0 = kj2.C117407d.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = "ClientInfo"
            r1[r8] = r2
            r1[r17] = r12
            r1[r16] = r18
            r0.mo160131h(r9, r1)
            return
        L_0x0062:
            r7 = r31
        L_0x0064:
            s73.e r6 = new s73.e
            long r0 = r7.f97381b
            s73.e$j r2 = s73.C48262e.C48272j.Client
            r6.<init>(r0, r2)
            s73.f r0 = r26.mo72994E1()     // Catch:{ Exception -> 0x00d0 }
            s73.f$c r1 = new s73.f$c     // Catch:{ Exception -> 0x00d0 }
            r1.<init>()     // Catch:{ Exception -> 0x00d0 }
            r0.mo73006a(r1)     // Catch:{ Exception -> 0x00d0 }
            c30.g r2 = r11.mo72991B1(r13)     // Catch:{ Exception -> 0x00d0 }
            s73.e$g r0 = new s73.e$g     // Catch:{ Exception -> 0x00d0 }
            r0.<init>()     // Catch:{ Exception -> 0x00d0 }
            r6.mo73005a(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = r7.f97380a     // Catch:{ Exception -> 0x00d0 }
            r5 = 0
            r19 = 0
            r20 = 36
            r21 = 0
            r1 = r26
            r3 = r27
            r4 = r6
            r31 = r6
            r6 = r28
            r25 = r7
            r7 = r0
            r8 = r19
            r9 = r20
            r11 = 3
            r10 = r21
            m53592M1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00cc }
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r27
            r5 = r31
            r6 = r30
            r1.mo72999J1(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00cc }
            s73.e$h r0 = new s73.e$h     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            r1 = r31
            r1.mo73005a(r0)     // Catch:{ Exception -> 0x00ca }
            s73.f r0 = r26.mo72994E1()     // Catch:{ Exception -> 0x00ca }
            s73.f$d r2 = new s73.f$d     // Catch:{ Exception -> 0x00ca }
            r2.<init>()     // Catch:{ Exception -> 0x00ca }
            r0.mo73006a(r2)     // Catch:{ Exception -> 0x00ca }
            return
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d5
        L_0x00cc:
            r0 = move-exception
            r1 = r31
            goto L_0x00d5
        L_0x00d0:
            r0 = move-exception
            r1 = r6
            r25 = r7
            r11 = 3
        L_0x00d5:
            s73.f r2 = r26.mo72994E1()
            s73.f$a r3 = new s73.f$a
            r3.<init>()
            r2.mo73006a(r3)
            s73.e$b r2 = new s73.e$b
            r2.<init>()
            r1.mo73005a(r2)
            r1 = r25
            java.lang.String r1 = r1.f97380a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "type="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r4 = r2.toString()
            if (r4 == 0) goto L_0x0117
            r5 = 44
            r6 = 46
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r18 = z04.C112551y.m153815o(r4, r5, r6, r7, r8, r9)
        L_0x0117:
            kj2.d r2 = kj2.C117407d.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r4 = 0
            r3[r4] = r1
            r3[r17] = r12
            r3[r16] = r18
            r1 = 20821(0x5155, float:2.9176E-41)
            r2.mo160131h(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "configClient engineContext err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s73.C48255c.mo73004y1(com.tencent.mm.plugin.appbrand.jsruntime.g, java.lang.String, java.lang.String, fy3.l, s73.c$a):void");
    }
}
