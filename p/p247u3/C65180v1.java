package p247u3;

import a14.C0000n0;
import a14.C53930o0;
import c14.C54612b0;
import c14.C54624g;
import c14.C54625h;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import d14.C58095x0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.v1 */
public final class C65180v1 {

    @C91590f(mo125468c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", mo125469f = "SimpleChannelFlow.kt", mo125470l = {46}, mo125471m = "invokeSuspend")
    /* renamed from: u3.v1$a */
    public static final class C65181a extends C91594j implements C32227p<C45253g<? super T>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187655d;

        /* renamed from: e */
        public int f187656e;

        /* renamed from: f */
        public final /* synthetic */ C32227p f187657f;

        @C91590f(mo125468c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", mo125469f = "SimpleChannelFlow.kt", mo125470l = {64, 65}, mo125471m = "invokeSuspend")
        /* renamed from: u3.v1$a$a */
        public static final class C65182a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f187658d;

            /* renamed from: e */
            public Object f187659e;

            /* renamed from: f */
            public int f187660f;

            /* renamed from: g */
            public final /* synthetic */ C65181a f187661g;

            /* renamed from: h */
            public final /* synthetic */ C45253g f187662h;

            @C91590f(mo125468c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", mo125469f = "SimpleChannelFlow.kt", mo125470l = {52}, mo125471m = "invokeSuspend")
            /* renamed from: u3.v1$a$a$a */
            public static final class C65183a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f187663d;

                /* renamed from: e */
                public final /* synthetic */ C65182a f187664e;

                /* renamed from: f */
                public final /* synthetic */ C54625h f187665f;

                @C91590f(mo125468c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", mo125469f = "SimpleChannelFlow.kt", mo125470l = {57}, mo125471m = "invokeSuspend")
                /* renamed from: u3.v1$a$a$a$a */
                public static final class C65184a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                    /* renamed from: d */
                    public /* synthetic */ Object f187666d;

                    /* renamed from: e */
                    public int f187667e;

                    /* renamed from: f */
                    public final /* synthetic */ C65183a f187668f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65184a(C65183a aVar, C15601d dVar) {
                        super(2, dVar);
                        this.f187668f = aVar;
                    }

                    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                        C87412m.m108594g(dVar, "completion");
                        C65184a aVar = new C65184a(this.f187668f, dVar);
                        aVar.f187666d = obj;
                        return aVar;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        return ((C65184a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                        int i = this.f187667e;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            C65196x1 x1Var = new C65196x1((C0000n0) this.f187666d, this.f187668f.f187665f);
                            C32227p pVar = this.f187668f.f187664e.f187661g.f187657f;
                            this.f187667e = 1;
                            if (pVar.invoke(x1Var, this) == aVar) {
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
                public C65183a(C65182a aVar, C54625h hVar, C15601d dVar) {
                    super(2, dVar);
                    this.f187664e = aVar;
                    this.f187665f = hVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    C87412m.m108594g(dVar, "completion");
                    return new C65183a(this.f187664e, this.f187665f, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C65183a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f187663d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C65184a aVar2 = new C65184a(this, (C15601d) null);
                        this.f187663d = 1;
                        if (C53930o0.m60559f(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else if (i == 1) {
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            this.f187665f.mo75540w(th);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C54612b0.C54613a.m61404a(this.f187665f, (Throwable) null, 1, (Object) null);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65182a(C65181a aVar, C45253g gVar, C15601d dVar) {
                super(2, dVar);
                this.f187661g = aVar;
                this.f187662h = gVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                C65182a aVar = new C65182a(this.f187661g, this.f187662h, dVar);
                aVar.f187658d = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65182a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r12.f187660f
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0035
                    if (r1 == r3) goto L_0x0025
                    if (r1 != r2) goto L_0x001d
                    java.lang.Object r1 = r12.f187659e
                    c14.j r1 = (c14.C54628j) r1
                    java.lang.Object r5 = r12.f187658d
                    a14.z1 r5 = (a14.C53973z1) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    r13 = r12
                    r11 = r5
                    r5 = r1
                    r1 = r11
                    goto L_0x0058
                L_0x001d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0025:
                    java.lang.Object r1 = r12.f187659e
                    c14.j r1 = (c14.C54628j) r1
                    java.lang.Object r5 = r12.f187658d
                    a14.z1 r5 = (a14.C53973z1) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    r6 = r5
                    r5 = r1
                    r1 = r0
                    r0 = r12
                    goto L_0x006a
                L_0x0035:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r13 = r12.f187658d
                    r5 = r13
                    a14.n0 r5 = (a14.C0000n0) r5
                    r13 = 0
                    r1 = 6
                    c14.h r13 = c14.C54629k.m61479a(r13, r4, r4, r1, r4)
                    r6 = 0
                    r7 = 0
                    u3.v1$a$a$a r8 = new u3.v1$a$a$a
                    r8.<init>(r12, r13, r4)
                    r9 = 3
                    r10 = 0
                    a14.z1 r1 = a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
                    c14.a r13 = (c14.C54602a) r13
                    c14.a$a r5 = new c14.a$a
                    r5.<init>(r13)
                    r13 = r12
                L_0x0058:
                    r13.f187658d = r1
                    r13.f187659e = r5
                    r13.f187660f = r3
                    java.lang.Object r6 = r5.mo75523a(r13)
                    if (r6 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    r11 = r0
                    r0 = r13
                    r13 = r6
                    r6 = r1
                    r1 = r11
                L_0x006a:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L_0x0089
                    java.lang.Object r13 = r5.next()
                    d14.g r7 = r0.f187662h
                    r0.f187658d = r6
                    r0.f187659e = r5
                    r0.f187660f = r2
                    java.lang.Object r13 = r7.emit(r13, r0)
                    if (r13 != r1) goto L_0x0085
                    return r1
                L_0x0085:
                    r13 = r0
                    r0 = r1
                    r1 = r6
                    goto L_0x0058
                L_0x0089:
                    a14.C53973z1.C53974a.m60623a(r6, r4, r3, r4)
                    rx3.b0 r13 = rx3.C13598b0.f38549a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65180v1.C65181a.C65182a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65181a(C32227p pVar, C15601d dVar) {
            super(2, dVar);
            this.f187657f = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65181a aVar = new C65181a(this.f187657f, dVar);
            aVar.f187655d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65181a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187656e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65182a aVar2 = new C65182a(this, (C45253g) this.f187655d, (C15601d) null);
                this.f187656e = 1;
                if (C53930o0.m60559f(aVar2, this) == aVar) {
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

    /* renamed from: a */
    public static final <T> C45252f<T> m76764a(C32227p<? super C65189w1<T>, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        return C58042h.m67192a(new C58095x0(new C65181a(pVar, (C15601d) null)), -2, (C54624g) null, 2, (Object) null);
    }
}
