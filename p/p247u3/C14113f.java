package p247u3;

import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$1", mo125469f = "CachedPagingData.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: u3.f */
public final class C14113f extends C91594j implements C32227p<C65081m1<Object>, C15601d<? super C13598b0>, Object> {
    public C14113f(C15601d dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C14113f(dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        C14113f fVar = (C14113f) create(obj, (C15601d) obj2);
        C13598b0 b0Var = C13598b0.f38549a;
        ResultKt.throwOnFailure(b0Var);
        return b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return C13598b0.f38549a;
    }
}
