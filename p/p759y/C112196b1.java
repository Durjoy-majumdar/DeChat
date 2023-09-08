package p759y;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p175j0.C60667k2;
import p560i2.C108330s;
import p560i2.C108331t;
import p582k1.C108796a;
import p582k1.C108797b;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y.b1 */
public final class C112196b1 {

    /* renamed from: a */
    public final C112218f0 f335910a;

    /* renamed from: b */
    public final boolean f335911b;

    /* renamed from: c */
    public final C60667k2<C108797b> f335912c;

    /* renamed from: d */
    public final C112302z0 f335913d;

    /* renamed from: e */
    public final C112195b0 f335914e;

    /* renamed from: f */
    public final C112241i0 f335915f;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollingLogic", mo125469f = "Scrollable.kt", mo125470l = {345}, mo125471m = "doFlingAnimation-QWom1Mo")
    /* renamed from: y.b1$a */
    public static final class C112197a extends C66704d {

        /* renamed from: d */
        public Object f335916d;

        /* renamed from: e */
        public /* synthetic */ Object f335917e;

        /* renamed from: f */
        public final /* synthetic */ C112196b1 f335918f;

        /* renamed from: g */
        public int f335919g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112197a(C112196b1 b1Var, C15601d<? super C112197a> dVar) {
            super(dVar);
            this.f335918f = b1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335917e = obj;
            this.f335919g |= Integer.MIN_VALUE;
            return this.f335918f.mo164020b(0, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", mo125469f = "Scrollable.kt", mo125470l = {358}, mo125471m = "invokeSuspend")
    /* renamed from: y.b1$b */
    public static final class C112198b extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f335920d;

        /* renamed from: e */
        public Object f335921e;

        /* renamed from: f */
        public long f335922f;

        /* renamed from: g */
        public int f335923g;

        /* renamed from: h */
        public /* synthetic */ Object f335924h;

        /* renamed from: i */
        public final /* synthetic */ C112196b1 f335925i;

        /* renamed from: j */
        public final /* synthetic */ C45983e0 f335926j;

        /* renamed from: n */
        public final /* synthetic */ long f335927n;

        /* renamed from: y.b1$b$a */
        public static final class C112199a extends C87413o implements C32226l<C112539e, C112539e> {

            /* renamed from: d */
            public final /* synthetic */ C112196b1 f335928d;

            /* renamed from: e */
            public final /* synthetic */ C112278q0 f335929e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112199a(C112196b1 b1Var, C112278q0 q0Var) {
                super(1);
                this.f335928d = b1Var;
                this.f335929e = q0Var;
            }

            public Object invoke(Object obj) {
                long j = ((C112539e) obj).f336959a;
                C112196b1 b1Var = this.f335928d;
                long a = b1Var.mo164019a(this.f335929e, b1Var.f335911b ? C112539e.m153743h(j, -1.0f) : j, (C112539e) null, 2);
                if (this.f335928d.f335911b) {
                    a = C112539e.m153743h(a, -1.0f);
                }
                return new C112539e(C112539e.m153741f(j, a));
            }
        }

        /* renamed from: y.b1$b$b */
        public static final class C112200b implements C112278q0 {

            /* renamed from: a */
            public final /* synthetic */ C112196b1 f335930a;

            /* renamed from: b */
            public final /* synthetic */ C32226l<C112539e, C112539e> f335931b;

            public C112200b(C112196b1 b1Var, C32226l<? super C112539e, C112539e> lVar) {
                this.f335930a = b1Var;
                this.f335931b = lVar;
            }

            /* renamed from: a */
            public float mo90555a(float f) {
                C112196b1 b1Var = this.f335930a;
                return b1Var.mo164022d(this.f335931b.invoke(new C112539e(b1Var.mo164023e(f))).f336959a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112198b(C112196b1 b1Var, C45983e0 e0Var, long j, C15601d<? super C112198b> dVar) {
            super(2, dVar);
            this.f335925i = b1Var;
            this.f335926j = e0Var;
            this.f335927n = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112198b bVar = new C112198b(this.f335925i, this.f335926j, this.f335927n, dVar);
            bVar.f335924h = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112198b) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C112196b1 b1Var;
            long j;
            C112196b1 b1Var2;
            C45983e0 e0Var;
            int i;
            float f;
            float f2;
            C112218f0 f0Var = C112218f0.Horizontal;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f335923g;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C112199a aVar2 = new C112199a(this.f335925i, (C112278q0) this.f335924h);
                C112196b1 b1Var3 = this.f335925i;
                C112200b bVar = new C112200b(b1Var3, aVar2);
                C45983e0 e0Var2 = this.f335926j;
                long j2 = this.f335927n;
                C112195b0 b0Var = b1Var3.f335914e;
                long j3 = e0Var2.f124000d;
                float b = b1Var3.f335910a == f0Var ? C108330s.m146746b(j2) : C108330s.m146747c(j2);
                if (b1Var3.f335911b) {
                    b *= (float) -1;
                }
                this.f335924h = b1Var3;
                this.f335920d = b1Var3;
                this.f335921e = e0Var2;
                this.f335922f = j3;
                this.f335923g = 1;
                obj = b0Var.mo163922a(bVar, b, this);
                if (obj == aVar) {
                    return aVar;
                }
                e0Var = e0Var2;
                b1Var2 = b1Var3;
                b1Var = b1Var2;
                j = j3;
            } else if (i2 == 1) {
                long j4 = this.f335922f;
                b1Var = (C112196b1) this.f335924h;
                ResultKt.throwOnFailure(obj);
                long j5 = j4;
                e0Var = (C45983e0) this.f335921e;
                b1Var2 = (C112196b1) this.f335920d;
                j = j5;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float floatValue = ((Number) obj).floatValue();
            if (b1Var.f335911b) {
                floatValue *= (float) -1;
            }
            if (b1Var2.f335910a == f0Var) {
                f2 = floatValue;
                f = 0.0f;
                i = 2;
            } else {
                f = floatValue;
                f2 = 0.0f;
                i = 1;
            }
            e0Var.f124000d = C108330s.m146745a(j, f2, f, i, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollingLogic", mo125469f = "Scrollable.kt", mo125470l = {333, 335, 337}, mo125471m = "onDragStopped")
    /* renamed from: y.b1$c */
    public static final class C112201c extends C66704d {

        /* renamed from: d */
        public Object f335932d;

        /* renamed from: e */
        public long f335933e;

        /* renamed from: f */
        public /* synthetic */ Object f335934f;

        /* renamed from: g */
        public final /* synthetic */ C112196b1 f335935g;

        /* renamed from: h */
        public int f335936h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112201c(C112196b1 b1Var, C15601d<? super C112201c> dVar) {
            super(dVar);
            this.f335935g = b1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335934f = obj;
            this.f335936h |= Integer.MIN_VALUE;
            return this.f335935g.mo164021c(0.0f, this);
        }
    }

    public C112196b1(C112218f0 f0Var, boolean z, C60667k2<C108797b> k2Var, C112302z0 z0Var, C112195b0 b0Var, C112241i0 i0Var) {
        C87412m.m108594g(f0Var, "orientation");
        C87412m.m108594g(k2Var, "nestedScrollDispatcher");
        C87412m.m108594g(z0Var, "scrollableState");
        C87412m.m108594g(b0Var, "flingBehavior");
        this.f335910a = f0Var;
        this.f335911b = z;
        this.f335912c = k2Var;
        this.f335913d = z0Var;
        this.f335914e = b0Var;
        this.f335915f = i0Var;
    }

    /* renamed from: a */
    public final long mo164019a(C112278q0 q0Var, long j, C112539e eVar, int i) {
        long j2;
        C112278q0 q0Var2 = q0Var;
        long j3 = j;
        int i2 = i;
        C87412m.m108594g(q0Var, "$this$dispatchScroll");
        C112241i0 i0Var = this.f335915f;
        if (i0Var != null) {
            j2 = i0Var.mo164003b(j3, eVar, i2);
        } else {
            C112539e eVar2 = eVar;
            j2 = C112539e.f336955b;
        }
        long f = C112539e.m153741f(j3, j2);
        C108797b value = this.f335912c.getValue();
        C108796a aVar = value.f325790c;
        long f2 = C112539e.m153741f(f, aVar != null ? aVar.mo159898e(f, i2) : C112539e.f336955b);
        long e = mo164023e(q0Var.mo90555a(mo164022d(this.f335911b ? C112539e.m153743h(f2, -1.0f) : f2)));
        if (this.f335911b) {
            e = C112539e.m153743h(e, -1.0f);
        }
        long j4 = e;
        long f3 = C112539e.m153741f(f2, j4);
        long b = value.mo159901b(j4, f3, i);
        C112241i0 i0Var2 = this.f335915f;
        if (i0Var2 != null) {
            i0Var2.mo164004c(f2, C112539e.m153741f(f3, b), eVar, i);
        }
        return f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164020b(long r13, wx3.C15601d<? super p560i2.C108330s> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p759y.C112196b1.C112197a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            y.b1$a r0 = (p759y.C112196b1.C112197a) r0
            int r1 = r0.f335919g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335919g = r1
            goto L_0x0018
        L_0x0013:
            y.b1$a r0 = new y.b1$a
            r0.<init>(r12, r15)
        L_0x0018:
            r4 = r0
            java.lang.Object r15 = r4.f335917e
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r4.f335919g
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            java.lang.Object r13 = r4.f335916d
            gy3.e0 r13 = (gy3.C45983e0) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r15)
            gy3.e0 r15 = new gy3.e0
            r15.<init>()
            r15.f124000d = r13
            y.z0 r1 = r12.f335913d
            r3 = 0
            y.b1$b r11 = new y.b1$b
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f335916d = r15
            r4.f335919g = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = p759y.C112302z0.C112303a.m153183a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r13 = r15
        L_0x005b:
            long r13 = r13.f124000d
            i2.s r15 = new i2.s
            r15.<init>(r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112196b1.mo164020b(long, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164021c(float r11, wx3.C15601d<? super rx3.C13598b0> r12) {
        /*
            r10 = this;
            y.f0 r0 = p759y.C112218f0.Horizontal
            boolean r1 = r12 instanceof p759y.C112196b1.C112201c
            if (r1 == 0) goto L_0x0015
            r1 = r12
            y.b1$c r1 = (p759y.C112196b1.C112201c) r1
            int r2 = r1.f335936h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f335936h = r2
            goto L_0x001a
        L_0x0015:
            y.b1$c r1 = new y.b1$c
            r1.<init>(r10, r12)
        L_0x001a:
            r7 = r1
            java.lang.Object r12 = r7.f335934f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r7.f335936h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0049
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            long r1 = r7.f335933e
            java.lang.Object r11 = r7.f335932d
            y.b1 r11 = (p759y.C112196b1) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00c5
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003f:
            long r4 = r7.f335933e
            java.lang.Object r11 = r7.f335932d
            y.b1 r11 = (p759y.C112196b1) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00a4
        L_0x0049:
            long r5 = r7.f335933e
            java.lang.Object r11 = r7.f335932d
            y.b1 r11 = (p759y.C112196b1) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x008e
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r12)
            y.i0 r12 = r10.f335915f
            if (r12 == 0) goto L_0x0070
            long r8 = r10.mo164024f(r11)
            long r8 = r12.mo164007f(r8)
            y.f0 r12 = r10.f335910a
            if (r12 != r0) goto L_0x006b
            float r12 = p560i2.C108330s.m146746b(r8)
            goto L_0x0071
        L_0x006b:
            float r12 = p560i2.C108330s.m146747c(r8)
            goto L_0x0071
        L_0x0070:
            r12 = 0
        L_0x0071:
            float r11 = r11 - r12
            long r11 = r10.mo164024f(r11)
            j0.k2<k1.b> r2 = r10.f335912c
            java.lang.Object r2 = r2.getValue()
            k1.b r2 = (p582k1.C108797b) r2
            r7.f335932d = r10
            r7.f335933e = r11
            r7.f335936h = r5
            java.lang.Object r2 = r2.mo159902c(r11, r7)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r5 = r11
            r12 = r2
            r11 = r10
        L_0x008e:
            i2.s r12 = (p560i2.C108330s) r12
            long r8 = r12.f324356a
            long r5 = p560i2.C108330s.m146748d(r5, r8)
            r7.f335932d = r11
            r7.f335933e = r5
            r7.f335936h = r4
            java.lang.Object r12 = r11.mo164020b(r5, r7)
            if (r12 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r4 = r5
        L_0x00a4:
            i2.s r12 = (p560i2.C108330s) r12
            long r8 = r12.f324356a
            j0.k2<k1.b> r12 = r11.f335912c
            java.lang.Object r12 = r12.getValue()
            r2 = r12
            k1.b r2 = (p582k1.C108797b) r2
            long r4 = p560i2.C108330s.m146748d(r4, r8)
            r7.f335932d = r11
            r7.f335933e = r8
            r7.f335936h = r3
            r3 = r4
            r5 = r8
            java.lang.Object r12 = r2.mo159900a(r3, r5, r7)
            if (r12 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r1 = r8
        L_0x00c5:
            i2.s r12 = (p560i2.C108330s) r12
            long r3 = r12.f324356a
            long r1 = p560i2.C108330s.m146748d(r1, r3)
            y.i0 r12 = r11.f335915f
            if (r12 == 0) goto L_0x00e5
            y.f0 r3 = r11.f335910a
            if (r3 != r0) goto L_0x00da
            float r0 = p560i2.C108330s.m146746b(r1)
            goto L_0x00de
        L_0x00da:
            float r0 = p560i2.C108330s.m146747c(r1)
        L_0x00de:
            long r0 = r11.mo164024f(r0)
            r12.mo164005d(r0)
        L_0x00e5:
            y.i0 r11 = r11.f335915f
            if (r11 == 0) goto L_0x00ec
            r11.release()
        L_0x00ec:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112196b1.mo164021c(float, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final float mo164022d(long j) {
        return this.f335910a == C112218f0.Horizontal ? C112539e.m153738c(j) : C112539e.m153739d(j);
    }

    /* renamed from: e */
    public final long mo164023e(float f) {
        if (!(f == 0.0f)) {
            return this.f335910a == C112218f0.Horizontal ? C112540f.m153745a(f, 0.0f) : C112540f.m153745a(0.0f, f);
        }
        int i = C112539e.f336958e;
        return C112539e.f336955b;
    }

    /* renamed from: f */
    public final long mo164024f(float f) {
        return this.f335910a == C112218f0.Horizontal ? C108331t.m146750a(f, 0.0f) : C108331t.m146750a(0.0f, f);
    }
}
