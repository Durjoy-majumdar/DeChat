package androidx.lifecycle;

import a14.C0000n0;
import a14.C53873d2;
import androidx.lifecycle.C39623j;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo125469f = "Lifecycle.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: androidx.lifecycle.m */
public final class C54214m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f152180d;

    /* renamed from: e */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f152181e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54214m(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C15601d dVar) {
        super(2, dVar);
        this.f152181e = lifecycleCoroutineScopeImpl;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C54214m mVar = new C54214m(this.f152181e, dVar);
        mVar.f152180d = obj;
        return mVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C54214m) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C0000n0 n0Var = (C0000n0) this.f152180d;
        if (this.f152181e.f152162d.getCurrentState().compareTo(C39623j.C39626c.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f152181e;
            lifecycleCoroutineScopeImpl.f152162d.addObserver(lifecycleCoroutineScopeImpl);
        } else {
            C53873d2.m60390b(n0Var.getCoroutineContext(), (CancellationException) null);
        }
        return C13598b0.f38549a;
    }
}
