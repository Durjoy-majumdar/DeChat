package wg1;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: wg1.d4 */
public final class C15266d4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f41517d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41518e;

    /* renamed from: f */
    public final /* synthetic */ DialogInterface.OnCancelListener f41519f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15266d4(boolean z, C15278g3 g3Var, DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f41517d = z;
        this.f41518e = g3Var;
        this.f41519f = onCancelListener;
    }

    public Object invoke() {
        if (this.f41517d) {
            C15278g3 g3Var = this.f41518e;
            C89779i0 i0Var = g3Var.f41549D;
            boolean z = true;
            if (i0Var == null) {
                g3Var.f41549D = C89779i0.m112248e(g3Var.getActivity(), this.f41518e.getActivity().getString(C0966R.string.ett), true, 2, this.f41519f);
            } else {
                if (i0Var.isShowing()) {
                    z = false;
                }
                if (z) {
                    C89779i0 i0Var2 = this.f41518e.f41549D;
                    if (i0Var2 != null) {
                        i0Var2.setOnCancelListener(this.f41519f);
                    }
                    C89779i0 i0Var3 = this.f41518e.f41549D;
                    if (i0Var3 != null) {
                        i0Var3.show();
                    }
                }
            }
        } else {
            C89779i0 i0Var4 = this.f41518e.f41549D;
            if (i0Var4 != null) {
                i0Var4.dismiss();
            }
        }
        return C13598b0.f38549a;
    }
}
