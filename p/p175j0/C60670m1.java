package p175j0;

import fy3.C32227p;
import kotlin.ResultKt;
import p175j0.C60661k1;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.runtime.Recomposer$join$2", mo125469f = "Recomposer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j0.m1 */
public final class C60670m1 extends C91594j implements C32227p<C60661k1.C60664c, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f172813d;

    public C60670m1(C15601d<? super C60670m1> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C60670m1 m1Var = new C60670m1(dVar);
        m1Var.f172813d = obj;
        return m1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60670m1) create((C60661k1.C60664c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return Boolean.valueOf(((C60661k1.C60664c) this.f172813d) == C60661k1.C60664c.ShutDown);
    }
}
