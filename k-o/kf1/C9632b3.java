package kf1;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.FinderGetJustWatched$cancel$1", mo125469f = "FinderGetJustWatched.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: kf1.b3 */
public final class C9632b3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C9683d3 f29953d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9632b3(C9683d3 d3Var, C15601d<? super C9632b3> dVar) {
        super(2, dVar);
        this.f29953d = d3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9632b3(this.f29953d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9632b3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C9683d3 d3Var = this.f29953d;
        d3Var.f30087p = true;
        C32224a<C13598b0> aVar = d3Var.f30079h;
        if (aVar != null) {
            aVar.invoke();
        }
        return C13598b0.f38549a;
    }
}
