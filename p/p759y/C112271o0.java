package p759y;

import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p175j0.C60667k2;
import p267x.C38426u1;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y.o0 */
public final class C112271o0 implements C112252k0, C112250j0 {

    /* renamed from: a */
    public final C60667k2<C112196b1> f336186a;

    /* renamed from: b */
    public C112278q0 f336187b = C112280r0.f336211a;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", mo125469f = "Scrollable.kt", mo125470l = {391}, mo125471m = "invokeSuspend")
    /* renamed from: y.o0$a */
    public static final class C66472a extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191244d;

        /* renamed from: e */
        public /* synthetic */ Object f191245e;

        /* renamed from: f */
        public final /* synthetic */ C112271o0 f191246f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C112250j0, C15601d<? super C13598b0>, Object> f191247g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66472a(C112271o0 o0Var, C32227p<? super C112250j0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C66472a> dVar) {
            super(2, dVar);
            this.f191246f = o0Var;
            this.f191247g = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66472a aVar = new C66472a(this.f191246f, this.f191247g, dVar);
            aVar.f191245e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66472a) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191244d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C112278q0 q0Var = (C112278q0) this.f191245e;
                C112271o0 o0Var = this.f191246f;
                o0Var.getClass();
                C87412m.m108594g(q0Var, "<set-?>");
                o0Var.f336187b = q0Var;
                C32227p<C112250j0, C15601d<? super C13598b0>, Object> pVar = this.f191247g;
                C112271o0 o0Var2 = this.f191246f;
                this.f191244d = 1;
                if (pVar.invoke(o0Var2, this) == aVar) {
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

    public C112271o0(C60667k2<C112196b1> k2Var) {
        C87412m.m108594g(k2Var, "scrollLogic");
        this.f336186a = k2Var;
    }

    /* renamed from: a */
    public void mo164034a(float f, long j) {
        C112196b1 value = this.f336186a.getValue();
        value.mo164019a(this.f336187b, value.mo164023e(f), new C112539e(j), 1);
    }

    /* renamed from: b */
    public Object mo164035b(C38426u1 u1Var, C32227p<? super C112250j0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        Object c = this.f336186a.getValue().f335913d.mo90554c(u1Var, new C66472a(this, pVar, (C15601d<? super C66472a>) null), dVar);
        return c == C15911a.COROUTINE_SUSPENDED ? c : C13598b0.f38549a;
    }
}
