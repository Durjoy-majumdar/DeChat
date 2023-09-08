package qj1;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.z1 */
public final class C63154z1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f179200d;

    /* renamed from: e */
    public final /* synthetic */ C63068w1 f179201e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63154z1(ViewGroup viewGroup, C63068w1 w1Var) {
        super(1);
        this.f179200d = viewGroup;
        this.f179201e = w1Var;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ViewGroup viewGroup = this.f179200d;
            viewGroup.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.color.a1u));
            this.f179201e.f178991t.animate().translationY(0.0f);
        }
        return C13598b0.f38549a;
    }
}
