package p004b0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32226l;
import gy3.C87413o;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: b0.y0 */
public final class C28191y0 extends C87413o implements C32226l<Integer, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C103953l0 f77688d;

    /* renamed from: e */
    public final /* synthetic */ C0000n0 f77689e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28191y0(C103953l0 l0Var, C0000n0 n0Var) {
        super(1);
        this.f77688d = l0Var;
        this.f77689e = n0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        boolean z = intValue >= 0 && intValue < this.f77688d.mo145573g().mo55834e();
        C103953l0 l0Var = this.f77688d;
        if (z) {
            C53895h.m60466d(this.f77689e, (C66212f) null, (C53934p0) null, new C28189x0(l0Var, intValue, (C15601d<? super C28189x0>) null), 3, (Object) null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + l0Var.mo145573g().mo55834e() + ')').toString());
    }
}
