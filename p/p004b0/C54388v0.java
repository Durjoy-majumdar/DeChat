package p004b0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C37901h;
import p759y.C112273p0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", mo125469f = "LazySemantics.kt", mo125470l = {95}, mo125471m = "invokeSuspend")
/* renamed from: b0.v0 */
public final class C54388v0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152585d;

    /* renamed from: e */
    public final /* synthetic */ C103953l0 f152586e;

    /* renamed from: f */
    public final /* synthetic */ float f152587f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54388v0(C103953l0 l0Var, float f, C15601d<? super C54388v0> dVar) {
        super(2, dVar);
        this.f152586e = l0Var;
        this.f152587f = f;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54388v0(this.f152586e, this.f152587f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54388v0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152585d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C103953l0 l0Var = this.f152586e;
            float f = this.f152587f;
            this.f152585d = 1;
            if (C112273p0.m153169b(l0Var, f, (C37901h) null, this, 2, (Object) null) == aVar) {
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
