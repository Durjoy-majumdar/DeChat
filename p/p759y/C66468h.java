package p759y;

import a14.C0000n0;
import a14.C53930o0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p267x.C38426u1;
import p267x.C66228v1;
import p267x.C66230w1;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y.h */
public final class C66468h implements C112302z0 {

    /* renamed from: a */
    public final C32226l<Float, Float> f191231a;

    /* renamed from: b */
    public final C112278q0 f191232b = new C66471b(this);

    /* renamed from: c */
    public final C66228v1 f191233c = new C66228v1();

    /* renamed from: d */
    public final C60690y0<Boolean> f191234d = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", mo125469f = "ScrollableState.kt", mo125470l = {145}, mo125471m = "invokeSuspend")
    /* renamed from: y.h$a */
    public static final class C66469a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191235d;

        /* renamed from: e */
        public final /* synthetic */ C66468h f191236e;

        /* renamed from: f */
        public final /* synthetic */ C38426u1 f191237f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C112278q0, C15601d<? super C13598b0>, Object> f191238g;

        @C91590f(mo125468c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", mo125469f = "ScrollableState.kt", mo125470l = {148}, mo125471m = "invokeSuspend")
        /* renamed from: y.h$a$a */
        public static final class C66470a extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f191239d;

            /* renamed from: e */
            public /* synthetic */ Object f191240e;

            /* renamed from: f */
            public final /* synthetic */ C66468h f191241f;

            /* renamed from: g */
            public final /* synthetic */ C32227p<C112278q0, C15601d<? super C13598b0>, Object> f191242g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66470a(C66468h hVar, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C66470a> dVar) {
                super(2, dVar);
                this.f191241f = hVar;
                this.f191242g = pVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C66470a aVar = new C66470a(this.f191241f, this.f191242g, dVar);
                aVar.f191240e = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66470a) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f191239d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C112278q0 q0Var = (C112278q0) this.f191240e;
                    ((C108494d2) this.f191241f.f191234d).setValue(Boolean.TRUE);
                    C32227p<C112278q0, C15601d<? super C13598b0>, Object> pVar = this.f191242g;
                    this.f191239d = 1;
                    if (pVar.invoke(q0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        ((C108494d2) this.f191241f.f191234d).setValue(Boolean.FALSE);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ((C108494d2) this.f191241f.f191234d).setValue(Boolean.FALSE);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66469a(C66468h hVar, C38426u1 u1Var, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C66469a> dVar) {
            super(2, dVar);
            this.f191236e = hVar;
            this.f191237f = u1Var;
            this.f191238g = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66469a(this.f191236e, this.f191237f, this.f191238g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66469a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191235d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66468h hVar = this.f191236e;
                C66228v1 v1Var = hVar.f191233c;
                C112278q0 q0Var = hVar.f191232b;
                C38426u1 u1Var = this.f191237f;
                C66470a aVar2 = new C66470a(hVar, this.f191238g, (C15601d<? super C66470a>) null);
                this.f191235d = 1;
                v1Var.getClass();
                if (C53930o0.m60559f(new C66230w1(u1Var, v1Var, aVar2, q0Var, (C15601d<? super C66230w1>) null), this) == aVar) {
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

    /* renamed from: y.h$b */
    public static final class C66471b implements C112278q0 {

        /* renamed from: a */
        public final /* synthetic */ C66468h f191243a;

        public C66471b(C66468h hVar) {
            this.f191243a = hVar;
        }

        /* renamed from: a */
        public float mo90555a(float f) {
            return this.f191243a.f191231a.invoke(Float.valueOf(f)).floatValue();
        }
    }

    public C66468h(C32226l<? super Float, Float> lVar) {
        C87412m.m108594g(lVar, "onDelta");
        this.f191231a = lVar;
    }

    /* renamed from: a */
    public boolean mo90552a() {
        return ((Boolean) ((C108494d2) this.f191234d).getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo90553b(float f) {
        return this.f191231a.invoke(Float.valueOf(f)).floatValue();
    }

    /* renamed from: c */
    public Object mo90554c(C38426u1 u1Var, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        Object f = C53930o0.m60559f(new C66469a(this, u1Var, pVar, (C15601d<? super C66469a>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }
}
