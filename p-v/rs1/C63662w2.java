package rs1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckUIC$safeCheck$$inlined$fail$default$1", mo125469f = "FinderFeedSafeCheckUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.w2 */
public final class C63662w2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f180482d;

    /* renamed from: e */
    public final /* synthetic */ C63654v2 f180483e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63662w2(C0287e eVar, C15601d dVar, C63654v2 v2Var) {
        super(2, dVar);
        this.f180482d = eVar;
        this.f180483e = v2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63662w2(this.f180482d, dVar, this.f180483e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63662w2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C0280a aVar = (C0280a) ((C0281b) this.f180482d).f843b;
        this.f180483e.f180456f = System.currentTimeMillis();
        return C13598b0.f38549a;
    }
}
