package wg1;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: wg1.x2 */
public final class C15366x2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f41720d;

    /* renamed from: e */
    public final /* synthetic */ C15370z1 f41721e;

    /* renamed from: f */
    public final /* synthetic */ DialogInterface.OnCancelListener f41722f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15366x2(boolean z, C15370z1 z1Var, DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f41720d = z;
        this.f41721e = z1Var;
        this.f41722f = onCancelListener;
    }

    public Object invoke() {
        if (this.f41720d) {
            C15370z1 z1Var = this.f41721e;
            C89779i0 i0Var = z1Var.f41740P;
            boolean z = true;
            if (i0Var == null) {
                z1Var.f41740P = C89779i0.m112248e(z1Var.getActivity(), this.f41721e.getActivity().getString(C0966R.string.ett), true, 2, this.f41722f);
            } else {
                if (i0Var.isShowing()) {
                    z = false;
                }
                if (z) {
                    C89779i0 i0Var2 = this.f41721e.f41740P;
                    if (i0Var2 != null) {
                        i0Var2.setOnCancelListener(this.f41722f);
                    }
                    C89779i0 i0Var3 = this.f41721e.f41740P;
                    if (i0Var3 != null) {
                        i0Var3.show();
                    }
                }
            }
        } else {
            C89779i0 i0Var4 = this.f41721e.f41740P;
            if (i0Var4 != null) {
                i0Var4.dismiss();
            }
        }
        return C13598b0.f38549a;
    }
}
