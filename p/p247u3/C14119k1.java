package p247u3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.Pager$flow$2", mo125469f = "Pager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: u3.k1 */
public final class C14119k1 extends C91594j implements C32226l<C15601d<? super C65145q1<Object, Object>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C32224a f39518d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14119k1(C32224a aVar, C15601d dVar) {
        super(1, dVar);
        this.f39518d = aVar;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C14119k1(this.f39518d, dVar);
    }

    public final Object invoke(Object obj) {
        return ((C14119k1) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return this.f39518d.invoke();
    }
}
