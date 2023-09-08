package ce1;

import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: ce1.d0 */
public final class C0459d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0461e0 f1094d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0459d0(C0461e0 e0Var) {
        super(0);
        this.f1094d = e0Var;
    }

    public Object invoke() {
        C89779i0 i0Var = this.f1094d.f1096d;
        if (i0Var != null && i0Var.isShowing()) {
            i0Var.dismiss();
        }
        ImageView imageView = this.f1094d.f1101i;
        if (imageView != null) {
            imageView.setVisibility(0);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("coverImageView");
        throw null;
    }
}
