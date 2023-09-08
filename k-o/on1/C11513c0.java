package on1;

import a14.C0000n0;
import cm1.C0740i2;
import d14.C58085t0;
import d14.C58100z0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.LoaderDispatcher$sendState$1", mo125469f = "LoaderDispatcher.kt", mo125470l = {231}, mo125471m = "invokeSuspend")
/* renamed from: on1.c0 */
public final class C11513c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33824d;

    /* renamed from: e */
    public final /* synthetic */ C11577z<C0740i2> f33825e;

    /* renamed from: f */
    public final /* synthetic */ C11520f0<C0740i2> f33826f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11513c0(C11577z<C0740i2> zVar, C11520f0<C0740i2> f0Var, C15601d<? super C11513c0> dVar) {
        super(2, dVar);
        this.f33825e = zVar;
        this.f33826f = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11513c0(this.f33825e, this.f33826f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11513c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33824d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C11520f0<T>> t0Var = this.f33825e.f33964b;
            C11520f0<C0740i2> f0Var = this.f33826f;
            this.f33824d = 1;
            if (((C58100z0) t0Var).emit(f0Var, this) == aVar) {
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
