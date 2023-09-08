package p247u3;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.SuspendingPagingSourceFactory$create$2", mo125469f = "SuspendingPagingSourceFactory.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: u3.a2 */
public final class C14110a2 extends C91594j implements C32227p<C0000n0, C15601d<? super C65145q1<Object, Object>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C14111b2 f39510d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14110a2(C14111b2 b2Var, C15601d dVar) {
        super(2, dVar);
        this.f39510d = b2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C14110a2(this.f39510d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((C14110a2) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f39510d.getClass();
        throw null;
    }
}
