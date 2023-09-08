package p004b0;

import fy3.C32227p;
import kotlin.ResultKt;
import p759y.C112278q0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", mo125469f = "LazyListState.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: b0.m0 */
public final class C103958m0 extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C103953l0 f307447d;

    /* renamed from: e */
    public final /* synthetic */ int f307448e;

    /* renamed from: f */
    public final /* synthetic */ int f307449f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103958m0(C103953l0 l0Var, int i, int i2, C15601d<? super C103958m0> dVar) {
        super(2, dVar);
        this.f307447d = l0Var;
        this.f307448e = i;
        this.f307449f = i2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C103958m0(this.f307447d, this.f307448e, this.f307449f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C103958m0) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f307447d.mo145574i(this.f307448e, this.f307449f);
        return C13598b0.f38549a;
    }
}
