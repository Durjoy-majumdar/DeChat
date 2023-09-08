package q73;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p1017od.C89166m;
import p1017od.C89201o;
import p1033sd.C90171a;
import p430d.C26973c;
import r73.C47930c;
import r73.C47934j;
import r73.C47937l;
import r73.C47940m;
import r73.C89894f;
import r73.C89899p;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48255c;
import s73.C48262e;
import s73.C48273f;
import s73.C90150b;
import t83.C48590l;
import z04.C66725r;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: q73.f */
public abstract class C89547f extends C48255c implements C47940m {

    /* renamed from: M */
    public static final C13601g<MMKVSlotManager> f257694M = C36568h.m40985a(C47773a.f128291d);

    /* renamed from: B */
    public final String f257695B = "MicroMsg.WebCanvasJsEngine";

    /* renamed from: C */
    public final C48273f f257696C;

    /* renamed from: D */
    public final HashMap<String, Integer> f257697D;

    /* renamed from: E */
    public final C13601g f257698E;

    /* renamed from: F */
    public final ConcurrentHashMap<String, C89538a> f257699F;

    /* renamed from: G */
    public final C90150b f257700G;

    /* renamed from: H */
    public final C13601g f257701H;

    /* renamed from: I */
    public final C13601g f257702I;

    /* renamed from: J */
    public C114668z.C104589a f257703J;

    /* renamed from: K */
    public String f257704K;

    /* renamed from: L */
    public String f257705L;

    /* renamed from: q73.f$c */
    public static final class C35803c extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f95605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35803c(C89547f fVar) {
            super(0);
            this.f95605d = fVar;
        }

        public Object invoke() {
            long now = MMSlotKt.now();
            C48255c.C36632b bVar = C48255c.f129277x;
            C35812s sVar = C35812s.f95615a;
            boolean z = true;
            if (sVar.mo60422c() != 1) {
                z = false;
            }
            C40427l0 b = C48255c.C36632b.m41016b(bVar, bVar.mo60770a("index.wspkg", z, sVar.mo60421b("wxf337cbaa27790d8e"), "wxf337cbaa27790d8e"), new C35806g(this.f95605d), C12146h.f35251d, false, 8, (Object) null);
            C90150b bVar2 = this.f95605d.f257700G;
            long now2 = MMSlotKt.now() - now;
            bVar2.mo124402e(123, 1);
            bVar2.mo124402e(124, now2);
            Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [bizPkg]:" + now2 + " ms");
            return b;
        }
    }

    /* renamed from: q73.f$k */
    public static final class C35804k implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C32226l f95606a;

        public C35804k(C32226l lVar) {
            this.f95606a = lVar;
        }

        public final /* synthetic */ void onReceiveValue(Object obj) {
            this.f95606a.invoke(obj);
        }
    }

    /* renamed from: q73.f$l */
    public static final class C35805l extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f95607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35805l(C89547f fVar) {
            super(0);
            this.f95607d = fVar;
        }

        public Object invoke() {
            long now = MMSlotKt.now();
            C48255c.C36632b bVar = C48255c.f129277x;
            C35812s sVar = C35812s.f95615a;
            boolean z = true;
            if (sVar.mo60422c() != 1) {
                z = false;
            }
            C40427l0 b = C48255c.C36632b.m41016b(bVar, bVar.mo60770a("webtimeline.wspkg", z, sVar.mo60421b("wxfedb0854e2b1820d"), "wxfedb0854e2b1820d"), C35809k.f95612d, C12149l.f35255d, false, 8, (Object) null);
            C90150b bVar2 = this.f95607d.f257700G;
            long now2 = MMSlotKt.now() - now;
            bVar2.mo124402e(120, 1);
            bVar2.mo124402e(121, now2);
            Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [basePkg]:" + now2 + " ms");
            return b;
        }
    }

    /* renamed from: q73.f$a */
    public static final class C47773a extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C47773a f128291d = new C47773a();

        public C47773a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__webcanvans__");
            C87412m.m108593f(mmkv, "getMMKV(\"__webcanvans__\")");
            return new MMKVSlotManager(mmkv, 259200);
        }
    }

    /* renamed from: q73.f$b */
    public static final class C47774b extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f128292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47774b(C89547f fVar) {
            super(0);
            this.f128292d = fVar;
        }

        public Object invoke() {
            return C44404a.m48765b(this.f128292d.mo123864R1());
        }
    }

    /* renamed from: q73.f$j */
    public static final class C47775j<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C89547f f128293a;

        public C47775j(C89547f fVar) {
            this.f128293a = fVar;
        }

        public void onReceiveValue(Object obj) {
            String str = this.f128293a.f257695B;
            Log.m105918d(str, "recycleContext destroy# " + ((String) obj));
        }
    }

    /* renamed from: q73.f$d */
    public static final class C89548d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f257706d;

        /* renamed from: e */
        public final /* synthetic */ String f257707e;

        /* renamed from: f */
        public final /* synthetic */ long f257708f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89548d(C89547f fVar, String str, long j) {
            super(1);
            this.f257706d = fVar;
            this.f257707e = str;
            this.f257708f = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                java.lang.String r1 = (java.lang.String) r1
                q73.f r1 = r0.f257706d
                s73.b r1 = r1.f257700G
                java.lang.String r2 = r0.f257707e
                long r3 = r0.f257708f
                r1.getClass()
                java.lang.String r5 = "id"
                gy3.C87412m.m108594g(r2, r5)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, s73.b$b> r5 = r1.f258841g
                java.lang.Object r5 = r5.get(r2)
                s73.b$b r5 = (s73.C90150b.C90151b) r5
                if (r5 == 0) goto L_0x0148
                r6 = 1
                r5.f258849c = r6
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 - r3
                r3 = 10000(0x2710, double:4.9407E-320)
                java.lang.String r9 = "MicroMsg.WebCanvasPerformanceReporter"
                int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r10 <= 0) goto L_0x0046
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid timePast "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
                goto L_0x0148
            L_0x0046:
                boolean r3 = r5.f258848b
                r10 = 50
                r14 = 101(0x65, double:5.0E-322)
                r12 = 1
                r16 = 500(0x1f4, double:2.47E-321)
                r18 = 501(0x1f5, double:2.475E-321)
                if (r3 != 0) goto L_0x00a3
                r21 = r5
                r4 = 28
                r1.mo124402e(r4, r7)
                int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x0065
                int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r4 >= 0) goto L_0x0065
                r4 = 1
                goto L_0x0066
            L_0x0065:
                r4 = 0
            L_0x0066:
                if (r4 == 0) goto L_0x006f
                r3 = 30
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x006f:
                int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x007b
                r4 = 301(0x12d, double:1.487E-321)
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 >= 0) goto L_0x007d
                r10 = 1
                goto L_0x007e
            L_0x007b:
                r4 = 301(0x12d, double:1.487E-321)
            L_0x007d:
                r10 = 0
            L_0x007e:
                if (r10 == 0) goto L_0x0087
                r3 = 31
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x0087:
                int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r10 > 0) goto L_0x0090
                int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                if (r4 >= 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r6 = 0
            L_0x0091:
                if (r6 == 0) goto L_0x0099
                r3 = 32
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x0099:
                int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r3 <= 0) goto L_0x00ef
                r3 = 33
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x00a3:
                r21 = r5
                r4 = 39
                r1.mo124402e(r4, r7)
                int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x00b4
                int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r4 >= 0) goto L_0x00b4
                r4 = 1
                goto L_0x00b5
            L_0x00b4:
                r4 = 0
            L_0x00b5:
                if (r4 == 0) goto L_0x00bd
                r3 = 41
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x00bd:
                int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x00c9
                r4 = 301(0x12d, double:1.487E-321)
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 >= 0) goto L_0x00cb
                r10 = 1
                goto L_0x00cc
            L_0x00c9:
                r4 = 301(0x12d, double:1.487E-321)
            L_0x00cb:
                r10 = 0
            L_0x00cc:
                if (r10 == 0) goto L_0x00d4
                r3 = 42
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x00d4:
                int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r10 > 0) goto L_0x00dd
                int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                if (r4 >= 0) goto L_0x00dd
                goto L_0x00de
            L_0x00dd:
                r6 = 0
            L_0x00de:
                if (r6 == 0) goto L_0x00e6
                r3 = 43
                r1.mo124402e(r3, r12)
                goto L_0x00ef
            L_0x00e6:
                int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r3 <= 0) goto L_0x00ef
                r3 = 44
                r1.mo124402e(r3, r12)
            L_0x00ef:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = r1.f258837c
                r3.append(r1)
                java.lang.String r1 = ","
                r3.append(r1)
                r3.append(r2)
                r3.append(r1)
                r5 = r21
                int r2 = r5.f258850d
                r3.append(r2)
                r3.append(r1)
                r3.append(r7)
                r3.append(r1)
                boolean r1 = r5.f258848b
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r2 = "StringBuilder().apply {\n…\n            }.toString()"
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 20920(0x51b8, float:2.9315E-41)
                r2.kvStat(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "performance: [ClientContextReady]:"
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = "ms isMainContextStarted:"
                r1.append(r2)
                boolean r2 = r5.f258848b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            L_0x0148:
                q73.f r1 = r0.f257706d
                q73.w r1 = r1.mo118087S1()
                java.lang.String r2 = r0.f257707e
                q73.a r1 = r1.mo123884Q1(r2)
                if (r1 == 0) goto L_0x0159
                r1.mo123853o()
            L_0x0159:
                q73.f r2 = r0.f257706d
                java.lang.String r4 = r0.f257707e
                r5 = 0
                r6 = 4
                r7 = 0
                java.lang.String r3 = "create"
                q73.C89547f.m111944P1(r2, r3, r4, r5, r6, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C89547f.C89548d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: q73.f$e */
    public static final class C89549e extends C87413o implements C32224a<C80669j> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f257709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89549e(C89547f fVar) {
            super(0);
            this.f257709d = fVar;
        }

        public Object invoke() {
            return this.f257709d.f242939g;
        }
    }

    /* renamed from: q73.f$f */
    public static final class C89550f extends C87413o implements C32224a<C89201o> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f257710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89550f(C89547f fVar) {
            super(0);
            this.f257710d = fVar;
        }

        public Object invoke() {
            return new C89201o(this.f257710d.mo115417m(), this.f257710d.mo115393J0(), this.f257710d.mo115414j());
        }
    }

    /* renamed from: q73.f$g */
    public static final class C89551g implements C90171a {

        /* renamed from: a */
        public final /* synthetic */ C89547f f257711a;

        public C89551g(C89547f fVar) {
            this.f257711a = fVar;
        }

        /* renamed from: a */
        public void mo123770a() {
            this.f257711a.f242938f.mo112435a();
        }

        /* renamed from: d */
        public boolean mo123771d() {
            return this.f257711a.f242938f.mo112436d();
        }

        /* renamed from: e */
        public String mo123772e() {
            return this.f257711a.mo115410e();
        }

        /* renamed from: p */
        public void mo123773p(Runnable runnable, boolean z) {
            C87412m.m108594g(runnable, "p0");
            this.f257711a.mo115419p(runnable, z);
        }

        /* renamed from: q */
        public boolean mo123774q() {
            return this.f257711a.f242938f.mo112441i();
        }
    }

    /* renamed from: q73.f$h */
    public static final class C89552h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89547f f257712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89552h(C89547f fVar) {
            super(1);
            this.f257712d = fVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            this.f257712d.f257700G.mo124401d(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q73.f$i */
    public static final class C89553i extends C114668z.C104589a {

        /* renamed from: d */
        public boolean f257713d = true;

        /* renamed from: e */
        public final /* synthetic */ C89547f f257714e;

        /* renamed from: q73.f$i$a */
        public static final class C89554a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C89547f f257715d;

            /* renamed from: e */
            public final /* synthetic */ C89553i f257716e;

            /* renamed from: q73.f$i$a$a */
            public static final class C89555a<T> implements ValueCallback {

                /* renamed from: a */
                public final /* synthetic */ C89547f f257717a;

                public C89555a(C89547f fVar) {
                    this.f257717a = fVar;
                }

                public void onReceiveValue(Object obj) {
                    String str = (String) obj;
                    Log.m105924i(this.f257717a.f257695B, "logicJsEngine pause callback");
                }
            }

            /* renamed from: q73.f$i$a$b */
            public static final class C89556b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C89547f f257718d;

                /* renamed from: e */
                public final /* synthetic */ C89553i f257719e;

                public C89556b(C89547f fVar, C89553i iVar) {
                    this.f257718d = fVar;
                    this.f257719e = iVar;
                }

                public final void run() {
                    String str = this.f257718d.f257695B;
                    Log.m105924i(str, "logicJsEngine pause isAppForeground=" + this.f257719e.f257713d);
                    if (!this.f257719e.f257713d) {
                        C89547f fVar = this.f257718d;
                        if (!fVar.f129285v) {
                            fVar.pause();
                        }
                    }
                }
            }

            public C89554a(C89547f fVar, C89553i iVar) {
                this.f257715d = fVar;
                this.f257716e = iVar;
            }

            public final void run() {
                C89547f fVar = this.f257715d;
                if (!fVar.f129285v) {
                    this.f257716e.f257713d = false;
                    C47930c.C47931a.m53253a(fVar, "background", (String) null, new C89555a(fVar), 2, (Object) null);
                    C119179t tVar = C119157j.f356862d;
                    C89556b bVar = new C89556b(this.f257715d, this.f257716e);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(bVar, 3000, false);
                    if (this.f257715d.mo118088T1()) {
                        C89567w S1 = this.f257715d.mo118087S1();
                        synchronized (S1) {
                            if (!S1.f257762L) {
                                S1.f257762L = true;
                                if (S1.f257763M) {
                                    S1.f257763M = false;
                                    C61926c.m72668M(new C89578z(S1));
                                }
                                S1.pause();
                                Log.m105924i(S1.f257756F, "renderJsEngine pause");
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                }
            }
        }

        /* renamed from: q73.f$i$b */
        public static final class C89557b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C89547f f257720d;

            /* renamed from: e */
            public final /* synthetic */ C89553i f257721e;

            public C89557b(C89547f fVar, C89553i iVar) {
                this.f257720d = fVar;
                this.f257721e = iVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8.f257720d.f257695B, r1, "onAppForeground ex", new java.lang.Object[0]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                return;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    q73.f r0 = r8.f257720d
                    boolean r1 = r0.f129285v
                    if (r1 == 0) goto L_0x0007
                    return
                L_0x0007:
                    q73.f$i r1 = r8.f257721e
                    r2 = 1
                    r1.f257713d = r2
                    java.lang.String r0 = r0.f257695B
                    java.lang.String r1 = "logicJsEngine resume"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                    r0 = 0
                    q73.f r1 = r8.f257720d     // Catch:{ Exception -> 0x005a }
                    boolean r1 = r1.mo118088T1()     // Catch:{ Exception -> 0x005a }
                    if (r1 == 0) goto L_0x0049
                    q73.f r1 = r8.f257720d     // Catch:{ Exception -> 0x005a }
                    q73.w r1 = r1.mo118087S1()     // Catch:{ Exception -> 0x005a }
                    monitor-enter(r1)     // Catch:{ Exception -> 0x005a }
                    boolean r3 = r1.f257762L     // Catch:{ all -> 0x0046 }
                    if (r3 == 0) goto L_0x0042
                    r1.f257762L = r0     // Catch:{ all -> 0x0046 }
                    r1.resume()     // Catch:{ all -> 0x0046 }
                    boolean r3 = r1.f257763M     // Catch:{ all -> 0x0046 }
                    if (r3 != 0) goto L_0x003a
                    r1.f257763M = r2     // Catch:{ all -> 0x0046 }
                    q73.a0 r2 = new q73.a0     // Catch:{ all -> 0x0046 }
                    r2.<init>(r1)     // Catch:{ all -> 0x0046 }
                    o40.C61926c.m72668M(r2)     // Catch:{ all -> 0x0046 }
                L_0x003a:
                    java.lang.String r2 = r1.f257756F     // Catch:{ all -> 0x0046 }
                    java.lang.String r3 = "renderJsEngine resume"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0046 }
                L_0x0042:
                    rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0046 }
                    monitor-exit(r1)     // Catch:{ Exception -> 0x005a }
                    goto L_0x0049
                L_0x0046:
                    r2 = move-exception
                    monitor-exit(r1)     // Catch:{ Exception -> 0x005a }
                    throw r2     // Catch:{ Exception -> 0x005a }
                L_0x0049:
                    q73.f r1 = r8.f257720d     // Catch:{ Exception -> 0x005a }
                    r1.resume()     // Catch:{ Exception -> 0x005a }
                    q73.f r2 = r8.f257720d     // Catch:{ Exception -> 0x005a }
                    java.lang.String r3 = "foreground"
                    r4 = 0
                    r5 = 0
                    r6 = 6
                    r7 = 0
                    r73.C47930c.C47931a.m53253a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x005a }
                    goto L_0x0066
                L_0x005a:
                    r1 = move-exception
                    q73.f r2 = r8.f257720d
                    java.lang.String r2 = r2.f257695B
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r3 = "onAppForeground ex"
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
                L_0x0066:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: q73.C89547f.C89553i.C89557b.run():void");
            }
        }

        public C89553i(C89547f fVar) {
            this.f257714e = fVar;
        }

        public synchronized void onAppBackground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ((C119157j) C119157j.f356862d).mo183895z(new C89554a(this.f257714e, this));
        }

        public synchronized void onAppForeground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ((C119157j) C119157j.f356862d).mo183895z(new C89557b(this.f257714e, this));
        }
    }

    public C89547f() {
        C36568h.m40985a(new C89549e(this));
        this.f257696C = new C48273f(1477);
        this.f257697D = new HashMap<>();
        this.f257698E = C36568h.m40985a(new C47774b(this));
        this.f257699F = new ConcurrentHashMap<>();
        long now = MMSlotKt.now();
        Log.m105918d("MicroMsg.WebCanvasJsEngine", "performance: initStartTime");
        this.f257700G = new C90150b(1498, now, (String) null, 4, (C8480h) null);
        this.f257701H = C36568h.m40985a(new C35805l(this));
        this.f257702I = C36568h.m40985a(new C35803c(this));
        mo118089U1();
        this.f257704K = "none";
        this.f257705L = "";
    }

    /* renamed from: P1 */
    public static void m111944P1(C89547f fVar, String str, String str2, ValueCallback valueCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                valueCallback = null;
            }
            fVar.getClass();
            C87412m.m108594g(str, "event");
            C87412m.m108594g(str2, "canvasId");
            fVar.mo60865I0(str, "{target:'" + str2 + "'}", valueCallback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
    }

    /* renamed from: Y1 */
    public static /* synthetic */ void m111945Y1(C89547f fVar, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = -1;
            }
            fVar.mo123866X1(str, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reflow");
    }

    /* renamed from: C1 */
    public C48255c.C36631a mo72992C1(String str) {
        C87412m.m108594g(str, "type");
        String Q1 = mo118086Q1();
        C104289g m = ((C104289g) ((C36570n) this.f257698E).getValue()).optJSONObject("client").optJSONObject(str);
        return new C48255c.C36631a(Q1, m != null ? m.optLong("idKey") : 0);
    }

    /* renamed from: E1 */
    public C48273f mo72994E1() {
        return this.f257696C;
    }

    /* renamed from: G1 */
    public C40427l0 mo72996G1() {
        return (C40427l0) this.f257701H.getValue();
    }

    /* renamed from: J1 */
    public void mo72999J1(String str, String str2, C40480g gVar, C48262e eVar, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "type");
        C87412m.m108594g(gVar, "context");
        C87412m.m108594g(eVar, "contextReporter");
        try {
            String string = ((C104289g) ((C36570n) this.f257698E).getValue()).getJSONObject("client").getJSONObject(str2).getString("path");
            C40427l0 R1 = mo123864R1();
            C87412m.m108593f(string, "path");
            String b = C81291m0.m99666b(R1, string);
            C35804k kVar = null;
            if (!BuildInfo.DEBUG || 1 <= Log.getLogLevel()) {
                gVar.mo63303P0(new URL("https://ws/usr/" + mo118086Q1() + string), mo72990A1(mo118086Q1(), string), String.valueOf(C44404a.m48766c(mo123864R1())), 0, b, lVar != null ? new C35804k(lVar) : null);
            } else {
                if (lVar != null) {
                    kVar = new C35804k(lVar);
                }
                gVar.evaluateJavascript(b, kVar);
            }
            String str3 = this.f257695B;
            Log.m105918d(str3, "biz loaded:" + string + " to " + str);
        } catch (Exception e) {
            eVar.mo73005a(new C48262e.C48268f());
            throw e;
        }
    }

    /* renamed from: K1 */
    public void mo73000K1(String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "targetOrigin");
        mo118087S1().mo72998I1(str, str2);
    }

    /* renamed from: N1 */
    public void mo118085N1() {
        ((C48590l) ((BizTLRecCardJsEngine) this).f247968Q).f129998c = MMApplicationContext.getContext();
        if (mo118088T1()) {
            C89567w S1 = mo118087S1();
            Iterator<String> it = S1.f257764N.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = S1.f257756F;
                Log.m105924i(str, "canvasContext#" + next + " should be destroyed");
                C89538a aVar = S1.f257752B.f257699F.get(next);
                if (aVar != null) {
                    C89558k0 k0Var = aVar.f257664h;
                    if (k0Var != null) {
                        aVar.mo123848j().mo115376I(k0Var.f257724c);
                        C89567w j = aVar.mo123848j();
                        j.mo60865I0("destroy", "{target:'" + aVar.f257660d + "'}", C35800d.f95600a);
                        ViewParent parent = k0Var.mo123872b().getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(k0Var.mo123872b());
                        }
                        Context context = k0Var.mo123872b().getContext();
                        MutableContextWrapper mutableContextWrapper = context instanceof MutableContextWrapper ? (MutableContextWrapper) context : null;
                        if (mutableContextWrapper != null) {
                            mutableContextWrapper.setBaseContext(MMApplicationContext.getContext());
                        }
                        Log.m105924i("MicroMsg.WebCanvasContext", "canvas#" + aVar.f257660d + XVFSFile.PATH_SEPARATOR_CHAR + k0Var.f257724c + '@' + k0Var.mo123872b().getVirtualElementId() + " has been destroyed");
                        k0Var.mo123872b().mo111629a();
                    }
                    aVar.f257664h = null;
                }
            }
            S1.f257764N.clear();
        }
    }

    /* renamed from: O1 */
    public final synchronized C89538a mo123863O1(String str, String str2, String str3, Context context) {
        String str4 = str2;
        String str5 = str3;
        Context context2 = context;
        synchronized (this) {
            C87412m.m108594g(str, "type");
            C87412m.m108594g(str4, "canvasId");
            C87412m.m108594g(str5, "data");
            C87412m.m108594g(context2, "context");
            if (this.f257697D.containsKey(str4)) {
                m111945Y1(this, str2, 0, 2, (Object) null);
                C89538a S1 = C89567w.m111981S1(mo118087S1(), context, str2, false, false, 12, (Object) null);
                return S1;
            }
            C26973c.f74981a.mo54444a(str4);
            long now = MMSlotKt.now();
            String str6 = this.f257695B;
            Log.m105924i(str6, "create #" + str4 + ", dataSize=" + str3.length());
            HashMap<String, Integer> hashMap = this.f257697D;
            C40480g X = mo115378X();
            mo118090V1(context2, str4, str5, X);
            C48255c.m53593z1(this, X, "CanvasContext#" + str4, str, new C89548d(this, str4, now), (C48255c.C36631a) null, 16, (Object) null);
            this.f257700G.mo124398a(str4, now);
            hashMap.put(str4, Integer.valueOf(((C83161f) X).f242978h));
            C90150b bVar = this.f257700G;
            bVar.getClass();
            bVar.f258841g.put(str4, new C90150b.C90151b(now, bVar.f258839e));
            C89538a S12 = C89567w.m111981S1(mo118087S1(), context, str2, false, false, 12, (Object) null);
            return S12;
        }
    }

    /* renamed from: Q1 */
    public abstract String mo118086Q1();

    /* renamed from: R1 */
    public final C40427l0 mo123864R1() {
        return (C40427l0) ((C36570n) this.f257702I).getValue();
    }

    /* renamed from: S1 */
    public abstract C89567w mo118087S1();

    /* renamed from: T1 */
    public boolean mo118088T1() {
        return false;
    }

    /* renamed from: U1 */
    public void mo118089U1() {
        Log.m105924i(this.f257695B, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            C89166m mVar = new C89166m();
            mVar.f256968a = MMApplicationContext.getContext();
            mVar.f256970c = new C89550f(this);
            mVar.f256969b = new C89551g(this);
            mVar.mo123512k();
        }
        C47934j jVar = new C47934j(this);
        C40480g z = mo115383z();
        C87412m.m108593f(z, "mainJsContext");
        jVar.mo72687a(z);
        this.f257700G.mo124400c(0);
        mo73003x1(new C89552h(this));
        this.f257700G.mo124399b(0);
        C89553i iVar = new C89553i(this);
        iVar.alive();
        this.f257703J = iVar;
    }

    /* renamed from: V1 */
    public void mo118090V1(Context context, String str, String str2, C83165i iVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(iVar, "jsRuntime");
        new C47937l(this).mo72687a(iVar);
        C89538a S1 = C89567w.m111981S1(mo118087S1(), context, str, false, false, 12, (Object) null);
        new C89894f(S1).mo72687a(iVar);
        new C89899p(new C89564u(S1, this)).mo72687a(iVar);
    }

    /* renamed from: W1 */
    public final void mo123865W1(String str, int i) {
        C87412m.m108594g(str, "canvasId");
        mo60865I0("destroy", "{target:'" + str + "'}", new C47775j(this));
        mo115376I(i);
        String str2 = this.f257695B;
        Log.m105924i(str2, "recycleContext canvasId=" + str + ", contextId=" + i);
    }

    /* renamed from: X1 */
    public final void mo123866X1(String str, long j) {
        C87412m.m108594g(str, "canvasId");
        String str2 = this.f257695B;
        Log.m105924i(str2, "reflow #" + str);
        C89538a Q1 = mo118087S1().mo123884Q1(str);
        if (Q1 != null) {
            Q1.mo123853o();
        }
        C47930c.C47931a.m53253a(this, "reflow", "{target:'" + str + "', start:" + j + '}', (ValueCallback) null, 4, (Object) null);
    }

    /* renamed from: Z1 */
    public void mo118091Z1(String str, MotionEvent motionEvent) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(motionEvent, "touch");
        int action = motionEvent.getAction();
        String str2 = action != 0 ? action != 1 ? action != 2 ? action != 3 ? null : "touchcancel" : "touchmove" : "touchend" : "touchstart";
        if (str2 != null) {
            int actionIndex = motionEvent.getActionIndex();
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    target:\"");
            sb.append(str);
            sb.append("\",\n                    touches: [{\n                        identifier:");
            sb.append(motionEvent.getPointerId(actionIndex));
            sb.append(",\n                        clientX:");
            C89894f.C89897c cVar = C89894f.f258347d;
            sb.append(cVar.mo124201a(Float.valueOf(motionEvent.getX())));
            sb.append(",\n                        clientY:");
            sb.append(cVar.mo124201a(Float.valueOf(motionEvent.getY())));
            sb.append("\n                    }]\n                }\n            ");
            C47930c.C47931a.m53253a(this, str2, C66725r.m78728b(sb.toString()), (ValueCallback) null, 4, (Object) null);
        }
    }

    public void destroy() {
        C114668z.C104589a aVar = this.f257703J;
        if (aVar != null) {
            aVar.dead();
        }
        super.destroy();
    }

    /* renamed from: i0 */
    public int mo63609i0() {
        return C44404a.m48766c(mo72996G1());
    }

    /* renamed from: u0 */
    public int mo63612u0() {
        return C44404a.m48766c(mo123864R1());
    }

    /* renamed from: y1 */
    public void mo73004y1(C40480g gVar, String str, String str2, C32226l<? super String, C13598b0> lVar, C48255c.C36631a aVar) {
        C87412m.m108594g(gVar, "context");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "type");
        C40480g z = mo115383z();
        if (z != null) {
            z.mo63256J(gVar, "NativeGlobal");
        }
        super.mo73004y1(gVar, str, str2, lVar, aVar);
    }
}
