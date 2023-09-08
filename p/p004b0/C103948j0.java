package p004b0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87413o;
import p257w.C111640g;
import p257w.C111647j;
import p257w.C37907l;
import p759y.C112278q0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", mo125469f = "LazyListScrolling.kt", mo125470l = {114, 205}, mo125471m = "invokeSuspend")
/* renamed from: b0.j0 */
public final class C103948j0 extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f307386d;

    /* renamed from: e */
    public Object f307387e;

    /* renamed from: f */
    public Object f307388f;

    /* renamed from: g */
    public float f307389g;

    /* renamed from: h */
    public float f307390h;

    /* renamed from: i */
    public int f307391i;

    /* renamed from: j */
    public int f307392j;

    /* renamed from: n */
    public /* synthetic */ Object f307393n;

    /* renamed from: o */
    public final /* synthetic */ C103953l0 f307394o;

    /* renamed from: p */
    public final /* synthetic */ int f307395p;

    /* renamed from: q */
    public final /* synthetic */ int f307396q;

    /* renamed from: b0.j0$a */
    public static final class C103949a extends C87413o implements C32226l<C111640g<Float, C37907l>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ float f307397d;

        /* renamed from: e */
        public final /* synthetic */ C59741c0 f307398e;

        /* renamed from: f */
        public final /* synthetic */ C112278q0 f307399f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f307400g;

        /* renamed from: h */
        public final /* synthetic */ boolean f307401h;

        /* renamed from: i */
        public final /* synthetic */ float f307402i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f307403j;

        /* renamed from: n */
        public final /* synthetic */ int f307404n;

        /* renamed from: o */
        public final /* synthetic */ C103953l0 f307405o;

        /* renamed from: p */
        public final /* synthetic */ int f307406p;

        /* renamed from: q */
        public final /* synthetic */ C8479f0<C111647j<Float, C37907l>> f307407q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103949a(float f, C59741c0 c0Var, C112278q0 q0Var, C8477a0 a0Var, boolean z, float f2, C8478d0 d0Var, int i, C103953l0 l0Var, int i2, C8479f0<C111647j<Float, C37907l>> f0Var) {
            super(1);
            this.f307397d = f;
            this.f307398e = c0Var;
            this.f307399f = q0Var;
            this.f307400g = a0Var;
            this.f307401h = z;
            this.f307402i = f2;
            this.f307403j = d0Var;
            this.f307404n = i;
            this.f307405o = l0Var;
            this.f307406p = i2;
            this.f307407q = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r0 > r2) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
            if (r0 < r2) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                w.g r9 = (p257w.C111640g) r9
                java.lang.String r0 = "$this$animateTo"
                gy3.C87412m.m108594g(r9, r0)
                b0.l0 r0 = r8.f307405o
                int r1 = r8.f307404n
                b0.k r0 = p004b0.C103951k0.m138678a(r0, r1)
                r1 = 0
                if (r0 != 0) goto L_0x00fb
                float r0 = r8.f307397d
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x002b
                java.lang.Object r0 = r9.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r2 = r8.f307397d
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 <= 0) goto L_0x003c
            L_0x0029:
                r0 = r2
                goto L_0x003c
            L_0x002b:
                java.lang.Object r0 = r9.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r2 = r8.f307397d
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 >= 0) goto L_0x003c
                goto L_0x0029
            L_0x003c:
                gy3.c0 r2 = r8.f307398e
                float r2 = r2.f170634d
                float r0 = r0 - r2
                y.q0 r2 = r8.f307399f
                float r2 = r2.mo90555a(r0)
                b0.l0 r3 = r8.f307405o
                int r4 = r8.f307404n
                b0.k r3 = p004b0.C103951k0.m138678a(r3, r4)
                if (r3 == 0) goto L_0x0053
                goto L_0x00fa
            L_0x0053:
                boolean r4 = r8.f307401h
                b0.l0 r5 = r8.f307405o
                int r6 = r8.f307404n
                int r7 = r8.f307406p
                boolean r4 = p004b0.C103948j0.m138677f(r4, r5, r6, r7)
                if (r4 != 0) goto L_0x00fa
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0067
                r2 = 1
                goto L_0x0068
            L_0x0067:
                r2 = 0
            L_0x0068:
                if (r2 != 0) goto L_0x0073
                r9.mo163315a()
                gy3.a0 r9 = r8.f307400g
                r9.f27482d = r1
                goto L_0x011c
            L_0x0073:
                gy3.c0 r2 = r8.f307398e
                float r4 = r2.f170634d
                float r4 = r4 + r0
                r2.f170634d = r4
                boolean r0 = r8.f307401h
                if (r0 == 0) goto L_0x0092
                java.lang.Object r0 = r9.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r2 = r8.f307402i
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x00a6
                r9.mo163315a()
                goto L_0x00a6
            L_0x0092:
                java.lang.Object r0 = r9.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r2 = r8.f307402i
                float r2 = -r2
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L_0x00a6
                r9.mo163315a()
            L_0x00a6:
                boolean r0 = r8.f307401h
                r2 = 2
                r4 = 100
                if (r0 == 0) goto L_0x00d5
                gy3.d0 r0 = r8.f307403j
                int r0 = r0.f27483d
                if (r0 < r2) goto L_0x00fa
                int r0 = r8.f307404n
                b0.l0 r2 = r8.f307405o
                b0.x r2 = r2.mo145573g()
                java.util.List r2 = r2.mo55835f()
                java.lang.Object r2 = sx3.C110818d0.m150923U(r2)
                b0.k r2 = (p004b0.C54380k) r2
                int r2 = r2.getIndex()
                int r0 = r0 - r2
                if (r0 <= r4) goto L_0x00fa
                b0.l0 r0 = r8.f307405o
                int r2 = r8.f307404n
                int r2 = r2 - r4
                r0.mo145574i(r2, r1)
                goto L_0x00fa
            L_0x00d5:
                gy3.d0 r0 = r8.f307403j
                int r0 = r0.f27483d
                if (r0 < r2) goto L_0x00fa
                b0.l0 r0 = r8.f307405o
                b0.x r0 = r0.mo145573g()
                java.util.List r0 = r0.mo55835f()
                java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
                b0.k r0 = (p004b0.C54380k) r0
                int r0 = r0.getIndex()
                int r2 = r8.f307404n
                int r0 = r0 - r2
                if (r0 <= r4) goto L_0x00fa
                b0.l0 r0 = r8.f307405o
                int r2 = r2 + r4
                r0.mo145574i(r2, r1)
            L_0x00fa:
                r0 = r3
            L_0x00fb:
                boolean r2 = r8.f307401h
                b0.l0 r3 = r8.f307405o
                int r4 = r8.f307404n
                int r5 = r8.f307406p
                boolean r2 = p004b0.C103948j0.m138677f(r2, r3, r4, r5)
                if (r2 == 0) goto L_0x011a
                b0.l0 r0 = r8.f307405o
                int r2 = r8.f307404n
                int r3 = r8.f307406p
                r0.mo145574i(r2, r3)
                gy3.a0 r0 = r8.f307400g
                r0.f27482d = r1
                r9.mo163315a()
                goto L_0x011c
            L_0x011a:
                if (r0 != 0) goto L_0x011f
            L_0x011c:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            L_0x011f:
                b0.b r9 = new b0.b
                gy3.f0<w.j<java.lang.Float, w.l>> r1 = r8.f307407q
                T r1 = r1.f27484d
                w.j r1 = (p257w.C111647j) r1
                r9.<init>(r0, r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p004b0.C103948j0.C103949a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b0.j0$b */
    public static final class C103950b extends C87413o implements C32226l<C111640g<Float, C37907l>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ float f307408d;

        /* renamed from: e */
        public final /* synthetic */ C59741c0 f307409e;

        /* renamed from: f */
        public final /* synthetic */ C112278q0 f307410f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103950b(float f, C59741c0 c0Var, C112278q0 q0Var) {
            super(1);
            this.f307408d = f;
            this.f307409e = c0Var;
            this.f307410f = q0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
            if (r3 == false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
            if (r0 > r1) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            if (r0 < r1) goto L_0x0035;
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                w.g r6 = (p257w.C111640g) r6
                java.lang.String r0 = "$this$animateTo"
                gy3.C87412m.m108594g(r6, r0)
                float r0 = r5.f307408d
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x0021
                java.lang.Object r0 = r6.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.f307408d
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x001f
                goto L_0x0035
            L_0x001f:
                r1 = r0
                goto L_0x0035
            L_0x0021:
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0035
                java.lang.Object r0 = r6.mo163316b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.f307408d
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x001f
            L_0x0035:
                gy3.c0 r0 = r5.f307409e
                float r0 = r0.f170634d
                float r0 = r1 - r0
                y.q0 r2 = r5.f307410f
                float r2 = r2.mo90555a(r0)
                r3 = 0
                r4 = 1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0049
                r2 = 1
                goto L_0x004a
            L_0x0049:
                r2 = 0
            L_0x004a:
                if (r2 == 0) goto L_0x005d
                java.lang.Object r2 = r6.mo163316b()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto L_0x005b
                r3 = 1
            L_0x005b:
                if (r3 != 0) goto L_0x0060
            L_0x005d:
                r6.mo163315a()
            L_0x0060:
                gy3.c0 r6 = r5.f307409e
                float r1 = r6.f170634d
                float r1 = r1 + r0
                r6.f170634d = r1
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p004b0.C103948j0.C103950b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103948j0(C103953l0 l0Var, int i, int i2, C15601d<? super C103948j0> dVar) {
        super(2, dVar);
        this.f307394o = l0Var;
        this.f307395p = i;
        this.f307396q = i2;
    }

    /* renamed from: f */
    public static final boolean m138677f(boolean z, C103953l0 l0Var, int i, int i2) {
        if (z) {
            if (l0Var.mo145571e() <= i && (l0Var.mo145571e() != i || l0Var.mo145572f() <= i2)) {
                return false;
            }
        } else if (l0Var.mo145571e() >= i && (l0Var.mo145571e() != i || l0Var.mo145572f() >= i2)) {
            return false;
        }
        return true;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C103948j0 j0Var = new C103948j0(this.f307394o, this.f307395p, this.f307396q, dVar);
        j0Var.f307393n = obj;
        return j0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C103948j0) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: y.q0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6 A[SYNTHETIC, Splitter:B:30:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0148 A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014a A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014d A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014f A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154 A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0157 A[Catch:{ b -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0257 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            r36 = this;
            r1 = r36
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f307392j
            r3 = 0
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 == r6) goto L_0x001c
            if (r0 != r4) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r37)
            goto L_0x0258
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001c:
            int r0 = r1.f307391i
            float r7 = r1.f307390h
            float r8 = r1.f307389g
            java.lang.Object r9 = r1.f307388f
            gy3.d0 r9 = (gy3.C8478d0) r9
            java.lang.Object r10 = r1.f307387e
            gy3.f0 r10 = (gy3.C8479f0) r10
            java.lang.Object r11 = r1.f307386d
            gy3.a0 r11 = (gy3.C8477a0) r11
            java.lang.Object r12 = r1.f307393n
            y.q0 r12 = (p759y.C112278q0) r12
            kotlin.ResultKt.throwOnFailure(r37)     // Catch:{ b -> 0x003d }
            r15 = r7
            r14 = r8
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r1
            goto L_0x01c3
        L_0x003d:
            r0 = move-exception
            goto L_0x01f2
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r37)
            java.lang.Object r0 = r1.f307393n
            r12 = r0
            y.q0 r12 = (p759y.C112278q0) r12
            b0.l0 r0 = r1.f307394o     // Catch:{ b -> 0x01ef }
            i2.d r0 = r0.f307420e     // Catch:{ b -> 0x01ef }
            float r7 = p004b0.C103951k0.f307411a     // Catch:{ b -> 0x01ef }
            float r0 = r0.mo143034T(r7)     // Catch:{ b -> 0x01ef }
            b0.l0 r7 = r1.f307394o     // Catch:{ b -> 0x01ef }
            i2.d r7 = r7.f307420e     // Catch:{ b -> 0x01ef }
            float r8 = p004b0.C103951k0.f307412b     // Catch:{ b -> 0x01ef }
            float r7 = r7.mo143034T(r8)     // Catch:{ b -> 0x01ef }
            gy3.a0 r8 = new gy3.a0     // Catch:{ b -> 0x01ef }
            r8.<init>()     // Catch:{ b -> 0x01ef }
            r8.f27482d = r6     // Catch:{ b -> 0x01ef }
            gy3.f0 r9 = new gy3.f0     // Catch:{ b -> 0x01ef }
            r9.<init>()     // Catch:{ b -> 0x01ef }
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            w.j r10 = p257w.C111651k.m152177a(r13, r14, r15, r17, r19, r20, r21)     // Catch:{ b -> 0x01ef }
            r9.f27484d = r10     // Catch:{ b -> 0x01ef }
            b0.l0 r10 = r1.f307394o     // Catch:{ b -> 0x01ef }
            int r11 = r1.f307395p     // Catch:{ b -> 0x01ef }
            b0.k r10 = p004b0.C103951k0.m138678a(r10, r11)     // Catch:{ b -> 0x01ef }
            if (r10 != 0) goto L_0x01e5
            int r10 = r1.f307395p     // Catch:{ b -> 0x01ef }
            b0.l0 r11 = r1.f307394o     // Catch:{ b -> 0x01ef }
            int r11 = r11.mo145571e()     // Catch:{ b -> 0x01ef }
            if (r10 <= r11) goto L_0x0090
            r10 = 1
            goto L_0x0091
        L_0x0090:
            r10 = 0
        L_0x0091:
            gy3.d0 r11 = new gy3.d0     // Catch:{ b -> 0x01ef }
            r11.<init>()     // Catch:{ b -> 0x01ef }
            r11.f27483d = r6     // Catch:{ b -> 0x01ef }
            r14 = r0
            r15 = r7
            r0 = r10
            r13 = r11
            r10 = r1
            r11 = r8
            r35 = r12
            r12 = r9
            r9 = r35
        L_0x00a3:
            boolean r7 = r11.f27482d     // Catch:{ b -> 0x01e0 }
            if (r7 == 0) goto L_0x0261
            b0.l0 r7 = r10.f307394o     // Catch:{ b -> 0x01e0 }
            b0.x r7 = r7.mo145573g()     // Catch:{ b -> 0x01e0 }
            int r7 = r7.mo55834e()     // Catch:{ b -> 0x01e0 }
            if (r7 <= 0) goto L_0x0261
            b0.l0 r7 = r10.f307394o     // Catch:{ b -> 0x01e0 }
            b0.x r7 = r7.mo145573g()     // Catch:{ b -> 0x01e0 }
            java.util.List r7 = r7.mo55835f()     // Catch:{ b -> 0x01e0 }
            int r8 = r7.size()     // Catch:{ b -> 0x01e0 }
            r5 = 0
            r16 = 0
        L_0x00c4:
            if (r5 >= r8) goto L_0x00d5
            java.lang.Object r17 = r7.get(r5)     // Catch:{ b -> 0x01d0 }
            b0.k r17 = (p004b0.C54380k) r17     // Catch:{ b -> 0x01d0 }
            int r17 = r17.getSize()     // Catch:{ b -> 0x01d0 }
            int r16 = r16 + r17
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x00d5:
            int r5 = r7.size()     // Catch:{ b -> 0x01e0 }
            int r16 = r16 / r5
            int r5 = r10.f307395p     // Catch:{ b -> 0x01e0 }
            b0.l0 r7 = r10.f307394o     // Catch:{ b -> 0x01e0 }
            int r7 = r7.mo145571e()     // Catch:{ b -> 0x01e0 }
            int r5 = r5 - r7
            int r5 = r5 * r16
            float r5 = (float) r5     // Catch:{ b -> 0x01e0 }
            int r7 = r10.f307396q     // Catch:{ b -> 0x01e0 }
            float r7 = (float) r7     // Catch:{ b -> 0x01e0 }
            float r5 = r5 + r7
            b0.l0 r7 = r10.f307394o     // Catch:{ b -> 0x01e0 }
            int r7 = r7.mo145572f()     // Catch:{ b -> 0x01e0 }
            float r7 = (float) r7     // Catch:{ b -> 0x01e0 }
            float r5 = r5 - r7
            float r7 = java.lang.Math.abs(r5)     // Catch:{ b -> 0x01e0 }
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fc
            goto L_0x0101
        L_0x00fc:
            if (r0 == 0) goto L_0x0100
            r8 = r14
            goto L_0x0102
        L_0x0100:
            float r5 = -r14
        L_0x0101:
            r8 = r5
        L_0x0102:
            T r5 = r12.f27484d     // Catch:{ b -> 0x01e0 }
            r25 = r5
            w.j r25 = (p257w.C111647j) r25     // Catch:{ b -> 0x01e0 }
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r33 = 30
            r34 = 0
            w.j r5 = p257w.C111651k.m152178b(r25, r26, r27, r28, r30, r32, r33, r34)     // Catch:{ b -> 0x01e0 }
            r12.f27484d = r5     // Catch:{ b -> 0x01e0 }
            gy3.c0 r5 = new gy3.c0     // Catch:{ b -> 0x01e0 }
            r5.<init>()     // Catch:{ b -> 0x01e0 }
            T r7 = r12.f27484d     // Catch:{ b -> 0x01e0 }
            r19 = r7
            w.j r19 = (p257w.C111647j) r19     // Catch:{ b -> 0x01e0 }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ b -> 0x01e0 }
            r7.<init>(r8)     // Catch:{ b -> 0x01e0 }
            r20 = 0
            T r4 = r12.f27484d     // Catch:{ b -> 0x01e0 }
            w.j r4 = (p257w.C111647j) r4     // Catch:{ b -> 0x01e0 }
            w.k1<T, V> r6 = r4.f334234d     // Catch:{ b -> 0x01e0 }
            fy3.l r6 = r6.mo61400b()     // Catch:{ b -> 0x01e0 }
            V r4 = r4.f334236f     // Catch:{ b -> 0x01e0 }
            java.lang.Object r4 = r6.invoke(r4)     // Catch:{ b -> 0x01e0 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ b -> 0x01e0 }
            float r4 = r4.floatValue()     // Catch:{ b -> 0x01e0 }
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x014a
            r4 = 1
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            if (r4 != 0) goto L_0x014f
            r4 = 1
            goto L_0x0150
        L_0x014f:
            r4 = 0
        L_0x0150:
            b0.j0$a r6 = new b0.j0$a     // Catch:{ b -> 0x01e0 }
            if (r0 == 0) goto L_0x0157
            r16 = 1
            goto L_0x0159
        L_0x0157:
            r16 = 0
        L_0x0159:
            int r3 = r10.f307395p     // Catch:{ b -> 0x01e0 }
            b0.l0 r1 = r10.f307394o     // Catch:{ b -> 0x01e0 }
            r28 = r2
            int r2 = r10.f307396q     // Catch:{ b -> 0x01dc }
            r21 = r7
            r7 = r6
            r37 = r9
            r9 = r5
            r5 = r10
            r10 = r37
            r29 = r11
            r30 = r12
            r12 = r16
            r31 = r13
            r13 = r15
            r22 = r6
            r6 = r14
            r14 = r31
            r23 = r4
            r4 = r15
            r15 = r3
            r16 = r1
            r17 = r2
            r18 = r30
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ b -> 0x01d8 }
            r1 = 2
            r2 = 0
            r12 = r37
            r5.f307393n = r12     // Catch:{ b -> 0x01d4 }
            r8 = r29
            r5.f307386d = r8     // Catch:{ b -> 0x01d4 }
            r9 = r30
            r5.f307387e = r9     // Catch:{ b -> 0x01d4 }
            r11 = r31
            r5.f307388f = r11     // Catch:{ b -> 0x01d4 }
            r5.f307389g = r6     // Catch:{ b -> 0x01d4 }
            r5.f307390h = r4     // Catch:{ b -> 0x01d4 }
            r5.f307391i = r0     // Catch:{ b -> 0x01d4 }
            r3 = 1
            r5.f307392j = r3     // Catch:{ b -> 0x01d4 }
            r16 = r19
            r17 = r21
            r18 = r20
            r19 = r23
            r20 = r22
            r21 = r5
            r22 = r1
            r23 = r2
            java.lang.Object r1 = p257w.C111671y0.m152195c(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ b -> 0x01d4 }
            r2 = r28
            if (r1 != r2) goto L_0x01b9
            return r2
        L_0x01b9:
            r15 = r4
            r10 = r5
            r14 = r6
            r13 = r11
            r11 = r8
            r35 = r12
            r12 = r9
            r9 = r35
        L_0x01c3:
            int r1 = r13.f27483d     // Catch:{ b -> 0x01d0 }
            r3 = 1
            int r1 = r1 + r3
            r13.f27483d = r1     // Catch:{ b -> 0x01d0 }
            r1 = r36
            r3 = 0
            r4 = 2
            r6 = 1
            goto L_0x00a3
        L_0x01d0:
            r0 = move-exception
            r12 = r9
            r1 = r10
            goto L_0x01f2
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            r2 = r28
            goto L_0x01e3
        L_0x01d8:
            r0 = move-exception
            r12 = r37
            goto L_0x01d5
        L_0x01dc:
            r0 = move-exception
            r12 = r9
            r5 = r10
            goto L_0x01d5
        L_0x01e0:
            r0 = move-exception
            r12 = r9
            r5 = r10
        L_0x01e3:
            r1 = r5
            goto L_0x01f2
        L_0x01e5:
            b0.b r0 = new b0.b     // Catch:{ b -> 0x01ef }
            T r1 = r9.f27484d     // Catch:{ b -> 0x01ef }
            w.j r1 = (p257w.C111647j) r1     // Catch:{ b -> 0x01ef }
            r0.<init>(r10, r1)     // Catch:{ b -> 0x01ef }
            throw r0     // Catch:{ b -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            r1 = r36
        L_0x01f2:
            w.j<java.lang.Float, w.l> r13 = r0.f307322e
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 30
            r22 = 0
            w.j r3 = p257w.C111651k.m152178b(r13, r14, r15, r16, r18, r20, r21, r22)
            b0.k r0 = r0.f307321d
            int r0 = r0.getOffset()
            int r4 = r1.f307396q
            int r0 = r0 + r4
            float r0 = (float) r0
            gy3.c0 r4 = new gy3.c0
            r4.<init>()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r0)
            r6 = 0
            w.k1<T, V> r7 = r3.f334234d
            fy3.l r7 = r7.mo61400b()
            V r8 = r3.f334236f
            java.lang.Object r7 = r7.invoke(r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0234
            r7 = 1
            r24 = 1
            goto L_0x0237
        L_0x0234:
            r7 = 1
            r24 = 0
        L_0x0237:
            r7 = r24 ^ 1
            b0.j0$b r8 = new b0.j0$b
            r8.<init>(r0, r4, r12)
            r9 = 2
            r10 = 0
            r0 = 0
            r1.f307393n = r0
            r1.f307386d = r0
            r1.f307387e = r0
            r1.f307388f = r0
            r4 = 2
            r1.f307392j = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            java.lang.Object r0 = p257w.C111671y0.m152195c(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L_0x0258
            return r2
        L_0x0258:
            b0.l0 r0 = r1.f307394o
            int r2 = r1.f307395p
            int r1 = r1.f307396q
            r0.mo145574i(r2, r1)
        L_0x0261:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004b0.C103948j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
