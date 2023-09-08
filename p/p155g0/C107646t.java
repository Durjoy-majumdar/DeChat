package p155g0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import d14.C45252f;
import d14.C45253g;
import d14.C58012a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p175j0.C108500f2;
import p175j0.C60667k2;
import p257w.C111626b;
import p257w.C111654m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", mo125469f = "SelectionMagnifier.kt", mo125470l = {88}, mo125471m = "invokeSuspend")
/* renamed from: g0.t */
public final class C107646t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f322041d;

    /* renamed from: e */
    public /* synthetic */ Object f322042e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C112539e> f322043f;

    /* renamed from: g */
    public final /* synthetic */ C111626b<C112539e, C111654m> f322044g;

    /* renamed from: g0.t$a */
    public static final class C107647a extends C87413o implements C32224a<C112539e> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<C112539e> f322045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107647a(C60667k2<C112539e> k2Var) {
            super(0);
            this.f322045d = k2Var;
        }

        public Object invoke() {
            C60667k2<C112539e> k2Var = this.f322045d;
            C111654m mVar = C107641q.f322032a;
            return new C112539e(k2Var.getValue().f336959a);
        }
    }

    /* renamed from: g0.t$b */
    public static final class C107648b implements C45253g<C112539e> {

        /* renamed from: d */
        public final /* synthetic */ C111626b<C112539e, C111654m> f322046d;

        /* renamed from: e */
        public final /* synthetic */ C0000n0 f322047e;

        public C107648b(C111626b<C112539e, C111654m> bVar, C0000n0 n0Var) {
            this.f322046d = bVar;
            this.f322047e = n0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            long j = ((C112539e) obj).f336959a;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            if (C112540f.m153747c(this.f322046d.mo163295c().f336959a) && C112540f.m153747c(j)) {
                if (!(C112539e.m153739d(this.f322046d.mo163295c().f336959a) == C112539e.m153739d(j))) {
                    C53973z1 d = C53895h.m60466d(this.f322047e, (C66212f) null, (C53934p0) null, new C32248u(this.f322046d, j, (C15601d<? super C32248u>) null), 3, (Object) null);
                    return d == aVar ? d : C13598b0.f38549a;
                }
            }
            Object d2 = this.f322046d.mo163296d(new C112539e(j), dVar);
            return d2 == aVar ? d2 : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107646t(C60667k2<C112539e> k2Var, C111626b<C112539e, C111654m> bVar, C15601d<? super C107646t> dVar) {
        super(2, dVar);
        this.f322043f = k2Var;
        this.f322044g = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C107646t tVar = new C107646t(this.f322043f, this.f322044g, dVar);
        tVar.f322042e = obj;
        return tVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107646t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f322041d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f f = C108500f2.m146999f(new C107647a(this.f322043f));
            C107648b bVar = new C107648b(this.f322044g, (C0000n0) this.f322042e);
            this.f322041d = 1;
            if (((C58012a) f).mo31880a(bVar, this) == aVar) {
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
