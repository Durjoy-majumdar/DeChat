package p247u3;

import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.MulticastedPagingData$accumulated$1", mo125469f = "CachedPagingData.kt", mo125470l = {38}, mo125471m = "invokeSuspend")
/* renamed from: u3.j0 */
public final class C14116j0 extends C91594j implements C32227p<C45253g<? super C65086n0<Object>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39514d;

    /* renamed from: e */
    public final /* synthetic */ C65077l0 f39515e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14116j0(C65077l0 l0Var, C15601d dVar) {
        super(2, dVar);
        this.f39515e = l0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C14116j0(this.f39515e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C14116j0) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f39514d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f39515e.getClass();
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
