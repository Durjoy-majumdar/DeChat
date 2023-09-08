package ca0;

import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60690y0;
import p631o1.C109854n0;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: ca0.i */
public final class C104347i extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C109854n0> f308954d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C13604l<C109854n0, Integer>> f308955e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C109854n0> f308956f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<Integer> f308957g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104347i(C8479f0<C109854n0> f0Var, C8479f0<C13604l<C109854n0, Integer>> f0Var2, C8479f0<C109854n0> f0Var3, C60690y0<Integer> y0Var) {
        super(1);
        this.f308954d = f0Var;
        this.f308955e = f0Var2;
        this.f308956f = f0Var3;
        this.f308957g = y0Var;
    }

    public Object invoke(Object obj) {
        C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
        C87412m.m108594g(aVar, "$this$layout");
        C109854n0.C109855a aVar2 = aVar;
        C109854n0.C109855a.m149304c(aVar2, (C109854n0) this.f308954d.f27484d, this.f308957g.getValue().intValue(), 0, 0.0f, 4, (Object) null);
        C13604l lVar = (C13604l) this.f308955e.f27484d;
        if (lVar != null) {
            int intValue = ((Number) lVar.f38556e).intValue();
            C109854n0.C109855a.m149304c(aVar, (C109854n0) lVar.f38555d, intValue, 0, 0.0f, 4, (Object) null);
        }
        C109854n0 n0Var = (C109854n0) this.f308956f.f27484d;
        if (n0Var != null) {
            C109854n0.C109855a.m149304c(aVar, n0Var, 0, 0, 0.0f, 4, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
