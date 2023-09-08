package p247u3;

import a14.C0000n0;
import a14.C53869d;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54612b0;
import c14.C54636p;
import d14.C45252f;
import d14.C45253g;
import d14.C58022c;
import d14.C58042h;
import d14.C58073o0;
import d14.C58078q;
import d14.C58083t;
import d14.C58095x0;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import p865v3.C65535g;
import rx3.C13598b0;
import sx3.C64188i0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.c */
public final class C65019c<T> {

    /* renamed from: a */
    public final C65167t<T> f187163a;

    /* renamed from: b */
    public final AtomicBoolean f187164b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C65535g<C64188i0<C65086n0<T>>> f187165c;

    /* renamed from: d */
    public final C45252f<C65086n0<T>> f187166d;

    @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {83, 117}, mo125471m = "invokeSuspend")
    /* renamed from: u3.c$a */
    public static final class C65020a extends C91594j implements C32227p<C65189w1<C65086n0<T>>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187167d;

        /* renamed from: e */
        public int f187168e;

        /* renamed from: f */
        public final /* synthetic */ C65019c f187169f;

        @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {292}, mo125471m = "invokeSuspend")
        /* renamed from: u3.c$a$a */
        public static final class C65021a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f187170d;

            /* renamed from: e */
            public final /* synthetic */ C65020a f187171e;

            /* renamed from: f */
            public final /* synthetic */ C65189w1 f187172f;

            /* renamed from: g */
            public final /* synthetic */ C65041c2 f187173g;

            /* renamed from: h */
            public final /* synthetic */ C53973z1 f187174h;

            /* renamed from: i */
            public final /* synthetic */ C8478d0 f187175i;

            @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: u3.c$a$a$a */
            public static final class C65022a extends C91594j implements C32228q<C45253g<? super C64188i0<? extends C65086n0<T>>>, Throwable, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public /* synthetic */ Object f187176d;

                public C65022a(C15601d dVar) {
                    super(3, dVar);
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Throwable th = (Throwable) obj2;
                    C15601d dVar = (C15601d) obj3;
                    C87412m.m108594g((C45253g) obj, "$this$create");
                    C87412m.m108594g(th, "throwable");
                    C87412m.m108594g(dVar, "continuation");
                    C65022a aVar = new C65022a(dVar);
                    aVar.f187176d = th;
                    return aVar.invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.f187176d;
                    if (th instanceof C54636p) {
                        return C13598b0.f38549a;
                    }
                    throw th;
                }
            }

            @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$2", mo125469f = "CachedPageEventFlow.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: u3.c$a$a$b */
            public static final class C65023b extends C91594j implements C32228q<C45253g<? super C64188i0<? extends C65086n0<T>>>, Throwable, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C65021a f187177d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65023b(C65021a aVar, C15601d dVar) {
                    super(3, dVar);
                    this.f187177d = aVar;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Throwable th = (Throwable) obj2;
                    C15601d dVar = (C15601d) obj3;
                    C87412m.m108594g((C45253g) obj, "$this$create");
                    C87412m.m108594g(dVar, "continuation");
                    return new C65023b(this.f187177d, dVar).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C54612b0.C54613a.m61404a(this.f187177d.f187173g.f187217a, (Throwable) null, 1, (Object) null);
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: u3.c$a$a$c */
            public static final class C65024c implements C45253g<C64188i0<? extends C65086n0<T>>> {

                /* renamed from: d */
                public final /* synthetic */ C65021a f187178d;

                @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {135, 138}, mo125471m = "emit")
                /* renamed from: u3.c$a$a$c$a */
                public static final class C65025a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f187179d;

                    /* renamed from: e */
                    public int f187180e;

                    /* renamed from: f */
                    public final /* synthetic */ C65024c f187181f;

                    /* renamed from: g */
                    public Object f187182g;

                    /* renamed from: h */
                    public Object f187183h;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65025a(C65024c cVar, C15601d dVar) {
                        super(dVar);
                        this.f187181f = cVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f187179d = obj;
                        this.f187180e |= Integer.MIN_VALUE;
                        return this.f187181f.emit((Object) null, this);
                    }
                }

                public C65024c(C65021a aVar) {
                    this.f187178d = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p247u3.C65019c.C65020a.C65021a.C65024c.C65025a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        u3.c$a$a$c$a r0 = (p247u3.C65019c.C65020a.C65021a.C65024c.C65025a) r0
                        int r1 = r0.f187180e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f187180e = r1
                        goto L_0x0018
                    L_0x0013:
                        u3.c$a$a$c$a r0 = new u3.c$a$a$c$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f187179d
                        xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r2 = r0.f187180e
                        r3 = 2
                        r4 = 0
                        r5 = 1
                        if (r2 == 0) goto L_0x003f
                        if (r2 == r5) goto L_0x0033
                        if (r2 != r3) goto L_0x002b
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x007a
                    L_0x002b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0033:
                        java.lang.Object r7 = r0.f187183h
                        sx3.i0 r7 = (sx3.C64188i0) r7
                        java.lang.Object r2 = r0.f187182g
                        u3.c$a$a$c r2 = (p247u3.C65019c.C65020a.C65021a.C65024c) r2
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x005f
                    L_0x003f:
                        kotlin.ResultKt.throwOnFailure(r8)
                        sx3.i0 r7 = (sx3.C64188i0) r7
                        u3.c$a$a r8 = r6.f187178d
                        u3.c2 r8 = r8.f187173g
                        c14.h<sx3.i0<u3.n0<T>>> r8 = r8.f187217a
                        c14.C54612b0.C54613a.m61404a(r8, r4, r5, r4)
                        u3.c$a$a r8 = r6.f187178d
                        a14.z1 r8 = r8.f187174h
                        r0.f187182g = r6
                        r0.f187183h = r7
                        r0.f187180e = r5
                        java.lang.Object r8 = r8.mo74521O(r0)
                        if (r8 != r1) goto L_0x005e
                        return r1
                    L_0x005e:
                        r2 = r6
                    L_0x005f:
                        int r8 = r7.f181909a
                        u3.c$a$a r2 = r2.f187178d
                        gy3.d0 r5 = r2.f187175i
                        int r5 = r5.f27483d
                        if (r8 <= r5) goto L_0x007a
                        u3.w1 r8 = r2.f187172f
                        T r7 = r7.f181910b
                        r0.f187182g = r4
                        r0.f187183h = r4
                        r0.f187180e = r3
                        java.lang.Object r7 = r8.mo75536o(r7, r0)
                        if (r7 != r1) goto L_0x007a
                        return r1
                    L_0x007a:
                        rx3.b0 r7 = rx3.C13598b0.f38549a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p247u3.C65019c.C65020a.C65021a.C65024c.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65021a(C65020a aVar, C65189w1 w1Var, C65041c2 c2Var, C53973z1 z1Var, C8478d0 d0Var, C15601d dVar) {
                super(2, dVar);
                this.f187171e = aVar;
                this.f187172f = w1Var;
                this.f187173g = c2Var;
                this.f187174h = z1Var;
                this.f187175i = d0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                return new C65021a(this.f187171e, this.f187172f, this.f187173g, this.f187174h, this.f187175i, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65021a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187170d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58078q qVar = new C58078q(new C58083t(this.f187171e.f187169f.f187165c.f188556b, new C65022a((C15601d) null)), new C65023b(this, (C15601d) null));
                    C65024c cVar = new C65024c(this);
                    this.f187170d = 1;
                    if (qVar.mo31880a(cVar, this) == aVar) {
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

        @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {292}, mo125471m = "invokeSuspend")
        /* renamed from: u3.c$a$b */
        public static final class C65026b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f187184d;

            /* renamed from: e */
            public final /* synthetic */ C65189w1 f187185e;

            /* renamed from: f */
            public final /* synthetic */ C65041c2 f187186f;

            /* renamed from: g */
            public final /* synthetic */ C8478d0 f187187g;

            /* renamed from: u3.c$a$b$a */
            public static final class C65027a implements C45253g<C64188i0<? extends C65086n0<T>>> {

                /* renamed from: d */
                public final /* synthetic */ C65026b f187188d;

                public C65027a(C65026b bVar) {
                    this.f187188d = bVar;
                }

                public Object emit(Object obj, C15601d dVar) {
                    C64188i0 i0Var = (C64188i0) obj;
                    C65026b bVar = this.f187188d;
                    bVar.f187187g.f27483d = i0Var.f181909a;
                    Object o = bVar.f187185e.mo75536o(i0Var.f181910b, dVar);
                    return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65026b(C65189w1 w1Var, C65041c2 c2Var, C8478d0 d0Var, C15601d dVar) {
                super(2, dVar);
                this.f187185e = w1Var;
                this.f187186f = c2Var;
                this.f187187g = d0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                return new C65026b(this.f187185e, this.f187186f, this.f187187g, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65026b) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f187184d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<T> d = C58042h.m67195d(this.f187186f.f187217a);
                    C65027a aVar2 = new C65027a(this);
                    this.f187184d = 1;
                    if (((C58022c) d).mo31880a(aVar2, this) == aVar) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65020a(C65019c cVar, C15601d dVar) {
            super(2, dVar);
            this.f187169f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65020a aVar = new C65020a(this.f187169f, dVar);
            aVar.f187167d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65020a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C65189w1 w1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187168e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                w1Var = (C65189w1) this.f187167d;
                C65167t<T> tVar = this.f187169f.f187163a;
                this.f187167d = w1Var;
                this.f187168e = 1;
                obj2 = tVar.mo89323a(this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                w1Var = (C65189w1) this.f187167d;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C65189w1 w1Var2 = w1Var;
            C65041c2 c2Var = (C65041c2) obj2;
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = Integer.MIN_VALUE;
            C53973z1 d = C53895h.m60466d(w1Var2, (C66212f) null, (C53934p0) null, new C65026b(w1Var2, c2Var, d0Var, (C15601d) null), 3, (Object) null);
            C53973z1[] z1VarArr = {C53895h.m60466d(w1Var2, (C66212f) null, (C53934p0) null, new C65021a(this, w1Var2, c2Var, d, d0Var, (C15601d) null), 3, (Object) null), d};
            this.f187167d = null;
            this.f187168e = 2;
            if (C53869d.m60386b(z1VarArr, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.CachedPageEventFlow$multicastedSrc$1", mo125469f = "CachedPageEventFlow.kt", mo125470l = {292}, mo125471m = "invokeSuspend")
    /* renamed from: u3.c$b */
    public static final class C65028b extends C91594j implements C32227p<C45253g<? super C64188i0<? extends C65086n0<T>>>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187189d;

        /* renamed from: e */
        public int f187190e;

        /* renamed from: f */
        public final /* synthetic */ C65019c f187191f;

        /* renamed from: g */
        public final /* synthetic */ C45252f f187192g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65028b(C65019c cVar, C45252f fVar, C15601d dVar) {
            super(2, dVar);
            this.f187191f = cVar;
            this.f187192g = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65028b bVar = new C65028b(this.f187191f, this.f187192g, dVar);
            bVar.f187189d = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65028b) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187190e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45253g gVar = (C45253g) this.f187189d;
                if (this.f187191f.f187164b.compareAndSet(false, true)) {
                    C45252f fVar = this.f187192g;
                    this.f187190e = 1;
                    Object a = fVar.mo31880a(new C58073o0(gVar, new C8478d0()), this);
                    if (a != aVar) {
                        a = C13598b0.f38549a;
                    }
                    if (a == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u3.c$c */
    public static final /* synthetic */ class C65029c extends C24565l implements C32227p<C64188i0<? extends C65086n0<T>>, C15601d<? super C13598b0>, Object> {
        public C65029c(C65167t tVar) {
            super(2, tVar, C65167t.class, "record", "record(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65167t) this.receiver).mo89324b((C64188i0) obj, (C15601d) obj2);
        }
    }

    public C65019c(C45252f<? extends C65086n0<T>> fVar, C0000n0 n0Var) {
        C87412m.m108594g(fVar, "src");
        C87412m.m108594g(n0Var, "scope");
        C65167t<T> tVar = new C65167t<>();
        this.f187163a = tVar;
        this.f187165c = new C65535g(n0Var, 0, new C58095x0(new C65028b(this, fVar, (C15601d) null)), false, new C65029c(tVar), true, 8, (C8480h) null);
        this.f187166d = C65180v1.m76764a(new C65020a(this, (C15601d) null));
    }
}
