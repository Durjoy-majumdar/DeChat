package p247u3;

import d14.C45253g;
import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$5", mo125469f = "CachedPagingData.kt", mo125470l = {100}, mo125471m = "invokeSuspend")
/* renamed from: u3.i */
public final class C14115i extends C91594j implements C32228q<C45253g<? super C65081m1<Object>>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39513d;

    public C14115i(C14108a aVar, C15601d dVar) {
        super(3, dVar);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        C15601d dVar = (C15601d) obj3;
        C87412m.m108594g((C45253g) obj, "$this$create");
        C87412m.m108594g(dVar, "continuation");
        return new C14115i((C14108a) null, dVar).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f39513d;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
