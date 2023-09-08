package p247u3;

import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$4", mo125469f = "CachedPagingData.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
/* renamed from: u3.h */
public final class C14114h extends C91594j implements C32227p<C45253g<? super C65081m1<Object>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39512d;

    public C14114h(C14108a aVar, C15601d dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C14114h((C14108a) null, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C14114h) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f39512d;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
