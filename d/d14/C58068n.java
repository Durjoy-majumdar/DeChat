package d14;

import a14.C0000n0;
import e14.C58508u;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo125469f = "Collect.kt", mo125470l = {50}, mo125471m = "invokeSuspend")
/* renamed from: d14.n */
public final class C58068n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f166081d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<Object> f166082e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58068n(C45252f<Object> fVar, C15601d<? super C58068n> dVar) {
        super(2, dVar);
        this.f166082e = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58068n(this.f166082e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58068n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f166081d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<Object> fVar = this.f166082e;
            this.f166081d = 1;
            Object a = fVar.mo31880a(C58508u.f167540d, this);
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            if (a == aVar) {
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
