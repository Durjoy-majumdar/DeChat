package p247u3;

import d14.C45253g;
import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.MulticastedPagingData$accumulated$2", mo125469f = "CachedPagingData.kt", mo125470l = {40}, mo125471m = "invokeSuspend")
/* renamed from: u3.k0 */
public final class C14118k0 extends C91594j implements C32228q<C45253g<? super C65086n0<Object>>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39516d;

    /* renamed from: e */
    public final /* synthetic */ C65077l0 f39517e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14118k0(C65077l0 l0Var, C15601d dVar) {
        super(3, dVar);
        this.f39517e = l0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        C15601d dVar = (C15601d) obj3;
        C87412m.m108594g((C45253g) obj, "$this$create");
        C87412m.m108594g(dVar, "continuation");
        return new C14118k0(this.f39517e, dVar).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f39516d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f39517e.getClass();
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
