package qm0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kr0.C88267e;
import li0.C88508b;
import li0.C88509c;
import qm0.C89714a;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qm0.d */
public final class C89717d {

    /* renamed from: a */
    public final AppBrandRuntimeWC f258002a;

    /* renamed from: b */
    public final AtomicBoolean f258003b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C0000n0 f258004c = C53930o0.m60555b();

    /* renamed from: d */
    public final AtomicReference<C53973z1> f258005d = new AtomicReference<>((Object) null);

    /* renamed from: e */
    public final AtomicReference<C12880b> f258006e = new AtomicReference<>((Object) null);

    /* renamed from: qm0.d$b */
    public static final class C12880b {

        /* renamed from: a */
        public final long f36854a;

        /* renamed from: b */
        public final int f36855b;

        public C12880b(long j, int i) {
            this.f36854a = j;
            this.f36855b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12880b)) {
                return false;
            }
            C12880b bVar = (C12880b) obj;
            return this.f36854a == bVar.f36854a && this.f36855b == bVar.f36855b;
        }

        public int hashCode() {
            long j = this.f36854a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f36855b;
        }

        public String toString() {
            return "StartArgs(intervalMillis=" + this.f36854a + ", shortEdge=" + this.f36855b + ')';
        }
    }

    /* renamed from: qm0.d$a */
    public static final class C89718a implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C89717d f258007d;

        /* renamed from: qm0.d$a$a */
        public /* synthetic */ class C89719a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f258008a;

            static {
                int[] iArr = new int[C88508b.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                f258008a = iArr;
            }
        }

        public C89718a(C89717d dVar) {
            this.f258007d = dVar;
        }

        /* renamed from: b */
        public final void mo113102b(String str, C88508b bVar) {
            C12880b bVar2;
            int i = bVar == null ? -1 : C89719a.f258008a[bVar.ordinal()];
            boolean z = false;
            if (i == 1) {
                C89717d dVar = this.f258007d;
                if (!dVar.f258003b.get() && (bVar2 = dVar.f258006e.get()) != null) {
                    dVar.mo124024a(bVar2.f36854a, bVar2.f36855b);
                    z = true;
                }
                Log.m105924i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f258007d.f258002a.f238147j + ")->FOREGROUND, started:" + z);
            } else if (i == 2) {
                Log.m105924i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f258007d.f258002a.f238147j + ")->BACKGROUND, stop");
                this.f258007d.mo124025b(false);
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.security.SecuritySnapshotContext$start$1", mo125469f = "JsApiSetSecuritySnapshotStrategy.kt", mo125470l = {180, 192}, mo125471m = "invokeSuspend")
    /* renamed from: qm0.d$c */
    public static final class C89720c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f258009d;

        /* renamed from: e */
        public int f258010e;

        /* renamed from: f */
        public final /* synthetic */ C89717d f258011f;

        /* renamed from: g */
        public final /* synthetic */ long f258012g;

        /* renamed from: h */
        public final /* synthetic */ int f258013h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.security.SecuritySnapshotContext$start$1$1", mo125469f = "JsApiSetSecuritySnapshotStrategy.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: qm0.d$c$a */
        public static final class C89721a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ int f258014d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f258015e;

            /* renamed from: f */
            public final /* synthetic */ C89717d f258016f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89721a(int i, Bitmap bitmap, C89717d dVar, C15601d<? super C89721a> dVar2) {
                super(2, dVar2);
                this.f258014d = i;
                this.f258015e = bitmap;
                this.f258016f = dVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C89721a(this.f258014d, this.f258015e, this.f258016f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C89721a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                try {
                    float min = ((float) this.f258014d) / ((float) Math.min(this.f258015e.getWidth(), this.f258015e.getHeight()));
                    if (min >= 1.0f) {
                        C89714a.C89715a aVar = C89714a.f258000i;
                        Bitmap bitmap = this.f258015e;
                        C88267e eVar = (C88267e) this.f258016f.f258002a.f238150p;
                        C87412m.m108593f(eVar, "rt.service");
                        aVar.mo124022a(bitmap, eVar, false);
                    } else {
                        Bitmap scaleBitmap = BitmapUtil.scaleBitmap(this.f258015e, min, min);
                        if (scaleBitmap != null && !scaleBitmap.isRecycled()) {
                            C89714a.C89715a aVar2 = C89714a.f258000i;
                            C88267e eVar2 = (C88267e) this.f258016f.f258002a.f238150p;
                            C87412m.m108593f(eVar2, "rt.service");
                            aVar2.mo124022a(scaleBitmap, eVar2, true);
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrand.SecuritySnapshotContext", "scale and dispatch bitmap for " + this.f258016f.f258002a.f238147j + ", get exception:" + e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89720c(C89717d dVar, long j, int i, C15601d<? super C89720c> dVar2) {
            super(2, dVar2);
            this.f258011f = dVar;
            this.f258012g = j;
            this.f258013h = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C89720c(this.f258011f, this.f258012g, this.f258013h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C89720c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(1:(1:(1:4)(2:5|6))(12:7|8|9|10|24|25|(4:33|(2:35|(1:37))|39|40)|38|15|(4:19|20|(1:22)(6:23|24|25|31|33|(0))|22)|39|40))(1:13)|14|15|17|19|20|(0)|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
            r5 = e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f258010e
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L_0x0028
                if (r1 == r3) goto L_0x001b
                if (r1 != r4) goto L_0x0013
                int r1 = r11.f258009d
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x002c
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                int r1 = r11.f258009d
                kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ Exception -> 0x0024 }
                r5 = r1
                r1 = r0
                r0 = r11
                goto L_0x006d
            L_0x0024:
                r12 = move-exception
                r5 = r12
                r12 = r11
                goto L_0x0078
            L_0x0028:
                kotlin.ResultKt.throwOnFailure(r12)
                r1 = 5
            L_0x002c:
                r12 = r11
            L_0x002d:
                qm0.d r5 = r12.f258011f
                java.util.concurrent.atomic.AtomicBoolean r5 = r5.f258003b
                boolean r5 = r5.get()
                if (r5 == 0) goto L_0x00d0
                int r1 = r1 + -1
                if (r1 <= 0) goto L_0x00d0
                qm0.d r5 = r12.f258011f     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r5.f258002a     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r5 = r5.mo113212m1()     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.page.i0 r5 = r5.getCurrentPage()     // Catch:{ Exception -> 0x0077 }
                gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.page.d1 r5 = r5.getCurrentPageView()     // Catch:{ Exception -> 0x0077 }
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC"
                gy3.C87412m.m108592e(r5, r6)     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.page.t1 r5 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r5     // Catch:{ Exception -> 0x0077 }
                com.tencent.mm.plugin.appbrand.page.j4 r5 = r5.mo116524L1()     // Catch:{ Exception -> 0x0077 }
                long r6 = r12.f258012g     // Catch:{ Exception -> 0x0077 }
                java.lang.String r8 = "SecuritySnapshot"
                r12.f258009d = r1     // Catch:{ Exception -> 0x0077 }
                r12.f258010e = r3     // Catch:{ Exception -> 0x0077 }
                java.lang.Object r5 = r5.mo1851a(r6, r8, r12)     // Catch:{ Exception -> 0x0077 }
                if (r5 != r0) goto L_0x0068
                return r0
            L_0x0068:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r1
                r1 = r10
            L_0x006d:
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch:{ Exception -> 0x0070 }
                goto L_0x00a1
            L_0x0070:
                r12 = move-exception
                r10 = r5
                r5 = r12
                r12 = r0
                r0 = r1
                r1 = r10
                goto L_0x0078
            L_0x0077:
                r5 = move-exception
            L_0x0078:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "takeSnapshot for "
                r6.append(r7)
                qm0.d r7 = r12.f258011f
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r7 = r7.f258002a
                java.lang.String r7 = r7.f238147j
                r6.append(r7)
                java.lang.String r7 = ", get exception:"
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "MicroMsg.AppBrand.SecuritySnapshotContext"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
                r5 = r1
                r1 = r0
                r0 = r12
                r12 = r2
            L_0x00a1:
                if (r12 == 0) goto L_0x00cb
                boolean r6 = r12.isRecycled()
                if (r6 == 0) goto L_0x00aa
                goto L_0x00cb
            L_0x00aa:
                qm0.d r6 = r0.f258011f
                java.util.concurrent.atomic.AtomicBoolean r6 = r6.f258003b
                boolean r6 = r6.get()
                if (r6 != 0) goto L_0x00b5
                goto L_0x00d0
            L_0x00b5:
                a14.h0 r6 = a14.C53872d1.f151119c
                qm0.d$c$a r7 = new qm0.d$c$a
                int r8 = r0.f258013h
                qm0.d r9 = r0.f258011f
                r7.<init>(r8, r12, r9, r2)
                r0.f258009d = r5
                r0.f258010e = r4
                java.lang.Object r12 = a14.C53895h.m60469g(r6, r7, r0)
                if (r12 != r1) goto L_0x00cb
                return r1
            L_0x00cb:
                r12 = r0
                r0 = r1
                r1 = r5
                goto L_0x002d
            L_0x00d0:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qm0.C89717d.C89720c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C89717d(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        this.f258002a = appBrandRuntimeWC;
        appBrandRuntimeWC.f238113K.mo122978a(new C89718a(this));
    }

    /* renamed from: a */
    public final void mo124024a(long j, int i) {
        mo124025b(true);
        this.f258003b.set(true);
        this.f258006e.set(new C12880b(j, i));
        C53895h.m60466d(this.f258004c, (C66212f) null, (C53934p0) null, new C89720c(this, j, i, (C15601d<? super C89720c>) null), 3, (Object) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo124025b(boolean z) {
        Log.m105924i("MicroMsg.AppBrand.SecuritySnapshotContext", "stop(terminate:" + z + ") for " + this.f258002a.f238147j);
        try {
            C53973z1 z1Var = this.f258005d.get();
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f258005d.set((Object) null);
            this.f258003b.set(false);
            if (z) {
                this.f258006e.set((Object) null);
            }
        } catch (Throwable th) {
            this.f258005d.set((Object) null);
            throw th;
        }
    }
}
