package xk1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import il1.C9149v5;
import rx3.C13598b0;

/* renamed from: xk1.j2 */
public final class C15745j2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66297d2 f42463d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15745j2(C66297d2 d2Var) {
        super(0);
        this.f42463d = d2Var;
    }

    public Object invoke() {
        View view;
        C9149v5 v5Var = this.f42463d.f190855n;
        if (!(v5Var == null || (view = v5Var.f28818d) == null)) {
            view.performClick();
        }
        this.f42463d.mo90419j3();
        return C13598b0.f38549a;
    }
}
