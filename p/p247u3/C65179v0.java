package p247u3;

import c14.C54614c;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", mo125469f = "PageFetcherSnapshotState.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: u3.v0 */
public final class C65179v0 extends C91594j implements C32227p<C45253g<? super Integer>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C65173u0 f187654d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65179v0(C65173u0 u0Var, C15601d dVar) {
        super(2, dVar);
        this.f187654d = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65179v0(this.f187654d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65179v0) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C65173u0 u0Var = this.f187654d;
        ((C54614c) u0Var.f187636i).offer(new Integer(u0Var.f187634g));
        return C13598b0.f38549a;
    }
}
