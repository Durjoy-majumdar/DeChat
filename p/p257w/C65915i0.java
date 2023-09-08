package p257w;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p410k0.C108793e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: w.i0 */
public final class C65915i0 {

    /* renamed from: a */
    public final C108793e<C65920a<?, ?>> f189487a = new C108793e<>(new C65920a[16], 0);

    /* renamed from: b */
    public final C60690y0 f189488b = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);

    /* renamed from: c */
    public long f189489c = Long.MIN_VALUE;

    /* renamed from: d */
    public final C60690y0 f189490d = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);

    @C91590f(mo125468c = "androidx.compose.animation.core.InfiniteTransition$run$1", mo125469f = "InfiniteTransition.kt", mo125470l = {147, 169}, mo125471m = "invokeSuspend")
    /* renamed from: w.i0$b */
    public static final class C65916b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f189491d;

        /* renamed from: e */
        public int f189492e;

        /* renamed from: f */
        public /* synthetic */ Object f189493f;

        /* renamed from: g */
        public final /* synthetic */ C65915i0 f189494g;

        @C91590f(mo125468c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", mo125469f = "InfiniteTransition.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: w.i0$b$c */
        public static final class C37904c extends C91594j implements C32227p<Float, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public /* synthetic */ float f100317d;

            public C37904c(C15601d<? super C37904c> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C37904c cVar = new C37904c(dVar);
                cVar.f100317d = ((Number) obj).floatValue();
                return cVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C37904c) create(Float.valueOf(((Number) obj).floatValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return Boolean.valueOf(this.f100317d > 0.0f);
            }
        }

        /* renamed from: w.i0$b$a */
        public static final class C65917a extends C87413o implements C32226l<Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C65915i0 f189495d;

            /* renamed from: e */
            public final /* synthetic */ C59741c0 f189496e;

            /* renamed from: f */
            public final /* synthetic */ C0000n0 f189497f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65917a(C65915i0 i0Var, C59741c0 c0Var, C0000n0 n0Var) {
                super(1);
                this.f189495d = i0Var;
                this.f189496e = c0Var;
                this.f189497f = n0Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
                if ((r13.f189496e.f170634d == p257w.C111671y0.m152197e(r13.f189497f.getCoroutineContext())) == false) goto L_0x0029;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Number r14 = (java.lang.Number) r14
                    long r0 = r14.longValue()
                    w.i0 r14 = r13.f189495d
                    long r2 = r14.f189489c
                    r14 = 0
                    r4 = 1
                    r5 = -9223372036854775808
                    int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r7 == 0) goto L_0x0029
                    gy3.c0 r2 = r13.f189496e
                    float r2 = r2.f170634d
                    a14.n0 r3 = r13.f189497f
                    wx3.f r3 = r3.getCoroutineContext()
                    float r3 = p257w.C111671y0.m152197e(r3)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 != 0) goto L_0x0026
                    r2 = 1
                    goto L_0x0027
                L_0x0026:
                    r2 = 0
                L_0x0027:
                    if (r2 != 0) goto L_0x004d
                L_0x0029:
                    w.i0 r2 = r13.f189495d
                    r2.f189489c = r0
                    k0.e<w.i0$a<?, ?>> r2 = r2.f189487a
                    int r3 = r2.f325786f
                    if (r3 <= 0) goto L_0x003f
                    T[] r2 = r2.f325784d
                    r5 = 0
                L_0x0036:
                    r6 = r2[r5]
                    w.i0$a r6 = (p257w.C65915i0.C65920a) r6
                    r6.f189508n = r4
                    int r5 = r5 + r4
                    if (r5 < r3) goto L_0x0036
                L_0x003f:
                    gy3.c0 r2 = r13.f189496e
                    a14.n0 r3 = r13.f189497f
                    wx3.f r3 = r3.getCoroutineContext()
                    float r3 = p257w.C111671y0.m152197e(r3)
                    r2.f170634d = r3
                L_0x004d:
                    gy3.c0 r2 = r13.f189496e
                    float r2 = r2.f170634d
                    r3 = 0
                    int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r3 != 0) goto L_0x0058
                    r3 = 1
                    goto L_0x0059
                L_0x0058:
                    r3 = 0
                L_0x0059:
                    if (r3 == 0) goto L_0x007b
                    w.i0 r0 = r13.f189495d
                    k0.e<w.i0$a<?, ?>> r0 = r0.f189487a
                    int r1 = r0.f325786f
                    if (r1 <= 0) goto L_0x00dc
                    T[] r0 = r0.f325784d
                L_0x0065:
                    r2 = r0[r14]
                    w.i0$a r2 = (p257w.C65915i0.C65920a) r2
                    w.b1<T, V> r3 = r2.f189506i
                    T r3 = r3.f100298d
                    j0.y0 r5 = r2.f189505h
                    j0.d2 r5 = (p175j0.C108494d2) r5
                    r5.setValue(r3)
                    r2.f189508n = r4
                    int r14 = r14 + 1
                    if (r14 < r1) goto L_0x0065
                    goto L_0x00dc
                L_0x007b:
                    w.i0 r3 = r13.f189495d
                    long r5 = r3.f189489c
                    long r0 = r0 - r5
                    float r0 = (float) r0
                    float r0 = r0 / r2
                    long r0 = (long) r0
                    k0.e<w.i0$a<?, ?>> r2 = r3.f189487a
                    int r5 = r2.f325786f
                    if (r5 <= 0) goto L_0x00ce
                    T[] r2 = r2.f325784d
                    r6 = 0
                    r7 = 1
                L_0x008d:
                    r8 = r2[r6]
                    w.i0$a r8 = (p257w.C65915i0.C65920a) r8
                    boolean r9 = r8.f189507j
                    if (r9 != 0) goto L_0x00c4
                    w.i0 r9 = r8.f189510p
                    j0.y0 r9 = r9.f189488b
                    java.lang.Boolean r10 = java.lang.Boolean.FALSE
                    j0.d2 r9 = (p175j0.C108494d2) r9
                    r9.setValue(r10)
                    boolean r9 = r8.f189508n
                    if (r9 == 0) goto L_0x00a8
                    r8.f189508n = r14
                    r8.f189509o = r0
                L_0x00a8:
                    long r9 = r8.f189509o
                    long r9 = r0 - r9
                    w.b1<T, V> r11 = r8.f189506i
                    java.lang.Object r11 = r11.mo61385e(r9)
                    j0.y0 r12 = r8.f189505h
                    j0.d2 r12 = (p175j0.C108494d2) r12
                    r12.setValue(r11)
                    w.b1<T, V> r11 = r8.f189506i
                    r11.getClass()
                    boolean r9 = p257w.C111636d.C37895a.m41575a(r11, r9)
                    r8.f189507j = r9
                L_0x00c4:
                    boolean r8 = r8.f189507j
                    if (r8 != 0) goto L_0x00c9
                    r7 = 0
                L_0x00c9:
                    int r6 = r6 + 1
                    if (r6 < r5) goto L_0x008d
                    goto L_0x00cf
                L_0x00ce:
                    r7 = 1
                L_0x00cf:
                    r14 = r7 ^ 1
                    j0.y0 r0 = r3.f189490d
                    java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                    j0.d2 r0 = (p175j0.C108494d2) r0
                    r0.setValue(r14)
                L_0x00dc:
                    rx3.b0 r14 = rx3.C13598b0.f38549a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: p257w.C65915i0.C65916b.C65917a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: w.i0$b$b */
        public static final class C65918b extends C87413o implements C32224a<Float> {

            /* renamed from: d */
            public final /* synthetic */ C0000n0 f189498d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65918b(C0000n0 n0Var) {
                super(0);
                this.f189498d = n0Var;
            }

            public Object invoke() {
                return Float.valueOf(C111671y0.m152197e(this.f189498d.getCoroutineContext()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65916b(C65915i0 i0Var, C15601d<? super C65916b> dVar) {
            super(2, dVar);
            this.f189494g = i0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C65916b bVar = new C65916b(this.f189494g, dVar);
            bVar.f189493f = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65916b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f189492e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r8.f189491d
                gy3.c0 r1 = (gy3.C59741c0) r1
                java.lang.Object r4 = r8.f189493f
                a14.n0 r4 = (a14.C0000n0) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                goto L_0x003f
            L_0x0019:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0021:
                java.lang.Object r1 = r8.f189491d
                gy3.c0 r1 = (gy3.C59741c0) r1
                java.lang.Object r4 = r8.f189493f
                a14.n0 r4 = (a14.C0000n0) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                r4 = r8
                goto L_0x0054
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f189493f
                a14.n0 r9 = (a14.C0000n0) r9
                gy3.c0 r1 = new gy3.c0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f170634d = r4
            L_0x003f:
                r4 = r8
            L_0x0040:
                w.i0$b$a r5 = new w.i0$b$a
                w.i0 r6 = r4.f189494g
                r5.<init>(r6, r1, r9)
                r4.f189493f = r9
                r4.f189491d = r1
                r4.f189492e = r3
                java.lang.Object r5 = p257w.C65913g0.m77652a(r5, r4)
                if (r5 != r0) goto L_0x0054
                return r0
            L_0x0054:
                float r5 = r1.f170634d
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x005d
                r5 = 1
                goto L_0x005e
            L_0x005d:
                r5 = 0
            L_0x005e:
                if (r5 == 0) goto L_0x0040
                w.i0$b$b r5 = new w.i0$b$b
                r5.<init>(r9)
                d14.f r5 = p175j0.C108500f2.m146999f(r5)
                w.i0$b$c r6 = new w.i0$b$c
                r7 = 0
                r6.<init>(r7)
                r4.f189493f = r9
                r4.f189491d = r1
                r4.f189492e = r2
                java.lang.Object r5 = d14.C58042h.m67198g(r5, r6, r4)
                if (r5 != r0) goto L_0x0040
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p257w.C65915i0.C65916b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: w.i0$c */
    public static final class C65919c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65915i0 f189499d;

        /* renamed from: e */
        public final /* synthetic */ int f189500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65919c(C65915i0 i0Var, int i) {
            super(2);
            this.f189499d = i0Var;
            this.f189500e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f189499d.mo89957a((C108504h) obj, this.f189500e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.i0$a */
    public final class C65920a<T, V extends C37919o> implements C60667k2<T> {

        /* renamed from: d */
        public T f189501d;

        /* renamed from: e */
        public T f189502e;

        /* renamed from: f */
        public final C37906k1<T, V> f189503f;

        /* renamed from: g */
        public C37901h<T> f189504g;

        /* renamed from: h */
        public final C60690y0 f189505h;

        /* renamed from: i */
        public C37893b1<T, V> f189506i;

        /* renamed from: j */
        public boolean f189507j;

        /* renamed from: n */
        public boolean f189508n;

        /* renamed from: o */
        public long f189509o;

        /* renamed from: p */
        public final /* synthetic */ C65915i0 f189510p;

        public C65920a(C65915i0 i0Var, T t, T t2, C37906k1<T, V> k1Var, C37901h<T> hVar) {
            C87412m.m108594g(k1Var, "typeConverter");
            C87412m.m108594g(hVar, "animationSpec");
            this.f189510p = i0Var;
            this.f189501d = t;
            this.f189502e = t2;
            this.f189503f = k1Var;
            this.f189504g = hVar;
            this.f189505h = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
            this.f189506i = new C37893b1(this.f189504g, k1Var, this.f189501d, this.f189502e, (C37919o) null, 16, (C8480h) null);
        }

        public T getValue() {
            return this.f189505h.getValue();
        }
    }

    /* renamed from: a */
    public final void mo89957a(C108504h hVar, int i) {
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-318043801);
        if (((Boolean) ((C108494d2) this.f189490d).getValue()).booleanValue() || ((Boolean) ((C108494d2) this.f189488b).getValue()).booleanValue()) {
            C60655g0.m70932c(this, new C65916b(this, (C15601d<? super C65916b>) null), z, 8);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C65919c(this, i));
        }
    }
}
