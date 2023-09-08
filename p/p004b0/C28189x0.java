package p004b0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2", mo125469f = "LazySemantics.kt", mo125470l = {111}, mo125471m = "invokeSuspend")
/* renamed from: b0.x0 */
public final class C28189x0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f77684d;

    /* renamed from: e */
    public final /* synthetic */ C103953l0 f77685e;

    /* renamed from: f */
    public final /* synthetic */ int f77686f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28189x0(C103953l0 l0Var, int i, C15601d<? super C28189x0> dVar) {
        super(2, dVar);
        this.f77685e = l0Var;
        this.f77686f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C28189x0(this.f77685e, this.f77686f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C28189x0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f77684d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C103953l0 l0Var = this.f77685e;
            int i2 = this.f77686f;
            this.f77684d = 1;
            if (C103953l0.m138679h(l0Var, i2, 0, this, 2, (Object) null) == aVar) {
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
