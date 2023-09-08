package p257w;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108494d2;
import p721v0.C65508k;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: w.y0 */
public final class C111671y0 {

    @C91590f(mo125468c = "androidx.compose.animation.core.SuspendAnimationKt", mo125469f = "SuspendAnimation.kt", mo125470l = {233, 272}, mo125471m = "animate")
    /* renamed from: w.y0$a */
    public static final class C111672a<T, V extends C37919o> extends C66704d {

        /* renamed from: d */
        public Object f334284d;

        /* renamed from: e */
        public Object f334285e;

        /* renamed from: f */
        public Object f334286f;

        /* renamed from: g */
        public Object f334287g;

        /* renamed from: h */
        public /* synthetic */ Object f334288h;

        /* renamed from: i */
        public int f334289i;

        public C111672a(C15601d<? super C111672a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f334288h = obj;
            this.f334289i |= Integer.MIN_VALUE;
            return C111671y0.m152193a((C111647j) null, (C111636d) null, 0, (C32226l) null, this);
        }
    }

    /* renamed from: w.y0$b */
    public static final class C111673b extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C111640g<T, V>> f334290d;

        /* renamed from: e */
        public final /* synthetic */ T f334291e;

        /* renamed from: f */
        public final /* synthetic */ C111636d<T, V> f334292f;

        /* renamed from: g */
        public final /* synthetic */ V f334293g;

        /* renamed from: h */
        public final /* synthetic */ C111647j<T, V> f334294h;

        /* renamed from: i */
        public final /* synthetic */ float f334295i;

        /* renamed from: j */
        public final /* synthetic */ C32226l<C111640g<T, V>, C13598b0> f334296j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111673b(C8479f0<C111640g<T, V>> f0Var, T t, C111636d<T, V> dVar, V v, C111647j<T, V> jVar, float f, C32226l<? super C111640g<T, V>, C13598b0> lVar) {
            super(1);
            this.f334290d = f0Var;
            this.f334291e = t;
            this.f334292f = dVar;
            this.f334293g = v;
            this.f334294h = jVar;
            this.f334295i = f;
            this.f334296j = lVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            C8479f0<C111640g<T, V>> f0Var = this.f334290d;
            C111640g gVar = new C111640g(this.f334291e, this.f334292f.mo61384d(), this.f334293g, longValue, this.f334292f.mo61386f(), longValue, true, new C111678z0(this.f334294h));
            C111671y0.m152196d(gVar, longValue, this.f334295i, this.f334292f, this.f334294h, this.f334296j);
            f0Var.f27484d = gVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.y0$c */
    public static final class C111674c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111647j<T, V> f334297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111674c(C111647j<T, V> jVar) {
            super(0);
            this.f334297d = jVar;
        }

        public Object invoke() {
            this.f334297d.f334239i = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.y0$d */
    public static final class C111675d extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C111640g<T, V>> f334298d;

        /* renamed from: e */
        public final /* synthetic */ float f334299e;

        /* renamed from: f */
        public final /* synthetic */ C111636d<T, V> f334300f;

        /* renamed from: g */
        public final /* synthetic */ C111647j<T, V> f334301g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<C111640g<T, V>, C13598b0> f334302h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111675d(C8479f0<C111640g<T, V>> f0Var, float f, C111636d<T, V> dVar, C111647j<T, V> jVar, C32226l<? super C111640g<T, V>, C13598b0> lVar) {
            super(1);
            this.f334298d = f0Var;
            this.f334299e = f;
            this.f334300f = dVar;
            this.f334301g = jVar;
            this.f334302h = lVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            T t = this.f334298d.f27484d;
            C87412m.m108591d(t);
            C111671y0.m152196d((C111640g) t, longValue, this.f334299e, this.f334300f, this.f334301g, this.f334302h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.y0$e */
    public static final class C111676e extends C87413o implements C32226l {

        /* renamed from: d */
        public static final C111676e f334303d = new C111676e();

        public C111676e() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111640g) obj, "$this$null");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.y0$f */
    public static final class C111677f extends C87413o implements C32226l {

        /* renamed from: d */
        public static final C111677f f334304d = new C111677f();

        public C111677f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111640g) obj, "$this$null");
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed A[Catch:{ CancellationException -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends p257w.C37919o> java.lang.Object m152193a(p257w.C111647j<T, V> r25, p257w.C111636d<T, V> r26, long r27, fy3.C32226l<? super p257w.C111640g<T, V>, rx3.C13598b0> r29, wx3.C15601d<? super rx3.C13598b0> r30) {
        /*
            r9 = r25
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof p257w.C111671y0.C111672a
            if (r2 == 0) goto L_0x0019
            r2 = r1
            w.y0$a r2 = (p257w.C111671y0.C111672a) r2
            int r3 = r2.f334289i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f334289i = r3
            goto L_0x001e
        L_0x0019:
            w.y0$a r2 = new w.y0$a
            r2.<init>(r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.f334288h
            xx3.a r11 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r10.f334289i
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r13) goto L_0x0036
            if (r2 != r12) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            java.lang.Object r0 = r10.f334287g
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r2 = r10.f334286f
            fy3.l r2 = (fy3.C32226l) r2
            java.lang.Object r3 = r10.f334285e
            w.d r3 = (p257w.C111636d) r3
            java.lang.Object r4 = r10.f334284d
            w.j r4 = (p257w.C111647j) r4
            r5 = r0
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ CancellationException -> 0x004d }
            r0 = r3
            goto L_0x00e0
        L_0x004d:
            r0 = move-exception
            goto L_0x012a
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = 0
            java.lang.Object r15 = r0.mo61385e(r1)
            w.o r17 = r0.mo61387g(r1)
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            r1 = -9223372036854775808
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            wx3.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0098 }
            float r7 = m152197e(r1)     // Catch:{ CancellationException -> 0x0098 }
            w.y0$b r8 = new w.y0$b     // Catch:{ CancellationException -> 0x0098 }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r26
            r5 = r17
            r6 = r25
            r15 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0098 }
            r10.f334284d = r9     // Catch:{ CancellationException -> 0x0098 }
            r10.f334285e = r0     // Catch:{ CancellationException -> 0x0098 }
            r8 = r29
            r10.f334286f = r8     // Catch:{ CancellationException -> 0x0098 }
            r10.f334287g = r14     // Catch:{ CancellationException -> 0x0098 }
            r10.f334289i = r13     // Catch:{ CancellationException -> 0x0098 }
            boolean r1 = r26.mo61381a()     // Catch:{ CancellationException -> 0x0098 }
            if (r1 == 0) goto L_0x009b
            java.lang.Object r1 = p257w.C65913g0.m77652a(r15, r10)     // Catch:{ CancellationException -> 0x0098 }
            goto L_0x00a4
        L_0x0098:
            r0 = move-exception
            goto L_0x012e
        L_0x009b:
            w.a1 r1 = new w.a1     // Catch:{ CancellationException -> 0x0098 }
            r1.<init>(r15)     // Catch:{ CancellationException -> 0x0098 }
            java.lang.Object r1 = p175j0.C60685u0.m70964b(r1, r10)     // Catch:{ CancellationException -> 0x0098 }
        L_0x00a4:
            if (r1 != r11) goto L_0x00dd
            return r11
        L_0x00a7:
            r8 = r29
            w.g r7 = new w.g     // Catch:{ CancellationException -> 0x0098 }
            w.k1 r16 = r26.mo61384d()     // Catch:{ CancellationException -> 0x0098 }
            java.lang.Object r20 = r26.mo61386f()     // Catch:{ CancellationException -> 0x0098 }
            r23 = 1
            w.y0$c r1 = new w.y0$c     // Catch:{ CancellationException -> 0x0098 }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x0098 }
            r6 = r14
            r14 = r7
            r18 = r27
            r21 = r27
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23, r24)     // Catch:{ CancellationException -> 0x012c }
            wx3.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x012c }
            float r4 = m152197e(r1)     // Catch:{ CancellationException -> 0x012c }
            r1 = r7
            r2 = r27
            r5 = r26
            r14 = r6
            r6 = r25
            r15 = r7
            r7 = r29
            m152196d(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x0098 }
            r14.f27484d = r15     // Catch:{ CancellationException -> 0x0098 }
        L_0x00dd:
            r2 = r8
            r4 = r9
            r5 = r14
        L_0x00e0:
            T r1 = r5.f27484d     // Catch:{ CancellationException -> 0x004d }
            gy3.C87412m.m108591d(r1)     // Catch:{ CancellationException -> 0x004d }
            w.g r1 = (p257w.C111640g) r1     // Catch:{ CancellationException -> 0x004d }
            boolean r1 = r1.mo163318d()     // Catch:{ CancellationException -> 0x004d }
            if (r1 == 0) goto L_0x0127
            wx3.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x004d }
            float r1 = m152197e(r1)     // Catch:{ CancellationException -> 0x004d }
            w.y0$d r3 = new w.y0$d     // Catch:{ CancellationException -> 0x004d }
            r25 = r3
            r26 = r5
            r27 = r1
            r28 = r0
            r29 = r4
            r30 = r2
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x004d }
            r10.f334284d = r4     // Catch:{ CancellationException -> 0x004d }
            r10.f334285e = r0     // Catch:{ CancellationException -> 0x004d }
            r10.f334286f = r2     // Catch:{ CancellationException -> 0x004d }
            r10.f334287g = r5     // Catch:{ CancellationException -> 0x004d }
            r10.f334289i = r12     // Catch:{ CancellationException -> 0x004d }
            boolean r1 = r0.mo61381a()     // Catch:{ CancellationException -> 0x004d }
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = p257w.C65913g0.m77652a(r3, r10)     // Catch:{ CancellationException -> 0x004d }
            goto L_0x0124
        L_0x011b:
            w.a1 r1 = new w.a1     // Catch:{ CancellationException -> 0x004d }
            r1.<init>(r3)     // Catch:{ CancellationException -> 0x004d }
            java.lang.Object r1 = p175j0.C60685u0.m70964b(r1, r10)     // Catch:{ CancellationException -> 0x004d }
        L_0x0124:
            if (r1 != r11) goto L_0x00e0
            return r11
        L_0x0127:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x012a:
            r14 = r5
            goto L_0x012f
        L_0x012c:
            r0 = move-exception
            r14 = r6
        L_0x012e:
            r4 = r9
        L_0x012f:
            T r1 = r14.f27484d
            w.g r1 = (p257w.C111640g) r1
            if (r1 != 0) goto L_0x0136
            goto L_0x013f
        L_0x0136:
            j0.y0 r1 = r1.f334225i
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            j0.d2 r1 = (p175j0.C108494d2) r1
            r1.setValue(r2)
        L_0x013f:
            T r1 = r14.f27484d
            w.g r1 = (p257w.C111640g) r1
            r2 = 0
            if (r1 == 0) goto L_0x014f
            long r5 = r1.f334223g
            long r7 = r4.f334237g
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x014f
            goto L_0x0150
        L_0x014f:
            r13 = 0
        L_0x0150:
            if (r13 == 0) goto L_0x0154
            r4.f334239i = r2
        L_0x0154:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C111671y0.m152193a(w.j, w.d, long, fy3.l, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static Object m152194b(C111647j jVar, C37940v vVar, boolean z, C32226l lVar, C15601d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            lVar = C111676e.f334303d;
        }
        Object a = m152193a(jVar, new C37937u(vVar, jVar.f334234d, jVar.getValue(), jVar.f334236f), z ? jVar.f334237g : Long.MIN_VALUE, lVar, dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: c */
    public static Object m152195c(C111647j jVar, Object obj, C37901h hVar, boolean z, C32226l lVar, C15601d dVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            hVar = C37903i.m41594b(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        C37901h hVar2 = hVar;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            lVar = C111677f.f334304d;
        }
        Object a = m152193a(jVar, new C37893b1(hVar2, jVar.f334234d, jVar.getValue(), obj, jVar.f334236f), z ? jVar.f334237g : Long.MIN_VALUE, lVar, dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: d */
    public static final <T, V extends C37919o> void m152196d(C111640g<T, V> gVar, long j, float f, C111636d<T, V> dVar, C111647j<T, V> jVar, C32226l<? super C111640g<T, V>, C13598b0> lVar) {
        long b = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? dVar.mo61382b() : (long) (((float) (j - gVar.f334219c)) / f);
        gVar.f334223g = j;
        ((C108494d2) gVar.f334221e).setValue(dVar.mo61385e(b));
        V g = dVar.mo61387g(b);
        C87412m.m108594g(g, "<set-?>");
        gVar.f334222f = g;
        if (dVar.mo61383c(b)) {
            gVar.f334224h = gVar.f334223g;
            ((C108494d2) gVar.f334225i).setValue(Boolean.FALSE);
        }
        m152198f(gVar, jVar);
        lVar.invoke(gVar);
    }

    /* renamed from: e */
    public static final float m152197e(C66212f fVar) {
        C87412m.m108594g(fVar, "<this>");
        int i = C65508k.f188491L0;
        C65508k kVar = (C65508k) fVar.get(C65508k.C65509a.f188492d);
        float r = kVar != null ? kVar.mo74978r() : 1.0f;
        if (r >= 0.0f) {
            return r;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: f */
    public static final <T, V extends C37919o> void m152198f(C111640g<T, V> gVar, C111647j<T, V> jVar) {
        C87412m.m108594g(gVar, "<this>");
        C87412m.m108594g(jVar, "state");
        ((C108494d2) jVar.f334235e).setValue(gVar.mo163316b());
        V v = jVar.f334236f;
        V v2 = gVar.f334222f;
        C87412m.m108594g(v, "<this>");
        C87412m.m108594g(v2, FirebaseAnalytics.C113379b.SOURCE);
        int b = v.mo61402b();
        for (int i = 0; i < b; i++) {
            v.mo61405e(i, v2.mo61401a(i));
        }
        jVar.f334238h = gVar.f334224h;
        jVar.f334237g = gVar.f334223g;
        jVar.f334239i = gVar.mo163318d();
    }
}
