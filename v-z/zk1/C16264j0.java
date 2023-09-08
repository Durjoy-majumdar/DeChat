package zk1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import mk1.C10906h;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLivePostBtnUIC$resetPrepareJob$1", mo125469f = "FinderLivePostBtnUIC.kt", mo125470l = {131}, mo125471m = "invokeSuspend")
/* renamed from: zk1.j0 */
public final class C16264j0 extends C91594j implements C32227p<C0000n0, C15601d<? super C10906h.C10907a>, Object> {

    /* renamed from: d */
    public int f43550d;

    /* renamed from: e */
    public final /* synthetic */ C16260i0 f43551e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16264j0(C16260i0 i0Var, C15601d<? super C16264j0> dVar) {
        super(2, dVar);
        this.f43551e = i0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16264j0(this.f43551e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16264j0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43550d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10906h hVar = this.f43551e.f43545o;
            this.f43550d = 1;
            obj = hVar.mo11115d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
