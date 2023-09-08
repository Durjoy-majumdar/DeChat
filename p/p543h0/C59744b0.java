package p543h0;

import fy3.C32227p;
import kotlin.ResultKt;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.material.SurfaceKt$Surface$1$2", mo125469f = "Surface.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: h0.b0 */
public final class C59744b0 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {
    public C59744b0(C15601d<? super C59744b0> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59744b0(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C109119z zVar = (C109119z) obj;
        new C59744b0((C15601d) obj2);
        C13598b0 b0Var = C13598b0.f38549a;
        ResultKt.throwOnFailure(b0Var);
        return b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return C13598b0.f38549a;
    }
}
