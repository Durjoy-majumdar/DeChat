package p190l1;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", mo125469f = "SuspendingPointerInputFilter.kt", mo125470l = {240}, mo125471m = "invokeSuspend")
/* renamed from: l1.g0 */
public final class C34154g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f92132d;

    /* renamed from: e */
    public /* synthetic */ Object f92133e;

    /* renamed from: f */
    public final /* synthetic */ C109093f0 f92134f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<C109119z, C15601d<? super C13598b0>, Object> f92135g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34154g0(C109093f0 f0Var, C32227p<? super C109119z, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C34154g0> dVar) {
        super(2, dVar);
        this.f92134f = f0Var;
        this.f92135g = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C34154g0 g0Var = new C34154g0(this.f92134f, this.f92135g, dVar);
        g0Var.f92133e = obj;
        return g0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C34154g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f92132d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f92133e;
            C109093f0 f0Var = this.f92134f;
            f0Var.getClass();
            C87412m.m108594g(n0Var, "<set-?>");
            f0Var.f326668p = n0Var;
            C32227p<C109119z, C15601d<? super C13598b0>, Object> pVar = this.f92135g;
            C109093f0 f0Var2 = this.f92134f;
            this.f92132d = 1;
            if (pVar.invoke(f0Var2, this) == aVar) {
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
