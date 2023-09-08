package p004b0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p257w.C111626b;
import p257w.C111654m;
import p560i2.C33177j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", mo125469f = "LazyListItemPlacementAnimator.kt", mo125470l = {264}, mo125471m = "invokeSuspend")
/* renamed from: b0.l */
public final class C103952l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f307413d;

    /* renamed from: e */
    public final /* synthetic */ C103930a1 f307414e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103952l(C103930a1 a1Var, C15601d<? super C103952l> dVar) {
        super(2, dVar);
        this.f307414e = a1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C103952l(this.f307414e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C103952l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f307413d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C103930a1 a1Var = this.f307414e;
            C111626b<C33177j, C111654m> bVar = a1Var.f307318b;
            C33177j jVar = new C33177j(a1Var.f307319c);
            this.f307413d = 1;
            if (bVar.mo163296d(jVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((C108494d2) this.f307414e.f307320d).setValue(Boolean.FALSE);
        return C13598b0.f38549a;
    }
}
