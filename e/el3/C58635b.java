package el3;

import a14.C0000n0;
import d14.C58087u0;
import el3.C58629a;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.component.support.StateTransform$BaseStateBuilder$asStateFlow$1", mo125469f = "StateTransform.kt", mo125470l = {264}, mo125471m = "invokeSuspend")
/* renamed from: el3.b */
public final class C58635b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f167869d;

    /* renamed from: e */
    public final /* synthetic */ C58629a.C58630a<Object> f167870e;

    /* renamed from: f */
    public final /* synthetic */ C58087u0<Object> f167871f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58635b(C58629a.C58630a<Object> aVar, C58087u0<Object> u0Var, C15601d<? super C58635b> dVar) {
        super(2, dVar);
        this.f167870e = aVar;
        this.f167871f = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58635b(this.f167870e, this.f167871f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58635b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f167869d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58629a.C58630a<Object> aVar2 = this.f167870e;
            C58087u0<Object> u0Var = this.f167871f;
            this.f167869d = 1;
            if (aVar2.mo83511b(u0Var, this) == aVar) {
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
