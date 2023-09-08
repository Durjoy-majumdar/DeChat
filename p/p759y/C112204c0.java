package p759y;

import fy3.C32227p;
import kotlin.ResultKt;
import p190l1.C109085c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", mo125469f = "ForEachGesture.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
/* renamed from: y.c0 */
public final class C112204c0 extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

    /* renamed from: e */
    public int f335938e;

    /* renamed from: f */
    public /* synthetic */ Object f335939f;

    public C112204c0(C15601d<? super C112204c0> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112204c0 c0Var = new C112204c0(dVar);
        c0Var.f335939f = obj;
        return c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112204c0) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335938e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f335938e = 1;
            if (C112209d0.m153115a((C109085c) this.f335939f, this) == aVar) {
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
