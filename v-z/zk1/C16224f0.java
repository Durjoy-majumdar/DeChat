package zk1;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: zk1.f0 */
public final class C16224f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f43449d;

    /* renamed from: e */
    public final /* synthetic */ C16229h f43450e;

    /* renamed from: f */
    public final /* synthetic */ DialogInterface.OnCancelListener f43451f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16224f0(boolean z, C16229h hVar, DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f43449d = z;
        this.f43450e = hVar;
        this.f43451f = onCancelListener;
    }

    public Object invoke() {
        if (this.f43449d) {
            C16229h hVar = this.f43450e;
            C89779i0 i0Var = hVar.f43468J;
            boolean z = true;
            if (i0Var == null) {
                hVar.f43468J = C89779i0.m112248e(hVar.getActivity(), this.f43450e.getActivity().getString(C0966R.string.ett), true, 2, this.f43451f);
            } else {
                if (i0Var.isShowing()) {
                    z = false;
                }
                if (z) {
                    C89779i0 i0Var2 = this.f43450e.f43468J;
                    if (i0Var2 != null) {
                        i0Var2.setOnCancelListener(this.f43451f);
                    }
                    C89779i0 i0Var3 = this.f43450e.f43468J;
                    if (i0Var3 != null) {
                        i0Var3.show();
                    }
                }
            }
        } else {
            C89779i0 i0Var4 = this.f43450e.f43468J;
            if (i0Var4 != null) {
                i0Var4.dismiss();
            }
        }
        return C13598b0.f38549a;
    }
}
