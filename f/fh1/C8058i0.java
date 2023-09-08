package fh1;

import a14.C0000n0;
import a14.C53953u0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.InteractiveGiftController$playOnce$2", mo125469f = "InteractiveGiftController.kt", mo125470l = {134}, mo125471m = "invokeSuspend")
/* renamed from: fh1.i0 */
public final class C8058i0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f26798d;

    /* renamed from: e */
    public final /* synthetic */ C53953u0<C13598b0> f26799e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8058i0(C53953u0<C13598b0> u0Var, C15601d<? super C8058i0> dVar) {
        super(2, dVar);
        this.f26799e = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8058i0(this.f26799e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8058i0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f26798d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53953u0<C13598b0> u0Var = this.f26799e;
            this.f26798d = 1;
            if (u0Var.mo74634A(this) == aVar) {
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
