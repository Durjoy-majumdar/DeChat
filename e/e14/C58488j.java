package e14;

import d14.C45253g;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo125469f = "ChannelFlow.kt", mo125470l = {152}, mo125471m = "invokeSuspend")
/* renamed from: e14.j */
public final class C58488j extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f167491d;

    /* renamed from: e */
    public /* synthetic */ Object f167492e;

    /* renamed from: f */
    public final /* synthetic */ C58489k<Object, Object> f167493f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58488j(C58489k<Object, Object> kVar, C15601d<? super C58488j> dVar) {
        super(2, dVar);
        this.f167493f = kVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C58488j jVar = new C58488j(this.f167493f, dVar);
        jVar.f167492e = obj;
        return jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58488j) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f167491d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58489k<Object, Object> kVar = this.f167493f;
            this.f167491d = 1;
            if (kVar.mo83428k((C45253g) this.f167492e, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
