package p865v3;

import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import d14.C58078q;
import d14.C58080r;
import d14.C58095x0;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import p865v3.C65512c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.multicast.Multicaster$flow$1", mo125469f = "Multicaster.kt", mo125470l = {100}, mo125471m = "invokeSuspend")
/* renamed from: v3.f */
public final class C65529f extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f188538d;

    /* renamed from: e */
    public int f188539e;

    /* renamed from: f */
    public final /* synthetic */ C65535g f188540f;

    @C91590f(mo125468c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1", mo125469f = "Multicaster.kt", mo125470l = {215}, mo125471m = "invokeSuspend")
    /* renamed from: v3.f$a */
    public static final class C65530a extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f188541d;

        /* renamed from: e */
        public int f188542e;

        /* renamed from: f */
        public final /* synthetic */ C45252f f188543f;

        /* renamed from: v3.f$a$a */
        public static final class C65531a implements C45253g<C65512c.C65520c.C65522b.C65525c<Object>> {

            /* renamed from: d */
            public final /* synthetic */ C45253g f188544d;

            @C91590f(mo125468c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1", mo125469f = "Multicaster.kt", mo125470l = {134}, mo125471m = "emit")
            /* renamed from: v3.f$a$a$a */
            public static final class C65532a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f188545d;

                /* renamed from: e */
                public int f188546e;

                /* renamed from: f */
                public final /* synthetic */ C65531a f188547f;

                /* renamed from: g */
                public Object f188548g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65532a(C65531a aVar, C15601d dVar) {
                    super(dVar);
                    this.f188547f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f188545d = obj;
                    this.f188546e |= Integer.MIN_VALUE;
                    return this.f188547f.emit((Object) null, this);
                }
            }

            public C65531a(C65530a aVar, C45253g gVar) {
                this.f188544d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, wx3.C15601d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p865v3.C65529f.C65530a.C65531a.C65532a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    v3.f$a$a$a r0 = (p865v3.C65529f.C65530a.C65531a.C65532a) r0
                    int r1 = r0.f188546e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f188546e = r1
                    goto L_0x0018
                L_0x0013:
                    v3.f$a$a$a r0 = new v3.f$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f188545d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f188546e
                    r3 = 1
                    if (r2 == 0) goto L_0x0033
                    if (r2 != r3) goto L_0x002b
                    java.lang.Object r5 = r0.f188548g
                    v3.c$c$b$c r5 = (p865v3.C65512c.C65520c.C65522b.C65525c) r5
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x0047
                L_0x002b:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0033:
                    kotlin.ResultKt.throwOnFailure(r6)
                    d14.g r6 = r4.f188544d
                    v3.c$c$b$c r5 = (p865v3.C65512c.C65520c.C65522b.C65525c) r5
                    T r2 = r5.f188533a
                    r0.f188548g = r5
                    r0.f188546e = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    a14.u<rx3.b0> r5 = r5.f188534b
                    rx3.b0 r6 = rx3.C13598b0.f38549a
                    r5.mo74633n(r6)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p865v3.C65529f.C65530a.C65531a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65530a(C45252f fVar, C15601d dVar) {
            super(2, dVar);
            this.f188543f = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C65530a aVar = new C65530a(this.f188543f, dVar);
            aVar.f188541d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65530a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188542e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f fVar = this.f188543f;
                C65531a aVar2 = new C65531a(this, (C45253g) this.f188541d);
                this.f188542e = 1;
                if (fVar.mo31880a(aVar2, this) == aVar) {
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

    @C91590f(mo125468c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$1", mo125469f = "Multicaster.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
    /* renamed from: v3.f$b */
    public static final class C65533b extends C91594j implements C32227p<C45253g<? super C65512c.C65520c.C65522b.C65525c<Object>>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f188549d;

        /* renamed from: e */
        public final /* synthetic */ C65529f f188550e;

        /* renamed from: f */
        public final /* synthetic */ C54625h f188551f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65533b(C65529f fVar, C54625h hVar, C15601d dVar) {
            super(2, dVar);
            this.f188550e = fVar;
            this.f188551f = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65533b(this.f188550e, this.f188551f, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65533b) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188549d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54625h hVar = this.f188551f;
                this.f188549d = 1;
                C65512c<T>.a aVar2 = ((C65512c) this.f188550e.f188540f.f188555a.getValue()).f188495a;
                Object o = ((C54614c) aVar2.f188580a).mo75536o(new C65512c.C65520c.C65521a(hVar), this);
                if (o != aVar) {
                    o = C13598b0.f38549a;
                }
                if (o != aVar) {
                    o = C13598b0.f38549a;
                }
                if (o == aVar) {
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

    @C91590f(mo125468c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$3", mo125469f = "Multicaster.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
    /* renamed from: v3.f$c */
    public static final class C65534c extends C91594j implements C32228q<C45253g<Object>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f188552d;

        /* renamed from: e */
        public final /* synthetic */ C65529f f188553e;

        /* renamed from: f */
        public final /* synthetic */ C54625h f188554f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65534c(C65529f fVar, C54625h hVar, C15601d dVar) {
            super(3, dVar);
            this.f188553e = fVar;
            this.f188554f = hVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Throwable th = (Throwable) obj2;
            C15601d dVar = (C15601d) obj3;
            C87412m.m108594g((C45253g) obj, "$this$create");
            C87412m.m108594g(dVar, "continuation");
            return new C65534c(this.f188553e, this.f188554f, dVar).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188552d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54625h hVar = this.f188554f;
                this.f188552d = 1;
                C65512c<T>.a aVar2 = ((C65512c) this.f188553e.f188540f.f188555a.getValue()).f188495a;
                Object o = ((C54614c) aVar2.f188580a).mo75536o(new C65512c.C65520c.C65526c(hVar), this);
                if (o != aVar) {
                    o = C13598b0.f38549a;
                }
                if (o != aVar) {
                    o = C13598b0.f38549a;
                }
                if (o == aVar) {
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
    public C65529f(C65535g gVar, C15601d dVar) {
        super(2, dVar);
        this.f188540f = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65529f fVar = new C65529f(this.f188540f, dVar);
        fVar.f188538d = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65529f) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188539e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54625h a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
            C58078q qVar = new C58078q(new C58095x0(new C65530a(new C58080r(new C65533b(this, a, (C15601d) null), C58042h.m67195d(a)), (C15601d) null)), new C65534c(this, a, (C15601d) null));
            this.f188539e = 1;
            if (qVar.mo31880a((C45253g) this.f188538d, this) == aVar) {
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
