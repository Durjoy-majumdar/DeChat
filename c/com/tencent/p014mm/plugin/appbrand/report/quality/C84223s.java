package com.tencent.p014mm.plugin.appbrand.report.quality;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.page.C1948j4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s */
public final class C84223s {

    /* renamed from: a */
    public final C84228v f246012a;

    /* renamed from: b */
    public final boolean f246013b;

    /* renamed from: c */
    public final float f246014c;

    /* renamed from: d */
    public final long f246015d = 2000;

    /* renamed from: e */
    public final long f246016e = 4000;

    /* renamed from: f */
    public final long f246017f = 1000;

    /* renamed from: g */
    public final C13601g f246018g = C36568h.m40985a(C84227c.f246037d);

    /* renamed from: h */
    public final C13601g f246019h = C36568h.m40985a(C1966d.f11877d);

    /* renamed from: i */
    public final C0000n0 f246020i;

    /* renamed from: j */
    public C53973z1 f246021j;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s$d */
    public static final class C1966d extends C87413o implements C32224a<Executor> {

        /* renamed from: d */
        public static final C1966d f11877d = new C1966d();

        public C1966d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C1967u.f11878d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s$a */
    public static final class C84224a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84223s f246022d;

        /* renamed from: e */
        public final /* synthetic */ C83928t1 f246023e;

        /* renamed from: f */
        public final /* synthetic */ C84213o.C84214a f246024f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f246025g;

        /* renamed from: h */
        public final /* synthetic */ C84213o f246026h;

        public C84224a(C84223s sVar, C83928t1 t1Var, C84213o.C84214a aVar, Bitmap bitmap, C84213o oVar) {
            this.f246022d = sVar;
            this.f246023e = t1Var;
            this.f246024f = aVar;
            this.f246025g = bitmap;
            this.f246026h = oVar;
        }

        public final void run() {
            try {
                C84223s.m103820a(this.f246022d, this.f246023e, this.f246024f, this.f246025g, this.f246026h);
            } catch (Exception e) {
                Log.m105924i("MicroMsg.AppBrand.QualityPageWhiteScreenDetector", "checkContentSnapshotIsBlank(page:" + this.f246023e.mo116162Q0() + "), scene:" + this.f246024f + ", failed " + e);
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.report.quality.QualityPageWhiteScreenDetector$checkContentSnapshotIsBlank$2", mo125469f = "QualityPageWhiteScreenDetector.kt", mo125470l = {127, 129}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s$b */
    public static final class C84225b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f246027d;

        /* renamed from: e */
        public final /* synthetic */ C83928t1 f246028e;

        /* renamed from: f */
        public final /* synthetic */ long f246029f;

        /* renamed from: g */
        public final /* synthetic */ C84223s f246030g;

        /* renamed from: h */
        public final /* synthetic */ C84213o.C84214a f246031h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.report.quality.QualityPageWhiteScreenDetector$checkContentSnapshotIsBlank$2$2$1", mo125469f = "QualityPageWhiteScreenDetector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s$b$a */
        public static final class C84226a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C84223s f246032d;

            /* renamed from: e */
            public final /* synthetic */ C83928t1 f246033e;

            /* renamed from: f */
            public final /* synthetic */ C84213o.C84214a f246034f;

            /* renamed from: g */
            public final /* synthetic */ Bitmap f246035g;

            /* renamed from: h */
            public final /* synthetic */ C84213o f246036h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C84226a(C84223s sVar, C83928t1 t1Var, C84213o.C84214a aVar, Bitmap bitmap, C84213o oVar, C15601d<? super C84226a> dVar) {
                super(2, dVar);
                this.f246032d = sVar;
                this.f246033e = t1Var;
                this.f246034f = aVar;
                this.f246035g = bitmap;
                this.f246036h = oVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C84226a(this.f246032d, this.f246033e, this.f246034f, this.f246035g, this.f246036h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C84226a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C84223s.m103820a(this.f246032d, this.f246033e, this.f246034f, this.f246035g, this.f246036h);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84225b(C83928t1 t1Var, long j, C84223s sVar, C84213o.C84214a aVar, C15601d<? super C84225b> dVar) {
            super(2, dVar);
            this.f246028e = t1Var;
            this.f246029f = j;
            this.f246030g = sVar;
            this.f246031h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C84225b(this.f246028e, this.f246029f, this.f246030g, this.f246031h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C84225b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f246027d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C1948j4 L1 = this.f246028e.mo116524L1();
                long j = this.f246029f;
                this.f246027d = 1;
                obj = L1.mo1851a(j, "WhiteScreenDetector", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.AppBrand.QualityPageWhiteScreenDetector", "checkContentSnapshotIsBlank for appId:" + this.f246028e.getAppId() + ", url:" + this.f246028e.mo116162Q0() + ", get exception:" + th);
                }
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                if (!(!bitmap.isRecycled())) {
                    bitmap = null;
                }
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    C83928t1 t1Var = this.f246028e;
                    C84223s sVar = this.f246030g;
                    C84213o.C84214a aVar2 = this.f246031h;
                    C84213o N1 = t1Var.mo116526N1(true);
                    Objects.requireNonNull(N1);
                    N1.mo116905a();
                    C53896h0 h0Var = C53872d1.f151119c;
                    C84226a aVar3 = new C84226a(sVar, t1Var, aVar2, bitmap2, N1, (C15601d<? super C84226a>) null);
                    this.f246027d = 2;
                    if (C53895h.m60469g(h0Var, aVar3, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.s$c */
    public static final class C84227c extends C87413o implements C32224a<Executor> {

        /* renamed from: d */
        public static final C84227c f246037d = new C84227c();

        public C84227c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C29629t.f80561d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C84223s(com.tencent.p014mm.plugin.appbrand.report.quality.C84228v r7) {
        /*
            r6 = this;
            java.lang.String r0 = "contextReporter"
            gy3.C87412m.m108594g(r7, r0)
            r6.<init>()
            r6.f246012a = r7
            r0 = 2000(0x7d0, double:9.88E-321)
            r6.f246015d = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r6.f246016e = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.f246017f = r0
            com.tencent.mm.plugin.appbrand.report.quality.s$c r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84223s.C84227c.f246037d
            rx3.g r7 = rx3.C36568h.m40985a(r7)
            r6.f246018g = r7
            com.tencent.mm.plugin.appbrand.report.quality.s$d r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84223s.C1966d.f11877d
            rx3.g r7 = rx3.C36568h.m40985a(r7)
            r6.f246019h = r7
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r7 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            double r0 = r7.f239301Y
            r7 = 0
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x006a
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x006a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x004d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x0066 }
            if (r3 == 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            int r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ Exception -> 0x0066 }
            r4 = 671097344(0x28002200, float:7.1128E-15)
            if (r3 > r4) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r3 = 0
            goto L_0x004e
        L_0x004d:
            r3 = 1
        L_0x004e:
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x0066 }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ Exception -> 0x0066 }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_android_appbrand_white_screen_detect_switch64     // Catch:{ Exception -> 0x0066 }
            int r3 = r4.mo58779Qe(r5, r3)     // Catch:{ Exception -> 0x0066 }
            if (r3 != r2) goto L_0x0066
            boolean r3 = p156gj.C87203t.m108279o()     // Catch:{ Exception -> 0x0066 }
            if (r3 == 0) goto L_0x0066
            r3 = 1
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            if (r3 == 0) goto L_0x006a
            r7 = 1
        L_0x006a:
            r6.f246013b = r7
            if (r7 == 0) goto L_0x0070
            float r7 = (float) r0
            goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            r6.f246014c = r7
            a14.n0 r7 = a14.C53930o0.m60555b()
            r6.f246020i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84223s.<init>(com.tencent.mm.plugin.appbrand.report.quality.v):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103820a(com.tencent.p014mm.plugin.appbrand.report.quality.C84223s r10, com.tencent.p014mm.plugin.appbrand.page.C83928t1 r11, com.tencent.p014mm.plugin.appbrand.report.quality.C84213o.C84214a r12, android.graphics.Bitmap r13, com.tencent.p014mm.plugin.appbrand.report.quality.C84213o r14) {
        /*
            com.tencent.mm.plugin.appbrand.report.quality.o$a r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84213o.C84214a.kInitReadyDoubleCheck
            java.lang.String r1 = "page"
            r10.getClass()
            com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails r7 = new com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails
            r7.<init>()
            float r2 = r10.f246014c     // Catch:{ all -> 0x0101 }
            boolean r2 = com.tencent.p014mm.plugin.appbrand.utils.C84763l0.m104423a(r13, r2, r7)     // Catch:{ all -> 0x0101 }
            r13.recycle()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
        L_0x0018:
            if (r2 == 0) goto L_0x00ef
            com.tencent.mm.plugin.appbrand.report.quality.v r2 = r10.f246012a
            r14.getClass()
            java.lang.String r10 = "contextReporter"
            gy3.C87412m.m108594g(r2, r10)
            java.lang.String r10 = "scene"
            gy3.C87412m.m108594g(r12, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "reportWhiteScreenError, appId:"
            r10.append(r11)
            com.tencent.mm.plugin.appbrand.page.t1 r11 = r14.f245964a
            java.lang.String r11 = r11.getAppId()
            r10.append(r11)
            java.lang.String r11 = ", page:"
            r10.append(r11)
            com.tencent.mm.plugin.appbrand.page.t1 r11 = r14.f245964a
            java.lang.String r11 = r11.mo116162Q0()
            r10.append(r11)
            java.lang.String r11 = ", scene:"
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.AppBrand.PageWhiteScreenDetectSession"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            r10 = 0
            int r11 = r12.ordinal()     // Catch:{ all -> 0x00c4 }
            r13 = 1
            if (r11 == 0) goto L_0x008e
            if (r11 == r13) goto L_0x0084
            r13 = 2
            if (r11 == r13) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x00c4 }
            r14.f245968e = r11     // Catch:{ all -> 0x00c4 }
            boolean r10 = r14.f245967d
            if (r10 != 0) goto L_0x0100
            com.tencent.mm.plugin.appbrand.page.t1 r10 = r14.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r10 = r10.getRuntime()
            if (r10 == 0) goto L_0x0100
            com.tencent.mm.plugin.appbrand.report.quality.s r10 = r10.mo113189T1()
            if (r10 == 0) goto L_0x0100
            goto L_0x00ae
        L_0x0084:
            r14.f245966c = r13     // Catch:{ all -> 0x00c4 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x00c4 }
            r14.f245968e = r3     // Catch:{ all -> 0x00c4 }
            r10 = 1
            goto L_0x0090
        L_0x008e:
            r14.f245965b = r13     // Catch:{ all -> 0x00c4 }
        L_0x0090:
            com.tencent.mm.plugin.appbrand.page.t1 r3 = r14.f245964a     // Catch:{ all -> 0x00c4 }
            r5 = 0
            r8 = 4
            r9 = 0
            r4 = r12
            r6 = r14
            com.tencent.p014mm.plugin.appbrand.report.quality.C84228v.m103823e(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c4 }
            if (r10 == 0) goto L_0x0100
            boolean r10 = r14.f245967d
            if (r10 != 0) goto L_0x0100
            com.tencent.mm.plugin.appbrand.page.t1 r10 = r14.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r10 = r10.getRuntime()
            if (r10 == 0) goto L_0x0100
            com.tencent.mm.plugin.appbrand.report.quality.s r10 = r10.mo113189T1()
            if (r10 == 0) goto L_0x0100
        L_0x00ae:
            com.tencent.mm.plugin.appbrand.page.t1 r11 = r14.f245964a
            gy3.C87412m.m108594g(r11, r1)
            boolean r12 = r10.f246013b
            if (r12 == 0) goto L_0x0100
            boolean r12 = r10.mo116910c(r11)
            if (r12 == 0) goto L_0x00be
            goto L_0x0100
        L_0x00be:
            long r12 = r10.f246017f
            r10.mo116909b(r11, r0, r12)
            goto L_0x0100
        L_0x00c4:
            r11 = move-exception
            if (r10 == 0) goto L_0x00ee
            boolean r10 = r14.f245967d
            if (r10 != 0) goto L_0x00ee
            com.tencent.mm.plugin.appbrand.page.t1 r10 = r14.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r10 = r10.getRuntime()
            if (r10 == 0) goto L_0x00ee
            com.tencent.mm.plugin.appbrand.report.quality.s r10 = r10.mo113189T1()
            if (r10 == 0) goto L_0x00ee
            com.tencent.mm.plugin.appbrand.page.t1 r12 = r14.f245964a
            gy3.C87412m.m108594g(r12, r1)
            boolean r13 = r10.f246013b
            if (r13 == 0) goto L_0x00ee
            boolean r13 = r10.mo116910c(r12)
            if (r13 == 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            long r13 = r10.f246017f
            r10.mo116909b(r12, r0, r13)
        L_0x00ee:
            throw r11
        L_0x00ef:
            com.tencent.mm.plugin.appbrand.report.quality.o$a r13 = com.tencent.p014mm.plugin.appbrand.report.quality.C84213o.C84214a.kPageLeave
            if (r13 != r12) goto L_0x0100
            com.tencent.mm.plugin.appbrand.report.quality.v r0 = r10.f246012a
            r3 = 0
            r5 = 0
            r6 = 16
            r7 = 0
            r1 = r11
            r2 = r12
            r4 = r14
            com.tencent.p014mm.plugin.appbrand.report.quality.C84228v.m103823e(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0100:
            return
        L_0x0101:
            r10 = move-exception
            r13.recycle()     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84223s.m103820a(com.tencent.mm.plugin.appbrand.report.quality.s, com.tencent.mm.plugin.appbrand.page.t1, com.tencent.mm.plugin.appbrand.report.quality.o$a, android.graphics.Bitmap, com.tencent.mm.plugin.appbrand.report.quality.o):void");
    }

    /* renamed from: b */
    public final void mo116909b(C83928t1 t1Var, C84213o.C84214a aVar, long j) {
        C53973z1 z1Var = this.f246021j;
        Bitmap bitmap = null;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        if (C84213o.C84214a.kPageLeave == aVar) {
            C1948j4 L1 = t1Var.mo116524L1();
            L1.getClass();
            try {
                bitmap = L1.f11842a.mo116159N0();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.PageSnapshotStore", "takeSnapshotSync(" + "WhiteScreenDetector" + ") failed " + e);
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                Executor executor = t1Var.getRuntime().f238117P ? (Executor) ((C36570n) this.f246018g).getValue() : (Executor) ((C36570n) this.f246019h).getValue();
                C84213o N1 = t1Var.mo116526N1(true);
                Objects.requireNonNull(N1);
                N1.mo116905a();
                executor.execute(new C84224a(this, t1Var, aVar, bitmap2, N1));
                return;
            }
            return;
        }
        this.f246021j = C53895h.m60466d(this.f246020i, (C66212f) null, (C53934p0) null, new C84225b(t1Var, j, this, aVar, (C15601d<? super C84225b>) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = r3.getRuntime();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo116910c(com.tencent.p014mm.plugin.appbrand.page.C83928t1 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.tencent.p014mm.plugin.appbrand.headless.C81915k
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.getRuntime()
            if (r3 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r3 = r3.mo121251g1()
            if (r3 == 0) goto L_0x0014
            return r1
        L_0x0014:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84223s.mo116910c(com.tencent.mm.plugin.appbrand.page.t1):boolean");
    }
}
