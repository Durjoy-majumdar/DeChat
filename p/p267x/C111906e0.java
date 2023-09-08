package p267x;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p1165z.C112517d;
import p1165z.C112518e;
import p1165z.C112527l;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", mo125469f = "Focusable.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
/* renamed from: x.e0 */
public final class C111906e0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f335017d;

    /* renamed from: e */
    public int f335018e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C112517d> f335019f;

    /* renamed from: g */
    public final /* synthetic */ C112527l f335020g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111906e0(C60690y0<C112517d> y0Var, C112527l lVar, C15601d<? super C111906e0> dVar) {
        super(2, dVar);
        this.f335019f = y0Var;
        this.f335020g = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111906e0(this.f335019f, this.f335020g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111906e0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C60690y0<C112517d> y0Var;
        C60690y0<C112517d> y0Var2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335018e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112517d value = this.f335019f.getValue();
            if (value != null) {
                C112527l lVar = this.f335020g;
                y0Var = this.f335019f;
                C112518e eVar = new C112518e(value);
                if (lVar != null) {
                    this.f335017d = y0Var;
                    this.f335018e = 1;
                    if (lVar.mo164252a(eVar, this) == aVar) {
                        return aVar;
                    }
                    y0Var2 = y0Var;
                }
                y0Var.setValue(null);
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            y0Var2 = (C60690y0) this.f335017d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y0Var = y0Var2;
        y0Var.setValue(null);
        return C13598b0.f38549a;
    }
}
