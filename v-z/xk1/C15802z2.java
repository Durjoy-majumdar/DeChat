package xk1;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xk1.z2 */
public final class C15802z2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15771r2 f42575d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15802z2(C15771r2 r2Var) {
        super(0);
        this.f42575d = r2Var;
    }

    public Object invoke() {
        C15771r2 r2Var = this.f42575d;
        r2Var.mo14489f3();
        r2Var.getActivity().finish();
        r2Var.getActivity().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        return C13598b0.f38549a;
    }
}
