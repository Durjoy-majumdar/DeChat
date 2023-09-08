package p247u3;

import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import p865v3.C65512c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2", mo125469f = "CachedPagingData.kt", mo125470l = {93}, mo125471m = "invokeSuspend")
/* renamed from: u3.g */
public final class C65059g extends C91594j implements C32228q<C65077l0<Object>, C65077l0<Object>, C15601d<? super C65077l0<Object>>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187258d;

    /* renamed from: e */
    public /* synthetic */ Object f187259e;

    /* renamed from: f */
    public int f187260f;

    public C65059g(C15601d dVar) {
        super(3, dVar);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C65077l0 l0Var = (C65077l0) obj;
        C65077l0 l0Var2 = (C65077l0) obj2;
        C15601d dVar = (C15601d) obj3;
        C87412m.m108594g(l0Var, "prev");
        C87412m.m108594g(l0Var2, "next");
        C87412m.m108594g(dVar, "continuation");
        C65059g gVar = new C65059g(dVar);
        gVar.f187258d = l0Var;
        gVar.f187259e = l0Var2;
        return gVar.invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187260f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65077l0 l0Var = (C65077l0) this.f187259e;
            this.f187258d = l0Var;
            this.f187260f = 1;
            Object b = ((C65512c) ((C65077l0) this.f187258d).f187295a.f187165c.f188555a.getValue()).f188495a.mo89635b(this);
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            return b == aVar ? aVar : l0Var;
        } else if (i == 1) {
            C65077l0 l0Var2 = (C65077l0) this.f187258d;
            ResultKt.throwOnFailure(obj);
            return l0Var2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
