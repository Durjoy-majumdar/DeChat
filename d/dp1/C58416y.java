package dp1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.db4;

/* renamed from: dp1.y */
public final class C58416y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58353a0 f167349d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58416y(C58353a0 a0Var) {
        super(0);
        this.f167349d = a0Var;
    }

    public Object invoke() {
        LinkedList linkedList = new LinkedList();
        this.f167349d.mo83105P1();
        C58353a0 a0Var = this.f167349d;
        C58378j1 j1Var = a0Var.f167091v;
        if (j1Var != null) {
            j1Var.mo83151H(a0Var.f167331o);
            db4 d = C58378j1.f167214j0.mo83214d(j1Var, a0Var.f167327h);
            linkedList.add(d);
            a0Var.mo83104N1(j1Var, d);
        }
        this.f167349d.f167091v = null;
        if (!linkedList.isEmpty()) {
            this.f167349d.f167090u.addAll(linkedList);
            this.f167349d.mo8558M1();
        }
        return C13598b0.f38549a;
    }
}
