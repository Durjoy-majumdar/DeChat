package p247u3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import p247u3.C65060g0;
import p247u3.C65086n0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PageFetcher$injectRemoteEvents$1", mo125469f = "PageFetcher.kt", mo125470l = {253}, mo125471m = "invokeSuspend")
/* renamed from: u3.p0 */
public final class C65114p0 extends C91594j implements C32227p<C65189w1<C65086n0<Object>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187414d;

    /* renamed from: e */
    public int f187415e;

    /* renamed from: f */
    public final /* synthetic */ C65125q0 f187416f;

    @C91590f(mo125468c = "androidx.paging.PageFetcher$injectRemoteEvents$1$1", mo125469f = "PageFetcher.kt", mo125470l = {140}, mo125471m = "invokeSuspend")
    /* renamed from: u3.p0$a */
    public static final class C65115a extends C91594j implements C32228q<C65069i0, C65060g0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187417d;

        /* renamed from: e */
        public /* synthetic */ Object f187418e;

        /* renamed from: f */
        public int f187419f;

        /* renamed from: g */
        public final /* synthetic */ C65189w1 f187420g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65115a(C65189w1 w1Var, C15601d dVar) {
            super(3, dVar);
            this.f187420g = w1Var;
        }

        /* renamed from: f */
        public final Object invoke(C65069i0 i0Var, C65060g0 g0Var, C15601d<? super C13598b0> dVar) {
            C87412m.m108594g(i0Var, "type");
            C87412m.m108594g(g0Var, "state");
            C87412m.m108594g(dVar, "continuation");
            C65115a aVar = new C65115a(this.f187420g, dVar);
            aVar.f187417d = i0Var;
            aVar.f187418e = g0Var;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187419f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65069i0 i0Var = (C65069i0) this.f187417d;
                C65060g0 g0Var = (C65060g0) this.f187418e;
                C87412m.m108594g(g0Var, "loadState");
                if (!(g0Var instanceof C65060g0.C65062b)) {
                    boolean z = g0Var instanceof C65060g0.C65061a;
                }
                C65189w1 w1Var = this.f187420g;
                C65086n0.C65091c cVar = new C65086n0.C65091c(i0Var, true, g0Var);
                this.f187417d = null;
                this.f187419f = 1;
                if (w1Var.mo75536o(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2", mo125469f = "PageFetcher.kt", mo125470l = {253}, mo125471m = "invokeSuspend")
    /* renamed from: u3.p0$b */
    public static final class C65116b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f187421d;

        /* renamed from: e */
        public final /* synthetic */ C65114p0 f187422e;

        /* renamed from: f */
        public final /* synthetic */ C65080m0 f187423f;

        /* renamed from: g */
        public final /* synthetic */ C65115a f187424g;

        /* renamed from: u3.p0$b$a */
        public static final class C65117a implements C45253g<C65066h0> {

            /* renamed from: d */
            public final /* synthetic */ C65116b f187425d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0 f187426e;

            @C91590f(mo125468c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1", mo125469f = "PageFetcher.kt", mo125470l = {135, 139, 143}, mo125471m = "emit")
            /* renamed from: u3.p0$b$a$a */
            public static final class C65118a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f187427d;

                /* renamed from: e */
                public int f187428e;

                /* renamed from: f */
                public final /* synthetic */ C65117a f187429f;

                /* renamed from: g */
                public Object f187430g;

                /* renamed from: h */
                public Object f187431h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65118a(C65117a aVar, C15601d dVar) {
                    super(dVar);
                    this.f187429f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f187427d = obj;
                    this.f187428e |= Integer.MIN_VALUE;
                    return this.f187429f.emit((Object) null, this);
                }
            }

            public C65117a(C65116b bVar, C8479f0 f0Var) {
                this.f187425d = bVar;
                this.f187426e = f0Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof p247u3.C65114p0.C65116b.C65117a.C65118a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    u3.p0$b$a$a r0 = (p247u3.C65114p0.C65116b.C65117a.C65118a) r0
                    int r1 = r0.f187428e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f187428e = r1
                    goto L_0x0018
                L_0x0013:
                    u3.p0$b$a$a r0 = new u3.p0$b$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f187427d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f187428e
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L_0x0056
                    if (r2 == r5) goto L_0x004a
                    if (r2 == r4) goto L_0x003e
                    if (r2 != r3) goto L_0x0036
                    java.lang.Object r9 = r0.f187431h
                    u3.h0 r9 = (p247u3.C65066h0) r9
                    java.lang.Object r0 = r0.f187430g
                    u3.p0$b$a r0 = (p247u3.C65114p0.C65116b.C65117a) r0
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L_0x00ea
                L_0x0036:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x003e:
                    java.lang.Object r9 = r0.f187431h
                    u3.h0 r9 = (p247u3.C65066h0) r9
                    java.lang.Object r2 = r0.f187430g
                    u3.p0$b$a r2 = (p247u3.C65114p0.C65116b.C65117a) r2
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L_0x00ba
                L_0x004a:
                    java.lang.Object r9 = r0.f187431h
                    u3.h0 r9 = (p247u3.C65066h0) r9
                    java.lang.Object r2 = r0.f187430g
                    u3.p0$b$a r2 = (p247u3.C65114p0.C65116b.C65117a) r2
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L_0x008b
                L_0x0056:
                    kotlin.ResultKt.throwOnFailure(r10)
                    u3.h0 r9 = (p247u3.C65066h0) r9
                    gy3.f0 r10 = r8.f187426e
                    T r10 = r10.f27484d
                    u3.h0 r10 = (p247u3.C65066h0) r10
                    u3.g0 r10 = r10.f187269a
                    u3.g0 r2 = r9.f187269a
                    boolean r10 = gy3.C87412m.m108589b(r10, r2)
                    r10 = r10 ^ r5
                    if (r10 == 0) goto L_0x008a
                    u3.p0$b r10 = r8.f187425d
                    u3.m0 r10 = r10.f187423f
                    u3.i0 r2 = p247u3.C65069i0.REFRESH
                    u3.g0 r6 = r9.f187269a
                    r10.mo89279b(r2, r5, r6)
                    u3.p0$b r10 = r8.f187425d
                    u3.p0$a r10 = r10.f187424g
                    u3.g0 r6 = r9.f187269a
                    r0.f187430g = r8
                    r0.f187431h = r9
                    r0.f187428e = r5
                    java.lang.Object r10 = r10.invoke(r2, r6, r0)
                    if (r10 != r1) goto L_0x008a
                    return r1
                L_0x008a:
                    r2 = r8
                L_0x008b:
                    gy3.f0 r10 = r2.f187426e
                    T r10 = r10.f27484d
                    u3.h0 r10 = (p247u3.C65066h0) r10
                    u3.g0 r10 = r10.f187270b
                    u3.g0 r6 = r9.f187270b
                    boolean r10 = gy3.C87412m.m108589b(r10, r6)
                    r10 = r10 ^ r5
                    if (r10 == 0) goto L_0x00ba
                    u3.p0$b r10 = r2.f187425d
                    u3.m0 r10 = r10.f187423f
                    u3.i0 r6 = p247u3.C65069i0.PREPEND
                    u3.g0 r7 = r9.f187270b
                    r10.mo89279b(r6, r5, r7)
                    u3.p0$b r10 = r2.f187425d
                    u3.p0$a r10 = r10.f187424g
                    u3.g0 r7 = r9.f187270b
                    r0.f187430g = r2
                    r0.f187431h = r9
                    r0.f187428e = r4
                    java.lang.Object r10 = r10.invoke(r6, r7, r0)
                    if (r10 != r1) goto L_0x00ba
                    return r1
                L_0x00ba:
                    gy3.f0 r10 = r2.f187426e
                    T r10 = r10.f27484d
                    u3.h0 r10 = (p247u3.C65066h0) r10
                    u3.g0 r10 = r10.f187271c
                    u3.g0 r4 = r9.f187271c
                    boolean r10 = gy3.C87412m.m108589b(r10, r4)
                    r10 = r10 ^ r5
                    if (r10 == 0) goto L_0x00eb
                    u3.p0$b r10 = r2.f187425d
                    u3.m0 r10 = r10.f187423f
                    u3.i0 r4 = p247u3.C65069i0.APPEND
                    u3.g0 r6 = r9.f187271c
                    r10.mo89279b(r4, r5, r6)
                    u3.p0$b r10 = r2.f187425d
                    u3.p0$a r10 = r10.f187424g
                    u3.g0 r5 = r9.f187271c
                    r0.f187430g = r2
                    r0.f187431h = r9
                    r0.f187428e = r3
                    java.lang.Object r10 = r10.invoke(r4, r5, r0)
                    if (r10 != r1) goto L_0x00e9
                    return r1
                L_0x00e9:
                    r0 = r2
                L_0x00ea:
                    r2 = r0
                L_0x00eb:
                    gy3.f0 r10 = r2.f187426e
                    r10.f27484d = r9
                    rx3.b0 r9 = rx3.C13598b0.f38549a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65114p0.C65116b.C65117a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65116b(C65114p0 p0Var, C65080m0 m0Var, C65115a aVar, C15601d dVar) {
            super(2, dVar);
            this.f187422e = p0Var;
            this.f187423f = m0Var;
            this.f187424g = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65116b(this.f187422e, this.f187423f, this.f187424g, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65116b) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.f187421d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0 f0Var = new C8479f0();
                C65066h0 h0Var = C65066h0.f187268d;
                f0Var.f27484d = C65066h0.f187268d;
                this.f187422e.getClass();
                throw null;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: u3.p0$c */
    public static final class C65119c implements C45253g<C65086n0<Object>> {

        /* renamed from: d */
        public final /* synthetic */ C65114p0 f187432d;

        /* renamed from: e */
        public final /* synthetic */ C65189w1 f187433e;

        /* renamed from: f */
        public final /* synthetic */ C65080m0 f187434f;

        @C91590f(mo125468c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1", mo125469f = "PageFetcher.kt", mo125470l = {139, 147, 155}, mo125471m = "emit")
        /* renamed from: u3.p0$c$a */
        public static final class C65120a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187435d;

            /* renamed from: e */
            public int f187436e;

            /* renamed from: f */
            public final /* synthetic */ C65119c f187437f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65120a(C65119c cVar, C15601d dVar) {
                super(dVar);
                this.f187437f = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187435d = obj;
                this.f187436e |= Integer.MIN_VALUE;
                return this.f187437f.emit((Object) null, this);
            }
        }

        public C65119c(C65114p0 p0Var, C65189w1 w1Var, C65080m0 m0Var) {
            this.f187432d = p0Var;
            this.f187433e = w1Var;
            this.f187434f = m0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p247u3.C65114p0.C65119c.C65120a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                u3.p0$c$a r0 = (p247u3.C65114p0.C65119c.C65120a) r0
                int r1 = r0.f187436e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187436e = r1
                goto L_0x0018
            L_0x0013:
                u3.p0$c$a r0 = new u3.p0$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f187435d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187436e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0036
                if (r2 == r5) goto L_0x0032
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                goto L_0x0032
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0078
            L_0x0036:
                kotlin.ResultKt.throwOnFailure(r8)
                u3.n0 r7 = (p247u3.C65086n0) r7
                boolean r8 = r7 instanceof p247u3.C65086n0.C65088b
                if (r8 != 0) goto L_0x007b
                boolean r8 = r7 instanceof p247u3.C65086n0.C65087a
                if (r8 == 0) goto L_0x005b
                u3.m0 r8 = r6.f187434f
                r2 = r7
                u3.n0$a r2 = (p247u3.C65086n0.C65087a) r2
                u3.i0 r2 = r2.f187321a
                r3 = 0
                u3.g0$c r5 = p247u3.C65060g0.C65063c.f187265c
                r8.mo89279b(r2, r3, r5)
                u3.w1 r8 = r6.f187433e
                r0.f187436e = r4
                java.lang.Object r7 = r8.mo75536o(r7, r0)
                if (r7 != r1) goto L_0x0078
                return r1
            L_0x005b:
                boolean r8 = r7 instanceof p247u3.C65086n0.C65091c
                if (r8 == 0) goto L_0x0078
                u3.m0 r8 = r6.f187434f
                r2 = r7
                u3.n0$c r2 = (p247u3.C65086n0.C65091c) r2
                u3.i0 r4 = r2.f187349a
                boolean r5 = r2.f187350b
                u3.g0 r2 = r2.f187351c
                r8.mo89279b(r4, r5, r2)
                u3.w1 r8 = r6.f187433e
                r0.f187436e = r3
                java.lang.Object r7 = r8.mo75536o(r7, r0)
                if (r7 != r1) goto L_0x0078
                return r1
            L_0x0078:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            L_0x007b:
                u3.n0$b r7 = (p247u3.C65086n0.C65088b) r7
                u3.m r7 = r7.f187331e
                u3.h0 r7 = r7.f187307d
                u3.p0 r7 = r6.f187432d
                r7.getClass()
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65114p0.C65119c.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65114p0(C65125q0 q0Var, C65171t1 t1Var, C15601d dVar) {
        super(2, dVar);
        this.f187416f = q0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65114p0 p0Var = new C65114p0(this.f187416f, (C65171t1) null, dVar);
        p0Var.f187414d = obj;
        return p0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65114p0) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187415e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65189w1 w1Var = (C65189w1) this.f187414d;
            C65080m0 m0Var = new C65080m0();
            C53895h.m60466d(w1Var, (C66212f) null, (C53934p0) null, new C65116b(this, m0Var, new C65115a(w1Var, (C15601d) null), (C15601d) null), 3, (Object) null);
            C45252f<C65086n0<Value>> fVar = this.f187416f.f187460g;
            C65119c cVar = new C65119c(this, w1Var, m0Var);
            this.f187415e = 1;
            if (fVar.mo31880a(cVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
