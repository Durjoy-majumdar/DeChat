package fh1;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$renderForWeVision$7", mo125469f = "GestureEffectPagController.kt", mo125470l = {333}, mo125471m = "invokeSuspend")
/* renamed from: fh1.a0 */
public final class C8030a0 extends C91594j implements C32227p<C0000n0, C15601d<? super Integer>, Object> {

    /* renamed from: d */
    public Object f26729d;

    /* renamed from: e */
    public int f26730e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C15601d<Integer>> f26731f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8030a0(C8479f0<C15601d<Integer>> f0Var, C15601d<? super C8030a0> dVar) {
        super(2, dVar);
        this.f26731f = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8030a0(this.f26731f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8030a0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f26730e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8479f0<C15601d<Integer>> f0Var = this.f26731f;
            this.f26729d = f0Var;
            this.f26730e = 1;
            T hVar = new C66218h(C66447b.m78392b(this));
            f0Var.f27484d = hVar;
            obj = hVar.mo90314b();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C8479f0 f0Var2 = (C8479f0) this.f26729d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
